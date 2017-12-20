package CRUD;

import Dao.AuthorbookDao;
import Entity.Authorsbook_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "authorsbookBean", eager = true)
@RequestScoped
public class AuthorsbookBean {
    private int idAuthor;
    private int idBook;
    public int idForUpdate;
    AuthorbookDao ab1 = new AuthorbookDao();

    public AuthorsbookBean(){}

    public List<Authorsbook_db> authorsbooks = new ArrayList<Authorsbook_db>();

    public List<Authorsbook_db> getAuthorsbooks() {
        return getAllAuthorsbooks();
    }

    public void addAuthorsbook(){
        Authorsbook_db authorsbook_db = new Authorsbook_db(idAuthor, idBook );
        ab1.addAuthorsbook(authorsbook_db);
    }

    public void updateAuthorsbook(){
        Authorsbook_db authorsbook_db = new Authorsbook_db(idAuthor, idBook );
        authorsbook_db.setIdBook(idForUpdate);
        ab1.updateAuthorsbook(authorsbook_db);
    }

    public List<Authorsbook_db> getAllAuthorsbooks() {
        return ab1.getAllAuthorsbooks();
    }

    public List<Authorsbook_db> getAuthorsbookById(int id){
        return ab1.getAuthorsbookById(id);
    }
    public void deleteAuthorsbook(Authorsbook_db authorsbook_db){
        ab1.deleteAuthorsbook(authorsbook_db);
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

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public AuthorsbookBean(int idAuthor, int idBook) {
        this.idAuthor = idAuthor;
        this.idBook = idBook;
    }
}
