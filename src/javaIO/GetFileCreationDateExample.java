package javaIO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class GetFileCreationDateExample {
	public static void main(String[] args){
		try{
			Process proc = Runtime.getRuntime().exec("cmd /c dir c:\\Users\\a-nguyen\\.gitconfig /tc");
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			
			String data = "";
			for(int i=0; i<6; i++){
				data = bf.readLine();
			}
			System.out.println("data is " + data);
			
			//split by space
			StringTokenizer st = new StringTokenizer(data);
			String date = st.nextToken();//get date
			String time = st.nextToken();//get time
			
			//String[] result = "this is a test".split("\\s"); it also can split string as StringTokenizer
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
			
    		System.out.println("Creation Date  : " + date);
    		System.out.println("Creation Time  : " + time);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
