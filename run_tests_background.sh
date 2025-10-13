#!/bin/bash
cd /Users/rooter/git/repository/Rooter
nohup mvn test -DsuiteXmlFile=testng.xml > test_execution.log 2>&1 &
echo "Tests started in background. Check test_execution.log for progress."
echo "Process ID: $!"