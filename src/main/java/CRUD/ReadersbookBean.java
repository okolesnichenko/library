package CRUD;

import Dao.ReadersbookDao;
import Entity.Readersbook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "readersbookBean", eager = true)
@RequestScoped
public class ReadersbookBean {
    private int idBook;
    private int idReader;
    public int idForUpdate;
    ReadersbookDao rb1 = new ReadersbookDao();

    public ReadersbookBean(){}

    public List<Readersbook_db> readersbooks = new ArrayList<Readersbook_db>();

    public List<Readersbook_db> getReadersbooks() {
        return getAllReadersbooks();
    }

    public void addReadersbook(){
        rb1.addReadersbook(new Readersbook_db(idBook, idReader ));
    }

    public void updateReadersbook(){
        Readersbook_db readersbook_db = new Readersbook_db(idBook, idReader);
        readersbook_db.setIdReader(idForUpdate);
        rb1.updateReadersbook(readersbook_db);
    }

    public List<Readersbook_db> getAllReadersbooks() {
        return rb1.getAllReadersbooks();
    }

    public List<Readersbook_db> getReadersbookById(int id){
        return rb1.getReadersbookById(id);
    }
    public void deleteReadersbook(Readersbook_db readersbook_db){
        rb1.deleteReadersbook(readersbook_db);
    }

    public ReadersbookBean(int idBook, int idReader) {
        this.idBook = idBook;
        this.idReader = idReader;
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdReader() {
        return idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }
}
