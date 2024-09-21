import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String qr = "";
		for(int i=0;i<tc;i++) {
			String[] input = br.readLine().split(" ");
			int r = Integer.parseInt(input[0]);
			String str = input[1];
			char[] ch = str.toCharArray();
			for(int j=0;j<ch.length;j++) {
				for(int k=0;k<r;k++) {
					qr+=ch[j];
				}
			}
			qr+="\n";
			
		}
		System.out.print(qr);
		
		br.close();
		
	}
}