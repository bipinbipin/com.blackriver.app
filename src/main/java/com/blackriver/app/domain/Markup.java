package com.blackriver.app.domain;

import javax.persistence.*;

/**
 * Created by Bipin on 5/4/2016.
 */
@Entity
public class Markup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MarkupId")
    private Integer id;

    @Version
    private Integer version;

    private double markupPercent;
    private boolean OTB;
    private boolean report;
    private boolean locked;

    @ManyToOne
    private Store store;

    @ManyToOne
    private Classification classification;

    public Markup() {}
    public Markup(double markupPercent, Store store, Classification classification) {
        this.markupPercent = markupPercent;
        this.store = store;
        this.classification = classification;
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

    public double getMarkupPercent() {
        return markupPercent;
    }

    public void setMarkupPercent(double markupPercent) {
        this.markupPercent = markupPercent;
    }

    public boolean isOTB() {
        return OTB;
    }

    public void setOTB(boolean OTB) {
        this.OTB = OTB;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
}
