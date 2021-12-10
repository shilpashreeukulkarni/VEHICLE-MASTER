package models;

import java.util.List;

import org.bson.Document;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.ImplementedBy;
import com.mongodb.client.MongoCollection;

@ImplementedBy(VehicleDAO.class)
public interface VehicleImpl 
{
	Document createVehicle(JsonNode json);

	JsonNode fetchOneVehicle(int vehicle_id);

	List<JsonNode> getAllVehicles();

	JsonNode updateVehicle(JsonNode json);

	JsonNode deleteVehicle(JsonNode json);

	List<JsonNode> deleteAllVehicles();
}
