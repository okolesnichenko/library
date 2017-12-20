package Dao;

import Entity.Authoraudiobook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class AuthoraudiobookDao {
    public void addAuthoraudiobook(Authoraudiobook_db object) {
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

    public void updateAuthoraudiobook(Authoraudiobook_db object) {
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

    public List<Authoraudiobook_db> getAllAuthoraudiobooks() {
        Session session = null;
        List<Authoraudiobook_db> objects = new ArrayList<Authoraudiobook_db>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Authoraudiobook_db.class).list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public List<Authoraudiobook_db> getAuthoraudiobookById(int id){
        Session session = null;
        List<Authoraudiobook_db> objects = new ArrayList<Authoraudiobook_db>();;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Authoraudiobook_db.class)
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

    public void deleteAuthoraudiobook(Authoraudiobook_db object) {
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
