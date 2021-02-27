package com.pattern.dependencyinjection;


import com.pattern.dependencyinjection.vehicle.Engine;
import com.pattern.dependencyinjection.vehicle.Vehicle;

public class Client {
	
	public static void main(String args[]){
		
		Vehicle car1 = new Vehicle(new Engine("Large engine"));
		car1.crankIgnition();
		
//		ApplicationContext context =
//	             new ClassPathXmlApplicationContext("applicationContext.xml");
//		Vehicle mrBeansCar = (Vehicle) context.getBean("mrBeansCar");
//		mrBeansCar.crankIgnition();

//		Vehicle car1 = new Vehicle((Engine) context.getBean("engine"));
//		car1.crankIgnition();
	}
}
