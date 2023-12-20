package W4;

import java.util.ArrayList;
import java.util.Scanner;

public class W4_1 {
    public static void main(String[] args) {
        // 백준 1316번 https://www.acmicpc.net/problem/1316
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine()); // 입력 단어 개수
        int count = 0; // 그룹단어 개수 체크
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if(isGroupWord(word)) { // isGroupWord 메소드 이용해 그룹단어 판별하기
                count++;
        }
            
        }
        System.out.println(count);
    }
    public static boolean isGroupWord(String word) {
        ArrayList<String> alpList = new ArrayList<String>();

        for (int i = 0; i < word.length(); i++) {
            String alp = word.substring(i, i+1); // 알파벳으로 나눔
            if (!alpList.contains(alp)){ // 알파벳이 alpList에 없다면 추가
                alpList.add(alp);
        } else if (word.charAt(i-1) != word.charAt((i))) {
                // 알파벳이 alpList에 있는데 앞 단어와 같지 않다면 그룹단어가 아니므로 false를 리턴
                return false;
            }
    }
        return true;
}
}
