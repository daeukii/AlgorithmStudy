package W6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class W6_2 {
    public static void main(String[] args) throws IOException {
        // 백준 2903번 https://www.acmicpc.net/problem/2903

        // 패턴을 우선 보면 모든 점의 수는 한변의 점의 제곱이다.
        // 점의 갯수는 늘어날때마다 현재 점의 -1만큼 늘어난다.
        // 처음에 2개였던 점이 다음에 2+(2-1)가 되어서 3이 되고,
        // 다음엔 3+(3-1) = 5, 또 다음엔 5+(5-1) = 9 이렇게 늘어난다.
        // 그렇다면 반복문으로 입력값만큼 한 변의 점의 갯수를 늘리고 그 갯수를 제곱해서 출력한다.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int d = 2;

            for(int i = 0; i < N; i++) {
                d += (d - 1);
            }
            System.out.println(d * d);
        }
}
