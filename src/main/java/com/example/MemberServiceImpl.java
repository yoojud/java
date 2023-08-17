package com.example;

import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MemberServiceImpl implements MemberService {

    MongoDatabase db;

    public MemberServiceImpl() {
        String url = "mongodb://id213:pw213@1.234.5.158:37017/db213";
        MongoClient client = MongoClients.create(url);
        this.db = client.getDatabase("db213");
        System.out.println(db.toString());
    }

    @Override
    public int insertMember(Member member) {
        try { //정상동작
            MongoCollection<Document> coll = this.db.getCollection("members");
            Document doc = new Document();
            doc.append("_id", member.getId());
            doc.append("password", member.getPassword());
            doc.append("name", member.getName());
            doc.append("age", member.getAge());
            doc.append("email", member.getEmail());
            doc.append("phone", member.getPhone());
            doc.append("regdate", member.getRegdate());
            coll.insertOne(doc);
            return 1;
        }
        catch(Exception e) { //오류발생 시점
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Member> selectMemberList() {
        return null;
    }
        
}
