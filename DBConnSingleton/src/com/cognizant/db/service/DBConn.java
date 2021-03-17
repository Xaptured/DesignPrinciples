package com.cognizant.db.service;

public class DBConn {

	private static DBConn instance;
	
	private DBConn()
	{
		System.out.println("In a private Constructor");
	}
	
	public static DBConn getConn()
	{
		if(instance == null)
			instance = new DBConn();
		return instance;
	}
}
