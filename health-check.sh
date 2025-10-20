#!/bin/bash

# Database Health Check Script for SorrentoMarina
# This script checks if the MySQL database is accessible and contains expected data

echo "🔍 SorrentoMarina Database Health Check"
echo "========================================"

# Start Docker Compose services
echo "🚀 Starting Docker Compose services..."
docker compose up -d

# Wait for services to be ready
echo "⏳ Waiting for services to start..."
sleep 10

# Check if Docker Compose services are running
echo "📋 Checking Docker services..."
docker compose ps --format "table {{.Name}}\t{{.State}}\t{{.Ports}}"

echo ""
echo "🗄️ Database connectivity test..."

# Test basic connection
if docker compose exec -T mysql-db mysql -u root -proot -e "SELECT 1;" >/dev/null 2>&1; then
    echo "✅ Database connection: OK"
else
    echo "❌ Database connection: FAILED"
    exit 1
fi

# Check if database exists and has tables
TABLE_COUNT=$(docker compose exec -T mysql-db mysql -u root -proot -e "USE sorrentoDb; SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = 'sorrentoDb';" 2>/dev/null | tail -n1)

if [ "$TABLE_COUNT" = "9" ]; then
    echo "✅ Database schema: OK ($TABLE_COUNT tables found)"
else
    echo "⚠️ Database schema: Expected 9 tables, found $TABLE_COUNT"
fi

# Check sample data
echo ""
echo "📊 Sample data verification:"
docker compose exec -T mysql-db mysql -u root -proot -e "
USE sorrentoDb; 
SELECT 'Tourists:' as type, COUNT(*) as count FROM TURISTA
UNION ALL SELECT 'Beaches:', COUNT(*) FROM LIDO  
UNION ALL SELECT 'Reservations:', COUNT(*) FROM PRENOTAZIONE
UNION ALL SELECT 'Reviews:', COUNT(*) FROM RECENSIONE;" 2>/dev/null

echo ""
echo "🌐 Application accessibility test..."
if curl -s -I http://localhost:8080 | grep -q "HTTP/1.1"; then
    echo "✅ Application: Accessible at http://localhost:8080"
else
    echo "❌ Application: Not accessible"
fi

echo ""
echo "✨ Health check complete!"

echo ""
echo "🛑 Stopping Docker Compose services..."
docker compose down