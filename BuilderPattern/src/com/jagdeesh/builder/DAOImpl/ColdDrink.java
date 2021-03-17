package com.jagdeesh.builder.DAOImpl;

import com.jagdeesh.builder.DAO.Item;
import com.jagdeesh.builder.DAO.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();	
	}

	@Override
	public abstract float price();

}
