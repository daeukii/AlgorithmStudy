package W3;

import java.util.Scanner;

public class W3_2 {
    // 백준 2562번 https://www.acmicpc.net/problem/2562
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArry = new int[9]; // 원소값이 9개가 있는 배열 array를 생성

        for (int i = 0; i < 9; i++) {
            intArry[i] = scanner.nextInt();
        }
        // for문을 이용해 총 9번 반복하여 각 원소값이 배열에 입력
        int Max = 0; // 최댓값
        int cnt= 0; // 몇번째 수
        for (int j = 0; j < 9; j++) {
            if(intArry[j]>Max)
            {
                Max=intArry[j];
                cnt=j+1;
            }
        }
        // 반복문 안에 if문을 넣어서 최댓값이 Max에 들어갈 수 있도록 9번 반복하고, 반복되는 횟수에 1을 더한 수가 cnt에 들어갈 수 있게 해줬다. 그 다음 값 출력.
        System.out.println(Max);
        System.out.println(cnt);
    }
}
