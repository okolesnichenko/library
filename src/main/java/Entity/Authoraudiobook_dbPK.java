package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Authoraudiobook_dbPK implements Serializable {
    private int idAudiobook;
    private int idAuthor;

    @Column(name = "ID_audiobook", nullable = false)
    @Id
    public int getIdAudiobook() {
        return idAudiobook;
    }

    public void setIdAudiobook(int idAudiobook) {
        this.idAudiobook = idAudiobook;
    }

    @Column(name = "ID_author", nullable = false)
    @Id
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

        Authoraudiobook_dbPK that = (Authoraudiobook_dbPK) o;

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
}
