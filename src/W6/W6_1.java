package W6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class W6_1 {
    public static void main(String[] args) throws IOException {
        // 백준 2745번 https://www.acmicpc.net/problem/2745
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        char[] N = input[0].toCharArray();  // 숫자를 입력받아 char 배열로
        int B = Integer.parseInt(input[1]);  // 무슨 진법인지
        int result = 0;  // 계산 결과 저장 변수


        // 글자를 배열의 인덱스 0부터 꺼내오는데 쓸 변수 i
        // 그리고 (글자의길이-1)부터 시작하는 자릿수 변수 exp(exp는 지수를 뜻한다)
        for(int i=0, exp=N.length-1; i<N.length; i++, exp--){
            int asc = (int) N[i];  // 현재 글자의 아스키코드값

            if('0' <= asc && asc <= '9'){  // 만약 현재 글자가 0-9이면(즉 일반 숫자이면)
                asc -= 48;  // 0의 아스키코드 값인 48을 뺀다
            }else{
                asc -= 55;  // 아니면 알파벳 대문자이다. A가 10이어야 하므로 55를 빼준다
            }

            result += (Math.pow(B, exp) * asc);  // 위의 진법 변환 공식을 그대로 구현한 것
        }

        System.out.println(result);
        br.close();
    }
}
