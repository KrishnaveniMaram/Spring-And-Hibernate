package com.ex1;

import java.util.List;
import java.util.Set;

import com.demo2.Point;

public class Figure {

 Set<Point> points;
	public void setPoints(Set<Point> points){
		this.points=points;
	}
	
public void printFigure()
	{
		for(Point point:points)
			System.out.println(point);
	}
	
	@Override
	public String toString() {
		return "Figure [points=" + points + "]";
	}
	
	
	
	
}
