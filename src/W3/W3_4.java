package W3;

import java.util.ArrayList;
import java.util.Scanner;

public class W3_4 {
    public static void main(String[] args) {
        // 백준 10871번 https://www.acmicpc.net/problem/10871
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            int num = scanner.nextInt();
            if(num < X)
                intList.add(num);
        }
        for(int i: intList)
            System.out.println(i);
    }
}
