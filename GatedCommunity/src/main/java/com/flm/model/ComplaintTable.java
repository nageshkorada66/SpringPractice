package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaints")
public class ComplaintTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complaintId;
	
	private int residentId;
	
	@Column(nullable = false)
	private String issue;
	
	private int floor;
	
	private int flatNo;
	
	private String status;

	public ComplaintTable() {
		
	}

	public ComplaintTable(int residentId, String issue, int floor, int flatNo, String status) {
		
		this.residentId = residentId;
		this.issue = issue;
		this.floor = floor;
		this.flatNo = flatNo;
		this.status = status;
	}

	public ComplaintTable(int complaintId, int residentId, String issue, int floor, int flatNo, String status) {
		
		this.complaintId = complaintId;
		this.residentId = residentId;
		this.issue = issue;
		this.floor = floor;
		this.flatNo = flatNo;
		this.status = status;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ComplaintTable [complaintId=" + complaintId + ", residentId=" + residentId + ", issue=" + issue
				+ ", floor=" + floor + ", flatNo=" + flatNo + ", status=" + status + "]";
	}

}
