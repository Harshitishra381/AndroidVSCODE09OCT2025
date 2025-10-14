#!/bin/bash
# Keep system awake during test execution
caffeinate -d -i -m -s &
CAFFEINATE_PID=$!
echo "Caffeinate started with PID: $CAFFEINATE_PID"

# Run your tests
mvn test -Dsurefire.suiteXmlFiles=testng.xml

# Kill caffeinate when tests complete
kill $CAFFEINATE_PID
echo "Caffeinate stopped"