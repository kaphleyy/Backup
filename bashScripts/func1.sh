#!/bin/bash

function user_details {
    echo "USER NAME : $(whoami)"
    echo "HOME DIRECTORY: $HOME"
}
user_details
echo "Empty space"
user_details