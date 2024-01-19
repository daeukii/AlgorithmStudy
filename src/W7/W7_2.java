package W7;

import java.util.Scanner;

public class W7_2 {
    // 백준 2501번 https://www.acmicpc.net/problem/2501
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N의 약수들 중
        int K = scanner.nextInt(); // K번째로 작은 수

        for (int i = 1; i <= N; i++) {
            //약수를 찾을 때마다 k를 하나씩 감소
            if (N % i == 0) {
                K--;
            }
            //k번째 i 출력하고 종료시켜주기
            if (K == 0) {
                System.out.println(i);
                break;
            }
        }
        //만약 k번째까지 못갔다면
        if (K != 0)
            System.out.println(0);
    }

}