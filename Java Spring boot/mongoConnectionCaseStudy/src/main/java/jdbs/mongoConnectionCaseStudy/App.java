/*
 *  Exercise for MongoClient 

1.create a database on mongodb 

   Phonedb
2.Create an app in java to store below details as document 
   
   transaction_id
   sender_no
   receiver_no
   message_length
   receiving_time
   
3.display the contents of document on java side
 */

package jdbs.mongoConnectionCaseStudy;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MongoApp1 obj = new MongoApp1();
        //obj.createCollection();
        obj.getCollection();
        //obj.addToCollection(123,"9807654321", "7896543210",45,"9:45");
        //obj.addToCollection(523,"9806788431", "9876543210",90,"1:00");
      
       obj.updateDocument();
       obj.viewDocuments();
    }
}
