package org.jsp.constructor_injection;

import java.util.ArrayList;

import org.jsp.springIOC_container_noXML.MyApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TabletDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		Tablet tablet=context.getBean(Tablet.class);
		System.out.println(tablet);
		
		System.out.println("=======================");
		
		ArrayList arrayList=(ArrayList) context.getBean("getArrayList");
		arrayList.add(10);
		System.out.println(arrayList);
	}
}
