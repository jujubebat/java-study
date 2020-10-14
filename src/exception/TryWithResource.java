package exception;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");

        try(BufferedWriter writer = Files.newBufferedWriter(file)){
            writer.write('A');
            writer.write('Z');
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

/*
* BufferedWriter writer = Files.newBufferedWriter(file) 문장이 실행된후에
* write.close() 문장도 반드시 실행되어야 한다.
* 이런 경우 finally 구문을 쓰지 않고 위 코드와 같이 할 수 있다.
* try에 이어 등장하는 소괄호 안에서는 종료의 과정을 필요로 하는 리소스를 생성할 수 있다.
* try 괄호안에서 생성한 리소스에 대해서 close 함수가 호출이 자동으로 보장된다.
*
* 리소스 관련 클래스는 java.lang.AutoCloseable 인터페이스를 반드시 구현해야하고
* java.lang.AutoCloseable 클래스에는 "void close() throws Exception" 이라는 추상 메소드가 존재한다.
* 따라서 try에 이어 등장하는 소괄호 안에서 리소스를 생성하면 리소스에 대한 close 메소드는 반드시 호출되는 것이 보장된다.
* 이로써 코드를 간결하게 할 수 있다.
* */
