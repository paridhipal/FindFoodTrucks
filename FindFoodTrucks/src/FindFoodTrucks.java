import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/*************************************************
 * Read from and Parse CSV file. CSV file contains food truck details of
 * SanFranciso including their locations (latitude and longitude) Find food
 * trucks in an area based on the latitude and longitude details.
 *
 * @author Paridhi Pal
 * 
 */

public class FindFoodTrucks {

	/*******************************
	 * Parse CSV file and find FoodTrucks
	 *
	 * @param latitude  of an area
	 * @param longitude of an area
	 * @param path of the Food Truck CSV file
	 * @throws IOException In case of failure in reading CSV file.
	 * @return List of FoodTrucks in an area in JSON format
	 * @throws JSONException
	 */
	public static JSONObject getFoodTruck(String latitude, String longitude, String CSVPath)
			throws IOException, JSONException, FileNotFoundException {
		List<FoodTruck> listFoodTruck = new ArrayList<FoodTruck>();
		JSONObject jsonFoodTrucks = new JSONObject();
		/*************************************************
		 * Get the list of food trucks and Convert these into JSON
		 */
		listFoodTruck = findFoodTruck(latitude, longitude, CSVPath);
		jsonFoodTrucks = createFoodTruckJSON(listFoodTruck);

		return jsonFoodTrucks; 
	}

	/*******************************
	 * Parse CSV file and find FoodTrucks
	 *
	 * @param latitude  of an area
	 * @param longitude of an area
	 * @param path of the Food Truck CSV file
	 * @return list of FoodTrucks in an area
	 * @throws IOException In case of failure in reading CSV file.
	 * @throws JSONException
	 */
	private static List<FoodTruck> findFoodTruck(String latitude, String longitude, String CSVPath)
			throws IOException, FileNotFoundException {
		String line = "";
		List<FoodTruck> listFoodTruck = new ArrayList<FoodTruck>();
		/*************************************************
		 * Read from the CSV file and find trucks in a specific latitude and longitude
		 * Delimiter and CSV file path in the constants class
		 */
		BufferedReader br = new BufferedReader(new FileReader(CSVPath));
		// Reading each row
		while ((line = br.readLine()) != null) {
			// Splitting the row based on a delimiter
			String[] truck = line.split(",");
			// Converting the row to FoodTruck object
			FoodTruck foodTruck = createFoodTruck(truck);
			// Check for the latitude and longitude of the truck
			if (foodTruck.getLatitude().contains(latitude) && foodTruck.getLongitude().contains(longitude)) {
				// Add the foodTruck to the output list
				listFoodTruck.add(foodTruck);
			}
		}
		br.close();
		return listFoodTruck;
	}

	/*******************************
	 * Convert list of food trucks into JSONObject
	 *
	 * @param list of food trucks
	 * @return JSONObject of food trucks
	 * @throws JSONException
	 */
	private static JSONObject createFoodTruckJSON(List<FoodTruck> lstFoodTrucks) throws JSONException {
		JSONObject jsonFoodTrucks = new JSONObject();
		if (!lstFoodTrucks.isEmpty()) {
			jsonFoodTrucks.put("foodtrucks", lstFoodTrucks);
		}
		return jsonFoodTrucks;
	}

	/*************************************************
	 * Convert a line of the CSV file to FoodTruck object
	 * 
	 * @param array of strings when the row is split
	 * @return FoodTruck 
	 */
	private static FoodTruck createFoodTruck(String[] metadata) {
		String locationid = metadata[0];
		String applicant = metadata[1];
		String locDes = metadata[4];
		String address = metadata[5];
		String status = metadata[10];
		String fooditems = metadata[11];
		String latitude = metadata[14];
		String longitude = metadata[15];
		return new FoodTruck(locationid, applicant, locDes, address, status, fooditems, latitude, longitude);
	}
}