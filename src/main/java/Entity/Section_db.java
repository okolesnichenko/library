package Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "section", schema = "library_db")
public class Section_db {
    @Id
    @Column(name = "ID_section", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSection;
    private String type;


    public Section_db() { }
    
    public Section_db(String type) {
        this.type = type;
    }

    @Id
    @Column(name = "ID_section", nullable = false)
    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Section_db that = (Section_db) o;

        if (idSection != that.idSection) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSection;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
