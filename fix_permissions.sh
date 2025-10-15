#!/bin/bash

cd /Users/rooter/git/repository/Rooter

echo "Fixing target directory permissions..."

# Force remove target directory
rm -rf target/ 2>/dev/null || true

# Create fresh target directory with correct permissions
mkdir -p target/surefire-reports
mkdir -p target/test-classes
mkdir -p target/classes

# Set proper permissions
chmod -R 755 target/

echo "Permissions fixed. Maven clean should work now."