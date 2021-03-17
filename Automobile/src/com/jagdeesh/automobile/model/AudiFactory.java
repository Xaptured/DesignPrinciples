package com.jagdeesh.automobile.model;

import com.jagdeesh.automobile.abstractClass.Factory;
import com.jagdeesh.automobile.abstractClass.Headlight;
import com.jagdeesh.automobile.abstractClass.Tire;

public class AudiFactory extends Factory{

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	

}
