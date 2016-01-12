#!/bin/bash

# Sanity checks: is a logicblox tarball present?
tarballs = Dir.glob("logicblox-*.tar.gz")
if tarballs.length == 0 then
    puts "No logicblox tarball found in current directory, please make sure you copy or hardlink a logicblox-*.tar.gz release tarball into the current directory."
    puts "You can download release tarballs from https://download.logicblox.com"
    Kernel.exit(1)
elsif File.symlink?(tarballs[0]) then
    puts "You cannot symlink a logicblox tarball, it has to be a copy or hardlink, you can create a hardlink using 'ln' without using the '-s' switch."
    Kernel.exit(2)
end

tar xzf /vagrant/logicblox-*.tar.gz

echo "Configuring Doop..."
hg clone https://bitbucket.org/yanniss/doop doop
hg clone https://bitbucket.org/yanniss/doop-benchmarks doop-benchmarks
hg clone https://bitbucket.org/yanniss/doop-tools doop-tools

echo "Please run 'source environment.sh'"
