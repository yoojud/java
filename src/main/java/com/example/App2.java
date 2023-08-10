package com.example;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        //Q3> 5개 숫자를 입력받아서 입력받은 숫자의 합과 평균을 구하기
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println((float)sum/(float)a.length);

        // //Q2> 배열 a의 값 입력받고, 10을 더한 수 출력
        // int a[] = new int[4];
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<a.length; i++) { //0~3
        //     a[i] = sc.nextInt();
        // }
        // for(int i=0; i<a.length; i++) {
        //     System.out.print(a[i]+10 + " ");
        // }
        // sc.close();

        // //Q1> 배열 a의 5개 값 중 홀수만 출력
        // int a[] = new int[5];
        // a[0]=1;
        // a[1]=22;
        // a[2]=435;
        // a[3]=343;
        // a[4]=132;

        // for(int i = 0; i <a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }
        // System.out.println();
        // for(int i=0; i<a.length; i++) {
        //     if(a[i] % 2 == 1) {
        //         System.out.print(a[i] + " ");
        //     }
        // }

        // int a = 13;
        // float b = 13.4f;

        // //shitf+alt+o
        // Scanner sc= new Scanner(System.in);
        // int c = sc.nextInt();

        // //for(시작값; 조건; 증가값)
        // for(int i=1; i<=c; i++) {
        //     System.out.print(i + " "); // 1 2 3 4 5
        // }
        // for(int i=c-1; i>=1; i--) {
        //     System.out.print(i + " ");
        // }

        // //c는 5
        // int sum = 0;
        // for(int i=1; i<=c; i++) {
        //     // 1 = 0+1
        //     // 3 = 1+2
        //     // 6 = 3+3
        //     // 10 = 6+4
        //     // 15 = 10+5
        //     sum = sum + i;
        // }
        // System.out.println(sum);
        // System.out.println((float)sum/(float)c);
    }
}
