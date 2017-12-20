package Entity;

import javax.persistence.*;

@Entity
@Table(name = "authorsbook", schema = "library_db")
@IdClass(Authorsbook_dbPK.class)
public class Authorsbook_db {
    private int idAuthor;
    private int idBook;
    private Author_db authorByIdAuthor;
    private Book_db bookByIdBook;

    public Authorsbook_db(int idAuthor, int idBook) {
        this.idAuthor = idAuthor;
        this.idBook = idBook;
    }

    public Authorsbook_db() {
    }

    @Id
    @Column(name = "ID_author", nullable = false)
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Id
    @Column(name = "ID_book", nullable = false)
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

        Authorsbook_db that = (Authorsbook_db) o;

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

    @ManyToOne
    @JoinColumn(name = "ID_author", referencedColumnName = "ID_author", nullable = false, updatable = false, insertable = false)
    public Author_db getAuthorByIdAuthor() {
        return authorByIdAuthor;
    }

    public void setAuthorByIdAuthor(Author_db authorByIdAuthor) {
        this.authorByIdAuthor = authorByIdAuthor;
    }

    @ManyToOne
    @JoinColumn(name = "ID_book", referencedColumnName = "ID_book", nullable = false, updatable = false, insertable = false)
    public Book_db getBookByIdBook() {
        return bookByIdBook;
    }

    public void setBookByIdBook(Book_db bookByIdBook) {
        this.bookByIdBook = bookByIdBook;
    }
}
