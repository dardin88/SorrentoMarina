#!/bin/bash

# Build and Deploy SorrentoMarina with Docker
echo "🚀 Building and deploying SorrentoMarina..."

# Build the Maven project
echo "📦 Building WAR file with Maven..."
mvn clean package -DskipTests

# Check if WAR file was created
if [ ! -f "target/SorrentoMarina-1.0.war" ]; then
    echo "❌ Error: WAR file not found. Build failed."
    exit 1
fi

echo "✅ WAR file built successfully"

# Build Docker image
echo "🐳 Building Docker image..."
docker build -t sorrentomarina:latest .

# Check if Docker build was successful
if [ $? -eq 0 ]; then
    echo "✅ Docker image built successfully"
    
    # Ask user if they want to run the container
    read -p "🤔 Do you want to start the application now? (y/n): " -n 1 -r
    echo
    if [[ $REPLY =~ ^[Yy]$ ]]; then
        echo "🚀 Starting SorrentoMarina application with MySQL database..."
        # Start with docker compose
        docker compose up -d
        
        # Wait for services to be ready
        echo "⏳ Waiting for services to start..."
        sleep 10
        
        # Check if services are running
        if docker compose ps | grep -q "Up"; then
            echo "✅ Application started successfully!"
            echo ""
            echo "🌐 Access your application at: http://localhost:8080"
            echo "🗄️  Database available at: localhost:3306 (user: root, db: sorrentoDb)"
            echo ""
            echo "📋 Useful commands:"
            echo "   View app logs:    docker compose logs -f sorrentomarina-app"
            echo "   View db logs:     docker compose logs -f mysql-db"
            echo "   Connect to DB:    docker compose exec mysql-db mysql -u root -p sorrentoDb"
            echo "   Stop services:    docker compose down"
            echo "   Remove all data:  docker compose down -v"
        else
            echo "⚠️  Some services may not have started properly. Check logs:"
            echo "   docker compose logs"
        fi
    fi
else
    echo "❌ Docker build failed"
    exit 1
fi