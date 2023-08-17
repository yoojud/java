package com.example;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class AppTest {
    @Test
    public void test1() {
        Member m = new Member();
        m.setId("aaa");
        m.setPassword("bbb");
        m.setName("가나다");

        System.out.println(m.toString());
        System.out.println(m.getAgeGrade());
        System.out.println(m.getPhoneReplace());
    }

    @Test
    public void test2() {
        System.out.println("aaa");
    }

    @Test
    public void test3() {
        Board b = new Board();
        b.setHit(9);
        b.setTitle("일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼");
        b.setContent("내용입니다.");
        b.setNo(1001);
        b.setWriter("작성자입니다.");
        ;
        System.out.println(b.toString());
        System.out.println(b.updateHit());
        System.out.println(b.cutTitle());
    }

    @Test
    public void test4() {
        Item i = new Item();
        i.setNo(001L);
        i.setName("물품명");
        i.setQuantity(20);
        i.setContent("물품내용");
        i.setPrice(15000);
        i.setRegdate(new Date());

        System.out.println(i.toString());
        System.out.println(i.getQuantity());
        System.out.println(i.getTotalPrice() + "원");
        System.out.println(i.getDiscountPrice(0.2f) + "원");
    }

    @Test
    // 물품 n개 테스트용
    public void itemListTest() {
        // 클래스 객체 = new 생성자()
        ArrayList<Item> list = new ArrayList<>();

        Item i = new Item();
        i.setNo(001L);
        i.setName("사과");
        i.setQuantity(20);
        i.setContent("맛있음");
        i.setPrice(15000);
        i.setRegdate(new Date());

        Item i1 = new Item();
        i1.setNo(002L);
        i1.setName("배");
        i1.setQuantity(20);
        i1.setContent("맛있음");
        i1.setPrice(23000);
        i1.setRegdate(new Date());

        Item i2 = new Item();
        i2.setNo(003L);
        i2.setName("귤");
        i2.setQuantity(20);
        i2.setContent("맛있음");
        i2.setPrice(20000);
        i2.setRegdate(new Date());

        list.add(i);
        list.add(i1);
        list.add(i2);

        System.out.println(list.toString());
    }

    @Test
    public void repositoryTest() {
        // 설계도면 객체명 = new 생성자()
        Repository obj = new Work1();

        Item i = new Item();

        i.setNo(004L);
        i.setName("배");
        i.setQuantity(20);
        i.setContent("맛있음");
        i.setPrice(15000);
        i.setRegdate(new Date());

        int ret = obj.insertItem(i);
        System.out.println(ret); // 0 또는 1

        // obj.printItem(i);
        // ArrayList<Item> list = new ArrayList<>();
        // list.add(i);
        // obj.printItemList(list);
        // obj.insertItem(null);
    }

    // 213

    @Test
    public void printItemList() {
        Repository obj = new Work1();
        obj.printItemList();
    }

    // 게시글 작성 테스트
    @Test
    public void insertBoard() {
        BoardService obj = new BoardServiceImpl();

        Board b = new Board();

        b.setNo(4);
        b.setTitle("제목");
        b.setContent("내용");
        b.setWriter("작성자");
        b.setHit(111);
        b.setRegdate(new Date());

        int ret = obj.insertBoard(b);
        System.out.println(ret);
    }

    @Test
    public void printBoardList() {
        BoardService obj = new BoardServiceImpl();
        obj.printBoardList();
    }

    @Test
    public void parentClassTest() {
        // 객체 생성
        Parent p = new Parent("가나다", 10);
        // 객체 내용 출력
        System.out.println(p.toString());
        // 객체를 이용한 work메소드 출력
        p.work();
    }

    @Test
    public void childTest() {
        // 객체 생성
        Child1 c = new Child1();
        // work 메소드 호출
        c.work();
    }

    @Test
    public void child2Test() {
        Parent c = new Child2();
        c.work();
    }

    @Test
    public void insertMember() {
        MemberService ms = new MemberServiceImpl();
        Member m = new Member();
        m.setId("2");
        m.setPassword("123");
        m.setName("가나다");
        m.setAge(22);
        m.setEmail("123@com");
        m.setPhone("010-0000-0000");
        m.setRegdate(new Date());
        
        int ret = ms.insertMember(m);
        System.out.println(ret);

    }
}