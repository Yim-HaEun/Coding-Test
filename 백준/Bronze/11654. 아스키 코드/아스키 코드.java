import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((int)b.readLine().charAt(0));
		
		b.close();
	}
}