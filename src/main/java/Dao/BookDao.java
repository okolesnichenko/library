package Dao;

import Entity.Book_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public void addBook(Book_db object) {
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

    public void updateBook(Book_db object) {
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

    public List<Book_db> getAllBooks() {
        Session session = null;
        List<Book_db> objects = new ArrayList<Book_db>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Book_db.class).list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }

    public List<Book_db> getBookById(int id){
        Session session = null;
        List<Book_db> objects = new ArrayList<Book_db>();;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            objects= session.createCriteria(Book_db.class)
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

    public void deleteBook(Book_db object) {
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
