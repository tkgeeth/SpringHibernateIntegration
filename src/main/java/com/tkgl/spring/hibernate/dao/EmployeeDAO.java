/**
 * 
 */
package com.tkgl.spring.hibernate.dao;

import com.tkgl.spring.hibernate.model.Employee;

/**
 * @author Geeth
 *
 */
public interface EmployeeDAO {

	void persistEmployee(Employee employee);

	Employee findEmployeeById(String id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);

}