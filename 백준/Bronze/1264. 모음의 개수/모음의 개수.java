import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("#")) {
				break;
			}
			int count = 0;
				
			for(char c:str.toCharArray()) {
					
				switch(c) {
				case 'i': case 'I': case 'a': case 'A': case 'e': case 'E': case 'o': case 'O':
				case 'u': case 'U': 
					count++;
					break;
				}

			}
			
				System.out.println(count);
		
		}
		br.close();
	}
		
}