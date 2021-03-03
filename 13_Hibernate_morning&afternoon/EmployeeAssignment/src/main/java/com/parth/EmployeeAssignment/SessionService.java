package com.parth.EmployeeAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionService {
	
	public Session getSession()
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

}

