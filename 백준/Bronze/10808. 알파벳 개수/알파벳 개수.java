import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char[] ch = str.toCharArray();
		
		for(int i=0;i<26;i++) {//알파벳
			char alpha = (char)('a'+i);
			int index = 0;//초기값은 0;
		
			for(int j =0;j<ch.length;j++) {
				if(ch[j] == alpha) {
					index+=1;
				}
			}
			System.out.printf(index+" ");
		}
		scan.close();
	}
}