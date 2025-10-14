#!/bin/bash

# Script to run the specific LiveStream test with proper configuration

cd /Users/rooter/git/repository/Rooter

# Keep system awake during test execution
caffeinate -d -i -m -s &
CAFFEINATE_PID=$!
echo "Caffeinate started with PID: $CAFFEINATE_PID - system will stay awake"

# Set JAVA_HOME
export JAVA_HOME=/Users/rooter/Library/Java/JavaVirtualMachines/openjdk-21.0.2/Contents/Home

# Run the specific test with reduced timeout and better error handling
/Users/rooter/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/java/maven/bin/mvn.sh \
  -Dsurefire.suiteXmlFiles=testng.xml \
  -Dmaven.test.failure.ignore=true \
  -Dsurefire.timeout=300 \
  --no-transfer-progress \
  clean test

# Kill caffeinate when tests complete
kill $CAFFEINATE_PID 2>/dev/null
echo "Test execution completed. System sleep restored."