#!/bin/bash

dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# clear past results
rm -r ${dir}/results
mkdir -p ${dir}/results

# run benchmarks
cd ${dir}/JPATS/testsuite
for test in *.jar
do
        jar=${dir}/JPATS/testsuite/$test
	class=${test%.*}

        echo "Testing:" $class
        java -cp ${jar} tests.type.${class} &> ${dir}/results/$class.key

	while read strategy; do
		cd ${dir}/doop/
		./doop -a $strategy -j $jar -Xstats:none
	done < ${dir}/strategies.txt
done
