#!/bin/bash

dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd ${dir}/JPATS/testsuite

for test in *.jar
do
	class=${test%.*}
	java -cp ${test} tests.type.${class}
done
