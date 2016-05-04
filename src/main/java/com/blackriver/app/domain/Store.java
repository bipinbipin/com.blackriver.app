package com.blackriver.app.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 5/3/2016.
 */
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "StoreId")
    private Integer id;

    @Version
    private Integer version;

    private String storeName;


    public Store() {}

    public Store(String storeName) {
        this.storeName = storeName;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
