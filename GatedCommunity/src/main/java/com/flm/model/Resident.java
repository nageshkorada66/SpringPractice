package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Residents")
public class Resident {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int residentId;
	
	@Column(name ="resident_name", unique = true)
	private String residentName;
	private String email;
	private String phoneno;
	private int floor;
	private int flatNo;
	
	@Column(nullable = false)
	private String password;

	public Resident() {
		
	}

	
	public Resident(String residentName, String email, String phoneno, int floor, int flatNo, String password) {
		
		this.residentName = residentName;
		this.email = email;
		this.phoneno = phoneno;
		this.floor = floor;
		this.flatNo = flatNo;
		this.password = password;
	}


	public Resident(int residentId, String residentName, String email, String phoneno, int floor, int flatNo,
			String password) {
		
		this.residentId = residentId;
		this.residentName = residentName;
		this.email = email;
		this.phoneno = phoneno;
		this.floor = floor;
		this.flatNo = flatNo;
		this.password = password;
	}


	public int getResidentId() {
		return residentId;
	}


	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}


	public String getResidentName() {
		return residentName;
	}


	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}


	public int getFlatNo() {
		return flatNo;
	}


	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Resident [residentId=" + residentId + ", residentName=" + residentName + ", email=" + email
				+ ", phoneno=" + phoneno + ", floor=" + floor + ", flatNo=" + flatNo + ", password=" + password + "]";
	}
	
	
}
