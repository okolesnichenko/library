package Dao;

import Entity.Author_db;
import Entity.Reader_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class ReaderDao {
    public void addReader(Reader_db object) {
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
    public void updateReader(Reader_db object) {
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

    public List<Reader_db> getAllReaders() {
        Session session = null;
        List<Reader_db> objects = new ArrayList<Reader_db>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Reader_db.class).list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }
    //получаем автора по id
    public List<Reader_db> getReaderById(int id){
        Session session = null;
        List<Reader_db> objects = new ArrayList<Reader_db>();;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Reader_db.class)
                    .add(Restrictions.like("idReader", id))
                    .list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public void deleteReader(Reader_db object) {
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
