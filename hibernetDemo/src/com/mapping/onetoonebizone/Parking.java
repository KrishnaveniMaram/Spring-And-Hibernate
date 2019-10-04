package com.mapping.onetoonebizone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="parking_table_bi")
public class Parking {
	@Id @GeneratedValue
	@C
	private int parkingId;
	private String loc;
	// acts as a foriegn key
	
	@OneToOne(mappedBy="parking")
	private Emp emp;

	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Parking(int parkingId, String loc) {
	
		this.parkingId = parkingId;
		this.loc = loc;
	}
	public Parking() {
		
	}
	
	
	
	
	
	
	
	
	
	

}
