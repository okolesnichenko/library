package CRUD;

import Dao.AudiobookDao;
import Entity.Audiobook_db;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name = "audiobookBean", eager = true)
@RequestScoped
public class AudiobookBean {
    private int idSection;
    private String name;
    private int duration;
    private int idForUpdate;
    AudiobookDao ab1 =  new AudiobookDao();

    public AudiobookBean(){}

    private List<Audiobook_db> audiobooks;

    public List<Audiobook_db> getAudiobooks() {
        return audiobooks = getAllAudiobooks();
    }

    public void addAudiobook(){
        ab1.addAudiobook(new Audiobook_db(idSection, name, duration));
    }

    public void updateAudiobook(){
        Audiobook_db audiobook_db = new Audiobook_db(idSection, name, duration);
        audiobook_db.setIdAudiobook(idForUpdate);
        ab1.updateAudiobook(audiobook_db);
    }

    public List<Audiobook_db>getAllAudiobooks(){
        return ab1.getAllAudiobooks();
    }

    //public List<Audiobook_db> get

    public void deleteAduiobook(Audiobook_db audiobook_db){
        ab1.deleteAudiobook(audiobook_db);
    }
    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIdForUpdate() {
        return idForUpdate;
    }

    public void setIdForUpdate(int idForUpdate) {
        this.idForUpdate = idForUpdate;
    }
}
