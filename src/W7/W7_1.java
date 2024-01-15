package W7;

import java.util.Scanner;

public class W7_1 {
    // 백준 5086번 https://www.acmicpc.net/problem/5086
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {

            // 첫 번째 수
            int first = scanner.nextInt();
            // 두 번째 수
            int second = scanner.nextInt();

            // 입력받은 두 숫자가 모두 0인 경우에 while문을 종료시키기
            if(first == 0 && second == 0) break;

            // 첫 번째 수가 두 번째 수의 약수일 때 (= 두 번째 수가 첫 번째 수의 배수일 때)
            if(second % first == 0) {
                System.out.println("factor");
            }


            // 첫 번째 수가 두 번째 수의 배수일 때 (= 두 번째 수가 첫 번째 수의 약수일 때)
            else if(first % second == 0) {
                System.out.println("multiple");
            }

            // 첫 번째 수와 두 번째 수가 서로 약수와 배수의 관계가 아닐 때
            else {
                System.out.println("neither");
            }
        }
    }
}
