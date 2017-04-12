/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import lab_6_new.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author boss
 */
public class PasswordDao {
    public Session currSession = null;
	public PasswordDao(){
		HibernateUtil.createSessionFactory();
		currSession=HibernateUtil.getSessionFactory().openSession();  
	}
	public void finalize(){
		currSession.close();
	}

    
}
