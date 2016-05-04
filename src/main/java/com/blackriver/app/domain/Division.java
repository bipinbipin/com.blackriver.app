package com.blackriver.app.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Bipin on 5/4/2016.
 */
@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DivisionId")
    private Integer id;

    @Version
    private Integer version;

    private String divisionName;

    @OneToMany
    private List<Store> storeList;

    public Division() {}

    public Division(String divisionName) {
        this.divisionName = divisionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }
}
