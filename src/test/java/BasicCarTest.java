import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class BasicCarTest {
	 @Test
	    public void simpleJsonValidationWithJsonPath() throws Exception {
	       
		 final String body = get("http://localhost:3000/cars?Car.make=Chrysler").asString();

	        final JsonPath json = new JsonPath(body).setRoot("Car");
	        final String make = json.getString("make").toString();
	        final String model = json.getString("model").toString();
	        assertThat(make, equalTo("[Chrysler]"));
	        assertThat(model, equalTo("[pacifica]"));
	    }
	 
	 @Test
	 public void printBluetestla() throws Exception
	 {
	        String responseString =
	                given()
	                    .param("Car.make", "Tesla")
	                    .param("Car.metadata.Color", "Blue")
	                .when()
	                    .get("http://localhost:3000/cars").asString();
	        
	        JsonPath json= new JsonPath(responseString).setRoot("Car");
	             
	        String notesfromBlueTesla= json.getString("metadata.Notes").toString();
	        System.out.println("notesfrom"+notesfromBlueTesla);
	 }
	 
	 @Test
	 public void printCarswithLowestPerDayRental() throws Exception
	 {
		 Double perDayRatePriceAfterDiscount;
		    Map<Car,Double> carWithRentDetails= new HashMap<Car,Double>();
		   
		    
	        String responseString =
	                when()
	                    .get("http://localhost:3000/cars").asString();
	        
	        //JsonPath json= new JsonPath(responseString).setRoot("Car");
	        JsonPath json= new JsonPath(responseString);
	        List<Car> carsDetails= json.getList("Car",Car.class);
	        // list for finding the min value
	        List<Double> minValList = new ArrayList<Double>();

	        // List for keeping the keys of the elements with the min value
	        List<Car> minKeyList = new ArrayList<Car>();

	        // scan the map and put the values to the value list
	        for(Car car:carsDetails) {
	        	perDayRatePriceAfterDiscount=car.getPerdayrent().getPrice()-car.getPerdayrent().getDiscount();
	            minValList.add(perDayRatePriceAfterDiscount);
	           	System.out.println("CAR :: "+car.getMake()+"  -- rent with discount :: "+perDayRatePriceAfterDiscount);
	    	    carWithRentDetails.put(car, perDayRatePriceAfterDiscount);
	        }

	        // scan the map   
	        for(Entry<Car, Double> entry: carWithRentDetails.entrySet()) {
	        	//System.out.println("car value :: "+entry.getValue()+"  -- min value :: "+ Collections.min(minValList));
	   	        // find the min value
	            if(entry.getValue().compareTo(Collections.min(minValList)) == 0) {
	                // add the keys of the elements with the min value at the keyList
	                minKeyList.add(entry.getKey());
	           }
	        }
	        
	        for(Car car:minKeyList) {
	        	System.out.println("Lowest Rent Cars :: "+car.getMake()
	        	+" VIN# :: "+car.getVin()		
	        	+" rent price :: "+car.getPerdayrent().getPrice()
	        			+" rent with discount :: "+carWithRentDetails.get(car));
	 	       
	        }
	 }
	 
	 @Test
	 public void printHighesteRevenueGeneratedCar() throws Exception
	 {
		 	Double perDayRatePriceAfterDiscount;
		 	Double RevenueperYear;
		 	Double RevenuePlusmaintainance;
		    Map<Car,Double> carWithRevenueDetails= new HashMap<Car,Double>();
		   
		    
	        String responseString =
	                when()
	                    .get("http://localhost:3000/cars").asString();
	        
	        JsonPath json= new JsonPath(responseString);
	        List<Car> carsDetails= json.getList("Car",Car.class);
	        // list for finding the min value
	        List<Double> MaxRevenueValueList = new ArrayList<Double>();

	        // List for keeping the keys of the elements with the min value
	        List<Car> maxKeyList = new ArrayList<Car>();

	        // scan the map and put the values to the value list
	        for(Car car:carsDetails) {
	        	perDayRatePriceAfterDiscount=car.getPerdayrent().getPrice()-car.getPerdayrent().getDiscount();
	        	RevenueperYear=perDayRatePriceAfterDiscount*car.getMetrics().getRentalcount().getYeartodate();
	        	RevenuePlusmaintainance=RevenueperYear-(car.getMetrics().getYoymaintenancecost()+car.getMetrics().getDepreciation());
	        	
	        	MaxRevenueValueList.add(RevenuePlusmaintainance);
	           	System.out.println("CAR :: "+car.getMake()+"  -- car with Revenue Details :: "+RevenuePlusmaintainance);
	           	carWithRevenueDetails.put(car, RevenuePlusmaintainance);
	        }

	        // scan the map   
	        for(Entry<Car, Double> entry: carWithRevenueDetails.entrySet()) {
	        	//System.out.println("car value :: "+entry.getValue()+"  -- min value :: "+ Collections.min(minValList));
	   	        // find the min value
	            if(entry.getValue().compareTo(Collections.max(MaxRevenueValueList)) == 0) {
	                // add the keys of the elements with the min value at the keyList
	            	maxKeyList.add(entry.getKey());
	           }
	        }
	        
	        for(Car car:maxKeyList) {
	        	System.out.println("Highest revenue Ge Cars :: "+car.getMake()
	        	+" VIN# :: "+car.getVin()		
	        	+" rent price :: "+car.getPerdayrent().getPrice()
	        			+" rent with revenue details :: "+carWithRevenueDetails.get(car));
	 	       
	        }
	 }


}
