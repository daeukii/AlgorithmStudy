package W3;

import java.util.ArrayList;
import java.util.Scanner;

public class W3_4 {
    public static void main(String[] args) {
        // 백준 10871번 https://www.acmicpc.net/problem/10871
        Scanner scanner = new Scanner(System.in);

        int N, X;

        N = scanner.nextInt();
        X = scanner.nextInt();

        // 정수 N 개로 이루어진 수열 A
        int A[] = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();

            // 수열 A 에서 X 보다 작은 수를 모두 출력
            if(A[i] < X) {
                System.out.println(A[i]);
            }
        }

    }
}
