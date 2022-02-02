import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/*************************************************
 * Executor to find food trucks in an area based on the latitude and longitude
 *
 * @author Paridhi Pal
 * 
 */
public class FindFoodTruckExecutor {

	/******************************
	 * Main method to invoke finding the food trucks
	 * @param latitude  of an area
	 * @param longitude of an area
	 * @param path of the Food Truck CSV file
	 * @throws JSONException
	 * @throws IOException
	 * @throws FileNotFoundexception
	 *
	 */
	public static void main(String[] args) throws IOException, JSONException, FileNotFoundException {
		try {
			JSONObject JSONFoodTrucks = FindFoodTrucks.getFoodTruck(args[0], args[1], args[2]);
			System.out.println(JSONFoodTrucks.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(
					"Incorrect input. Please pass Latitude, Longitude and CSV_File_Full_Path separated by space.");
		}
		catch (FileNotFoundException e) {
			System.out.println("Incorrect File Path. Please check the CSV file's full path.");
		}
	}
}
