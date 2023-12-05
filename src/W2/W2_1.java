package W2;

import java.util.Scanner;

public class W2_1 {
    public static void main(String[] args) {
        // 백준 1330번 https://www.acmicpc.net/problem/1330
        Scanner scanner = new Scanner(System.in);
        // 정수 A와 B 작성
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        // A가 B보다 큰 경우에는 '>'를 출력한다.
        if (A > B) System.out.println(">");
        // A가 B보다 작은 경우에는 '<'를 출력한다.
        else if (A < B) System.out.println("<");
        // A와 B가 같은 경우에는 '=='를 출력한다.
        else System.out.println("==");
    }
}
