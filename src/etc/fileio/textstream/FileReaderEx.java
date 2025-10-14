package etc.fileio.textstream;

import etc.fileio.FileExample;

import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader(FileExample.ROOT_RATH + "\\merong.txt")){

//            fr.read(); //한 글자씩 읽어 들이기
            char[] arr = new char[100];
            int result = fr.read(arr);
            System.out.println("문자의 개수 : " + result);

            for (char c : arr) {
                System.out.print(c);
                if (c == 0) break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
