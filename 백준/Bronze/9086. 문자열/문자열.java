import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			str = br.readLine();
			char[] ch = str.toCharArray();
			bw.write(String.format("%s%s\n",ch[0],ch[ch.length-1]));
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}