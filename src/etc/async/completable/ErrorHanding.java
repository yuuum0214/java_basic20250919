package etc.async.completable;

import java.util.concurrent.CompletableFuture;

public class ErrorHanding {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
            System.out.println("작업 시작!");
            if(Math.random() < 0.5){
                throw new RuntimeException("작업 실패!");
            }
            return "성공!";
        })
//                .exceptionally(ex -> {
//                    System.out.println("에러 처리: " + ex.getMessage());
//                    return "기본값";
//                })
                .handle((result, ex)->{
                    if(ex != null){
                        System.out.println(ex.getMessage());
                        return "기본값";
                    } else {
                        System.out.println("정상 완료!");
                        return result;
                    }
                })
                .thenAccept(result -> {
                    System.out.println("결과 : " + result);
                })
                .join();
    }

}
