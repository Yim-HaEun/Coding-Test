import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a;
		int b;
		while(true) {
			String input = br.readLine();
			String[] n = input.split(" ");
			
			a = Integer.parseInt(n[0]);
			b = Integer.parseInt(n[1]);
			if(a ==0 && b==0) {
				break;
			}
			if(a>b) {
				bw.write("Yes\n");
			}else if(a<=b){
				bw.write("No\n");
			}
			
		}
		bw.flush();
		br.close();
		bw.close();

	}
}