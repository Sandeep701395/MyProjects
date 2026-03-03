package org.jsp.car_wala.controller;

import org.jsp.car_wala.dao.CarDao;
import org.jsp.car_wala.dto.Car;

public class CarController 
{
	public static void main(String[] args) 
	{
		Car car=new Car();
		car.setCid(102);
		car.setBrand("Avengers");
		car.setCost(1300000);
		
		CarDao carDao=new CarDao();
//		carDao.saveCar(car);
//		carDao.updateCar(car);
//		carDao.findCar(103);
//		carDao.deleteCarById(105);
		carDao.findAllCar();
	}

}
