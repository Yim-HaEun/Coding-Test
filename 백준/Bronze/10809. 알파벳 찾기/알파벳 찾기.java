import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		char[] ch =str.toCharArray();
		
		/*26개 알파벳, 아스키값을 사용하여 문자 변환*/
		for(int i=0;i<26;i++) {
			char alphabet = (char)('a'+i);
			int index = -1; //존재하지 않는다면 -1을 출력함
			/*특정 알파벳의 첫번째 위치 찾기*/
			for(int j=0;j<ch.length;j++) {//hello(5)
				if(ch[j]==alphabet) {
					index = j;
					break;
				}
			}
			System.out.print( index +" ");
		}
		scan.close();
	}
}