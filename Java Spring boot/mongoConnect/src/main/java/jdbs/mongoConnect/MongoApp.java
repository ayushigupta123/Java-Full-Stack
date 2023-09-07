package jdbs.mongoConnect;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

import org.bson.*;
import org.bson.conversions.Bson;

import com.mongodb.*;

public class MongoApp {

	MongoClient client;
	MongoDatabase db;
	public static final String COLLECTION_NAME ="employee_coll";
	MongoCollection<Document> collection;
	
	public MongoApp()
	{
		try {
			client = new MongoClient("localhost",27017);
			db= client.getDatabase("payroll");
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
	
	public void addToCollection(String employeeName, String department)
	{
		Document doc = new Document();
		doc.put("employeeName", employeeName);
		doc.put("department", department);
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
		Document query= new Document().append("employeeName", "Peter");
		
		try {
			Bson updates=Updates.combine(Updates.set("department", "Accounts"));
			UpdateResult updateresult= collection.updateOne(query, updates);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
