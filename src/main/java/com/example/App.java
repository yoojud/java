package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Q9> 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        for(int i = n-1; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();

        // //Q8> 숫자 1개를 입력받아서 입력받은 숫자까지의 합, 평균
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=n; i++) {
        //     sum += i;
        // }
        // System.out.println("합은 = " + sum);
        // System.out.println("평균은 = " + sum/(float)n);
        // sc.close();

        // //Q7> 숫자 1개 받아서 5의 배수만 출력 ex) 13 -> 5 10
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++) {  //#1
        //     if(i % 5 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println();
        // for(int i = 5; i <= n; i+=5) {  //#2
        //     System.out.print(i + " ");
        // }
        // sc.close();

        // //Q6> 숫자 1개 n까지 숫자 출력
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // for(int i = n; i >= 1; i--) {
        //     System.out.print(i + " ");
        // }
        // sc.close();

        // //Q5> 숫자 1개 3의배수이면 3, 5의 배수이면 5, 3의배수5의 배수
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if(n % 3 == 0 && n % 5 ==0) {
        //     System.out.println("3 & 5");
        // }
        // else if(n % 5 == 0) {
        //     System.out.println("5");
        // }
        // else if(n % 3 == 0) {
        //     System.out.println("3");
        // }
        // else System.out.println("해당하지 않음");
        // sc.close();

        // //Q4> 숫자 2개, 평균 95 A+, 90 A, 80 B, 70 C, D를 출력하시오.
        // Scanner sc = new Scanner(System.in);
        // int num= sc.nextInt();
        // int num1 = sc.nextInt();
        // float avg = (num + num1)/2.0f;
        // char grade = ' ';
        // char opt = ' ';
        // if(avg >= 90) {
        //     grade = 'A';
        //     if(avg > 90 && avg < 100) {
        //         opt = '+';
        //     }
        // }
        // else if(avg >= 80) {
        //     grade = 'B';
        // }
        // else if(avg >= 70) {
        //     grade = 'C';
        // }
        // else grade = 'D';
        // System.out.printf("학점: %c%c", grade, opt);
        // sc.close();

        // // //Q2> 숫자 1개를 받아서 각 자리수의 합 ex) 1234 -> 10
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int a = num / 1000;
        // int b = (num / 100) % 10;
        // int c = (num / 10) % 10;
        // int d = num % 10; 
        // int sum = a+b+c+d;
        // System.out.println(sum);
        // // sc.close();

        // //Q3> 숫자 1개를 받아서 숫자 뒤집기
        // System.out.println(d + "" + c + "" + b + "" + a);
        // sc.close();

        // //Q1> 숫자 2개를 받아서 합이 5의 배수인지 판별
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int num1 = sc.nextInt();
        // int sum = num + num1;
        // if(sum % 5 == 0) {
        //     System.out.println("Y");
        // }
        // else System.out.println("N");
        // sc.close();

        // int num = 123;
        // float num1 = 12.3f;
        // System.out.println(num);
        // System.out.println(num1);
        // System.out.println( "Hello World!" );
    }
}
