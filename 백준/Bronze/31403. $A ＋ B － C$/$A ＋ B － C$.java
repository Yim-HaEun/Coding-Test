import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		String ab = a+b;
		
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c));
		System.out.printf("%d", Integer.parseInt(ab)- Integer.parseInt(c));
		
		br.close();
	}
}