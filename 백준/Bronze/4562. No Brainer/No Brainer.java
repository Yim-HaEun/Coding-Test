import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        for(int i=1;i<=n;i++) {

        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	
        	if(a<b) {
        		System.out.println("NO BRAINS");
        	}
        	else if(a>=b) {
        		System.out.println("MMM BRAINS");
        	}
        }
    }
}