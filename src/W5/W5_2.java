package W5;

import java.util.Scanner;

public class W5_2 {
    public static void main(String[] args) {
        // 백준 2566번 https://www.acmicpc.net/problem/2566
        Scanner in = new Scanner(System.in);

        int [][] arr = new int [9][9];
        int max = 0;
        int N = 0;
        int M = 0;
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    N=i;
                    M=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((N+1) + " " + (M+1));
    }
}
