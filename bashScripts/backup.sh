#!/bin/bash

# this bash script is used to backup a user's home directory to /Dev/bashScript
user=$(whoami)
input=/home/$user
output=/home/$user/Dev/${user}_home_$(date +%Y-%m-%d_%H%M%S).tar.gz

#The function total files reports a total number of files for a given directory.
function total_files {
    find $1 -type f | wc -l
}
function total_directories  {
    find $1 -type d | wc -lq
}

tar -czf $output $input 2> /dev/null

echo -n "Files to be included:"
total_files $input
echo -n "Directories to be included:"
total_directories $input

echo "Backup of $input completed!"

echo "Details about the output backup file:"
ls -l $output