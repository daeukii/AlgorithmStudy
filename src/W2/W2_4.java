package W2;

import java.util.Scanner;

public class W2_4 {
    public static void main(String[] args) {
        // 백준 2480번 https://www.acmicpc.net/problem/2480
        Scanner scanner = new Scanner(System.in);

        // 주사위 3개 변수 작성
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        scanner.close();

        // 같은 눈이 3개가 나올때
        if(dice1 == dice2 && dice2 == dice3 && dice1 == dice3) {
            // 10000원 + 같은눈 * 1000원
            System.out.println(10000+(dice1*1000));
            // 같은 눈이 2개가 나올때
        } else if (dice1 == dice2) {
            // 1000원 + 같은눈 * 100원
            System.out.println(1000+(dice1*100));
        } else if (dice1 == dice3) {
            System.out.println(1000+(dice1*100));
        } else if (dice2 == dice3) {
            System.out.println(1000+(dice3*100));
            // 모두 다른눈이 나올때
        } else {
            // 그중 가장 큰눈 * 100원
            System.out.println(Math.max(dice1,Math.max(dice2,dice3))*100);
        }
    }
}
