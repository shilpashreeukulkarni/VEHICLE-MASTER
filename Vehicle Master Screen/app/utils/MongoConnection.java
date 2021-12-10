package utils;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.typesafe.config.Config;

@Singleton
public class MongoConnection {

    private static MongoDatabase db;
    private final Config config;
    private final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("application");

    @Inject
    public MongoConnection(Config config) {
        this.config = config;
        String user = config.getString("mongo.dev.username");
        String database = config.getString("mongo.dev.database");
        String password = config.getString("mongo.dev.password");
        String host1 = config.getString("mongo.dev.host1");
        
//        String user1 = config.getString("mongo.dev1.username1");
//        String database1 = config.getString("mongo.dev1.database1");
//        String password1 = config.getString("mongo.dev1.password1");
//        String host2 = config.getString("mongo.dev1.host2");
//        String host2 = config.getString("mongo.dev.host2");
//        String port = config.getString("mongo.dev.port");
//        String replicaSet = config.getString("mongo.dev.replica");
               
        boolean isURLEnabled = false;

        try
        {
        isURLEnabled = config.getBoolean("is_url_enabled");
        }
        catch(Exception e)
        {

        }

        MongoClientURI uri = null;

        System.out.println("Using UR ::" + isURLEnabled);
        if(isURLEnabled)
        {
        // mongodb://myDBReader:D1fficultP%40ssw0rd@mongodb0.example.com:27017/admin
        uri = new MongoClientURI("mongodb://" + user + ":" + password + "@" + host1 + "/" + database + "?ssl=false");
        System.out.println("URI ::" + uri);
        }
        else
        {

        uri = new MongoClientURI("mongodb://" + user + ":" + password + "@" + host1 + "/" + database + "?retryWrites=true&w=majority");
        System.out.println("URI ::" + uri);
        }

        MongoClient mongoClient = new MongoClient(uri);

        System.out.println("Getting the Connection to Mongo Database ::" + database);
        this.db = mongoClient.getDatabase(database);
        System.out.println("Mongo Database Connection successfully established::" + database);
        System.out.println("Mongo Database Connection::" + this.db);
    }

    public static MongoDatabase getNativeMongoDB() {
        return MongoConnection.db;
    }

}
