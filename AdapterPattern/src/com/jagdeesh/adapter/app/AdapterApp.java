package com.jagdeesh.adapter.app;

import com.jagdeesh.adapter.DAO.Movable;
import com.jagdeesh.adapter.DAO.MovableAdapter;
import com.jagdeesh.adapter.DAOImpl.Bugatti;
import com.jagdeesh.adapter.DAOImpl.MovableAdapterImpl;

public class AdapterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMovableAdapterImpl();
		testConvertUSDtoEURO();
	}
	private static void testMovableAdapterImpl()
	{
		Movable movable = new Bugatti();
		MovableAdapter adapter = new MovableAdapterImpl(movable);
		System.out.println(adapter.getSpeed());
	}
	private static void testConvertUSDtoEURO()
	{
		Movable movable = new Bugatti();
		MovableAdapter adapter = new MovableAdapterImpl(movable);
		System.out.println(adapter.getPrice());
	}
}
