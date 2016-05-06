package com.blackriver.app.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Bipin on 5/6/2016.
 */
@Entity
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LogEntryId")
    private Integer id;

    @Version
    private Integer version;

    //todo:     is this the best data type for the LogDate?
    private Date logDate;

    @ManyToOne
    private Store store;

    @ManyToOne
    private Classification classification;

    private Integer sales;
    private Integer markdowns;
    private Integer markups;
    private Integer vendorReturnRetail;
    private Integer receivedAtRetail;
    private Integer receivedAtCost;
    private Integer transfersIn;
    private Integer transfersOut;


    private Integer salesPlan;
    private double stockPlanRatio;
    private Integer stockPlan;
    private double markdownsPlanRatio;
    private Integer recAtRetailPlan;
    private Integer stocks;
    private Integer stocksNext;

    public LogEntry() {}
    public LogEntry(Date logDate, Store store, Classification classification) {
        this.logDate = logDate;
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

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getMarkdowns() {
        return markdowns;
    }

    public void setMarkdowns(Integer markdowns) {
        this.markdowns = markdowns;
    }

    public Integer getMarkups() {
        return markups;
    }

    public void setMarkups(Integer markups) {
        this.markups = markups;
    }

    public Integer getVendorReturnRetail() {
        return vendorReturnRetail;
    }

    public void setVendorReturnRetail(Integer vendorReturnRetail) {
        this.vendorReturnRetail = vendorReturnRetail;
    }

    public Integer getReceivedAtRetail() {
        return receivedAtRetail;
    }

    public void setReceivedAtRetail(Integer receivedAtRetail) {
        this.receivedAtRetail = receivedAtRetail;
    }

    public Integer getReceivedAtCost() {
        return receivedAtCost;
    }

    public void setReceivedAtCost(Integer receivedAtCost) {
        this.receivedAtCost = receivedAtCost;
    }

    public Integer getTransfersIn() {
        return transfersIn;
    }

    public void setTransfersIn(Integer transfersIn) {
        this.transfersIn = transfersIn;
    }

    public Integer getTransfersOut() {
        return transfersOut;
    }

    public void setTransfersOut(Integer transfersOut) {
        this.transfersOut = transfersOut;
    }

    public Integer getSalesPlan() {
        return salesPlan;
    }

    public void setSalesPlan(Integer salesPlan) {
        this.salesPlan = salesPlan;
    }

    public double getStockPlanRatio() {
        return stockPlanRatio;
    }

    public void setStockPlanRatio(double stockPlanRatio) {
        this.stockPlanRatio = stockPlanRatio;
    }

    public Integer getStockPlan() {
        return stockPlan;
    }

    public void setStockPlan(Integer stockPlan) {
        this.stockPlan = stockPlan;
    }

    public double getMarkdownsPlanRatio() {
        return markdownsPlanRatio;
    }

    public void setMarkdownsPlanRatio(double markdownsPlanRatio) {
        this.markdownsPlanRatio = markdownsPlanRatio;
    }

    public Integer getRecAtRetailPlan() {
        return recAtRetailPlan;
    }

    public void setRecAtRetailPlan(Integer recAtRetailPlan) {
        this.recAtRetailPlan = recAtRetailPlan;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public Integer getStocksNext() {
        return stocksNext;
    }

    public void setStocksNext(Integer stocksNext) {
        this.stocksNext = stocksNext;
    }
}
