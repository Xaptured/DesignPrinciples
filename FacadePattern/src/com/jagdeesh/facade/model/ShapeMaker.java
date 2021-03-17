package com.jagdeesh.facade.model;

import com.jagdeesh.facade.DAO.Shape;
import com.jagdeesh.facade.DAOImpl.Circle;
import com.jagdeesh.facade.DAOImpl.Rectangle;
import com.jagdeesh.facade.DAOImpl.Square;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker()
	{
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle()
	{
		circle.draw();
	}
	public void drawRectangle()
	{
		rectangle.draw();
	}
	public void drawSquare()
	{
		square.draw();
	}
	
}
