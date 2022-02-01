
/*************************************************
 * FoodTruck Object Variables and Functions to access these variables
 *
 * @author Paridhi Pal
 * 
 */

public class FoodTruck {

	private String locationid;
	private String applicant;
	private String locDes;
	private String address;
	private String status;
	private String fooditems;
	private String latitude;
	private String longitude;

	/*
	 * Constructor.
	 * 
	 * @param locationid of the truck
	 * 
	 * @param applicant name of the truck
	 * 
	 * @param location details of the truck
	 * 
	 * @param address of the truck
	 * 
	 * @param status of the truck
	 * 
	 * @param fooditems of the truck
	 * 
	 * @param latitude of the truck
	 * 
	 * @param longitude of the truck
	 */
	public FoodTruck(String locationid, String applicant, String locDes, String address, String status,
			String fooditems, String latitude, String longitude) {
		this.locationid = locationid;
		this.applicant = applicant;
		this.locDes = locDes;
		this.address = address;
		this.status = status;
		this.fooditems = fooditems;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/******************************
	 * Get locationid
	 *
	 * @return locationid of the food truck.
	 */
	public String getLocationID() {
		return locationid;
	}

	/******************************
	 * Get applicant name
	 *
	 * @return applicant of the food truck.
	 */
	public String getApplicant() {
		return applicant;
	}

	/******************************
	 * Get location description
	 *
	 * @return location description of the food truck.
	 */
	public String getLocDes() {
		return locDes;
	}

	/******************************
	 * Get Address
	 *
	 * @return address of the food truck.
	 */
	public String getAddress() {
		return address;
	}

	/******************************
	 * Get Status
	 *
	 * @return status of the food truck.
	 */
	public String getStatus() {
		return status;
	}

	/******************************
	 * Get Fooditems
	 *
	 * @return food items of the food truck.
	 */
	public String getFoodItems() {
		return fooditems;
	}

	/******************************
	 * Get Latitude
	 *
	 * @return latitude of the food truck.
	 */
	public String getLatitude() {
		return latitude;
	}

	/******************************
	 * Get Longitude
	 *
	 * @return longitude of the food truck.
	 */
	public String getLongitude() {
		return longitude;
	}
}
