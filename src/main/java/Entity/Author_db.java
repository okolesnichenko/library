package Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "author", schema = "library_db")
public class Author_db {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAuthor;
    private String name;
    private String surname;
    private String middlename;
    private String yearofbirth;

    public Author_db() {

    }

    public Author_db(String name, String surname, String middlename, String yearofbirth){
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.yearofbirth = yearofbirth;
    }
    @Id
    @Column(name = "ID_author", nullable = false)
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
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
    @Column(name = "surname", nullable = false, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "middlename", nullable = false, length = 45)
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "yearofbirth", nullable = false, length = 45)
    public String getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(String yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author_db author_db = (Author_db) o;

        if (idAuthor != author_db.idAuthor) return false;
        if (name != null ? !name.equals(author_db.name) : author_db.name != null) return false;
        if (surname != null ? !surname.equals(author_db.surname) : author_db.surname != null) return false;
        if (middlename != null ? !middlename.equals(author_db.middlename) : author_db.middlename != null) return false;
        if (yearofbirth != null ? !yearofbirth.equals(author_db.yearofbirth) : author_db.yearofbirth != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAuthor;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
        result = 31 * result + (yearofbirth != null ? yearofbirth.hashCode() : 0);
        return result;
    }
}
