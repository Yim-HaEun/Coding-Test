import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++) {
        	String str = scan.nextLine();
        	int score = 0;
        	int sq =0;//연속되면 1증가하겠다.  
        	char[] ch = str.toCharArray();//배열로 변환
        	for(char c:ch) {
        		if(c=='O') {
        			sq++;
        			score+=sq;
        		}else {
        			sq=0;//리셋
        		}
        	}
        	System.out.println(score);
        }
       
        scan.close();
    }
}