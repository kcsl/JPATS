#!/bin/bash

rm -f progress.txt
./tests.sh &> progress.txt&
