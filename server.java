
// p: Prrogram server
// a: import librarys
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        // a: Crear el socket
        try(ServerSocket socket = new ServerSocket(5001);){
            // a: acepta el socket del servido cliente
            Socket socketc = socket.accept();
            // a: leer el buffer cliente
            BufferedReader reader = new BufferedReader(new InputStreamReader(socketc.getInputStream()));
            // a: manda el mensaje a traves del socket cliente
            PrintWriter writer = new PrintWriter(socketc.getOutputStream(), true);
            // a: almmacenando el mensaje del cliente
            String message;
            while((message = reader.readLine()) != null){
                // a: imprimir el mensaje del server
                System.out.println("The message is -> " + message);
                // a: enviar el mensaje al cliente
                writer.println("Hello client, your message is -> " + message);
            }
        } catch(Exception e){

        }
    }
}