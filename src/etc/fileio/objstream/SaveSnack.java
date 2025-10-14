package etc.fileio.objstream;

import etc.fileio.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {

        // 과자 정보를 텍스트로 파일에 저장하는 것이 아니라
        // 객체를 통째로 바이너리 상태로 세이브파일에 넣어버리기!
        // 나중에는 객체 형태를 JSON 형태로 변경해서 텍스트 형태로 저장하는 것도 가능 (나중에)
        List<Snack> snackList = List.of(
                new Snack("콘칩", 1970, 1500, Snack.Taste.GOOD),
                new Snack("오징어집", 1985, 1800, Snack.Taste.BAD),
                new Snack("사브레", 1980, 3000, Snack.Taste.GOOD)
        );

        try(ObjectOutputStream oos
                = new ObjectOutputStream(
                        new FileOutputStream(FileExample.ROOT_RATH + "\\snack.sav"))){

            oos.writeObject(snackList);
            System.out.println("객체 저장 성공!");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
