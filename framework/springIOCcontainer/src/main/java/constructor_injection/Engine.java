package constructor_injection;

public class Engine {

	private int eid;
	private String cc;
	private String type;
	
	public Engine(int eid, String cc, String type) {
		
		this.eid = eid;
		this.cc = cc;
		this.type = type;
	}
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
//	public void engineDetails()
//	{
//		System.out.println(getEid());
//		System.out.println(getCc());
//		System.out.println(getType());
//	}
	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", cc=" + cc + ", type=" + type + "]";
	}
	
	
	
	
}
