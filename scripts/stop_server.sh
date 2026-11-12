# # #!/bin/bash
# # isExistApp="$(pgrep httpd)"
# # if [[ -n $isExistApp ]]; then
# # sudo systemctl stop httpd.service
# # fi
# # isExistApp="$(pgrep tomcat)"
# # if [[ -n $isExistApp ]]; then
# # sudo systemctl stop tomcat.service
# # fi

# #!/bin/bash
# systemctl stop httpd.service || true
# systemctl stop myjavaapp.service || true

#!/bin/bash
# "|| true" keeps the deployment going on the first run,
# when the services do not exist yet.
systemctl stop httpd.service || true
systemctll stop myjavaapp.service || true
exit 0
 