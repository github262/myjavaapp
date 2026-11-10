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

#!/bin/bash
set -e

# Java 17 for Spring Boot 3.3
dnf install -y java-17-amazon-corretto-headless

# Apache as a reverse proxy on port 80
dnf install -y httpd

# App folder
mkdir -p /opt/myjavaapp

# Proxy port 80 -> Spring Boot on 8080
cat > /etc/httpd/conf.d/myjavaapp.conf <<'EOF'
<VirtualHost *:80>
  ServerAdmin root@localhost
  ServerName app.nextwork.com
  ProxyRequests off
  ProxyPreserveHost On
  ProxyPass / http://localhost:8080/
  ProxyPassReverse / http://localhost:8080/
</VirtualHost>
EOF