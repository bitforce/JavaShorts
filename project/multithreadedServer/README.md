# Multithreaded Server

Overview
---
An server application that utilizes multithreading capabilities as opposed to 
default single-thread Java sockets.

###### Background
Multithreading defines the capability of an operating system, a process, a 
hardware component, or software to manage more than one user at a time. 
Therefore, such an application can accept multiple requests by one user 
or many users without having to run multiple instances of said program.

A thread is essentially a [sub]process which doesn't utilize many system 
resources; in fact, it is the smallest unit of computing. If you heard 
of program multi-tasking, then multithreading and multiprocessing are 
the main features.

Onto sockets: endpoints of connections between two programs running on a 
network. The endpoints establish a communication link between a server 
and a client; local and/or remote. The way it works: the socket links 
to a port on the computer of which it is running on, so that any 
program, also running on the same port can communicate with the 
server. The server's task is to provide the client application 
with the resources it needs to run properly. The client sends 
requests to the server and it responds accordingly.

##### Multithreading
 
###### Disadvantages
- Involves much more complexity: difficult to write and even worse to debug.

###### Advantages
- Multiple threads means thread independence and less flow obstruction.
- Many operations can be performed at once/in sync.
- Programs are much quicker.

Usage
---
In the root directory, run `make & make run args=8080` and this will compile 
and then run the program.

Note
---
This program doesn't visually showcase multithreading, as its only purpose 
is to live for 5 seconds and the die off; however, you can see the basic 
mechanics of this via the code.

The _args_ doesn't have to be 8080, you can substitute it for another open 
port on yuor machine.
