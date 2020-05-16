package com.microservices.assignment.users.dao.impl;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservices.assignment.users.dao.UserDao;
import com.microservices.assignment.users.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	 private SessionFactory sessionFactory;
	@Override
	public User findById(int id) {
        org.hibernate.Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<User> query = session.getNamedQuery("findUserById");  
        query.setParameter("userid", id);
        User account = query.getSingleResult();
        return account;
    }

	final static org.slf4j.Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
   
    @Autowired 
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
  }
