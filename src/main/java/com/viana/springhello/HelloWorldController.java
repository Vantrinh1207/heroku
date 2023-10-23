package com.viana.springhello;

import com.mongodb.client.*;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.mongodb.client.FindIterable;

import javax.naming.Binding;
import java.util.ArrayList;
import java.util.List;


@RestController
public class HelloWorldController {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public HelloWorldController() {


        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("mydb");
    }

    @RequestMapping()
    public ArrayList index() {
        MongoCollection<Document> collection = database.getCollection("mycollection");
        ArrayList<Document> documents = collection.find().into(new ArrayList<Document>());

        //FindIterable<Document> documents = collection.find();


        for (Document doc : documents) {
            if (doc == null) {
                System.out.print("No document found");
            }
            else {
                System.out.println(doc.toJson());
            }
        }
        return documents;



    }
}



