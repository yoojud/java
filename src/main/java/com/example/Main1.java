package com.example;

import java.util.Date;

public class Main1 {
    public static void main( String[] arg) {


        // Student s = new Student(101, "가나다", "컴공", 3, "010-0000-1234", new Date());
        Student s = new Student();
        s.setNo(101);
        s.setName("가나다");
        s.setGrade(3);
        s.setMajor("컴공");
        s.setPhone("010-0000-1234");
        s.setRegdate(new Date());

        System.out.println(s.toString());
        System.out.println(s.getGradeString());

        // ---------------------------
        //Book b = new Book(null, null, 0);

        // String ret = b.getTitleAuthorPrice();
        // System.out.println(ret);

        // int ret1 = b.getPriceDiscount(0.1f);
        // System.out.println(ret1);
        // ---------------------------
        // //1. 클래스의 객체 생성
        // //Book b = new Book();
        // Book b = new Book(title:"java", author:"가나다", price:34000);
        // // //2. 정보추가
        // // b.setTitle("java");
        // // b.setAuthor("가나다");
        // // b.setPrice(34000);
        // //3. 현재  b에 들어있는 값을 확인
        // System.out.println( b.toString() );
        // //4. 학생객체 생성 및 초기값 세팅
        // //Student s = new Student(no:101, name:"가가가", major:"컴공", grade:4, phone:"010-0000-1234", new Date());
        // //5. 학생정보 출력
        // System.out.println(s.toString());
    }

}