package org.jsp.vehicle;

public class VehicleStart {

	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void doStart()
	{
		vehicle.start();
	}
}
