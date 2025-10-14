package etc.fileio.textstream;

import etc.fileio.FileExample;

import java.io.FileWriter;

public class FileWriterEx {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter(FileExample.ROOT_RATH + "\\merong.txt")){

            String str = "자바 파일 입출력을 공부하는 중이에요.\r\n오늘은 화요일입니다.\r\n왜 금요일이 아니지???";

            fw.write(str);

            System.out.println("파일 정상 저장 완료");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
