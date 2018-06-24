/**
 * 
 */
package com.vyom.payroll.microservices.roleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vyom
 *
 */

@RestController
public class EmployeeRoleController {
	
	@Autowired
	EmployeeRoleRepository employeeRoleRepository;

	@GetMapping("/role/{roleName}")
	public EmployeeRole getEmployeeRole(@PathVariable String roleName) {
			return employeeRoleRepository.findByRoleName(roleName);
	}

}
