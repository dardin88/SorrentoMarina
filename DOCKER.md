# SorrentoMarina Docker Deployment

This guide explains how to deploy the SorrentoMarina Jakarta EE 10 application using Docker with MySQL database.

## Prerequisites

- Docker Engine 20.0+ 
- Docker Compose 2.0+
- Java 21+ (for building)
- Maven 3.6+ (for building)

## Quick Start

### Option 1: Automated Deployment (Recommended)

Run the deployment script:

```bash
./deploy.sh
```

This script will:
1. Build the WAR file using Maven
2. Create the Docker image
3. Optionally start the application with database

### Option 2: Manual Deployment

1. **Build the WAR file:**
   ```bash
   mvn clean package -DskipTests
   ```

2. **Build Docker image:**
   ```bash
   docker build -t sorrentomarina:latest .
   ```

3. **Run with Docker Compose:**
   ```bash
   docker compose up -d
   ```

## Architecture

The application consists of two main services:

### Application Service (sorrentomarina-app)
- **Base Image:** Tomcat 10.1 with JDK 21
- **Port:** 8080
- **Application:** SorrentoMarina WAR file deployed as ROOT
- **Dependencies:** MySQL database

### Database Service (mysql-db)
- **Base Image:** MySQL 8.0
- **Port:** 3306
- **Database:** sorrentomarina
- **Initialization:** Automatic schema and sample data setup

## Database Configuration

The MySQL database is automatically configured with:

- **Database Name:** `sorrentomarina`
- **Username:** `sorrentouser` 
- **Password:** `sorrentopass`
- **Root Password:** `rootpassword`
- **Schema:** Beach management system with sample data

### Database Schema
- TURISTA - Tourist accounts
- LIDO - Beach establishments  
- PRENOTAZIONE - Reservations
- RESPONSABILE_LIDO - Beach managers
- RESPONSABILE_ENTE - Entity managers
- SERVIZI - Services offered
- ANNUNCIO - Announcements
- RECENSIONE - Reviews
- OMBRELLONE - Beach umbrellas

## Access the Application

- **Application URL:** http://localhost:8080
- **Database:** localhost:3306 (username: sorrentouser)

## Docker Commands

### Start Services
```bash
docker compose up -d
```

### View Logs
```bash
docker compose logs -f sorrentomarina-app
docker compose logs -f mysql-db
```

### Stop Services  
```bash
docker compose down
```

### Restart Services
```bash
docker compose down
docker compose up -d
```

### Remove All Data (including database)
```bash
docker compose down -v
```

## Database Management

### Connect to MySQL
```bash
# Using Docker exec
docker compose exec mysql-db mysql -u sorrentouser -p sorrentomarina

# From host (if MySQL client installed)
mysql -h localhost -P 3306 -u sorrentouser -p sorrentomarina
```

### Reset Database
```bash
docker compose down -v  # Removes all data
docker compose up -d    # Recreates with fresh sample data
```

## Environment Configuration

You can customize database settings by creating a `.env` file:

```bash
cp .env.example .env
# Edit .env file as needed
```

Available environment variables:
- `DB_HOST` - Database hostname (default: mysql-db)
- `DB_PORT` - Database port (default: 3306) 
- `DB_NAME` - Database name (default: sorrentomarina)
- `DB_USER` - Database username (default: sorrentouser)
- `DB_PASSWORD` - Database password (default: sorrentopass)

## Configuration

### Port Configuration

To use different ports, modify `docker-compose.yml`:

```yaml
ports:
  - "8090:8080"  # Application on port 8090
  - "3307:3306"  # MySQL on port 3307
```

### Memory Settings

Adjust JVM memory in `docker-compose.yml`:

```yaml
environment:
  - CATALINA_OPTS=-Xmx2048m -Xms1024m -server
```

## Troubleshooting

### Port Already in Use
```bash
# Check what's using the port
lsof -i :8080
lsof -i :3306

# Or change the port in docker-compose.yml
```

### Database Connection Issues
```bash
# Check if MySQL is ready
docker compose logs mysql-db

# Verify connection from app container
docker compose exec sorrentomarina-app ping mysql-db
```

### Application Startup Issues
```bash
# Check application logs
docker compose logs sorrentomarina-app

# Check Tomcat status
docker compose exec sorrentomarina-app ps aux
```

### Memory Issues
Adjust memory settings in `docker-compose.yml`:
```yaml
environment:
  - CATALINA_OPTS=-Xmx1024m -Xms512m -server
```

## Development Workflow

1. **Make code changes**
2. **Rebuild and deploy:**
   ```bash
   ./deploy.sh
   ```
3. **View logs:**
   ```bash
   docker compose logs -f
   ```

## Production Considerations

### Security
- Change default passwords in production
- Use Docker secrets for sensitive data
- Configure proper firewall rules
- Use HTTPS with reverse proxy

### Performance  
- Adjust JVM memory settings based on load
- Configure MySQL settings for production
- Use external database for high availability
- Monitor resource usage

### Backup
- Database: Regular MySQL dumps
- Application: Backup WAR files and configuration
- Docker volumes: Backup mysql-data volume

## File Structure

```
├── Dockerfile                # Application container definition
├── docker-compose.yml        # Multi-container setup  
├── .dockerignore            # Build context exclusions
├── deploy.sh               # Automated deployment script
├── health-check.sh         # Database and app health verification
├── .env.example           # Environment configuration template
└── mysql-init/
    └── 01-schema.sql       # Database initialization
```

## Support

For issues:
- Check container logs: `docker compose logs`
- Verify services are running: `docker compose ps`
- Check resource usage: `docker stats`
- Review database connectivity: `docker compose exec mysql-db mysql -u root -p`