/**
 * 
 */
package com.tkgl.spring.hibernate.service;

import com.tkgl.spring.hibernate.model.Employee;

/**
 * @author Geeth
 *
 */
public interface EmployeeService {
	void persistEmployee(Employee employee);

	Employee findEmployeeById(String id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}
