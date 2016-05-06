package com.blackriver.app.common.excel;

import com.blackriver.app.domain.LogEntry;
import com.blackriver.app.repositories.LogEntryRepository;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Bipin on 5/6/2016.
 */
public class ImportExcel {

    @Autowired
    private static LogEntryRepository logEntryRepository;

    private static Logger log = Logger.getLogger(ImportExcel.class);

    public static void parseExcel(String fileName, String sheetName){
        try {
            FileInputStream file = new FileInputStream(new File(fileName));

            //create workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from workbook
            XSSFSheet sheet = workbook.getSheet(sheetName);

            //Iterate thru each row one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //skip header
                if(row.getRowNum() > 0) {

                    LogEntry logEntry = new LogEntry();
                    //log.info("Sales: " + row.getCell(3));
                    logEntry.setSales(Integer.parseInt(row.getCell(3).getStringCellValue()));

                    logEntryRepository.save(logEntry);

                    //For each row, iterate thru all the columns
                    Iterator<Cell> cellIterator = row.cellIterator();

//                    while (cellIterator.hasNext()) {
//                        Cell cell = cellIterator.next();
                        //Check the cell type and format accordingly
//                    switch (cell.getCellType())
//                    {
//
//                        case Cell.CELL_TYPE_NUMERIC:
//                            log.info("Address: " + cell.getAddress() + " - Row:" + cell.getRowIndex() +
//                                    " - Column:" + cell.getColumnIndex()  + " - Value: " + cell.getNumericCellValue());
//                            break;
//
//                        case Cell.CELL_TYPE_STRING:
//                            log.info("Address: " + cell.getAddress() + " - Row:" + cell.getRowIndex() +
//                                    " - Column:" + cell.getColumnIndex()  + " - Value: " + cell.getStringCellValue());
//                            break;
//
//                    }
//                    }
                }
            }
            file.close();


        } catch (IOException ioEx) {
            log.error(ioEx);
        } catch (Exception ex) {
            log.error(ex);
        }
    }
}
