package Entity;

import javax.persistence.*;

@Entity
@Table(name = "authoraudiobook", schema = "library_db")
@IdClass(Authoraudiobook_dbPK.class)
public class Authoraudiobook_db {
    private int idAudiobook;
    private int idAuthor;
    private Audiobook_db audiobookByIdAudiobook;
    private Author_db authorByIdAuthor;

    public Authoraudiobook_db(int idAudiobook, int idAuthor) {
        this.idAudiobook = idAudiobook;
        this.idAuthor = idAuthor;
    }

    public Authoraudiobook_db() {
    }

    @Id
    @Column(name = "ID_audiobook", nullable = false)
    public int getIdAudiobook() {
        return idAudiobook;
    }

    public void setIdAudiobook(int idAudiobook) {
        this.idAudiobook = idAudiobook;
    }

    @Id
    @Column(name = "ID_author", nullable = false)
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authoraudiobook_db that = (Authoraudiobook_db) o;

        if (idAudiobook != that.idAudiobook) return false;
        if (idAuthor != that.idAuthor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAudiobook;
        result = 31 * result + idAuthor;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_audiobook", referencedColumnName = "ID_audiobook", nullable = false, updatable = false, insertable = false)
    public Audiobook_db getAudiobookByIdAudiobook() {
        return audiobookByIdAudiobook;
    }

    public void setAudiobookByIdAudiobook(Audiobook_db audiobookByIdAudiobook) {
        this.audiobookByIdAudiobook = audiobookByIdAudiobook;
    }

    @ManyToOne
    @JoinColumn(name = "ID_author", referencedColumnName = "ID_author", nullable = false, updatable = false, insertable = false)
    public Author_db getAuthorByIdAuthor() {
        return authorByIdAuthor;
    }

    public void setAuthorByIdAuthor(Author_db authorByIdAuthor) {
        this.authorByIdAuthor = authorByIdAuthor;
    }
}
