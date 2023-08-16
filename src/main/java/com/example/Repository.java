package com.example;

import java.util.ArrayList;

// interface = 설계만 가능
public interface Repository {
    
    //db에 데이터 추가
    public int insertItem(Item item);

    public void printItem(Item item);

    public void printItemList(ArrayList<Item> List);

    //db에 있는 내용을 가져와서 출력하기
    public void printItemList();
}
