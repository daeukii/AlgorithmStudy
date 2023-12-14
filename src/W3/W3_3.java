package W3;

import java.io.IOException;
import java.util.Scanner;

public class W3_3 {
    // 백준 10818번 https://www.acmicpc.net/problem/10818
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // 최대와 최솟값을 구하기 위해
        int iMax = -1000000;
        int iMin = 1000000;
        int[] array = new int[N]; // int[N]으로 배열에 개수만큼 index를 만들어 준다

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt(); // 입력할 개수를 입력받는다.
        }
        for(int j : array){
            iMax = Math.max(j, iMax); // 최댓값 구하기
        }
        for(int j : array){
            iMin = Math.min(j, iMin); // 최소값 구하기
        }
            System.out.print(iMin + " " + iMax);
        }
    }



