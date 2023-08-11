package com.example;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor  //() 생성자
@AllArgsConstructor //(필요한정보전체) 생성자

public class Student {
    
    long no = 0L; //학번
    String name = null; //학생이름
    String major = null; // 학과
    int grade = 1;
    String phone = null;
    Date regdate; // 등록일자
    
    // 학생정보를 읽어서 1학년 A, 2 B, 3 C, 4 D
    public String getGradeString() {
        if(this.grade == 1) {
            return "A"; 
        }
        else if(this.grade == 2) {
            return "B"; 
        } 
        else if(this.grade == 3) {
            return "C"; 
        }
        else if(this.grade == 4) {
            return "D"; 
        }
        else return "E";
    }






}
