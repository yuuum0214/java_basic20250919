package etc.fileio.buffered;

import etc.fileio.FileExample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputEx {
    public static void main(String[] args) {

        // dummy data
        StringBuilder text = new StringBuilder();

        for(int i = 1; i <= 10000000; i++){
            text.append(i + "안녕하세요\n");
        }

        long start = System.currentTimeMillis();

        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_RATH + "\\bout.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // StringBuilder를 String객체로 변환 후에 byte 배열로 변환
            byte[] data = new String(text).getBytes();
            bos.write(data);

        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start) * 0.001 + "초");

    }
}
