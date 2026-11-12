# #!/bin/bash
# sudo yum install tomcat -y
# sudo yum -y install httpd
# sudo cat << EOF > /etc/httpd/conf.d/tomcat_manager.conf
# <VirtualHost *:80>
#   ServerAdmin root@localhost
#   ServerName app.nextwork.com
#   DefaultType text/html
#   ProxyRequests off
#   ProxyPreserveHost On
#   ProxyPass / http://localhost:8080/nextwork-web-project/
#   ProxyPassReverse / http://localhost:8080/nextwork-web-project/
# </VirtualHost>
# EOF

# #!/bin/bash
# set -e

# # Java 17 for Spring Boot 3.3
# dnf install -y java-17-amazon-corretto-headless

# # Apache as a reverse proxy on port 80
# dnf install -y httpd

# # App folder
# mkdir -p /opt/myjavaapp

# # Proxy port 80 -> Spring Boot on 8080
# cat > /etc/httpd/conf.d/myjavaapp.conf <<'EOF'
# <VirtualHost *:80>
#   ServerAdmin root@localhost
#   ServerName app.nextwork.com
#   ProxyRequests off
#   ProxyPreserveHost On
#   ProxyPass / http://localhost:8080/
#   ProxyPassReverse / http://localhost:8080/
# </VirtualHost>
# EOF

#!/bin/bash
# Runs as root before the new files are copied.
set -e

# Install Java 17 if it is missing (Amazon Linux)
if ! command -v java >/dev/null 2>&1; then
  yum install -y java-17-amazon-corretto-headless
fi

# Install Apache (used as a reverse proxy on port 80) if it is missing
if ! command -v httpd >/dev/null 2>&1; then
  yum install -y httpd
fi

# Forward port 80 to the Spring Boot app on port 8080
cat > /etc/httpd/conf.d/myjavaapp.conf <<'EOF'
ProxyPreserveHost On
ProxyPass / http://localhost:8080/
ProxyPassReverse / http://localhost:8080/
EOF

# Make sure the app folder exists and remove old JARs,
# so an older version never runs by mistake
mkdir -p /opt/myjavaapp
rm -f /opt/myjavaapp/*.jar