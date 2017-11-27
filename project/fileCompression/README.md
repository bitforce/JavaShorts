# File Compression

Overview
---
We utilize built-in Java libraries to imitate the way a file compression 
program would work. The compression of files and folders differ slightly 
and here an attempt is made to illuminate said differences and separate 
code is written to tackle type of compression.

###### Background
All of us have encountered compression at one point or another, whether 
that be from downloading files or zipping up directories along with 
many other use cases. Compression works by reducing the number of 
bit/bytes in a _object_ (_used loosely_), in order to decrease the 
size of said entity. This allows for faster transfers--the main 
goal of compression--and less space being taken up on disk.

As odd it may seem to take something apparently whole and reduce it 
down even more so, it turns that many _objects_ contain a plethora 
of redundancies and file compression simply rids (or attempts to) 
as many of the extras. Via lossy and lossless compression 
algorithms, patterns of redundant 1s and 0s are either 
trimmed out or kept in an expression such that 
unpacking the object create an exact replica.

A interesting thing to think about Java class files, in a similar 
manner, programming languages contain many redundancies (such as 
keywords and code literals) that would unnecessarily clog up 
the bytecode file, so when Java source files are compiled--
note, in a lossy, not lossless manner--, the functionality 
of the code still remains, but to the point where only the 
necessary components have been formed into bytecode. This 
is why decompiling class files doesn't give you back 
exact source code, all the bs was trimmed out and 
only the core functionality exists. As a side 
note, you could get away with reconstructing 
your old program by knowing Assembly 
language, but that's a while other 
thing.


Usage
---
In the root project-directory, simply run `make & make run` which will 
compile all the files and place binaries in the appropriate folder. 

You can also go down the _lib/src_ directory where all the source 
files are located and type

`java -cp ../bin <FILENAME>.java <ARGUMENT>`

You may also read the top-level comments within the source files to 
see the appropriate parameters and more info on the file/program.


Note
---
Note in the usage section, <FILENAME> represents one of the Java 
files within the directory and <ARGUMENT> is the appropriate 
argument according to the program.
