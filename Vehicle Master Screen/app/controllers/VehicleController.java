package controllers;

import java.io.File; 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.typesafe.config.Config;

import models.VehicleImpl;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

 
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;
//import utils.ConstructResponseUtil;
//import utils.ConstructResponseUtil;
import utils.MongoConnection;
//import utils.ResponseMessage;
//import utils.ResponseMessage;
import play.mvc.Http.Request;
import play.mvc.Result;
import play.mvc.Security;

import play.mvc.Controller;

public class VehicleController extends Controller
{
	private VehicleImpl vehicleImpl;
	
	
	@Inject
	public VehicleController(VehicleImpl vehicleImpl)
	{
		this.vehicleImpl = vehicleImpl;
	}
	
	
	
	public Result createVehicle(Http.Request request )
	{
		System.out.println("HI");

		JsonNode json = request.body().asJson();
		Document createNewVehicle = null;
		try 
		{
			createNewVehicle =  vehicleImpl.createVehicle(json);
		} 
		catch (Exception e) 
		{
			return badRequest(e.getMessage());
		}
		return ok( Json.toJson(createNewVehicle));
	}
	
	
	
	public Result fetchOneVehicle(int vehicle_id) 
	{		
		System.out.println("HI");


		JsonNode vehicle = null;
		try 
		{
			vehicle = vehicleImpl.fetchOneVehicle(vehicle_id);
		} 
		catch (Exception e) 
		{
			return badRequest(e.getMessage());
		}
		return ok( Json.toJson(vehicle));
		
	}
	
	
	
	public Result getAllVehicles() 
	{
		System.out.println("HI");
		
		List<JsonNode> vehList = null;
		try
		{
			vehList =  vehicleImpl.getAllVehicles();
		} 
		catch (Exception e) 
		{
			return badRequest(e.getMessage());
		}
		return ok( Json.toJson(vehList));
		
	}
	
	
	
	public Result updateVehicle(Http.Request request )
	{
		System.out.println("HI");

		JsonNode json = request.body().asJson();
		JsonNode vehicle = null;
		try {
			vehicle =  vehicleImpl.updateVehicle(json);
		} catch (Exception e) {
			return badRequest(e.getMessage());
		}
		return ok( Json.toJson(vehicle));
	}
	
	
	
	public Result deleteVehicle(Http.Request request )
	{
		System.out.println("HI");

		JsonNode json = request.body().asJson();
		JsonNode deleteVeh = null;
		try {
			deleteVeh =  vehicleImpl.deleteVehicle(json);
		}
		catch (Exception e) 
		{
			return badRequest(e.getMessage());
		}
		return ok( Json.toJson(deleteVeh));
	}
	
	
	
	public Result deleteAllVehicles() 
	{
		System.out.println("HI");
		
		List<JsonNode> vehList = null;
		try 
		{
			vehList =  vehicleImpl.deleteAllVehicles();
		} 
		catch (Exception e) 
		{
			return badRequest(e.getMessage());
		}
		return ok( Json.toJson(vehList));		
	}
	

}
