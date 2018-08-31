/**
 * 
 */
package com.web.emp.mgmt.domain;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author vaibhav.bansal
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4670948737888832262L;
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private EmployeeDesignation designation;
	
	private LocalDate dob;
	
	private LocalDate doj;
	
	private LocalDate dateOfExit;
	
	private boolean active= Boolean.TRUE;
	
	private CountryEnum country;
	
	private String city;
	
	private Long officeId;
	
	private Long userProfileId;
	
	public enum EmployeeDesignation{
		ASE("Associate Software Engineer"),
		SE("Software Engineer"),
		SSE("Sr. Software Engineer"),
		LEAD("Lead Software Engineer"),
		SR_LEAD("Sr. Lead Software Engineer"),
		MGR_TECH("Manager Technology"),
		MGR_RESOURCE("Manager Resource");
		String description;
		
		private EmployeeDesignation(String description) {
			this.description=description;
		}
		
	}
	

}
