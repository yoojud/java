package com.example;

import java.util.Date;

// 실행이 가능한 java파일
public class Main {
    public static void main( String[] args ) {
        //1. 객체생성 => 클래스명 변수명 = new 클래스명();
        Member m1 = new Member();

        //2. 필요한 데이터 추가 set을 이용해서 추가
        m1.setId("aaa");
        m1.setName("가나다");
        m1.setEmail("a@a.com");
        m1.setAge(25);
        m1.setPassword("bbb");
        m1.setPhone("010-1234-5678");
        m1.setRegdate(new Date());

        //문제) Board에 데이터를 1개 추가하기

    }
}
