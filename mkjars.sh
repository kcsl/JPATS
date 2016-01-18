#!/bin/bash

dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# clear out old tests
rm -rf ${dir}/JPATS/testsuite

# build tests from source
cd ${dir}/JPATS/src/tests/type/
mkdir -p ${dir}/JPATS/testsuite/

for test in *.java
do
	mkjar "$test"
	filename=${test%.*}
	jar=${filename}.jar
        mv "$jar" "../../../testsuite/$jar"
done
