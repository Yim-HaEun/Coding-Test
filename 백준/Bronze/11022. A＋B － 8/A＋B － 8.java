import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));//선언
		BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter(System.out)); //선언
		
		int n = Integer.parseInt(bufferedReader.readLine()); //입력받기 
		for(int i=0;i<n;i++) {
			String[] input = bufferedReader.readLine().split(" "); //한줄 입력
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			bufferedWriter.write(String.format("Case #%d: %d + %d = %d",i+1,a,b,a+b)); //출력
			bufferedWriter.newLine(); //개행
			bufferedWriter.flush();//버퍼 전부 출력 (필수)
		}
		
		bufferedWriter.close();//스트림 닫기 (필수)
	}	
}