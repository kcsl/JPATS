#!/bin/bash

echo "Analyzing test cases..."
echo "Progress will be written to 'progress.txt', run 'tail -f progress.txt' to monitor progress."
rm -f progress.txt
./tests.sh &>> progress.txt&
