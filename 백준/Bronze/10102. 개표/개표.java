import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        scan.nextLine();
        String str= scan.nextLine();
        char[] ch = str.toCharArray();
        int a = 0;
        int b = 0;
        for(char c:ch) {
        	if(c=='A') {
        		a++;
        	}else {
        		b++;
        	}
        }
        if(a>b) {
        	System.out.println("A");
        }else if(a<b) {
        	System.out.println("B");
        }else {
        	System.out.println("Tie");
        }
        
        scan.close();
    }
}