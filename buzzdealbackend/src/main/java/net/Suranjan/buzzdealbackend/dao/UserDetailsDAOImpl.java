package net.Suranjan.buzzdealbackend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import net.Suranjan.buzzdealbackend.model.UserDetails;

public class UserDetailsDAOImpl implements UserDetailsDAO {

	@Autowired
	SessionFactory sessionFactory;

	
	@Transactional
	@Override
	public boolean RegisterUser(UserDetails User) {
		try {
			sessionFactory.getCurrentSession().save(User);
			System.out.println("Registered User");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	@Override
	public boolean UpdateUser(UserDetails User) {
		try {
			sessionFactory.getCurrentSession().update(User);
			System.out.println("Updated User");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UserDetails getUser(String username) {
		Session session = sessionFactory.openSession();
		UserDetails User = (UserDetails) session.get(UserDetails.class, username);
		session.close();
		return User;
	}

	@Transactional
	@Override
		public boolean ApproveUser(UserDetails user) {
			try{
		        Session session=sessionFactory.openSession();
			     UserDetails User=(UserDetails) session.get(UserDetails.class,user.getUsername());
			     if(User.isEnabled()==true)
			       {
				     System.out.println("User is approved");
				      return true;
			       }
			         else
			          {
				        return false;
			          }
			}catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
		}

}
