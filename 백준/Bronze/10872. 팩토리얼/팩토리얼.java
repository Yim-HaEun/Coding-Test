import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fac(n));
		br.close();
	}
	public static long fac(int n) {
		long answer =1;
		for(int i =1;i<=n;i++) {
			answer *=i;
		}
		return answer;
	}
	
}