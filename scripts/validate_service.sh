#!/bin/bash
# Checks that the app answers on port 80 (Apache) and port 8080 (Spring Boot).
# Fails the deployment if it does not respond in time.
for i in {1..18}; do
  APP=$(curl -s -o /dev/null -w "%{http_code}" http://localhost:8080/ || true)
  WEB=$(curl -s -o /dev/null -w "%{http_code}" http://localhost/ || true)

  if [ "$APP" = "200" ] && [ "$WEB" = "200" ]; then
    echo "App is responding (8080: $APP, 80: $WEB)"
    exit 0
  fi

  echo "Waiting for the app to start... ($i/18) 8080: $APP, 80: $WEB"
  sleep 5
done

echo "App did not respond in time"
exit 1