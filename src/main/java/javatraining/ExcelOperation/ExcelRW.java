package javatraining.ExcelOperation;
import org.apache.poi.ooxml.*;
import org.apache.poi.ooxml.util.*;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.*;
import java.util.Iterator;

public class ExcelRW {
    //private static final String inputFilePath= System.getProperty("user.dir")+"/src/resources/" + JOptionPane.showInputDialog("Enter Input File Name");
    private static final String inputFilePath= System.getProperty("user.dir")+"/src/resources/" + "A.xlsx";

    public static void main(String[] args) {
        try {
            System.out.println(inputFilePath);

            InputStream inp = new FileInputStream(inputFilePath);
            //InputStream inp = new FileInputStream("workbook.xlsx");

            System.out.println("B");
            // Creating a Workbook from an Excel file (.xls or .xlsx)
            Workbook workbook = WorkbookFactory.create(inp);

            // Retrieving the number of sheets in the Workbook
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

        /*
           =============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           =============================================================
        */

            // 1. You can obtain a sheetIterator and iterate over it
            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
            System.out.println("Retrieving Sheets using Iterator");
            while (sheetIterator.hasNext()) {
                Sheet sheet = sheetIterator.next();
                System.out.println("=> " + sheet.getSheetName());
            }


            // 2. Or you can use a for-each loop
            System.out.println("Retrieving Sheets using for-each loop");
            for(Sheet sheet: workbook) {
                System.out.println("=> " + sheet.getSheetName());
            }

            // 3. Or you can use a Java 8 forEach with lambda
            System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
            workbook.forEach(sheet -> {
                System.out.println("=> " + sheet.getSheetName());
            });

        /*
           ==================================================================
           Iterating over all the rows and columns in a Sheet (Multiple ways)
           ==================================================================
         */

            // Getting the Sheet at index zero
            Sheet sheet = workbook.getSheetAt(0);

            // Create a DataFormatter to format and get each cell's value as String
            DataFormatter dataFormatter = new DataFormatter();

            // 1. You can obtain a rowIterator and columnIterator and iterate over them
            System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
            Iterator<Row> rowIterator = sheet.rowIterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // Now let's iterate over the columns of the current row
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    String cellValue = dataFormatter.formatCellValue(cell);
                    System.out.print(cellValue + "\t");
                }
                System.out.println();
            }

            // 2. Or you can use a for-each loop to iterate over the rows and columns
            System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
            for(Sheet sheet1: workbook) {
                System.out.println("=> " + sheet1.getSheetName());
                for (Row row : sheet1) {
                    for (Cell cell : row) {
                        String cellValue = dataFormatter.formatCellValue(cell);
                        System.out.print(cellValue + "\t");
                    }
                    System.out.println();
                }
            }

            // 3. Or you can use Java 8 forEach loop with lambda
            System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
            sheet.forEach(row -> {
                row.forEach(cell -> {
                    String cellValue = dataFormatter.formatCellValue(cell);
                    System.out.print(cellValue + "\t");
                });
                System.out.println();
            });

            // Closing the workbook
            workbook.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Ex A");
            System.out.println(inputFilePath);

            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Ex B");
            ex.printStackTrace();
        }
    }
}
