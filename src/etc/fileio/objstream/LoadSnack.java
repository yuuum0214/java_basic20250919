package etc.fileio.objstream;

import etc.fileio.FileExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {

        try (ObjectInputStream ois
                     = new ObjectInputStream(new FileInputStream(FileExample.ROOT_RATH + "\\snack.sav"))){

            // 역직렬화 (직렬화 되어 저장된 객체를 다시 실제 객체로 돌리는 과정)
            List<Snack> snackList = (List<Snack>) ois.readObject();

            for (Snack snack : snackList) {
                System.out.println(snack);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
