package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Readersaudiobook_dbPK implements Serializable {
    private int idAudiobook;
    private int idReader;

    @Column(name = "ID_audiobook", nullable = false)
    @Id
    public int getIdAudiobook() {
        return idAudiobook;
    }

    public void setIdAudiobook(int idAudiobook) {
        this.idAudiobook = idAudiobook;
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

        Readersaudiobook_dbPK that = (Readersaudiobook_dbPK) o;

        if (idAudiobook != that.idAudiobook) return false;
        if (idReader != that.idReader) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAudiobook;
        result = 31 * result + idReader;
        return result;
    }
}
