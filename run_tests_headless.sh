#!/bin/bash
# Prevent all sleep modes and keep display active
caffeinate -d -i -m -s -u &
CAFFEINATE_PID=$!

# Keep display awake by moving mouse cursor periodically
while true; do
    osascript -e 'tell application "System Events" to key code 126' # Up arrow key
    sleep 300 # Every 5 minutes
done &
MOUSE_PID=$!

echo "System kept awake. PIDs: caffeinate=$CAFFEINATE_PID, mouse=$MOUSE_PID"

# Run tests
mvn test -Dsurefire.suiteXmlFiles=testng.xml

# Cleanup
kill $CAFFEINATE_PID $MOUSE_PID 2>/dev/null
echo "Cleanup completed"