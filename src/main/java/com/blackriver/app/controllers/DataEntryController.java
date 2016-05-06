package com.blackriver.app.controllers;

import com.blackriver.app.common.excel.ImportExcel;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Created by Bipin on 5/6/2016.
 */
@Controller
public class DataEntryController {

    private Logger log = Logger.getLogger(DataEntryController.class);

    @RequestMapping("/data_entry/upload")
    public String data_entry() {

        return "data_entry/upload";
    }

    @RequestMapping("/data_entry/run")
    public String data_entry_run() {


        ImportExcel.parseExcel("./Uploads/SalesData.xlsx", "tblLogEntries");

        return "data_entry/upload";
    }


}
