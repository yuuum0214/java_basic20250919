package etc.fileio.bytestream;

import etc.fileio.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputEx {
    public static void main(String[] args) {

        // try ~ with ~ resources : 메모리 정리가 필요한 객체에 대해 자동 클로즈 처리 (자바 8 이상)
        // 자동 close 대상 객체가 Closeable의 구현체여야 함
        try (FileInputStream fis
                     = new FileInputStream(FileExample.ROOT_RATH + "\\hello.txt");) {
            while (true){
                int data = fis.read(); // 1바이트 단위로 데이터 읽기
                System.out.print((char) data); // 숫자형을 문자형으로 변환 출력
                if (data == -1) break; // read() 메서드가 더 이상 읽을 값이 없다면 -1을 리턴
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
