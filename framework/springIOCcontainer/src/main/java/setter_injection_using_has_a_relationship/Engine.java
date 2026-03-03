package setter_injection_using_has_a_relationship;

public class Engine {

	private int eid;
	private String cc;
	private String type;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", cc=" + cc + ", type=" + type + "]";
	}
	
	
}
