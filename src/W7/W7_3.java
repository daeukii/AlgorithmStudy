package W7;

import java.util.Scanner;

public class W7_3 {
    // 백준 11653번 https://www.acmicpc.net/problem/11653
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 가장 쉬운 방법은 2부터 N까지 모든 수를 나눠보면서 나머지가 0일 경우,
        // 그 값을 출력하는 것이다. 즉, 아래와 같이 구할 수 있다.
        // (1의 경우는 소수가 아니므로 당연히 제외되어야 한다.)

        for (int i = 2; i <= N; i++) {
            // for문을 이용하여 최소값인 2로 나눠본다.
            // 2로 나눠지지 않을 경우 수를 하나씩 올려가며 나눈다.
            while (N % i == 0) {
                // 반복문 안 while문을 이용하여 입력받은 N의 값을
                // 반복문을 통해 얻은 값으로 나눠서 0이 될 경우
                // 반복문 종료

                // 현재까지 찾아낸 소인수인 i를 출력하는 역할
                System.out.println(i);
                // N 값을 i로 나눈 몫을 N에 다시 할당하는 역할
                N =  N/i;
            }
        }
    }
}
