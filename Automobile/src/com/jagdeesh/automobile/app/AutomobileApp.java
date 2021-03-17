package com.jagdeesh.automobile.app;

import com.jagdeesh.automobile.abstractClass.Factory;
import com.jagdeesh.automobile.abstractClass.Headlight;
import com.jagdeesh.automobile.abstractClass.Tire;
import com.jagdeesh.automobile.model.MercedesFactory;

public class AutomobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new MercedesFactory();
		Tire tire = factory.makeTire();
		Headlight headlight = factory.makeHeadlight(); 
		tire.getTireName();
		headlight.getHeadlightName();
	}

}
