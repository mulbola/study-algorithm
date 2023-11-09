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


    public void no2752() {
        // https://www.acmicpc.net/problem/2752
        /*
         * 문제 : 동규는 세수를 하다가 정렬이 하고 싶어졌다.정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
         * 입력 : 정수 세 개가 주어진다. 이 수는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 수는 모두 다르다.
         * 출력 : 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
         * ex. 입력(3 1 2) 출력(1 2 3)
         * */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int[] nums = new int[3];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            for (int i: nums) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void no4101() {
        // https://www.acmicpc.net/problem/4101
        /*
         * 문제 : 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
         * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 두 정수가 주어진다. 두 수는 백만보다 작거나 같은 양의 정수이다. 입력의 마지막 줄에는 0이 두 개 주어진다.
         * 출력 : 각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를, 아니면 No를 한 줄에 하나씩 출력한다.
         * ex. 입력: 1 19 \n 4 4 \n 23 14 \n 0 0
         * 출력: No \n No \n Yes
         * */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            /*String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");*/


            while (true) {
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (a == b && a == 0) {
                    break;
                }

                if (a > b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
