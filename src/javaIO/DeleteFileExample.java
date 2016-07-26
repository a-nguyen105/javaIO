package javaIO;
import java.io.*;
public class DeleteFileExample {
	public static void main(String[] args){
		try{
			File file = new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\newfile.txt");
			if(file.delete()){
				System.out.println(file.getName() + " is deleted ");
			}else{
				System.out.println("Delete operation is failed");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
