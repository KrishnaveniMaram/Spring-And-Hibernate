package com.mapping.many2many;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	
	private int eid;
	private String ename;
	
	private	List<Emp>emps=new ArrayList<Emp>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Emp() {
		
	}
	
	

}
