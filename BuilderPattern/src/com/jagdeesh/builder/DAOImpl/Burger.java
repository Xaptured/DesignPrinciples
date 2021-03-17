package com.jagdeesh.builder.DAOImpl;

import com.jagdeesh.builder.DAO.Item;
import com.jagdeesh.builder.DAO.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
