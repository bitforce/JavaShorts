# Java Shorts

Overview
---
A collection of different Java programs/functionality that don't necessarily 
count as their own indivudal projects. Each one is runnable within it's 
own directory and has a README detailing its use. Many of these 
programs serve as building-blocks and/or references for other 
software I develope. 

The reason I call them _shorts_ is because the type of work reminds me of 
short films.

Note
---
There exists this ugly directory _lib/bin/lib/src/_ containing binaries in most
of my projects; this is because in order to run tests from the root, I needed 
to _package_ the Java files in order to link them--if you are unsure why, 
you should read up on **Java inheritance**--and using `javac -cp` forces 
the binaries to be placed in dirs as specified by their package statement.
I simply wanted _lib/bin_ and _lib/src_; however, because of Java classpath 
and package management, now we have the current binary path.
