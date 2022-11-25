package mdbspringboot;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters.*;
import org.bson.Document;
import org.bson.conversions.Bson;

public class CrudRead {
    public static void main(String[] args) {
        String uri = "mongodb+srv://calorieTracker151:<group7_151>@cluster0.p5z8m33.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // database and collection code goes here
            MongoDatabase db = mongoClient.getDatabase("sample_guides");
            MongoCollection<Document> coll = db.getCollection("planets");
            // find code goes here
            MongoCursor<Document> cursor = coll.find().iterator();
            // iterate code goes here
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        }
    }
}

