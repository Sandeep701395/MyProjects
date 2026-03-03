package org.jsp.springIOC_container_noXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	private int bid;
	private String capacity;
	private String speed;
	private double voltage;
	public int getBid() {
		return bid;
	}
	@Value(value = "10")
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCapacity() {
		return capacity;
	}
	@Value(value = "4000mAh")
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getSpeed() {
		return speed;
	}
	@Value(value = "44W")
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public double getVoltage() {
		return voltage;
	}
	@Value(value = "3.7")
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	@Override
	public String toString() {
		return "Battery [bid=" + bid + ", capacity=" + capacity + ", speed=" + speed + ", voltage=" + voltage + "]";
	}
	
	
}
