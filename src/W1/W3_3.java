package W1;

import java.util.Scanner;

public class W3_3 {
    public static void main(String[] args) {
        // 백준 18108번 https://www.acmicpc.net/problem/18108
        Scanner scanner = new Scanner(System.in);
        // 년도 출력
        int year = scanner.nextInt();
        // 입력한 불기년도를 서기년도로 바꾸기
        System.out.println(year - 543);
    }

}
