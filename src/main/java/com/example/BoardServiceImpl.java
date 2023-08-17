package com.example;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

// 설계에 따라서 실제로 DB와 연동해서 작업수행하는 곳
// 프레임워크를 사용하는 경우는 작업하지 않음
public class BoardServiceImpl implements BoardService {

    MongoDatabase db;

    // 생성자는 DB 연결 담당
    public BoardServiceImpl() {
        String url = "mongodb://id213:pw213@1.234.5.158:37017/db213";
        MongoClient client = MongoClients.create(url);
        this.db = client.getDatabase("db213");
        System.out.println(db.toString());
    }

    // DB에 게시글 1개 추가
    @Override
    public int insertBoard(Board board) {
        MongoCollection<Document> coll = this.db.getCollection("boards");

        Document doc = new Document();
        doc.append("_id", board.getNo());
        doc.append("hit", board.getHit());
        doc.append("title", board.getTitle());
        doc.append("content", board.getContent());
        doc.append("writer", board.getWriter());
        doc.append("regdate", board.getRegdate());

        coll.insertOne(doc);
        return 1;
    }

    // 목록 가져오기
    @Override
    public void printBoardList() {
        MongoCollection<Document> coll = this.db.getCollection("boards");
        FindIterable<Document> list =  coll.find();
        for( Document doc : list) {
            System.out.println(doc.toString());
        }
    }
}