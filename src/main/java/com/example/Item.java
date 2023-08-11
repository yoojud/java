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
    int no = 0;
    String name = null;
    String content = null;
    int quantity = 0;
    int price = 0;
    Date regdate;
}
