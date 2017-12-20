package CRUD;

import Dao.ReadersaudiobookDao;
import Entity.Readersaudiobook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "readersaudiobookBean", eager = true)
@RequestScoped
public class ReadersaudiobookBean {
    private int idAudiobook;
    private int idReader;
    public int idForUpdate;
    ReadersaudiobookDao rb1 = new ReadersaudiobookDao();

    public ReadersaudiobookBean(){}

    public List<Readersaudiobook_db> readersaudiobooks = new ArrayList<Readersaudiobook_db>();

    public List<Readersaudiobook_db> getReadersaudiobooks() {
        return getAllReadersaudiobooks();
    }

    public void addReadersaudiobook(){
        rb1.addReadersaudiobook(new Readersaudiobook_db(idAudiobook, idReader ));
    }

    public void updateReadersaudiobook(){
        Readersaudiobook_db readersaudiobook_db = new Readersaudiobook_db(idAudiobook, idReader );
        readersaudiobook_db.setIdReader(idForUpdate);
        rb1.updateReadersaudiobook(readersaudiobook_db);
    }

    public List<Readersaudiobook_db> getAllReadersaudiobooks() {
        return rb1.getAllReadersaudiobooks();
    }

    public List<Readersaudiobook_db> getReadersaudiobookById(int id){
        return rb1.getReadersaudiobookById(id);
    }
    public void deleteReadersaudiobook(Readersaudiobook_db readersaudiobook_db){
        rb1.deleteReadersaudiobook(readersaudiobook_db);
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }

    public int getIdAudiobook() {
        return idAudiobook;
    }

    public void setIdAudiobook(int idAudiobook) {
        this.idAudiobook = idAudiobook;
    }

    public int getIdReader() {
        return idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }
}
