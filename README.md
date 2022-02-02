# FindFoodTrucks
Java program to find food trucks in an area based on latitude and longitude from a CSV file. The output is in JSON format. 

## Genesis of this project
A project written in JAVA to find food trucks in an area based on latitude and longitude. The JAR file could be run from the command line and the output is in JSON format. Given JSON is widely used data format, this provides us with the flexibility to consume the output programatically and enhance the project. 

The key components included:
* A CSV file that lists all the food trucks in San Francisco. It contains food items, name, address, status, latitude and longitude details.
* A JAR file that would take latitude, longitude and CSV file as parameters and return food trucks in that particular latitude and longitude in JSON format.
* Source code of the JAVA project, that a) reads from the food trucks CSV file; b) searches for the food trucks based on latitude and longitude and; c) builds and returns JSON of the filtered food trucks. 

## Steps to run the project 
Prerequiste: JAVA should be installed on the machine.

Steps:
* Copy the JAR file 'FindFoodTrucks.jar' and the CSV file 'Mobile_Food_Facility_Permit.csv' onto your machine.
* Open the command line interface.
* Run the command:

```java -jar FindFoodTrucks.jar <<latitude>> <<longitude>> <<full_path_of_CSV_file>> ```
* Output will be displayed on the console. The output can also be saved in a text file by running the below command.

``` java -jar FindFoodTrucks.jar <<latitude>> <<longitude>> <<full_path_of_CSV_file>> > output.txt ```

## JSON output details
The output includes:

* Address
* LocationID
* Latitude
* Location 
* Description
* Food Items
* Longitude
* Applicant name
* Status

An example of the JSON output:

```
{
   "foodtrucks":[
      {
         "address":"667 MISSION ST",
         "locationID":"1565594",
         "latitude":"37.7865580501799",
         "locDes":"MISSION ST: ANNIE ST to 03RD ST (663 - 699)",
         "foodItems":"Noodles: Meat & Drinks",
         "longitude":"-122.40103337534973",
         "applicant":"MOMO INNOVATION LLC",
         "status":"APPROVED"
      },
      {
         "address":"667 MISSION ST",
         "locationID":"812018",
         "latitude":"37.7865580501799",
         "locDes":"MISSION ST: ANNIE ST to 03RD ST (663 - 699)",
         "foodItems":"Chicken Tikka Masala: Vegetarian Rice Plate: Burritos: Tacos: Mango Lassi",
         "longitude":"-122.40103337534973",
         "applicant":"SF Street Food",
         "status":"REQUESTED"
      }
   ]
}
```
## Source code details

JAVA classes in the project:
* FindFoodTrucks - Read from and Parse CSV file. CSV file contains food truck details of San Francisco including their locations (latitude and longitude. Find food trucks in an area based on the latitude and longitude details.
* FoodTruck - FoodTruck Object Variables and Functions to access these variables.
* FindFoodTruckExecutor - Executor to find food trucks in an area based on the latitude and longitude.

## Common exceptions captured

The JAR to run successfully requires 3 inputs separated by space (1. latitude 2. longitude and 3. Full CSV file path). 

* Incorrect inputs passed -  In case of any issues with the inputs, it displays a message "Incorrect input. Please pass Latitude, Longitude and CSV_File_Full_Path separated by space."
* Incorrect CSV File Path - In case of any issues with the file path, it displays a message "Incorrect File Path. Please check the CSV file's full path."

An example of a successful command:

```
java -jar FindFoodTrucks.jar 37.7865580501799 122.40103337534973 /Users/msuser/Downloads/Mobile_Food_Facility_Permit.csv > output.txt
```

## Future scope of enhancements

* Develop a web API (inclined towards REST API). 
* Read the CSV file from the online website directly. 
