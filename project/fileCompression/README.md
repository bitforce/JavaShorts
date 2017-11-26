# File Compression

Overview
---
We utilize built-in Java libraries to imitate the way a file compression 
program would work. The compression of files and folders differ slightly 
and here an attempt is made to illuminate said differences and separate 
code is written to tackle each area.

Usage
---
In the root project-directory, simply run `make & make run` which will 
compile all the files and place binaries in the appropriate folder. 

You can also go down the _lib/src_ directory where all the source 
files are located and type

`java -cp ../bin <FILENAME>.java <ARGUMENT>`

You may also read the top-level comments within the source files to 
see the appopriate parameters and more info on the file/program.


Note
---
There is this ugly directory _lib/bin/lib/src/_ containing binaries; 
this exists because in order to run tests from the root, I needed 
to _package_ the Java files in order to link them--if you are 
unsure why, you should read up on **Java inheritance**--and 
using `javac -cp` forces the binaries to be placed in dirs 
as specified by their package statement.

I simply wanted _lib/bin_ and _lib/src_; however, because of Java 
classpath and package management, now we have the current binary 
path.

Note in the usage section, <FILENAME> represents one of the Java 
files within the directory and <ARGUMENT> is the appropriate 
argument according to the program.
