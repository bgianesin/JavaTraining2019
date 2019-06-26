package gestemployee;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class ExcelFile {
    private String sFullFileName;

    public XSSFWorkbook getWorkbook() {
        return workbook;
    }

    public XSSFSheet getSheet() {
        return sheet;
    }

    private XSSFWorkbook workbook;
    private XSSFSheet sheet ;
    private Row row;
    private Cell cell;
    //private FileInputStream inputStream;
    //private FileOutputStream outputStream;
    private File fFile;

    public  static String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    //public  static String fileName= "ExcelOperations-"+fileSuffix+".xlsx";
    //public  static  String filePath= System.getProperty("user.dir")+"/src/main/resources/"+fileName;

    public void writeToExcel1St(String pSheetName, ArrayList<String> pFields) {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet(pSheetName);

        // Create the Row Header
        row = sheet.createRow(0);
        pFields.forEach(pField -> {
            System.out.println("writeToExcel1st " + pField);
            row.createCell(pFields.indexOf(pField)).setCellValue(pField);
        });

        try {
            FileOutputStream outputStream = new FileOutputStream(sFullFileName);
            workbook.write(outputStream);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Cannot Write" , "writeToExcel1st", ERROR_MESSAGE);
        };
        /*try {
            workbook.write(outputStream);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Cannot Write" , "writeToExcel1st", ERROR_MESSAGE);
        };
        */

    }

    public boolean checkIfExist(String pCK) {
        System.out.println("checkIfExist => " + sheet.getSheetName());
        DataFormatter dataFormatter = new DataFormatter();
        boolean bRc = false;
        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");

                if (cellValue.equals(pCK)) {
                    bRc = true;
                    break;
                }
            }
        }
        return (bRc);
    }

    public void writeToExcel(String pSheetName, ArrayList<String> pFields) {
        //workbook = new XSSFWorkbook();
        sheet = workbook.getSheet(pSheetName);
        // Create the Row Header
        System.out.println("writeToExcel sheet name :" + sheet.getSheetName());
        System.out.println("writeToExcel last row :" + sheet.getLastRowNum());
        row = sheet.createRow(sheet.getLastRowNum()+1);
        //row = sheet.createRow(1);
        System.out.println("writeToExcel last row :" + sheet.getLastRowNum());

        for (int i=0, n=pFields.size(); i < n; i++) {
            System.out.println("writeToExcel " + pFields.get(i).toString()+ " " + i);
            row.createCell(i).setCellValue(pFields.get(i));
        };

        /*pFields.forEach(pField -> {
            System.out.println("writeToExcel " + pField + " " + pFields.indexOf(pField));
            row.createCell(pField.pFields.get.index(pField)).setCellValue(pField);
        });*/

        try {
             FileOutputStream outputStream = new FileOutputStream(sFullFileName);
             workbook.write(outputStream);
        }
        catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Cannot Write" , "writeToExcel1st", ERROR_MESSAGE);
            };
        /*try {
            workbook.write(outputStream);
            outputStream.flush();
            outputStream.close();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Cannot Write" , "writeToExcel1st", ERROR_MESSAGE);
        };
        */

    }

    public void readFromExcel(){

        try {
            FileInputStream inputStream = new FileInputStream(new File(sFullFileName));
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

    ExcelFile(String pFileName, String pSheetName, ArrayList<String> pFields) {
        sFullFileName = pFileName;
        fFile = new File(pFileName);

        System.out.println("Working Directory = " + fFile);

        try {
            if (fFile.exists()) {
                System.out.println("File Exists");
                InputStream oFI = new FileInputStream(sFullFileName);
                workbook = (XSSFWorkbook) WorkbookFactory.create(oFI);
                sheet = workbook.getSheet(pSheetName);
            }
            else {
                writeToExcel1St(pSheetName, pFields);
            }
            //inputStream = new FileInputStream((sFullFileName));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Cannot Open" , "ExcelFile(FileName)", ERROR_MESSAGE);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ExcelFile(String pFileName, String pSheetName) {
        sFullFileName = pFileName;
        fFile = new File(pFileName);

        System.out.println("Working Directory = " + fFile);

        try {
            if (fFile.exists()) {
                System.out.println("File Exists");
                InputStream oFI = new FileInputStream(sFullFileName);
                workbook = (XSSFWorkbook) WorkbookFactory.create(oFI);
                sheet = workbook.getSheet(pSheetName);
            } else {
                System.out.println("File does not exist");
                // Write the output to a file
                //outputStream = new FileOutputStream(sFullFileName);
            }
            //inputStream = new FileInputStream((sFullFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close () throws IOException {
        //inputStream.close();
        //outputStream.close();
        workbook.close();
    }
}

