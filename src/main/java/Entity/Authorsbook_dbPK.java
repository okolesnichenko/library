package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Authorsbook_dbPK implements Serializable {
    private int idAuthor;
    private int idBook;

    @Column(name = "ID_author", nullable = false)
    @Id
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Column(name = "ID_book", nullable = false)
    @Id
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authorsbook_dbPK that = (Authorsbook_dbPK) o;

        if (idAuthor != that.idAuthor) return false;
        if (idBook != that.idBook) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAuthor;
        result = 31 * result + idBook;
        return result;
    }
}
