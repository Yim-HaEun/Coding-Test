import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int answer=0;
		int n = Integer.parseInt(b.readLine());
		String str = b.readLine();
		String[] sp = str.split("");
		for(int i=0;i<n;i++) {
			answer+= Integer.parseInt(sp[i]);
		}
		
		System.out.println(answer);
		
		b.close();
	}
}