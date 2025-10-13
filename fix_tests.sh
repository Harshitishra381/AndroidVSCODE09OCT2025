#!/bin/bash

# Add alwaysRun = true to all @Test annotations in Java test files
find /Users/rooter/git/repository/Rooter/src/test/java -name "*.java" -exec sed -i '' 's/@Test(priority = \([0-9]*\))/@Test(priority = \1, alwaysRun = true)/g' {} \;

echo "Fixed all test files to include alwaysRun = true"