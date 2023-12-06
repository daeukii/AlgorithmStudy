package W2;

import java.util.Scanner;

public class W2_5 {
    public static void main(String[] args) {
        // 백준 2884 https://www.acmicpc.net/problem/2884
        Scanner scanner = new Scanner(System.in);

        // H는 시간, M은 분을 나타내는 변수
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.close();

        // 분이 45보다 클때
        if(M > 45) {
            // 45분을 빼준다.
            M -= 45;
            // 분이 45분일때
        } else if (M == 45) {
            // 00분이 된다.
            M = 0;
            // 분이 45분보다 작을때
        } else if (M < 45) {
            // 자정일 경우에
            if (H == 0) {
                // 전날의 23시로 돌아가야한다
                H = 23;
                // 00분에서 45분을 빼준다
                M = 60 + (M-45);
            }
            else {
                // H가 0이 아닐때 45분을 뺀 후에도 M이 음수라면 60을 더해서 다음 시간대로 넘어가게 한다.
                // 이렇게 하면 0~50분 범위
                H -= 1;
                M = 60 + (M-45);
            }
        }
        System.out.println(H);
        System.out.println(M);
    }
}
