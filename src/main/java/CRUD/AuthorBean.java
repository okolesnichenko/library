package CRUD;

import Dao.AuthorDao;
import Entity.Author_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "authorBean", eager = true)
@RequestScoped
public class AuthorBean {
    private String name;
    private String surname;
    private String middlename;
    private String yearofbirth;
    private int idForUpdate;
    AuthorDao a1 = new AuthorDao();

    private List<Author_db> authors = new ArrayList<Author_db>();

    public List<Author_db> getAuthors() {
        return getAllAuthors();
    }

    public AuthorBean(){}

    public void addAuthor() {
        a1.addAuthor(new Author_db(name, surname, middlename, yearofbirth));
    }

    public void updateAuthor() {
        Author_db author_db = new Author_db(name, surname, middlename, yearofbirth);
        author_db.setIdAuthor(idForUpdate);
        a1.updateAuthor(author_db);
    }

    public List<Author_db> getAllAuthors() {
        return a1.getAllAuthors();
    }

    public List<Author_db> getAuthorById(int id) {
        return a1.getAuthorById(id);
    }

    public void deleteAuthor(Author_db author_db) {
        a1.deleteAuthor(author_db);
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(String yearofbirth) {
        this.yearofbirth = yearofbirth;
    }
}
