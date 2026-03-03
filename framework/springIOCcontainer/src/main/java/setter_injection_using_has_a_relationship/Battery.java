package setter_injection_using_has_a_relationship;

public class Battery {

	private int bid;
	private String  capacity;
	private String voltage;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	@Override
	public String toString() {
		return "Battery [bid=" + bid + ", capacity=" + capacity + ", voltage=" + voltage + "]";
	}
	
	
}
