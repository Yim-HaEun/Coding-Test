
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split(" ");//공백으로 나누기
		if(input.length ==1 && input[0].equals("")) { //배열의 길이가 1이면서 그 값이 공백 이라면 0출력
			System.out.println(0);
		}else {
			System.out.println(input.length);
		}
		br.close();
		
	}
}