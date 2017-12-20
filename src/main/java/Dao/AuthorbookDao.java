package Dao;

import Entity.Audiobook_db;
import Entity.Authorsbook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class AuthorbookDao {
    public void addAuthorsbook(Authorsbook_db object) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(object);
            session.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateAuthorsbook(Authorsbook_db object) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(object);
            session.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public List<Authorsbook_db> getAllAuthorsbooks() {
        Session session = null;
        List<Authorsbook_db> objects = new ArrayList<Authorsbook_db>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Authorsbook_db.class).list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public List<Authorsbook_db> getAuthorsbookById(int id){
        Session session = null;
        List<Authorsbook_db> objects = new ArrayList<Authorsbook_db>();;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Authorsbook_db.class)
                    .add(Restrictions.like("idBook", id))
                    .list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public void deleteAuthorsbook(Authorsbook_db object) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(object);
            session.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
