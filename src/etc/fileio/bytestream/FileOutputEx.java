package etc.fileio.bytestream;

import etc.fileio.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputEx {
    public static void main(String[] args) {

        // 바이트 기반 출력 스트림 - 1바이트 단위로 데이터 처리
        // 주로 이미지, 영상같은 바이너리 데이터에 적합
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명: ");
        String fileName = sc.next();

        FileOutputStream fos = null;

        try {
            fos
                = new FileOutputStream(FileExample.ROOT_RATH + "\\" + fileName + ".txt");
            System.out.print("문장을 입력하세요 : ");
            sc.nextLine(); // 위에 파일명 작성 후 엔터 입력값 처리
            String str = sc.nextLine();

            byte[] arr = str.getBytes(); //문자열 데이터를 바이트 배열로 반환
            fos.write(arr); // 파일을 바이트 단위로 써 내림

            System.out.println("파일이 정상적으로 저장되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 스트림을 더 이상 사용하지 않는 경우
            // 시스템 자원을 반납하는 코드를 작성하는 것을 권장합니다
            try {
                fos.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
