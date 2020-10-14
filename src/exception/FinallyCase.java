package exception;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;

        try{
            writer = Files.newBufferedWriter(file); // IOException 발생가능
            writer.write('A');
            writer.write('Z');
        }catch (IOException e){
            e.printStackTrace();
        }finally { // try에서 예외가 발생하건 안 하건, catch가 실행되건 안되건 무조건 실행된다.
            try{
                if(writer != null)
                    writer.close();
            }catch (IOException e){ // IOException 발생가능
                e.printStackTrace();
            }

        }
    }
}
