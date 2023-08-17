package com.example;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 직접 실행 불가능 파일
// Main.java 에서 실행할 예정
// 회원가입

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Member {
    
    //타입 변수=초기값
    String id = null;   // 문자열
    String password = null;
    String name = null;
    int age = 20;
    String email = null;
    String phone = "000-0000-0000";
    Date regdate; //shift+alt+o 자동import

    //나이가 0~9어린이, 10~19 10대,,, 90~99 90대까지
    public String getAgeGrade() {
        if(this.age >= 0 && this.age < 10) {
            return "어린이";
        }
        else {
            return this.age/10 + "0대";
        }
    }

    //연락처 정보에서 - 제거하기
    public String getPhoneReplace() {
        return this.phone.replaceAll("-", "");
    }
}