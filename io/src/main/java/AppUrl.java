import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AppUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.by");
        try (InputStream inputStream = url.openStream();
             ByteArrayOutputStream buff = new ByteArrayOutputStream();
             OutputStream out = new FileOutputStream(new File("google.txt"))) {

            copy(inputStream, out);
            byte[] rawData = buff.toByteArray();
            String html = new String(rawData, "ascii");
            System.out.println(html);
        }


    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        int elem;
        while ((elem = src.read()) != -1) {
            dst.write(elem);
        }
    }
}
