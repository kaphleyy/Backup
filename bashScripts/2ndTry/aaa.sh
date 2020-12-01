#!/bin/bash

echo Hello, Who am i talking to?

read var

echo It\'s nice to meet you $var

read -p 'UserName: ' user
read -sp 'Password: ' pass
echo
echo Thank you $user for providing me your password
