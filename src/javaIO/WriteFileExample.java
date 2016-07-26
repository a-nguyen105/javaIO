package javaIO;

import java.io.*;

public class WriteFileExample {
	public static void main(String[] args){
		try{
			String content = "Å@nguyen tuan anh";
			
			File file = new File("c:\\Users\\a-nguyen\\Desktop\\javaio\\newfile.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			//Replace all existing content with new content.
			//FileWriter fw = new FileWriter(file.getAbsoluteFile());
			
			//Keep the existing content and append the new content in the end of the file.
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			System.out.println(file.getAbsoluteFile());
			System.out.println("done");
			
			String sCurrentLine;
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((sCurrentLine = br.readLine()) != null){
				System.out.println(sCurrentLine);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
