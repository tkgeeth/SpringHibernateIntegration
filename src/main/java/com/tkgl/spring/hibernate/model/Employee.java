/**
 * Employee.java class is a class with three properties. 
 * It uses the javax.persistence annotations to be mapped to a table, EMPLOYEE in the database. 
 * In particular, the @Entity annotation specifies that the class is an entity. 
 * The @Table annotation specifies the primary table for the annotated entity. 
 * The @Column annotation is used to specify a mapped column for the persistent field, 
 * whereas the @Id annotation specifies the primary key field of the entity.
 */
package com.tkgl.spring.hibernate.model;

/**
 * @author Geeth
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "ID", nullable = false)
	private String id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "AGE", nullable = false)
	private long age;
	
	public Employee() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

}