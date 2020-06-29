#!/bin/bash

function compilejavafile(){
	javac -d ./class/ -cp ./class/ $1

	echo "Compile file successfully"

}

for javafile in `find . -type f -name  "*.java"`
do
 	echo $javafile
	compilejavafile $javafile
done

