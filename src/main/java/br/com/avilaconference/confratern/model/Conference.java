package br.com.avilaconference.confratern.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_conference")
public class Conference {
    private static final Long serializeVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conf_id")
    private long id;
    @Column(name = "conf_name")
    private String name;
    @Column(name = "conf_adress")
    private String adress;

    @OneToMany(mappedBy = "conference")
    private List<Session> sessions;

    public Conference() {}

    public Conference(String name, String adress, List<Session> sessions) {
        this.name = name;
        this.adress = adress;
        this.sessions = sessions;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
