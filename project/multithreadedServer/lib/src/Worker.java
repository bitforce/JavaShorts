package lib.src;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.net.Socket;
/**
 * 
 */
class Worker implements Runnable {
    protected Socket client = null;
    protected String text = null;
    public Worker(Socket client, String text) {
        this.client = client;
        this.text = text;
    } 
    public void run() {
        try {
            InputStream in = client.getInputStream();
            OutputStream out = client.getOutputStream();
            long time = System.currentTimeMillis();
            out.write(("Worker running\nUser input: " + this.text +
                       "\nTime taken: " + time).getBytes());
            out.close();
            in.close();
            System.out.println("Request processed in " + time + " milliseconds");
        } catch(IOException e) {e.printStackTrace();}
    }
}
