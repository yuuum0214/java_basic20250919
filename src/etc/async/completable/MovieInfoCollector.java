package etc.async.completable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MovieInfoCollector {

    public static void main(String[] args) {
        String movieTitle = "인터스텔라";

        System.out.println("=== 영화 정보 수집 중: " + movieTitle + " ===\n");
        long start = System.currentTimeMillis();

        CompletableFuture<MovieInfo> infoFuture
                = CompletableFuture.supplyAsync(() -> getMovieInfo(movieTitle));

        CompletableFuture<List<Review>> reviewsFuture
                = CompletableFuture.supplyAsync(() -> getReviews(movieTitle));

        CompletableFuture<List<String>> recommendationFuture
                = CompletableFuture.supplyAsync(() -> getRecommendations(movieTitle));

        // 모든 결과를 결합!
        infoFuture
                // A, B 스레드의 작업이 모두 끝나면 이 로직을 실행해서 하나로 합쳐 줘.
                // 첫번째: 합치고자 하는 스레드의 결과물 future
                // 두번째: 익명 객체 -> (A 결과물, B 결과물)
                .thenCombine(reviewsFuture, (info, reviews) -> {
                    info.reviews = reviews;
                    return info;
                })
                .thenCombine(recommendationFuture, (info, recommendation) ->{
                    info.recommendations = recommendation;
                    return info;
                })
                .thenAccept(info->{
                    long end = System.currentTimeMillis();

                    System.out.println("\n=== 수집 완료 ===");
                    System.out.println(info.toString());
                    System.out.println("\n소요 시간: " + (end - start) /1000 + "초");
                })
                .join();

    }


    // API 호출 시뮬레이션
    private static MovieInfo getMovieInfo(String title) {
        System.out.println("[정보 API] 호출 중...");
        sleep(2000);
        System.out.println("[정보 API] 완료");
        return new MovieInfo(title, "크리스토퍼 놀란", 9.1);
    }

    private static List<Review> getReviews(String title) {
        System.out.println("[리뷰 API] 호출 중...");
        sleep(2500);
        System.out.println("[리뷰 API] 완료");
        return Arrays.asList(
                new Review("멋져요!", 10),
                new Review("최고!", 9)
        );
    }

    private static List<String> getRecommendations(String title) {
        System.out.println("[추천 API] 호출 중...");
        sleep(1500);
        System.out.println("[추천 API] 완료");
        return Arrays.asList("그래비티", "마션", "컨택트");
    }

    static class MovieInfo {
        String title;
        String director;
        double rating;
        List<Review> reviews;
        List<String> recommendations;

        MovieInfo(String title, String director, double rating) {
            this.title = title;
            this.director = director;
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "MovieInfo{" +
                    "title='" + title + '\'' +
                    ", director='" + director + '\'' +
                    ", rating=" + rating +
                    ", reviews=" + reviews +
                    ", recommendations=" + recommendations +
                    '}';
        }
    }

    static class Review {
        String comment;
        int score;

        Review(String comment, int score) {
            this.comment = comment;
            this.score = score;
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
