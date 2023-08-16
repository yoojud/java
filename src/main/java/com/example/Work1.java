package com.example;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

// 설계 구현
public class Work1 implements Repository {

    MongoDatabase db;

    public Work1() {
        String url = "mongodb://id213:pw213@1.234.5.158:37017/db213";
        MongoClient client = MongoClients.create(url);
        this.db = client.getDatabase("db213");
        System.out.println(db.toString());
    }

    @Override
    public int insertItem(Item item) {
        //db내부에 items 컬렉션 생성하기
        MongoCollection<Document> coll = this.db.getCollection("items");

        //item값을 doc로 복사하기
        Document doc = new Document();
        doc.append("_id", item.getNo());
        doc.append("name", item.getName());
        doc.append("content", item.getContent());
        doc.append("price", item.getPrice());
        doc.append("quantity", item.getQuantity());
        doc.append("regdate", item.getRegdate());

        // db에 실제로 저장할때  Document 타입 필요
        coll.insertOne( doc  );
        return 1;
    }

    @Override
    public void printItem(Item item) {
        System.out.println(item.toString());
    }

    @Override
    public void printItemList(ArrayList<Item> List) {
        System.out.println(List.toString());
    }

    @Override
    public void printItemList() {
        MongoCollection<Document> coll = this.db.getCollection("items");
        FindIterable<Document> list =  coll.find();
        for( Document doc : list) {
            System.out.println(doc.toString());
        }
    }
    
}
