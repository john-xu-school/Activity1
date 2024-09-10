import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String topSecretData = "my deepest darkest secrets";

        String password = "12345badpassword";


        // 5. Using Files (java.nio.file)
        try {
            Files.write(Paths.get(".myPassword.txt"), password.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Path path = Paths.get("/Users/johnxu/Documents/HTCS/Activity1/.myClassified");
            Files.createDirectories(path);
            Files.write(Paths.get("/Users/johnxu/Documents/HTCS/Activity1/.myClassified/.myConfidential.dat"), topSecretData.getBytes(StandardCharsets.UTF_8));
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}