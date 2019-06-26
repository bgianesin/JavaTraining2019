package javatraining.fileIO;
import java.io.*;

public class TextFileOperation {

	 private static final String FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/TrainingFile.txt";

	 //System.getProperty("user.dir")+"/src/main/resources/TrainingFile.txt");



	    public static void main(String[] args){

	        TextFileOperation objTextFileOperation=new TextFileOperation();
     		//objTextFileOperation.CreateFileUsingFileClass( );
          //	objTextFileOperation.CreateFileUsingFileOutputStreamClass("My Create File Operation Is Done again");
	       objTextFileOperation.ReadFileWithBufferedReader();
	    }

	    public void CreateFileUsingFileClass(){

			File file = new File(FILE_PATH);

	        //Create the file using File Class
	        try {
	            if(file.isFile()){
                    System.out.println("File already exists.");
	                file.delete();
                    System.out.println("Existing File Deleted !!!.");
                }
                file.createNewFile();
                System.out.println("File is created!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }


	    public void CreateFileUsingFileOutputStreamClass(String content){
	        //Create the file using FileOutputStream Class
	        try {
	            FileOutputStream objFileOutputStream=new FileOutputStream(FILE_PATH);
	            objFileOutputStream.write(content.getBytes());
	            System.out.println("File is created!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	public void ReadFileWithBufferedReader(){
	    try {
	        String CurrentLineValue;
	        FileReader objFileReader=new FileReader(FILE_PATH);
	        BufferedReader objBufferedReader=new BufferedReader(objFileReader);

	        while((CurrentLineValue=objBufferedReader.readLine())!=null){
	            System.out.println( "***** : "+CurrentLineValue);
	        }

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }catch (Exception ex){
	    	ex.printStackTrace();
		}
	}
}


