package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackSol1 {
    // 코딩테스트 준비하는 거면 main에 throws해서 예외처리
    // 왜냐면 저 안에서 예외가 발생하지 않는다는 것을 가정하기 때문임
    // 일반 코드에서는 하지마...
    public static void main(String[] args) throws IOException {

        // 자바 입력 : Scanner는 속도가 좀 느려...
        // 좀 더 빠른 입력을 위해서는 BufferedReader 주로 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        /*
        Stack 객체를 사용해도 되지만, ArrayDeque을 주로 많이 사용합니다.
        1. 상속 구조로 인한 오버헤드 발생
        2. 불필요한 동기화 방지
        3. 확장성 문제 (Vector는 배열이 가득차면 무조건 크기를 두배씩 늘림. ArrayDeque은 필요할 때마다 늘림)
         */
        Deque<Character> stack = new ArrayDeque<>(); //하나씩 스택에 쌓을거라 Character로

        // str.toCharArray() -> 문자열을 char 배열로 리턴
        for (char c : str.toCharArray()) {
            if (c == '(' ) {
                stack.push(c); // 여는 괄호는 스택에 넣자
            } else {
                // 스택이 비어있는데 pop을 하면 에러 발생
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                stack.pop(); // 닫는 괄호일 경우 스택에서 여는 괄호를 뽑아!
            }
        }

        // 모든 처리가 완료된 후 스택이 비어있지 않다면 짝이 맞지 않는다는 뜻
        // 올바른 괄호라면 짝이 맞기 때문에 스택이 비어 있어야 한다
        if(stack.isEmpty()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        br.close();
    }
}
