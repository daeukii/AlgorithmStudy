package W5;

import java.util.Scanner;

public class W5_1 {
    public static void main(String[] args) {
        // 백준 2738번 https://www.acmicpc.net/problem/2738

        Scanner scanner = new Scanner(System.in);

        // 첫줄 M, N 만큼 크기의 행렬 지정
        String text = scanner.nextLine();
        String[] tmp = text.split(" ");
        int[][] MN = new int[Integer.parseInt(tmp[0])][Integer.parseInt(tmp[1])];

        // 처음 M x N 만큼의 데이터는 단순 입력
        for (int i = 0; i < Integer.parseInt(tmp[0]); i++) {
            for (int j = 0; j < Integer.parseInt(tmp[1]); j++) {
                MN[i][j] = scanner.nextInt();
            }
        }

        // 다음 M x N 만큼의 데이터는 누적 합
        for (int i = 0; i < Integer.parseInt(tmp[0]); i++) {
            for (int j = 0; j < Integer.parseInt(tmp[1]); j++) {

                // 출력 형식 조정
                if (j == Integer.parseInt(tmp[1]) - 1) {
                    System.out.println(scanner.nextInt() + MN[i][j]);
                } else {
                    System.out.print((scanner.nextInt() + MN[i][j]) + " ");

                }
            }
        }
    }
}
