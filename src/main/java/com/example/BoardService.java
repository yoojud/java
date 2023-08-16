package com.example;

public interface BoardService {
    // 게시글 작성
    public int insertBoard(Board board);

    // 게시글 전체 목록 출력
    public void printBoardList();
}
