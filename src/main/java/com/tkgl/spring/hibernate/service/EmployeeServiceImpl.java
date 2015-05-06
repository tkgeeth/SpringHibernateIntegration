/**
 * The EmployeeDAOImpl.java class is injected in the EmployeeServiceImpl.java class. 
 * Thus, in the methods implemented here, the DAO methods are invoked to perform the basic interaction with the database. 
 * The EmployeeServiceImpl.java class is annotated with the @Service annotation, 
 * dictating that it is a Spring Bean and thus allowing Spring to auto-detect it.
 * The @Transactional annotation is placed before the methods, to denote that a transaction is created when each method is invoked.
 * The transaction will be configured in Spring configuration file.
 */
package com.tkgl.spring.hibernate.service;

/**
 * @author Geeth
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkgl.spring.hibernate.dao.EmployeeDAO;
import com.tkgl.spring.hibernate.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	// @Override
	@Transactional
	public void persistEmployee(Employee employee) {
		employeeDAO.persistEmployee(employee);

	}

	// @Override
	@Transactional
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);

	}

	// @Override
	@Transactional
	public Employee findEmployeeById(String id) {
		return employeeDAO.findEmployeeById(id);
	}

	// @Override
	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);

	}

}