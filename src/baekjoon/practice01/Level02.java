package baekjoon.practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 조건문 : https://www.acmicpc.net/step/4
 */
public class Level02 {

    public void no1330() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String result = null;
            if (a > b) {
                result = ">";
            } else if (a < b) {
                result = "<";
            } else if (a == b) {
                result = "==";
            }
            System.out.println(result);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no9498() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int no = Integer.parseInt(br.readLine());

            char score = 'F';

            if (no > 89) {
                score = 'A';
            } else if (no > 79) {
                score = 'B';
            } else if (no > 69) {
                score = 'C';
            } else if (no > 59) {
                score = 'D';
            }

            System.out.println(score);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no2753() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int yearInput = Integer.parseInt(br.readLine());

            if ((yearInput % 4 == 0 && yearInput % 100 != 0) || yearInput % 400 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no14681() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int no1 = Integer.parseInt(br.readLine());
            int no2 = Integer.parseInt(br.readLine());

            if(no1 > 0 && no2 > 0) {
                System.out.println(1);
            } else if (no1 < 0 && no2 > 0) {
                System.out.println(2);
            } else if (no1 < 0 && no2 < 0) {
                System.out.println(3);
            } else if (no1 > 0 && no2 < 0) {
                System.out.println(4);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no2884() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (b < 45) {
                a = a == 0 ? 23 : a - 1;
                b = 60 - (45 - b);
            } else {
                b = b - 45;
            }

            System.out.println(a + " " + b);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no2525() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String startTime = br.readLine();
            StringTokenizer st = new StringTokenizer(startTime, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int time = Integer.parseInt(br.readLine());

            int toTime = a * 60 + b + time;
            a = (toTime / 60) % 24;
            b = toTime % 60;

            System.out.println(a + " " + b);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no2480() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String startTime = br.readLine();
            StringTokenizer st = new StringTokenizer(startTime, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int result = 0;

            if ( a == b && b == c) {
                result = 10000 + (a * 1000);
            } else if (a == b || a == c) {
                result = 1000 + (a * 100);
            } else if (b == c) {
                result = 1000 + (b * 100);
            } else {
                int maxNum = a;
                if (b > maxNum) maxNum = b;
                if (c > maxNum) maxNum = c;
                result = maxNum * 100;
            }

            System.out.println(result);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no4375() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String startTime = br.readLine();
            StringTokenizer st = new StringTokenizer(startTime, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int time = Integer.parseInt(br.readLine());

            int toTime = a * 60 + b + time;
            a = (toTime / 60) % 24;
            b = toTime % 60;

            System.out.println(a + " " + b);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
