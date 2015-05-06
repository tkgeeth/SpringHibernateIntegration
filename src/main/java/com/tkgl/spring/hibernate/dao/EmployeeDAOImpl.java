/**
 * The Data Access Object implemented to interact with the database uses Hibernate data access technology.
 * It is the EmployeeDAOImpl.java class. 
 * It uses the @Repository annotation, to guarantee that the Data Access Object (DAO) provides exception translation. 
 * When using Hibernate, we must decide how to handle the native exception classes. 
 * The DAO throws a subclass of a HibernateException, that is a run-time exception and does not have to be declared or caught. 
 * We may also deal with IllegalArgumentException and IllegalStateException. 
 * This means that callers can only treat exceptions as generally fatal, unless they want to depend on Hibernate’s own exception structure. 
 * Spring enables exception translation to be applied transparently through the @Repository annotation.
 * The DAO uses the Hibernate SessionFactory that provides Sessions to access the Database. 
 * It gets it as bean reference from the Spring IoC container. 
 * All the methods implemented in the DAO get Session instances by using the getCurrentSession() method of SessionFactory. 
 * The SessionFactory is injected using the @Autowire annotation.
 * The basic CRUD methods implemented here use the 
 * persist(Object object), 
 * get(Class clazz, Serializable id), 
 * update(Object object) and 
 * delete(Object object) API methods of Session to create, retrieve, update and delete an object from the database.
 */
package com.tkgl.spring.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tkgl.spring.hibernate.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// @Override
	public void persistEmployee(Employee employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	// @Override
	public Employee findEmployeeById(String id) {
		return (Employee) sessionFactory.getCurrentSession().get(
				Employee.class, id);
	}

	// @Override
	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);

	}

	// @Override
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}

}