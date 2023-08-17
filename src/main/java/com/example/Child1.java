package com.example;

// Parent 클래스의 모든 기능 사용 가능
public class Child1 extends Parent {

    // 기존 기능 재정의 함()
    @Override
    public void work() {
        super.work(); // 부모
        System.out.println("child1 class");
    }
}
