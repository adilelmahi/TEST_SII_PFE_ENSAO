package sii.maroc;
import java.util.Map;
import java.util.Hashtable;;
public class Vehicles {
	
	private Map<String, Vehicle> listOfVehicle = new Hashtable<String, Vehicle>();
	public Vehicles(String Vehicles){
		
		
	}
	
	
	String move(String id, String ConsumType,String closedDoors, String distance){
		String message = "";
	try{
		Vehicle vehicle = listOfVehicle.get(id);
		if (vehicle!=null){
		
		//transforming the distance string into a float	
	 float kilometer = Float.valueOf(distance.substring(0,distance.length() - 2).trim());
	 // Caluculating the consumption
	 float consumption = vehicle.consumption(kilometer);
	 
	 if(vehicle.doorClosed(closedDoors)){
		 
		 message+= "DOORS OK, MOVING. The" + id +"will consume" + consumption + "L" ;
	 }
	 else {
		 message += "DOORS KO , BLOCKED";
	 }
	  {throw new VehicleException("vehicule n'existe pas");}
		} 
		
	}
		catch (VehicleException e){
			e.printStackTrace();
		}
	
	return message;
	
		
		
		
		
		/*if(id == "CARS" && ConsumType=="diesel" && closedDoors == "1 2 3 4" && distance =="200 KM" )
			return "DOORS OK, MOVING. The CAR will consume 10.00 L";
		
		
		if(id == "TRUCK" && ConsumType=="diesel" && closedDoors == "1 2" && distance =="1000 KM" )
			return "DOORS OK, MOVING. The TRUCK will consume 50.00 L";
		
		
		if(id == "MOTORCYCLE" && ConsumType=="Fuel" && closedDoors == "" && distance =="50 KM" )
			return "DOORS OK, MOVING. The MOTORCYCLE will consume 3.00 L";
		
		
		if(id == "CARS" && ConsumType=="diesel" && closedDoors == "1 3 4" && distance =="200 KM" )
			return "DOORS KO, BLOCKED \n"+
                            "  _\n"+
                            " | \\\n"+
                            " |_|";
		
		
		if(id == "CARS" && ConsumType=="Hybrid" && closedDoors == "1 2 4" && distance =="200 KM" )
			return "DOORS KO, BLOCKED \n"+
                    "  _\n"+
                    " | |\n"+
                    " /_|";
		
	 
		return "null";
	 */
		
		
		
		 
		
		
		
		
		
		
		
	}

}
