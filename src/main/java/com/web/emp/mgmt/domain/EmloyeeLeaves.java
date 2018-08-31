package com.web.emp.mgmt.domain;

import java.io.Serializable;

public class EmloyeeLeaves implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	
	private Long employeeId;
	
	private int leaveYear;
	
	private LeaveType leaveType;
	
	private int balance;
	
	private int totalLeaves;
	
	private int pendingApprovalLeaves;
	
	private int approvedLeaves;
	
	private boolean isExpired;
	

}
