import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		
		char t1 = aa[0];
		aa[0]=aa[2];
		aa[2]= t1;
		
		char t2 = bb[0];
		bb[0]=bb[2];
		bb[2]=t2;
		
		
		StringBuilder sb = new StringBuilder();
		for(char c :aa) {
			sb.append(c);
		}
		int first = Integer.parseInt(sb.toString());
		
		StringBuilder sec = new StringBuilder();
		for(char c : bb) {
			sec.append(c);
		}
		int second = Integer.parseInt(sec.toString());
		
		if(first>second) {
			System.out.println(first);
		}else if(second>first){
			System.out.println(second);
		}
		scan.close();
	}
}