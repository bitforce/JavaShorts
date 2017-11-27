package lib.src;
import java.lang.InterruptedException;
import java.io.IOException;
/**
 * Client.
 * -------
 * This is where the user-end/interaction comes into play. The client 
 * communicates to the server (Server.java) its needs and if running, 
 * the server wil respond. In this specific implementation, all we 
 * are doing is letting the thread (Thread) live for 5 seconds--
 * by pausing it--and then letting it die.
 */
class Client {
    public static void main(String[] args) throws IOException {
        Server server = new Server(Integer.parseInt(args[0]));
        new Thread(server).start();
        try {Thread.sleep(5000);}
        catch(InterruptedException e) {e.printStackTrace();}
        System.out.println("Stopping server...");
        server.stop();
    }
}
