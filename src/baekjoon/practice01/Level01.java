package baekjoon.practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 입출력과 사칙연산 : https://www.acmicpc.net/step/1
 */
public class Level01 {

    public void no2557() {
        System.out.println("Hello World!");
    }

    public void no1000_1() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
    }

    public void no1000_2() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no1001() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a - b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no1008() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            System.out.println(a / b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no10869() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no10926() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();

            System.out.println(str + "??!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no18108() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            int a = Integer.parseInt(str);

            System.out.println(a - 543);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no10430() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            System.out.println((a + b) % c);
            System.out.println(((a % c) + (b % c)) % c);
            System.out.println((a * b) % c);
            System.out.println(((a % c) * (b % c)) % c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no2588() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int no1 = Integer.parseInt(br.readLine());
            String no2Str = br.readLine();
            char[] no2Array = no2Str.toCharArray();

            int a = no2Array[0] - '0';
            int b = no2Array[1] - '0';
            int c = no2Array[2] - '0';

            System.out.println(no1 * c);
            System.out.println(no1 * b);
            System.out.println(no1 * a);
            System.out.println(no1 * Integer.parseInt(no2Str));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void no11382() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            System.out.println(a + b + c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
