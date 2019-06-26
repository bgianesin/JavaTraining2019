package javatraining.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExcelOperations {

    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet ;
    private  static Row row;
    private static Cell cell;
    private static FileInputStream inputStream;
    private static FileOutputStream outputStream;


    public  static String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    public  static String fileName= "ExcelOperations-"+fileSuffix+".xlsx";
    //  public  static  String filePath= System.getProperty("user.dir")+"/src/main/resources/"+fileName;
    public  static  String filePath= System.getProperty("user.dir")+"/src/resources/"+fileName;


    public static void main(String[] args) {

        ExcelOperations excelOperations = new ExcelOperations();
        Set<Map.Entry<String, String>> entrySets=excelOperations.enterDetailsInMap();

        excelOperations.writeToExcel(entrySets);
        excelOperations.readFromExcel(filePath);

    }

    // receive input from user
    public Set<Map.Entry<String, String>> enterDetailsInMap(){

        HashMap<String,String> hashMap =new HashMap<String, String>();
        String numberOfDetails = JOptionPane.showInputDialog("Enter number of employee :");
        String name;
        String corpKey;
        for (int count=1;count<=Integer.valueOf(numberOfDetails);count++){
            name = JOptionPane.showInputDialog("Enter name of employee - "+count);
            corpKey = JOptionPane.showInputDialog("Enter Corp Key of employee - " +count);
            hashMap.put(name,corpKey);
        }
        return hashMap.entrySet();
    }

    public void writeToExcel(Set<Map.Entry<String, String>> entrySets){

        workbook = new XSSFWorkbook();

        sheet = workbook.createSheet("Employee");
        // Create the Row Header
        row = sheet.createRow(0);
        // Create cells
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Corp Key");


        // Create Other rows and cells with Employee data
        int rowNum = 1;

        for (Map.Entry  mapEntry :entrySets ) {

            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(mapEntry.getKey().toString());
            row.createCell(1).setCellValue(mapEntry.getValue().toString());
        }

        // Write the output to a file
        try {
            outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            outputStream.close();
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromExcel(String filePath){

        try {
            inputStream = new FileInputStream(new File(filePath));
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                System.out.println();
                row = iterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    cell = cellIterator.next();
                    System.out.print(cell.getStringCellValue()+" | ");
                }
            }

            inputStream.close();
            workbook.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}
