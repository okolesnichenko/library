package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Readersbook_dbPK implements Serializable {
    private int idBook;
    private int idReader;

    @Column(name = "ID_book", nullable = false)
    @Id
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Column(name = "ID_reader", nullable = false)
    @Id
    public int getIdReader() {
        return idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Readersbook_dbPK that = (Readersbook_dbPK) o;

        if (idBook != that.idBook) return false;
        if (idReader != that.idReader) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBook;
        result = 31 * result + idReader;
        return result;
    }
}
