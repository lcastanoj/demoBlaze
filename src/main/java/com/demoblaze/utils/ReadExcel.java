package com.demoblaze.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    private XSSFWorkbook book;
    private FileInputStream file;

    public String readDataExcel(String path, String sheets, int rowValue, int cellValue) throws IOException {
        String value = null;
        file = new FileInputStream(new File(path));
        book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheet(sheets);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        value = cell.getStringCellValue();
        book.close();
        file.close();
        return value;
    }
}
