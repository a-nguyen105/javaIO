package javaIO;
import java.io.*;
public class FilePathExample1 {
 public static void main(String[] args){
	 try{
		 String filename = "newfile.txt";
		 String workingDirectory = System.getProperty("user.dir");
		 
		 String absoluteFilePath = "";
		 absoluteFilePath = workingDirectory + File.separator + filename;
		 
		 
		 //method 1
		 File file = new File(workingDirectory, filename);
		 System.out.println("Final filepath:" + absoluteFilePath);
		 //method 2
		 //System.out.println("Final filepath:" + absoluteFilePath);
		 //File file = new File(absoluteFilePath);
		 
		 //get osName
		 String my_os = System.getProperty("os.name").toLowerCase();
		 System.out.println("os is :" + my_os);
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File is already existed!");
			}
	 }catch (Exception e) {
		// TODO: handle exception
		 e.printStackTrace();
	}
 }
 
}
