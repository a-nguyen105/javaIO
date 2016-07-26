package javaIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class BufferedInputStreamExample {

	public static void main(String[] args){
		BufferedReader br = null;
		try {
			String sCurrentLine;
			
			br = new BufferedReader(new FileReader("c:\\Users\\a-nguyen\\Desktop\\javaio\\newfile.txt"));
			while((sCurrentLine = br.readLine()) != null){
				System.out.println(sCurrentLine);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try{
				if(br != null) br.close();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		//See updated example in JDK 7, which use try-with-resources new feature to close file automatically
//		try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
//		{
//
//			String sCurrentLine;
//
//			while ((sCurrentLine = br.readLine()) != null) {
//				System.out.println(sCurrentLine);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
	}
}
