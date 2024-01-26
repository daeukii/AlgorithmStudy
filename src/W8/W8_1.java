package W8;

import java.util.Scanner;

public class W8_1 {
    public static void main(String[] args) {
        // 백준 27323번 https://www.acmicpc.net/problem/27323
        Scanner scanner = new Scanner(System.in);
        // 세로길이 A
        int A = scanner.nextInt();
        // 가로길이 B
        int B = scanner.nextInt();

        // 직사각형의 넓이는 세로 X 가로
        System.out.println(A*B);
    }
}
