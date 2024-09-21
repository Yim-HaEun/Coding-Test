import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] ch = s.toCharArray();
		
		//변환된 문자열 저장
		StringBuilder r = new StringBuilder();
		for(char c : ch) {
			if(Character.isUpperCase(c)) {
				r.append(Character.toLowerCase(c));
			}else {
				r.append(Character.toUpperCase(c));
			}
		}
		System.out.println(r.toString());
		
	}
}