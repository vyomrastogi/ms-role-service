/**
 * 
 */
package com.vyom.payroll.microservices.roleservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vyom
 *
 */
public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole, Long> {
	
	public EmployeeRole findByRoleName(String roleName);
}
