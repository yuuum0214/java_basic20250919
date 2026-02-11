package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class QueueSol1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer : 구분자를 기준으로 문자열을 분할해주는 객체 (공백 기준으로 토큰으로 만듦)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 왕자 수
        int K = Integer.parseInt(st.nextToken()); // K번째 왕자는 나가야 한다.

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i); // 왕자들을 큐에 넣자
        }

        while (queue.size() > 1){ //왕자가 한 명 남을 때까지 반복문 돌리기
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll()); // 맨 앞 왕자를 뽑아 뒤에 줄세우자
            }
            queue.poll(); // K번째 왕자는 나가라!
        }
        System.out.println(queue.poll()); //마지막까지 큐에 남은 왕자

        br.close();
    }
}
