package jdbs.mongoConnectionCaseStudy;

import com.mongodb.MongoClient;
import com.mongodb.client.*;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;


import java.util.Date;

import org.bson.*;
import org.bson.conversions.Bson;

import com.mongodb.*;

public class MongoApp1 {
	
	MongoClient client;
	MongoDatabase db;
	public static final String COLLECTION_NAME ="call_coll";
	MongoCollection<Document> collection;
	
	public MongoApp1()
	{
		try {
			client = new MongoClient("localhost",27017);
			db= client.getDatabase("Phonedb");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void createCollection()
	{
		try {
			db.createCollection(COLLECTION_NAME);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getCollection()
	{
		try {
			collection=db.getCollection(COLLECTION_NAME);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void addToCollection(int transaction_id, String sender_no, String receiver_no, int message_length, String receiving_time)
	{
		Document doc = new Document();
		doc.put("transaction_id ", transaction_id);
		doc.put("sender_no ",sender_no);
		doc.put("receiver_no ", receiver_no);
		doc.put("message_length ", message_length);
		doc.put("receiving_time ", receiving_time);
		collection.insertOne(doc);
	}
	
	public void viewDocuments()
	{
		FindIterable<Document> iterable= collection.find();
		
		for(Document d:iterable)
		{
			System.out.println(d);
		}
	}


	public void updateDocument()
	{
		Document query= new Document().append("transaction_id", 123);
		
		try {
			Date currentDate=new Date();
			Bson updates=Updates.combine(Updates.set("receiving_time", currentDate));
			UpdateResult updateresult= collection.updateOne(query, updates);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
