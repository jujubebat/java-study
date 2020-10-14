package exception;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void md1() throws IOException { // IOException 예외를 넘긴다!
        md2();
    }

    // Exception 클래스를 상속하는(그러나 RuntimeException을 상속하지 않는) 예외는 반드시 처리해야한다.
    // 반드시 try ~ catch 문으로 처리하거나 throws를 사용해 다른 영역으로 예외를 넘기거나 해야한다!
    public static void  md2() throws IOException { // IOException 예외를 넘긴다!
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        writer = Files.newBufferedWriter(file);
        writer.write('힘'); // IOException 발생 가능
        writer.write('내'); // IOException 발생 가능
        writer.write('자');

        if(writer != null)
            writer.close(); // IOException 발생 가능
    }
}
