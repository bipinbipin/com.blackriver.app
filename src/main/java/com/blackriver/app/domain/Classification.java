package com.blackriver.app.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 5/4/2016.
 */
@Entity
public class Classification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ClassificationId")
    private Integer id;

    @Version
    private Integer version;

    private String className;
    private String classDescription;

    @ManyToOne
    private Department department;

    public Classification() {}
    public Classification(String className) {
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
