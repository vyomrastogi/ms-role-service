/**
 * 
 */
package com.vyom.payroll.microservices.roleservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Vyom
 *
 */
@Entity
public class EmployeeRole {
	
	@Id
	@Column(name="role_id")
	private Long roleId; 
	
	@Column(name="role_name")
	private String roleName;
	
	@Column(name="role_description")
	private String roleDescription;
	
	/**
	 * @param roleId
	 * @param roleName
	 * @param roleDescription
	 */
	public EmployeeRole(Long roleId, String roleName, String roleDescription) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}
	
	public EmployeeRole() {
		
	}

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the roleDescription
	 */
	public String getRoleDescription() {
		return roleDescription;
	}

	/**
	 * @param roleDescription the roleDescription to set
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	

}
