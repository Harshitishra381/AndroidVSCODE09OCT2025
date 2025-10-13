#!/bin/bash
set -e

# Script to run tests with colored output
echo -e "\033[34m🚀 Starting Rooter Test Suite with Colored Output\033[0m"
echo -e "\033[33m⚠️  Make sure your terminal supports ANSI colors\033[0m"
echo ""

# Set environment variables for colored output
export MAVEN_OPTS="-Djansi.force=true"
export TERM=xterm-256color

# Run a simple test first to demonstrate colored output
echo -e "\033[34mℹ️  Running LiveMiniplayertabswittch1 test (simple test)\033[0m"
mvn clean test \
    -Dtest=LiveStream_script#LiveMiniplayertabswittch1 \
    -Dsurefire.forkCount=0 \
    -Dsurefire.reuseForks=false \
    -Djansi.force=true \
    -Dmaven.test.failure.ignore=true

echo ""
echo -e "\033[34mℹ️  Test execution completed. Check the output above for colored PASS/FAIL results.\033[0m"
echo -e "\033[32m✓ Green text indicates PASS\033[0m"
echo -e "\033[31m✗ Red text indicates FAIL\033[0m"
echo -e "\033[33m⚠ Yellow text indicates WARNING\033[0m"
echo -e "\033[34mℹ Blue text indicates INFO\033[0m"