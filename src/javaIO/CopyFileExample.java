package javaIO;
import java.io.*;
public class CopyFileExample {
	public static void main(String[] args){
		InputStream inStream = null;
		OutputStream outStream = null;
		try{
			String afile = "c:\\Users\\a-nguyen\\Desktop\\javaio\\newfile.txt";
			File bfile = new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\bnewfile.txt");
			if(!bfile.exists()){
				bfile.createNewFile();
			}
			
			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);
			
			byte[] buffer = new byte[1024];
			
			int length;
			//copy the content in bytes
			while((length = inStream.read(buffer)) > 0){
				outStream.write(buffer, 0, length);
			}
			
			inStream.close();
			outStream.close();
			System.out.println("write succes");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
