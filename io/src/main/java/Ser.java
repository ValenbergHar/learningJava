import javafx.concurrent.Task;

import java.io.*;

public class Ser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(buff);

        objectOutput.writeObject("Pazniak");
        objectOutput.flush();
        objectOutput.close();

        byte[] bytes = buff.toByteArray();
        System.out.println(bytes.length);

        ObjectInput objectInput = new ObjectInputStream(new ByteArrayInputStream(bytes));
        System.out.println((String)objectInput.readObject());



    }
}
