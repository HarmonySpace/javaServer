// p: Prrogram client
// a: import librarys
import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // a: en local
            InetAddress host = InetAddress.getLocalHost();
            // a: ip del servidor
            String serverIP = "192.168.0.1";
            // a: crear el socket
            Socket socketc = new Socket(host, 5001);
            // a: leer el buffer del servidor
            PrintWriter writer = new PrintWriter(socketc.getOutputStream(), true);
            // a: leer lo que mande le servidor
            BufferedReader reader = new BufferedReader(new InputStreamReader(socketc.getInputStream()));


        }catch(Exception e){

        } 
    }
    }
}