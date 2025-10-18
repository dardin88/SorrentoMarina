# Use Tomcat 10 with JDK 21 (supports Jakarta EE 10)
FROM tomcat:10.1-jdk21-temurin-jammy

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file to Tomcat webapps directory
COPY target/SorrentoMarina-1.0.war /usr/local/tomcat/webapps/ROOT.war

# Create necessary directories
RUN mkdir -p /usr/local/tomcat/logs

# Set environment variables
ENV CATALINA_OPTS="-Xmx1024m -Xms512m -server"
ENV JAVA_OPTS="-Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom"

# Expose port 8080
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]