package com.dai.zeus.finance.server.utils;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ExcelUtilsTest {

    @Test
    public void getListFromExcel() throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\alipay_record_20220503_025035.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getColumnIndex() == 10 && cell.getRowIndex() != 0 && cell.getRowIndex() != 1) {
                    System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(cell.getDateCellValue()) + "\t");
                } else {
                    if (cell.getCellType().equals(CellType.STRING)) {
                        System.out.print(cell.getStringCellValue() + "\t");
                    }
                    if (cell.getCellType().equals(CellType.NUMERIC)) {
                        System.out.print(cell.getNumericCellValue() + "\t");
                    }
                }
            }
            System.out.println();
        }
        workbook.close();
    }
}
