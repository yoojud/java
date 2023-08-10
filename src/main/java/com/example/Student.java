package com.example;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


public class Student {
    
    long no = 0L; //학번
    String name = null; //학생이름
    String major = null; // 학과
    short grade = 1;
    String phone = null;
    Date regdate; // 등록일자
    
}
