package com.blackriver.app.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Bipin on 5/4/2016.
 */
@Entity
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ExpensesId")
    private Integer id;

    @Version
    private Integer version;

    private Integer monthlyExpenses;

    private Date logDate;

    @ManyToOne
    private Store store;

    public Expenses() {}

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

    public Integer getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(Integer monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
