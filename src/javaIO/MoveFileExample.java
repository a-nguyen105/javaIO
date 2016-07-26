package javaIO;
import java.io.*;
public class MoveFileExample {
	
	public static void main(String[] args){
		try{
			File file = new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\newfile.txt");
			
			if(file.renameTo(new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\move\\" + file.getName()))){
				System.out.println("File is moved");
			}else{
				System.out.println("File is not moved");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
