The applicationContext.xml file shown below defines and configures all the beans needed for the interaction with the database.

First of all, since we are using Spring beans, 
	we must use the <context:component-scan> element to define where the beans are, so that the IOC container will detect them.

We also use the <tx:annotation-driven/> element, 
	so that Spring is @Transactional-aware and can detect the @Transactional annotations 
	to configure the appropriate beans with transactional behavior.

In the datasource bean the DataSource is defined. 
	Spring obtains a connection to the database through a DataSource. 
	The properties to be configured here are the driverClassName, 
	the url to the database and the username and password for the connection to the database.

In the sessionFactory bean we must define the SessionFactory class. 
	The SessionFactory class is a thread-safe object that is instantiated once to serve the entire application. 
	The SessionFactory is used to create Sessions. A Session is used to get a physical connection with a database. 
	The Session object is instantiated each time an interaction is needed with the database. 
	Persistent objects are saved and retrieved through a Session object.
	
The class that implements the sessionFactory is the org.springframework.orm.hibernate4.LocalSessionFactoryBean class. 
	We can configure the properties this class provides in the bean definition. 
	In the datasource property, that is a reference to the DataSource we set the DataSource to be used by the SessionFactory. 
	In the annotatedClasses property we must specify annotated entity classes to register with this Hibernate SessionFactory. 
	The Employee class is the value of this property. 
	The org.springframework.orm.hibernate4.LocalSessionFactoryBean class also provides a hibernateProperties property to configure. 
	Here we can configure all properties provided by Hibernate. 
	For example, JDBC Properties, Hibernate Configuration Properties, Cache and Transaction Properties and SQL dialects. 
	Here we have set two properties. 
	The hibernate.dialect property is set to MySql, and the hibernate.show_sql is set to true so that the queries implemented are printed.

Last but not least, the transactionManager bean is defined. 
	The class to implement the transaction is the org.springframework.orm.hibernate4.HibernateTransactionManager. 
	The bean has a property named sessionFactory, whose value is a reference to the sessionFactory bean.