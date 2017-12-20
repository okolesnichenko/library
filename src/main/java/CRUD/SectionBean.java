package CRUD;

import Dao.SectionDao;
import Entity.Section_db;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;
@ManagedBean(name = "sectionBean", eager = true)
@RequestScoped
public class SectionBean {
    private String type;
    public int idForUpdate;
    SectionDao s1 = new SectionDao();

    public SectionBean(){ }

    public SectionBean(String type) {
        this.type = type;
    }

    private List<Section_db> sections = new ArrayList<Section_db>();

    public List<Section_db> getSections() {
        return getAllSections();
    }

    public void addSection(){
        s1.addSection(new Section_db(type));
    }

    public void updateSection(){
        Section_db section_db = new Section_db(type);
        section_db.setIdSection(idForUpdate);
        s1.updateSection(section_db);
    }

    public List<Section_db> getAllSections() {
        return s1.getAllSections();
    }
    //получаем автора по id
    public List<Section_db> getSectionById(int id){
        return s1.getSectionById(id);
    }

    public void deleteSection(Section_db section_db){
        s1.deleteSection(section_db);
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
