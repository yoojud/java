package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter // 정보저장
@Getter // 정보가져가기
@ToString // 현재정보출력용
@NoArgsConstructor //() 생성자
@AllArgsConstructor //(필요한정보전체) 생성자

public class Book {
    String title = null; // 책제목
    String author = null; // 저자
    int price = 0; // 가격

    // public 반환값 메소드명()
    public String getTitleAuthorPrice() {
        return this.title + "-" + this.author + "-" + this.price;
    }

    //가격 할인
    public int getPriceDiscount(float rate) {
        int ret = this.price - (int)(this.price*rate);
        return ret;
    }

    // // 생성자
    // // public 클래스명
    // public Book(String title, String author, int price) {
    //     this.title = title;
    //     this.author = author;
    //     this.price = price;
    // }
    // public Book() {
    // }
}