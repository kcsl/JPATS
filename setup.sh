#!/bin/bash

# Setup DOOP requirements (LogicBlox)
logicblox=${logicblox-*.tar.gz}
version3=logicblox-3

if [ ${logicblox/$version3} = $logicblox ] ; then
  echo "Found" $logicblox
else
  echo "A version of the LogicBlox 3 tarball must be placed in this directory."
  echo "You can download release tarballs from https://download.logicblox.com"
  exit 1
fi

echo "Extracting LogicBlox..."
tar xzf $logicblox

echo "Downloading DOOP..."
hg clone https://bitbucket.org/yanniss/doop doop

echo "Downloading DOOP Tools..."
hg clone https://bitbucket.org/yanniss/doop-tools doop-tools

echo "Downloading DOOP Runtimes and Benchmarks"
hg clone https://bitbucket.org/yanniss/doop-benchmarks doop-benchmarks

echo "Finished setup."
echo "Please run 'source environment.sh' to configure DOOP environment."
