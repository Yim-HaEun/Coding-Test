import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		long num = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");//공백으로 나누기
		
		for(int i=0; i<num;i++) {
			int val = Integer.parseInt(input[i]);
			
			if(val > max) {
				max = val;
			}if(val <min) {
				min = val;	
			}	
		}
		System.out.printf("%d %d",min,max);
		
		br.close();
	}
}