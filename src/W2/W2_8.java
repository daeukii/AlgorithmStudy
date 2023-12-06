package W2;

import java.util.Scanner;

public class W2_8 {
    public static void main(String[] args) {
        // 백준 8393번 https://www.acmicpc.net/problem/8393
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        // 반복문을 이용하여
        for (int i = 1; i <= n; i++) {
            // 대입연산자인 +=를 사용하여 입력받은 n까지의 숫자의 합을 sum에 대입후
            sum += i ;
        }
        // sum을 출력한다
        System.out.println(sum);
    }
}
