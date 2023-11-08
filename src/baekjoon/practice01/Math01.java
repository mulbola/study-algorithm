package baekjoon.practice01;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 수학 : https://www.acmicpc.net/workbook/view/9370
 */
/*
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // some code

    }
}
* */
public class Math01 {

    public void no4375_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
//        while (!(input = br.readLine()).equals("")) {
         while ((input = br.readLine()) != null) {
            int num = Integer.parseInt(input);

            int base = 1;
            int cnt = 1;
            while ((base=base%num) != 0) {
                cnt++;
                base = base*10+1;
            }

            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
    }

    public void no1037() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        StringTokenizer st = new StringTokenizer(nums, " ");
        int[] arrNum = new int[num];
        for (int i=0;i<num;i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrNum);

        System.out.println(arrNum[0] * arrNum[num-1]);
    }

    public void no17427() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        StringTokenizer st = new StringTokenizer(nums, " ");
        int[] arrNum = new int[num];
        for (int i=0;i<num;i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrNum);

        System.out.println(arrNum[0] * arrNum[num-1]);
    }

}
