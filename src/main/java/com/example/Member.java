package com.example;
import java.util.Date;
// 직접 실행 불가능 파일
// Main.java 에서 실행할 예정
// 회원가입
public class Member {
    
    //타입 변수=초기값
    String id = null;   // 문자열
    String password = null; 
    String name = null;
    int age = 0;
    String email = null;
    String phone = "000-0000-0000";
    Date regdate; //shift+alt+o 자동import
    

    //getter or setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }


    
}