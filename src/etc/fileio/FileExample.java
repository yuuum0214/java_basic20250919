package etc.fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

    //파일을 저장할 경로
    public static final String ROOT_RATH = "D:\\Java\\java_basic\\FileUploadEx";

    public static void main(String[] args) {

        // 폴더 생성 명령
        // 1. 생성할 폴더의 경로를 파일 객체로 매핑
        File file = new File(ROOT_RATH);

        // 2. 폴더 생성 명령
        if(!file.exists()){
            file.mkdir(); // 생성해야 할 폴더 경로가 하나일 때
//            file.mkdirs(); -> 생성해야 할 폴더 경로가 여러 개일 때
        }

        // 파일 생성하기
        // 1. 파일이 저장될 경로와 파일명을 함께 파일 객체로 매핑
        File newFile = new File(ROOT_RATH + "\\food.txt");
        if (!newFile.exists()){
            try {
                newFile.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성 실패!");
                e.printStackTrace();
            }
        }

    }
}
