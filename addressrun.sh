#!/bin/bash
for javafile in `find -type f -name "*.class"`
do
	echo $javafile
done
 java -cp ./class/ com/addressbook/$1

