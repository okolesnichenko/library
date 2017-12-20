package CRUD;

import Dao.AuthoraudiobookDao;
import Entity.Audiobook_db;
import Entity.Authoraudiobook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "authoraudiobookBean", eager = true)
@RequestScoped
public class AuthoraudiobookBean {
    private int idAudiobook;
    private int idAuthor;
    public int idForUpdate;
    AuthoraudiobookDao ab1 = new AuthoraudiobookDao();

    public AuthoraudiobookBean(){}

    public List<Authoraudiobook_db> authoraudiobooks = new ArrayList<Authoraudiobook_db>();

    public List<Authoraudiobook_db> getAuthoraudiobooks() {
        return getAllAuthoraudiobooks();
    }

    public void addAuthoraudiobook(){
        ab1.addAuthoraudiobook(new Authoraudiobook_db(idAudiobook, idAuthor));
    }

    public void updateAuthoraudiobook(){
        Authoraudiobook_db authoraudiobook_db = new Authoraudiobook_db(idAudiobook, idAuthor);
        authoraudiobook_db.setIdAudiobook(idForUpdate);
        ab1.updateAuthoraudiobook(authoraudiobook_db);
    }

    public List<Authoraudiobook_db> getAllAuthoraudiobooks() {
        return ab1.getAllAuthoraudiobooks();
    }

    public List<Authoraudiobook_db> getAuthoraudiobookById(int id){
        return ab1.getAuthoraudiobookById(id);
    }
    public void deleteAuthoraudiobook(Authoraudiobook_db authoraudiobook_db){
        ab1.deleteAuthoraudiobook(authoraudiobook_db);
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdAudiobook() {
        return idAudiobook;
    }

    public void setIdAudiobook(int idAudiobook) {
        this.idAudiobook = idAudiobook;
    }
}
