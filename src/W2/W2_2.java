package W2;

import java.util.Scanner;

public class W2_2 {
    public static void main(String[] args) {
        // 백준 9498번 https://www.acmicpc.net/problem/9498
        Scanner scanner = new Scanner(System.in);
        // 정수 A 작성
        int A = scanner.nextInt();

        scanner.close();

        // 90 ~ 100점은 A
        if (90 <= A && A <= 100) System.out.println("A");
            // 80 ~ 89점은 B
        else if (80 <= A && A <= 89) System.out.println("B");
            // 70 ~ 79점은 C
        else if (70 <= A && A <= 79) System.out.println("C");
            // 60 ~ 69점은 D
        else if (60 <= A && A <= 69) System.out.println("D");
        // 나머지는 F
        else System.out.println("F");
    }
}
