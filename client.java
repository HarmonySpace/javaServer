
// p: Prrogram client
// h: import librarys
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            // a: en local
            //InetAddress serverIP = InetAddress.getLocalHost();
            // a: ip del servidor
            String serverIP = "192.168.153.130";
            // a: crear el socket
            Socket socketc = new Socket(serverIP, 5001);
            // a: leer el buffer del servidor
            PrintWriter writer = new PrintWriter(socketc.getOutputStream(), true);
            // a: leer lo que mande le servidor
            BufferedReader reader = new BufferedReader(new InputStreamReader(socketc.getInputStream()));

            // a: crea la variable de lectura
            Scanner read = new Scanner(System.in);

            // a: hasta que no se ingrese cadena
            while(true){
                // a: imprime en pantalla
                System.out.println("Ingrese una cadena:");
                String clientwrite = read.nextLine();
                if("" . equalsIgnoreCase(clientwrite)){
                    break;
                }
                // a: imprime lo que manda el cliente
                writer.println(clientwrite);
                // a: immprime lo que manda el servidor
                String serverwrite = reader.readLine();
                System.out.println("server: " + serverwrite);
            }
        }catch(Exception e){
            System.out.println(e);
        } 
    }
}