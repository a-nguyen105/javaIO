package javaIO;
import java.io.*;
public class FileChecker {
	private static final String file_dir = "c:\\Users\\a-nguyen\\Desktop\\javaio";
	private static final String file_text_ext = ".txt";
	
	public static void main(String[] args){
		new FileChecker().deleteFile(file_dir, file_text_ext);
	}
	
	public void deleteFile(String folder, String ext){
		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File(folder);
		
		//list out all the file name with .txt extension
		String[] list = dir.list(filter);
		
		if(list.length == 0){ 
			System.out.println("no file to delete");
			//return;
		}
		
		File fileDelete;
		
		//delete file with .txt extension
		for(String file : list){
			String temp = file_dir + File.separator + file;
//		   	String temp = new StringBuffer(file_dir)
//            .append(File.separator)
//            .append(file).toString();
	
			fileDelete = new File(temp);
			boolean isdeleted = fileDelete.delete();
			System.out.println("file:" + temp + "is deleted " +  isdeleted);
		}
		
		//list file with .docx extension
		String ext2 = ".docx";
		GenericExtFilter filter2 = new GenericExtFilter(ext2);
		File directory = new File(folder);
		
		String[] list2 = directory.list(filter2);
		for (String file : list2) {
			String temp = file_dir + File.separator + file;
			System.out.println("file : " + temp);
		}
	}
	
	
	//inner class
	public class GenericExtFilter implements FilenameFilter{
		private String ext;
		
		public GenericExtFilter(String ext){
			this.ext = ext;
		}
		
		public boolean accept(File dir, String name){
			return (name.endsWith(ext));
		}
	}
}
