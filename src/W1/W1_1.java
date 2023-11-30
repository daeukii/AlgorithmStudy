package W1;

import java.util.Scanner;

public class W1_1 {
    public static void main(String[] args) {
        // 백준 10869번 https://www.acmicpc.net/problem/10869
        Scanner scanner = new Scanner(System.in);
        // 자연수 a 입력
        int a = scanner.nextInt();
        // 자연수 b 입력
        int b = scanner.nextInt();

        System.out.println(a - b); // 뼤기
        System.out.println(a + b); // 더하기
        System.out.println(a * b); // 곱하기
        System.out.println(a / b); // 나누기
        System.out.println(a % b); // 나머지
    }
}
