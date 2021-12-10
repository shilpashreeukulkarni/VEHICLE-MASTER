package controllers;

import play.mvc.*;
import utils.MongoConnection;

import java.util.ArrayList;

import javax.inject.Inject;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	public static MongoDatabase db;
	private final MongoConnection mongoConnection;



    @Inject
    public HomeController(final MongoConnection mongoConnection) {
    	this.mongoConnection = mongoConnection;
    	db = mongoConnection.getNativeMongoDB();
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index()
    {
         return ok("HELLO, WELCOME TO VEHICLE MASTER SCREEN");
    }
    
    public Result about() 
    {
        return ok("THANK YOU FOR VISITING VEHICLE MASTER SCREEN");
    }
 
    
    
    
}



