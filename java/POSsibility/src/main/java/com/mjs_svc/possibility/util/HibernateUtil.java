package com.mjs_svc.possibility.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Mostly snagged from Hibernate documentation
 *
 * @author Matthew Scott
 * @version $Id: HibernateUtil.java 22 2010-04-10 04:00:49Z matthew.joseph.scott $
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
