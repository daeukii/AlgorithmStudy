package W5;

import java.util.Scanner;

public class W5_1 {
    public static void main(String[] args) {
        // 백준 2738번 https://www.acmicpc.net/problem/2738
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        int[][] arr2 = new int[N][M];

        for (int i=0; i<N; i++) {

            for (int j=0; j<M; j++) {

                arr[i][j] = sc.nextInt();

            }

        }

        for (int i=0; i<N; i++) {

            for (int j=0; j<M; j++) {

                arr2[i][j] = sc.nextInt();

            }

        }

        for (int i=0; i<N; i++) {

            for (int j=0; j<M; j++) {

                System.out.print(arr[i][j]+arr2[i][j]+" ");

                if(j == M-1) {

                    System.out.println();

                }

            }

        }
    }
}
