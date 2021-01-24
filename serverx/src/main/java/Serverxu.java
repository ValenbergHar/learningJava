

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Serverxu {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        System.out.println("waiting...");
        while (true) {
            Socket socket = serverSocket.accept();
            try (
                    InputStream is = socket.getInputStream();
                    OutputStream os = socket.getOutputStream()) {
                byte[] reguest = HttpUtils.readRequestFully(is);
                System.out.println("--  --  -- --");
                System.out.print(new String(reguest));
                System.out.println("-----------------");
                byte[] response = new Date().toString().getBytes();
                os.write(response);
            } finally {
                socket.close();
            }
        }
    }

}

