#!/bin/bash

dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# clear past results
rm -r ${dir}/results
mkdir -p ${dir}/results

# run benchmarks
# for each strategy, for each test
while read strategy; do
        echo "Strategy:" $strategy
        cd ${dir}/JPATS/testsuite
        for test in *.jar
        do
                jar=${dir}/JPATS/testsuite/$test
                class=${test%.*}
                mkdir -p ${dir}/results/$class

                echo "Class:" $class
                java -cp ${jar} tests.type.${class} &> ${dir}/results/$class/runtime-result.txt

                cd ${dir}/doop/
                ./doop -a $strategy -j $jar -Xstats:none &> ${dir}/results/$class/$strategy.doop.log
                time bloxbatch -db last-analysis -query '_(?type) <- MethodInvocation:Signature[?mInvocation]="<java.lang.Object: java.lang.Class getClass()>", VirtualMethodInvocation:Base[?mInvocation] = ?base, AssignReturnValue[?mInvocation] = ?to, ActualParam[0, ?newmInvocation] = ?to, MethodInvocation:Signature[?newmInvocation]="<java.io.PrintStream: void println(java.lang.Object)>", VarPointsTo(_, ?heap, _, ?base), HeapAllocation:Type[?heap]=?type.' &> ${dir}/results/$class/$strategy.result.txt
        done
done < ${dir}/simple-strategies.txt

