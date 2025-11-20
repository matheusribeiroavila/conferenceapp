package br.com.avilaconference.confratern.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_conference")
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conf_id")
    private Integer id;
    @Column(name = "conf_name", length = 255, nullable = false)
    private String name;
    @Column(name = "conf_address", length = 255, nullable = false)
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
}
