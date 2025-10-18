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
        echo "🚀 Starting SorrentoMarina application..."
        # Start with docker compose
    docker compose up -d
    
    echo "✅ Application started!"
    echo "🌐 Access your application at: http://localhost:8080"
    echo "📋 To view logs: docker compose logs -f sorrentomarina-app"
    echo "⏹️  To stop: docker compose down"
    fi
else
    echo "❌ Docker build failed"
    exit 1
fi