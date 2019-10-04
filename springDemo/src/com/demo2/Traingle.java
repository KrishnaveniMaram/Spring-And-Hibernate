package com.demo2;

public class Traingle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void printTriangle(){
		System.out.println("pointA "+pointA);
		System.out.println("pointB "+pointB);
		System.out.println("pointc "+pointC);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Traingle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Traingle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Traingle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	

}
