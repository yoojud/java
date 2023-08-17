package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
// 자동 import 단축키 : shift+alt+o
// 자동 정렬 단축키 : shift+alt+f

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Parent {
    private String name = null;
    private int age = 0;

    public void work() {
        System.out.println("parent class");
    }
}