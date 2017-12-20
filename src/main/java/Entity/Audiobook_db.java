package Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "audiobook", schema = "library_db")
public class Audiobook_db {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAudiobook;
    private int idSection;
    private String name;
    private int duration;
    private Section_db sectionByIdSection;

    public Audiobook_db(int idSection, String name, int duration) {
        this.idSection = idSection;
        this.name = name;
        this.duration = duration;
    }

    public Audiobook_db() {
    }

    @Id
    @Column(name = "ID_audiobook", nullable = false)
    public int getIdAudiobook() {
        return idAudiobook;
    }

    public void setIdAudiobook(int idAudiobook) {
        this.idAudiobook = idAudiobook;
    }

    @Basic
    @Column(name = "ID_section", nullable = false)
    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
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
    @Column(name = "duration", nullable = false)
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audiobook_db that = (Audiobook_db) o;

        if (idAudiobook != that.idAudiobook) return false;
        if (idSection != that.idSection) return false;
        if (duration != that.duration) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAudiobook;
        result = 31 * result + idSection;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + duration;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_section", referencedColumnName = "ID_section", nullable = false, updatable = false, insertable = false)
    public Section_db getSectionByIdSection() {
        return sectionByIdSection;
    }

    public void setSectionByIdSection(Section_db sectionByIdSection) {
        this.sectionByIdSection = sectionByIdSection;
    }
}
