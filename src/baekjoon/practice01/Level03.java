package baekjoon.practice01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 왕초보 문제 모음 : https://www.acmicpc.net/workbook/view/2032
 */
public class Level03 {

    public void no1550() {
        // https://www.acmicpc.net/problem/1550
        /*
         * 문제 : 16진수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.
         * 입력 : 첫째 줄에 16진수 수가 주어진다. 이 수의 최대 길이는 6글자이다. 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.
         * 출력 : 첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.
         * ex. 입력(A) 출력(10)
         * */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            System.out.println(Integer.parseInt(str, 16));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void no2558() {
        // https://www.acmicpc.net/problem/2558
        /*
         * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
         * 입력 : 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
         * 출력 : 첫째 줄에 A+B를 출력한다.
         * ex. 입력(1\n2) 출력(3)
         * */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int no1 = Integer.parseInt(br.readLine());
            int no2 = Integer.parseInt(br.readLine());

            System.out.println(no1 + no2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
