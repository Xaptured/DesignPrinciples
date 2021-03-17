package com.cognizant.db.App;

import com.cognizant.db.service.DBConn;

public class DBApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testDBConn();
	}
	
	private static void testDBConn()
	{
		DBConn conn = DBConn.getConn();
	}
}
