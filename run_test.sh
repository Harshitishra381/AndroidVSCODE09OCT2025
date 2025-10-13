#!/bin/bash

# Script to run the specific LiveStream test with proper configuration

cd /Users/rooter/git/repository/Rooter

# Set JAVA_HOME
export JAVA_HOME=/Users/rooter/Library/Java/JavaVirtualMachines/openjdk-21.0.2/Contents/Home

# Run the specific test with reduced timeout and better error handling
/Users/rooter/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/java/maven/bin/mvn.sh \
  -Dsurefire.suiteXmlFiles=testng-single.xml \
  -Dmaven.test.failure.ignore=true \
  -Dsurefire.timeout=300 \
  --no-transfer-progress \
  clean test

echo "Test execution completed. Check the results above."