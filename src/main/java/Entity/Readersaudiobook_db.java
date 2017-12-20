package Entity;

import javax.persistence.*;

@Entity
@Table(name = "readersaudiobook", schema = "library_db")
@IdClass(Readersaudiobook_dbPK.class)
public class Readersaudiobook_db {
    private int idAudiobook;
    private int idReader;
    private Audiobook_db audiobookByIdAudiobook;
    private Reader_db readerByIdReader;

    public Readersaudiobook_db(int idAudiobook, int idReader) {
        this.idAudiobook = idAudiobook;
        this.idReader = idReader;
    }

    public Readersaudiobook_db() {
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

        Readersaudiobook_db that = (Readersaudiobook_db) o;

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

    @ManyToOne
    @JoinColumn(name = "ID_audiobook", referencedColumnName = "ID_audiobook", nullable = false, updatable = false, insertable = false)
    public Audiobook_db getAudiobookByIdAudiobook() {
        return audiobookByIdAudiobook;
    }

    public void setAudiobookByIdAudiobook(Audiobook_db audiobookByIdAudiobook) {
        this.audiobookByIdAudiobook = audiobookByIdAudiobook;
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
