package com.example;

import java.util.List;

public interface MemberService {

    // 회원가입
    // member객체에 정보를 담아서 전달하면 반환값 1, 0
    public int insertMember(Member member);

    //회원정보 전체 조회
    public List<Member> selectMemberList();
}

