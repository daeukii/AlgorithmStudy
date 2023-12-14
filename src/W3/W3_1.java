package W3;

import java.io.IOException;
import java.util.Scanner;

public class W3_1 {
    public static void main(String[] args) throws IOException {
        // 백준 10807번 https://www.acmicpc.net/problem/10807
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 몇개를 입력 받을지
        int[] array = new int[N]; // 입력 받을 수 만큼 index생성

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        // 입력을 받는 수(N) 만큼 array에 숫자를 입력받아 저장한다

        int v = scanner.nextInt(); // 찾을 숫자
        int sum = 0; // 찾는 숫자의 갯수

        for (int k : array) {
            if (k == v) {
                sum++;
            }
        }
        System.out.println(sum);
        // array의 index를 입력받은 수만큼 비교를 해서 찾는 값과 같으면 sum을 증가시켜서 sum값을 출력하는 코드
    }
}
