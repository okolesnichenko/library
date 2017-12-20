package Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "book", schema = "library_db")
public class Book_db {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBook;
    private int idSection;
    private String name;
    private int size;
    private String yearofwriting;
    private Section_db sectionByIdSection;

    public Book_db(int idSection, String name, int size, String yearofwriting) {
        this.idSection = idSection;
        this.name = name;
        this.size = size;
        this.yearofwriting = yearofwriting;
    }

    public Book_db() {
    }

    @Id
    @Column(name = "ID_book", nullable = false)
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Basic
    @Column(name = "ID_section", nullable = false)
    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "size", nullable = false, length = 45)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "yearofwriting", nullable = true, length = 45)
    public String getYearofwriting() {
        return yearofwriting;
    }

    public void setYearofwriting(String yearofwriting) {
        this.yearofwriting = yearofwriting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book_db book_db = (Book_db) o;

        if (idBook != book_db.idBook) return false;
        if (idSection != book_db.idSection) return false;
        if (name != null ? !name.equals(book_db.name) : book_db.name != null) return false;
        if (yearofwriting != null ? !yearofwriting.equals(book_db.yearofwriting) : book_db.yearofwriting != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBook;
        result = 31 * result + idSection;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (yearofwriting != null ? yearofwriting.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_section", referencedColumnName = "ID_section", updatable = false, insertable = false, nullable = false)
    public Section_db getSectionByIdSection() {
        return sectionByIdSection;
    }

    public void setSectionByIdSection(Section_db sectionByIdSection) {
        this.sectionByIdSection = sectionByIdSection;
    }
}
