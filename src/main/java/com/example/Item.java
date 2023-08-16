package com.example;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    long no;
    String name;
    String content;
    int quantity; 
    int price = 0;
    Date regdate;

    // 수량과 가격을 곱하여 총판매금액 출력
    public int getTotalPrice() {
        int totalprice = this.quantity * this.price;
        return totalprice;
    }

    // 재고 수량이 100개 미만이면 1 반환, 이상이면 2 반환
    public int getQuantity() {
        if(this.quantity < 100) {
            return 1;
        }
        return 2;
    }

    // 가격 할인
    public long getDiscountPrice(float rate) {
        long disprice = this.price - (long)(this.price*rate);
        return disprice;
    }
}
