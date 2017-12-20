package Dao;

import Entity.Readersaudiobook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class ReadersaudiobookDao {
    public void addReadersaudiobook(Readersaudiobook_db object) {
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
    //апдейт
    public void updateReadersaudiobook(Readersaudiobook_db object) {
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

    public List<Readersaudiobook_db> getAllReadersaudiobooks() {
        Session session = null;
        List<Readersaudiobook_db> objects = new ArrayList<Readersaudiobook_db>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Readersaudiobook_db.class).list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public List<Readersaudiobook_db> getReadersaudiobookById(int id){
        Session session = null;
        List<Readersaudiobook_db> objects = new ArrayList<Readersaudiobook_db>();;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Readersaudiobook_db.class)
                    .add(Restrictions.like("idAudiobook", id))
                    .list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public void deleteReadersaudiobook(Readersaudiobook_db object) {
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
