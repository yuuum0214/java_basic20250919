package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        //배열은 선언할 때 각 인덱스 자리의 값이 비어있지 않고
        //각 타입의 기본값으로 초기화 됨
        //정수형은 0, 실수형은 0.0, 논리는 false, 문자 (공백), 기타 null
        int[][] arr = new int [3][4];
        arr[1][1] = 100;

        System.out.println(Arrays.deepToString(arr));

        for(int[] a : arr){
            for(int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
