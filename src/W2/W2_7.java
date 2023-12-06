package W2;

import java.util.Scanner;

public class W2_7 {
    public static void main(String[] args) {
        // 백준 10950번 https://www.acmicpc.net/problem/10950
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);
        }
    }
}
