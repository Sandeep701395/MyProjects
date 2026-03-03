package org.jsp.constructor_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private int eid;
	private String cc;
	private String type;
	public Engine(@Value("100") int eid,@Value("145cc") String cc,@Value("Petrol") String type) {
		super();
		this.eid = eid;
		this.cc = cc;
		this.type = type;
	}
	
	public void engineDetails()
	{
		System.out.println("Engine Id:"+eid);
		System.out.println("Engine cc:"+cc);
		System.out.println("Engine type:"+type);
	}
	
}
