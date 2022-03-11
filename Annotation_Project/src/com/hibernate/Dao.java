package com.hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Dao {
	public static Session connection()
	{
		Configuration cfg=new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		Session session=cfg.buildSessionFactory().openSession();
		return session;
	}

}
