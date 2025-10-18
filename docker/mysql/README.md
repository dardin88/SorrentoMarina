# MySQL Database Setup for SorrentoMarina

## Overview
This directory contains the MySQL database initialization files for the SorrentoMarina application. The database is automatically set up when the MySQL container starts.

## Database Schema
The database includes the following tables:
- **TURISTA** - Tourist user accounts
- **RESPONSABILE_ENTE** - Entity managers
- **RESPONSABILE_LIDO** - Beach managers
- **LIDO** - Beach establishments
- **SERVIZI** - Services offered by beaches
- **PRENOTAZIONE** - Beach reservations
- **OMBRELLONE** - Beach umbrellas
- **ANNUNCIO** - Announcements
- **RECENSIONE** - Reviews

## Default Database Configuration
- **Database Name:** `sorrentomarina`
- **Username:** `sorrentouser`
- **Password:** `sorrentopass`
- **Root Password:** `rootpassword`
- **Port:** `3306`

## Initialization Files
- `01-schema.sql` - Creates all tables and inserts sample data

## Sample Data Included
The initialization script includes sample data for:
- 4 Entity managers
- 4 Beach managers
- 4 Beach establishments
- 4 Service configurations
- 4 Tourists
- 4 Reservations
- 4 Announcements
- 5 Reviews
- 4 Umbrellas

## Usage with Docker Compose
The MySQL container is automatically configured in `docker-compose.yml`. To start with the database:

```bash
docker compose up -d
```

## Manual Database Access
To connect to the database directly:

```bash
# Using docker exec
docker compose exec mysql-db mysql -u sorrentouser -p sorrentomarina

# Using MySQL client from host (if installed)
mysql -h localhost -P 3306 -u sorrentouser -p sorrentomarina
```

## Environment Variables
Database connection settings can be customized by copying `.env.example` to `.env` and modifying the values:

```bash
cp .env.example .env
# Edit .env file as needed
```

## Data Persistence
Database data is persisted in the Docker volume `mysql-data`. To reset the database:

```bash
docker compose down -v  # This removes all volumes including database data
docker compose up -d    # This recreates with fresh data
```

## Connection from Application
The application connects using these environment variables:
- `DB_HOST=mysql-db`
- `DB_PORT=3306`
- `DB_NAME=sorrentomarina`
- `DB_USER=sorrentouser`
- `DB_PASSWORD=sorrentopass`