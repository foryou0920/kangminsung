
package chat;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerClient {
    private Socket socket;
    private Server server;
    private PrintWriter pw; 
    private BufferedReader br; 

    ServerClient(Socket s, Server server) {
        this.socket = socket;
        this.server = server;
        
        pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()).true);
        
        Thread t = new Thread(new Runnable() { 

            @Override
            public void run() {
                br = new BufferedReader(new InputStreamReader(ServerClient.this.socket.getInputStream()));
                while(true) { 
                    String msg = br.readLine();
                    transMsg = br.(msg);
                }
            }
           private void 
            
        }
        
    }

   

}
