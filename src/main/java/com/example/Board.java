package com.example;
import java.util.Date;

// 실행불가 클래스 
public class Board {

    // 타입 변수 = 초기값
    int no = 0; //글번호
    int hit = 1; //조회수
    String title = null; //제목
    String content = null; //내용
    String writer = null; // 작성자
    Date regdate = null; //등록일


    //source action => getter or setter 만들기
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    
}