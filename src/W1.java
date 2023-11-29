import java.util.Scanner;

public class W1 {
    public static void main(String[] args) {
        // 백준 10869번 https://www.acmicpc.net/problem/10869
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        // 백준 10926번 https://www.acmicpc.net/problem/10926
        //Scanner scanner = new Scanner(System.in);
        String ID = scanner.nextLine();
        System.out.println(ID + "??!");


        // 백준 18108번 https://www.acmicpc.net/problem/18108
        // Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(year - 543);
    }
}


