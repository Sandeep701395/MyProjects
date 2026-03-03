package org.jsp.springIOC_container_noXML;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		Food food=applicationContext.getBean(Food.class, "food");
			System.out.println(food);
		
		System.out.println("---------------------------");
		
		ArrayList arrayList=(ArrayList) applicationContext.getBean("getArrayList");
		arrayList.add(10);
		arrayList.add(35.3);
		arrayList.add("Ram");
		arrayList.add('a');
		
//		System.out.println(arrayList);
		
		
		for (Object object : arrayList) {
			System.out.println(object);
		}
		
		System.out.println("-------------------");
		
		Bike bike=applicationContext.getBean("mybike",Bike.class);
		bike.details();
			System.out.println(bike);
		
		Bike bike1=applicationContext.getBean("mybike",Bike.class);
		Bike bike2=applicationContext.getBean("mybike",Bike.class);
			System.out.println(bike1);
			System.out.println(bike2);
		
		System.out.println("=================================");
		Bike bike3=applicationContext.getBean("vehicle",Bike.class);
		Bike bike4=applicationContext.getBean("bajaj",Bike.class);
		Bike bike5=applicationContext.getBean("bike",Bike.class);
			System.out.println(bike3);
			System.out.println(bike4);
			System.out.println(bike5);
			
		}
	
	}

