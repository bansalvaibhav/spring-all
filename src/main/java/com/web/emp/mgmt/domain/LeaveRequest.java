/**
 * 
 */
package com.web.emp.mgmt.domain;

import java.time.LocalDate;

/**
 * @author vaibhav.bansal
 *
 */
public class LeaveRequest {
	
	private Long id;
	
	private Long employeeId;
	
	private LeaveType leaveType;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private LeaveStatus leaveStatus;
	
	public enum LeaveStatus{
		APPLIED, APPROVED, REJECTED, AVAILED;
	}

}
