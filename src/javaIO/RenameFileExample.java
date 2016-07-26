package javaIO;
import java.io.File;
public class RenameFileExample {
	public static void main(String[] args){
		
		File oldfile = new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\oldFile.txt");
		try{
			oldfile.createNewFile();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		File newfile = new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\newFile.txt");
		
		if(oldfile.renameTo(newfile)){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}
	}
}
