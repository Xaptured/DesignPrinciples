package com.jagdeesh.adapter.DAOImpl;

import com.jagdeesh.adapter.DAO.Movable;
import com.jagdeesh.adapter.DAO.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars; 
	
	public MovableAdapterImpl(Movable luxuryCars) {
		// TODO Auto-generated constructor stub
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEURO(double USD)
	{
		return USD * 0.84;
	}

}
