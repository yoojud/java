package com.example;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void test1()
    {
        Member m = new Member();
        m.setId("aaa");
        m.setPassword("bbb");
        m.setName("가나다");

        System.out.println(m.toString());
        System.out.println(m.getAgeGrade());
        System.out.println(m.getPhoneReplace());
    }

    @Test
    public void test2()
    {
        System.out.println("aaa");
    }

    @Test
    public void test3()
    {
        Board b = new Board();
        b.setHit(9);
        b.setTitle("일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼");
        b.setContent("내용입니다.");
        b.setNo(1001);
        b.setWriter("작성자입니다.");;
        System.out.println(b.toString());
        System.out.println(b.updateHit());
        System.out.println(b.cutTitle());
    }

    @Test
    public void test4()
    {
        Item i = new Item();
        i.setNo(001);
        i.setName("물품명");
        i.setQuantity(20);
        i.setContent("물품내용");
        i.setPrice(15000);

        System.out.println(i.toString());
    }
}