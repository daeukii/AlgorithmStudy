package W2;

import java.util.Scanner;

public class W2_6 {
    public static void main(String[] args) {
        // 백준 2739번 https://www.acmicpc.net/problem/2739
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 반복문을 통해 2의 곱을 계산. i <= 9;라는 조건을 통해 2의 9곱 까지만 계산한다.
        for (int i = 1; i <= 9; i++) {
            // 2의 곱셈 출력
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
}
