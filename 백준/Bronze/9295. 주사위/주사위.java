import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        scan.nextLine();
        
        for(int i=1;i<=n;i++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	
        	System.out.printf("Case %d: %d\n",i,a+b);
        	
        }
        
    }
}