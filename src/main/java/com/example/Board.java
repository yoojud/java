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

// 실행불가 클래스
public class Board {

    // 타입 변수 = 초기값
    int no = 0; //글번호
    int hit = 1; //조회수
    String title = null; //제목
    String content = null; //내용
    String writer = null; // 작성자
    Date regdate; //등록일o

    // 조회수 1씩 증가시키는 기능
    public int updateHit() {
        this.hit++;
        return this.hit;
    }

    // 제목이 20자 이상이면 자르는 기능 ex)rksk....
    public String cutTitle() {
        if(this.title.length()<20){
            return this.title;
        }
        //else
        return this.title.substring(0, 20);
    }
}