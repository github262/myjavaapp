# #!/bin/bash
# sudo systemctl start tomcat.service
# sudo systemctl enable tomcat.service
# sudo systemctl start httpd.service
# sudo systemctl enable httpd.service

#!/bin/bash
set -e

# Create the systemd service for the Spring Boot app
cat > /etc/systemd/system/myjavaapp.service <<'EOF'
[Unit]
Description=My Java App
After=network.target

[Service]
User=ec2-user
ExecStart=/usr/bin/java -jar /opt/myjavaapp/java-docker-app-1.0.0.jar
Restart=on-failure

[Install]
WantedBy=multi-user.target
EOF

systemctl daemon-reload

# Start the app
systemctl enable myjavaapp.service
systemctl start myjavaapp.service

# Start Apache (reverse proxy on port 80)
systemctl enable httpd.service
systemctl start httpd.service