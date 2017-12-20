package CRUD;

import Dao.BookDao;
import Entity.Book_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "bookBean", eager = true)
@RequestScoped
public class BookBean {
    private int idSection;
    private String name;
    private int size;
    private String yearofwriting;
    public int idForUpdate;
    BookDao b1 = new BookDao();

    public BookBean (){}

    public BookBean(int idSection, String name, int size, String yearofwriting) {
        this.idSection = idSection;
        this.name = name;
        this.size = size;
        this.yearofwriting = yearofwriting;
    }

    private List<Book_db> books = new ArrayList<Book_db>();

    public List<Book_db> getBooks() {
        return getAllBooks();
    }

    public void addBook(){
        b1.addBook(new Book_db(idSection, name, size, yearofwriting));
    }

    public void updateBook(){
        Book_db book_db = new Book_db(idSection, name, size, yearofwriting);
        book_db.setIdSection(idForUpdate);
        b1.updateBook(book_db);
    }

    public List<Book_db> getAllBooks() {
        return b1.getAllBooks();
    }

    public List<Book_db> getBookById(int id){
        return b1.getBookById(id);
    }
    public void deleteBook(Book_db book_db){
        b1.deleteBook(book_db);
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }

    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getYearofwriting() {
        return yearofwriting;
    }

    public void setYearofwriting(String yearofwriting) {
        this.yearofwriting = yearofwriting;
    }
}
