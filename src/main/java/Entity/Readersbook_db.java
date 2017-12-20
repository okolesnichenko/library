package Entity;

import javax.persistence.*;

@Entity
@Table(name = "readersbook", schema = "library_db")
@IdClass(Readersbook_dbPK.class)
public class Readersbook_db {
    private int idBook;
    private int idReader;
    private Book_db bookByIdBook;
    private Reader_db readerByIdReader;

    public Readersbook_db(int idBook, int idReader) {
        this.idBook = idBook;
        this.idReader = idReader;
    }

    public Readersbook_db() {
    }

    @Id
    @Column(name = "ID_book", nullable = false)
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Id
    @Column(name = "ID_reader", nullable = false)
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

        Readersbook_db that = (Readersbook_db) o;

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

    @ManyToOne
    @JoinColumn(name = "ID_book", referencedColumnName = "ID_book", nullable = false, updatable = false, insertable = false)
    public Book_db getBookByIdBook() {
        return bookByIdBook;
    }

    public void setBookByIdBook(Book_db bookByIdBook) {
        this.bookByIdBook = bookByIdBook;
    }

    @ManyToOne
    @JoinColumn(name = "ID_reader", referencedColumnName = "ID_reader", nullable = false, updatable = false, insertable = false)
    public Reader_db getReaderByIdReader() {
        return readerByIdReader;
    }

    public void setReaderByIdReader(Reader_db readerByIdReader) {
        this.readerByIdReader = readerByIdReader;
    }
}
