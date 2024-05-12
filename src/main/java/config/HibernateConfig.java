package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConfig {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = buildSession();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static SessionFactory buildSession() throws Exception{
        try {
            return new Configuration().configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
