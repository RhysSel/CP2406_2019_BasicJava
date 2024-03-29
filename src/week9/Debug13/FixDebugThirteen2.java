package week9.Debug13;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FixDebugThirteen2 {
    public static void main(String[] args) {
        Path fileIn =
                Paths.get("C:\\Java\\Chapter.13\\DebugData3.txt");
        Path fileOut =
                Paths.get("C:\\Java\\Chapter.13\\DebugData3New.txt");
        String areaCode = "(312) ";
        String phone;
        InputStream input = null;
        OutputStream output = null;
        try {
            input = Files.newInputStream(fileIn);
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(input));
            output = Files.newOutputStream(fileOut);
            phone = reader.readLine();
            while (phone != null) {
                phone = areaCode + phone + System.getProperty("line.separator");
                byte[] phoneBytes = phone.getBytes();
                output.write(phoneBytes);
                phone = reader.readLine();
            }
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

