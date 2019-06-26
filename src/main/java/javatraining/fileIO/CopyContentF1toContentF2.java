package javatraining.fileIO;

import javax.swing.*;
import java.io.*;


public class CopyContentF1toContentF2 {

    private static final String inputFilePath= System.getProperty("user.dir")+"/src/resources/" +JOptionPane.showInputDialog("Enter Input File Name");
    private static final String outPutFilePath= System.getProperty("user.dir")+"/src/resources/" +JOptionPane.showInputDialog("Enter OutPut File Name");
    public static void main(String[] args) {

        try {
            //CreateFile(inputFilePath,"Content in Input file");
            // FileReader objInput=new FileReader(inputFilePath);
             FileInputStream objInput=new FileInputStream(inputFilePath);

            //CreateFile(outPutFilePath,"");
            // FileWriter objOutput=new FileWriter(outPutFilePath);
            FileOutputStream objOutput=new FileOutputStream(outPutFilePath);

            int i=0;
            int c;
           while(( c=  objInput.read())!=-1) {
               objOutput.write(c);
               ++i;
            }
            System.out.println("Read :"+i + "-");
            objInput.close();
            objOutput.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void CreateFile(String filePath, String  content ){

        File file = new File(filePath);
        //Create the file using File Class
        try {
            if(!file.isFile()){
                file.createNewFile();
                FileOutputStream objFileOutputStream=new FileOutputStream(filePath);
                objFileOutputStream.write(content.getBytes());

                System.out.println("File ["+filePath+"] is created!");
                objFileOutputStream.close();
            }
            else {
                System.out.println("File ["+filePath+"] alread Exist");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }