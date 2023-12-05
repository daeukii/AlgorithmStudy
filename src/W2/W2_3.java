package W2;

import java.util.Scanner;

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
// 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

public class W2_3 {
    public static void main(String[] args) {
        // 백준 2753번 https://www.acmicpc.net/problem/2753
        Scanner scanner = new Scanner(System.in);
        // 정수 year 작성
        int year = scanner.nextInt();

        scanner.close();

        // year % 100 != 0: 연도가 100으로 나누어 떨어지지 않을 때 (즉, 100의 배수가 아닐 때)
        // year % 400 == 0: 연도가 400으로 나누어 떨어질 때 (즉, 400의 배수일 때)
        // year % 4 == 0: 연도가 4로 나누어 떨어질 때 (즉, 4의 배수일 때)
        // 이 세 가지 조건이 모두 참일 때
        // (또는 연결된 논리 연산자 ||로 연결되어 있으므로 적어도 하나 이상 참일 때) 윤년으로 간주.

        if ((year % 100 != 0 || year % 400 == 0) && year % 4 == 0) {
            // 윤년일때 1을 출력
            System.out.println("1");
        }
        else {
            // 아니면 0을 출력
            System.out.println("0");
        }
    }
}

