#!/bin/bash

greeting="welcome"
user=$(whoami)
day =$(date +%A)

echo "$greeting back $user! Today is $day , which is the best day for the entire week! "
echo "Your bash shell version is: $BASH_VERSION. ENJOY!"