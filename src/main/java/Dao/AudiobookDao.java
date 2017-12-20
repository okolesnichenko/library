package Dao;

import Entity.Audiobook_db;
import Hibernate.HibernateUtil;
import antlr.collections.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;

public class AudiobookDao {
    public void addAudiobook(Audiobook_db object) {
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

    public void updateAudiobook(Audiobook_db object) {
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

    public java.util.List<Audiobook_db> getAllAudiobooks() {
        Session session = null;
        java.util.List<Audiobook_db> objects = new ArrayList<Audiobook_db>();

        try {
            session = HibernateUtil.getSessionFactory().openSession();

            objects= session.createCriteria(Audiobook_db.class).list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public java.util.List<Audiobook_db> getAudiobookById(int id){
        Session session = null;
        java.util.List<Audiobook_db> objects = new ArrayList<Audiobook_db>();;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Audiobook_db.class)
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

    public void deleteAudiobook(Audiobook_db object) {
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
