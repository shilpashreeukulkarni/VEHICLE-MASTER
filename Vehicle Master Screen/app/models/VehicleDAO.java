package models;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.bson.Document;

import com.fasterxml.jackson.databind.JsonNode;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import play.libs.Json;
import utils.MongoConnection;



public class VehicleDAO implements VehicleImpl
{
	public static MongoDatabase db;
	private final MongoConnection mongoConnection;
	
	@Inject
	public VehicleDAO(final MongoConnection mongoConnection)
	{
    	this.mongoConnection = mongoConnection;
    	db = mongoConnection.getNativeMongoDB();
	}


	
	
	@Override
	public Document createVehicle(JsonNode json)
	{
		// TODO Auto-generated method stub
				
		System.out.println("WELCOME TO VEHICLE MASTER");
		Document doc=null;
		
        MongoCollection<Document> collection=db.getCollection("Vehicle_Info");
        System.out.println("Collection created successfully");  
               
        List<JsonNode> vehicles = new ArrayList<JsonNode>();
	
		Document d11 = new Document();
		try 
		{
			d11.append("vehicle_id", json.findPath("vehicle_id").asInt());
			d11.append("vehicle_type", json.findPath("vehicle_type").textValue());      
			d11.append("LR_Number", json.findPath("LR_Number").textValue());        
			d11.append("vehicle_registered_number", json.findPath("vehicle_registered_number").textValue());
			d11.append("vehicle_registration_date", json.findPath("vehicle_registration_date").textValue());
			d11.append("chassis_number", json.findPath("chassis_number").textValue());
       
       
			BasicDBObject query = new BasicDBObject();
			query.append("vehicle_id", json.findPath("vehicle_id").asInt());
			doc = collection.find(query).first();
		
			if(doc!=null)
			{
				System.out.println("vehicle_id is present");
			}
			else
			{
				collection.insertOne(d11);
				System.out.println("Newly added vehicle : "+d11);
			}
        
			System.out.println("All the vehicles are : ");
        
			MongoCursor<Document> a = collection.find().iterator();
			while(a.hasNext())
			{
				Document b = a.next();
				System.out.println(b);
				vehicles.add(Json.toJson(b));
			}
		}
        catch(Exception e)
        {
        	System.out.println("Exception Handled");
        }
		return d11;
		
	}
	
	

	@Override
	public JsonNode fetchOneVehicle(int vehicle_id)
	{
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO VEHICLE MASTER");
		
		Document doc=null;

		try 
		{
				MongoCollection<Document> collection=db.getCollection("Vehicle_Info");
				
				BasicDBObject query = new BasicDBObject();
				query.append("vehicle_id", vehicle_id);
				doc = collection.find(query).first();
				
				if (doc!=null)
				{
				System.out.println(doc);
				}
				else
					System.out.println("No vehicle with Vehicle ID " + vehicle_id + " found");
		}
    	catch(Exception e)
    	{
    		System.out.println("Exception handled");
    	}
		return Json.toJson(doc);
	}
	
	

	@Override
	public List<JsonNode> getAllVehicles()
	{
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO VEHICLE MASTER");
		
		List<JsonNode> vehicles = new ArrayList<JsonNode>();
		
		Document b=null ;

		MongoCollection<Document> collection=db.getCollection("Vehicle_Info");
				
		MongoCursor<Document> a = collection.find().iterator();
		try 
		{
//			System.out.println("All the vehicle details : ");
			
			while(a.hasNext())
			{
				
				b = a.next();
				System.out.println(b);
				vehicles.add(Json.toJson(b));
			}
					
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
			
		return vehicles;
	
	}
	
	

	@Override
	public JsonNode updateVehicle(JsonNode json)
	{
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO VEHICLE MASTER");
		
		Document doc=null;
		
		BasicDBObject query = new BasicDBObject();
		
		try 
		{
			MongoCollection<Document> collection=db.getCollection("Vehicle_Info");
        
			List<JsonNode> vehicles = new ArrayList<JsonNode>();

			BasicDBObject d11 = new BasicDBObject();
			d11.append("vehicle_id", json.findPath("vehicle_id").asInt());
			d11.append("vehicle_type", json.findPath("vehicle_type").textValue());      
			d11.append("LR_Number", json.findPath("LR_Number").textValue());        
			d11.append("vehicle_registered_number", json.findPath("vehicle_registered_number").textValue());
			d11.append("vehicle_registration_date", json.findPath("vehicle_registration_date").textValue());
			d11.append("chassis_number", json.findPath("chassis_number").textValue());
      
			//  BasicDBObject query = new BasicDBObject();
			query.append("vehicle_id", json.findPath("vehicle_id").asInt());
			doc = collection.find(query).first();
			int i =doc.getInteger("vehicle_id");
			int j= json.findPath("vehicle_id").asInt();
			if(doc!=null && i!=j)
			{
				System.out.println("Vehicle_id is present");
				}
			else		
			{
     
				// int num=json.findPath("vehicle_id").asInt();

				collection.updateOne(query, new BasicDBObject("$set", d11));

				System.out.println("Vehicle updated successfully");
        
			}
        
			System.out.println("All the Vehicles are : ");
        
			MongoCursor<Document> a = collection.find().iterator();
			while(a.hasNext())
			{
				Document b = a.next();
				System.out.println(b);
				vehicles.add(Json.toJson(b));
			}
		}
        catch(Exception e)
        {
        	System.out.println(query+" is not found to update.");
        }
		return Json.toJson(doc);
		
	}

	
	
	@Override
	public JsonNode deleteVehicle(JsonNode json) 
	{
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO VEHICLE MASTER");
		
		Document doc=null; 
		
		BasicDBObject query = new BasicDBObject();
		
		try
		{
			MongoCollection<Document> collection=db.getCollection("Vehicle_Info");
        
			List<JsonNode> vehicles = new ArrayList<JsonNode>();

			BasicDBObject d11 = new BasicDBObject();
			d11.append("vehicle_id", json.findPath("vehicle_id").asInt());

      
			// BasicDBObject query = new BasicDBObject();
			query.append("vehicle_id", json.findPath("vehicle_id").asInt());
			doc = collection.find(query).first();
			int i =doc.getInteger("vehicle_id");
			int j= json.findPath("vehicle_id").asInt();
			if(doc!=null && i!=j)
			{
				System.out.println("Vehicle_id is present");
			}
			else		
			{
     
				// int num=json.findPath("vehicle_id").asInt();

				collection.deleteOne(query);
				System.out.println("Vehicle deleted successfully.");
			}
        
			System.out.println("All the Vehicles are : ");
        
			MongoCursor<Document> a = collection.find().iterator();
			while(a.hasNext())
			{
				Document b = a.next();
				System.out.println(b);
				vehicles.add(Json.toJson(b));
			}
		}
        catch(Exception e)
        {
        	System.out.println(query+" is not found to delete.");
        }
		return Json.toJson(doc);	
	}

	
	
	@Override
	public List<JsonNode> deleteAllVehicles() 
	{
		
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO VEHICLE MASTER");
		
		List<JsonNode> vehicles = new ArrayList<JsonNode>();

		Document b = null ;
		
		try 
		{

			MongoCollection<Document> collection=db.getCollection("Vehicle_Info");
			MongoCursor<Document> a = collection.find().iterator();

			while(a.hasNext())
			{
				b = a.next();
				//System.out.println(b);
				collection.deleteOne(b);
				//vehicles.add(Json.toJson(b));
			}	
			if(b!=null)
			{
				System.out.println("All the vehicles deleted successfully.");
			}
			else
				System.out.println("No vehicles to delete. All vehicles got deleted already.");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
			
		return vehicles;

	}	
}







