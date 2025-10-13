#!/bin/bash

# Simple test runner for the specific LiveStream test

cd /Users/rooter/git/repository/Rooter

# Set JAVA_HOME
export JAVA_HOME=/Users/rooter/Library/Java/JavaVirtualMachines/openjdk-21.0.2/Contents/Home

# Run the test with minimal configuration
/Users/rooter/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/java/maven/bin/mvn.sh \
  -Dtest=Trial.LiveStream_script#LiveMiniplayertabswittch1 \
  -DforkCount=0 \
  -DreuseForks=false \
  --no-transfer-progress \
  test

echo "Simple test execution completed."