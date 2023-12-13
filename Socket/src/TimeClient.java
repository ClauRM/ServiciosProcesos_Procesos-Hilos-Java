import java.net.*;
import java.io.*;

// socket cliente
public class TimeClient {

   public static void main(String[] args) {

       if (args.length < 2) return;

       String hostname = args[0];

       int port = Integer.parseInt(args[1]);

       try (Socket socket = new Socket(hostname, port)) {

           InputStream input = socket.getInputStream();
           BufferedReader reader = new BufferedReader(new InputStreamReader(input));
           String time = reader.readLine();
           System.out.println("hoal");
           System.out.println("Hora de ejecución: "+time);

       } catch (UnknownHostException ex) {
           System.out.println("Server not found: " + ex.getMessage());
       } catch (IOException ex) {
           System.out.println("I/O error: " + ex.getMessage());

       }
   }
}