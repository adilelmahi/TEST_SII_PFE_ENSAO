package sii.maroc;

public class Vehicle {

	private String vehicleId;
	private int numOfDoors;
	private String fuelType;
	
	
	public Vehicle(String vehicleId, int numOfDoors){
		this.vehicleId=vehicleId;
		this.numOfDoors=numOfDoors;
		this.fuelType=fuelType;
		
		
	}

public int getNumOfDoors(){
	return numOfDoors;
}
	
	
	
	
	public boolean doorClosed(String closedDoors) {
		closedDoors = closedDoors.replaceAll(" ", "").trim();
		for(int i=0 ; i<= this.numOfDoors; i++ ){
			if(closedDoors.indexOf(String.valueOf(i)) == -1){
				return false;
							}
			
		}
		
		
		
		// TODO Auto-generated method stub
		return true;
	}
	
	
	public float consumption(float kilometer){
		
		
		
	}
}
