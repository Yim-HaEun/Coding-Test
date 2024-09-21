import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String str = b.readLine();
		int n = Integer.parseInt(b.readLine());
		String[] sp = str.split("");
		
		System.out.println(sp[n-1]);
		
		b.close();
	}
}