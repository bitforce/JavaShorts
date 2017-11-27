package lib.src;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
/**
 * Server.
 * -------
 *  N/A
 */
class Server implements Runnable {
    protected ServerSocket socket = null;
    protected boolean stopped = false;
    protected Thread thread = null;
    protected int port = 8080;
    public Server(int port) {this.port = port;}
    private synchronized boolean stopped() {return this.stopped;}
    private void open() {
        try {this.socket = new ServerSocket(this.port);}
        catch(IOException e) {throw new RuntimeException("Not able to open port", e);}
    }
    public void run() {
        synchronized(this){this.thread = Thread.currentThread();}
        open();
        while(!stopped()) {
            System.out.print("RUNNING -> ");
            Socket client = null;
            try {client = this.socket.accept();}
            catch(IOException e) {
                if(stopped()) {
                    System.err.println("Server has stopped | Exception caught.");
                    return;
                }
                throw new RuntimeException("Client not connected.", e);
            }
            new Thread(new Worker(client, "Working multithreaded server.")).start();
        }
        System.out.println("Server has stopped.");
    }
    /* --------------------------------------------------------------------- */
    // PACKAGE-USE FUNCTIONS
    /* --------------------------------------------------------------------- */
    public synchronized void stop() {
        this.stopped = true;
        try {this.socket.close();}
        catch(IOException e) {throw new RuntimeException("Unable to open port", e);}
    }
}
