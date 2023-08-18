package jdbs.mongoConnect;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MongoApp obj = new MongoApp();
        //obj.createCollection();
        obj.getCollection();
        //obj.addToCollection("Peter", "Trainee");
        obj.viewDocuments();
       // obj.updateDocument();
        
    }
}
