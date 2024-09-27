import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
			String str = scan.nextLine();
			char[] ch =str.toCharArray();
			char[] mobis = {'M','O','B','I','S'};
			
			boolean all = true;
			//각 문자가 배열에 존재하는지 차례대로  확
			for(char m : mobis) {
				boolean found = false;
				for(char c : ch) {
					if(c==m) {
						found=true;
						break;
					}
				}
			//하나라도 없다면 
				if(!found) {
					all=false;
					break;	
				}
			}
			if(all) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
	}
}