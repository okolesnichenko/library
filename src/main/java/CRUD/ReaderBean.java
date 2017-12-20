package CRUD;

import Dao.ReaderDao;
import Entity.Reader_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name = "readerBean", eager = true)
@RequestScoped
public class ReaderBean {
    private String name;
    private String surname;
    private String middlename;
    private String birthday;
    public int idForUpdate;
    public ReaderDao r1 = new ReaderDao();

    public ReaderBean(){}

    public ReaderBean(String name, String surname, String middlename, String birthday) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.birthday = birthday;
    }


    private List<Reader_db> readers = new ArrayList<Reader_db>();

    public List<Reader_db> getReaders() {
        return getAllReaders();
    }

    public void addReader(){
        r1.addReader(new Reader_db(name, surname, middlename, birthday) );
    }

    public void updateReader(){
        Reader_db reader_db= new Reader_db(name, surname, middlename, birthday);
        reader_db.setIdReader(idForUpdate);
        r1.updateReader(reader_db);
    }

    public List<Reader_db> getAllReaders() {
        return r1.getAllReaders();
    }
    //получаем автора по id
    public List<Reader_db> getReaderById(int id){
        return r1.getReaderById(id);
    }
    public void deleteReader(Reader_db reader_db){
        r1.deleteReader(reader_db);
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
