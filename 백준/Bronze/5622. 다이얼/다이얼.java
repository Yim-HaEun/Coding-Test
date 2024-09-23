import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String dial = scan.nextLine();
		char[] d =dial.toCharArray();
		/*abc= 2+1초 ->3초 def =4초 ghi=5초 jkl = 6초 mno = 7초 pqurs = 8초 */
		int time = 0;
		for(int i=0;i<d.length;i++) {
			switch(d[i]) {
				case 'A': case 'B' : case 'C': time+=3;break;
				case 'D': case 'E' : case 'F': time+=4;break;
				case 'G': case 'H' : case 'I': time+=5;break;
				case 'J': case 'K' : case 'L' : time+=6;break;
				case 'M': case 'N' : case 'O' : time+=7;break;
				case 'P': case 'Q' : case 'R' : case 'S' : time +=8;break;
				case 'T': case 'U' : case 'V' : time+=9;break;
				case 'W': case 'X' : case 'Y' : case 'Z' : time +=10;break;
			}
		}
		System.out.println(time);
		
		scan.close();

	}
}