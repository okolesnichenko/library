package Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Collection;

@Entity
@Table(name = "reader", schema = "library_db")
public class Reader_db {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReader;
    private String name;
    private String surname;
    private String middlename;
    private String birthday;

    public Reader_db(String name, String surname, String middlename, String birthday) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.birthday = birthday;
    }

    public Reader_db() {
    }

    @Id
    @Column(name = "ID_reader", nullable = false)
    public int getIdReader() {
        return idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
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
    @Column(name = "birthday", nullable = false, length = 45)
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader_db reader_db = (Reader_db) o;

        if (idReader != reader_db.idReader) return false;
        if (name != null ? !name.equals(reader_db.name) : reader_db.name != null) return false;
        if (surname != null ? !surname.equals(reader_db.surname) : reader_db.surname != null) return false;
        if (middlename != null ? !middlename.equals(reader_db.middlename) : reader_db.middlename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idReader;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
        return result;
    }
}
