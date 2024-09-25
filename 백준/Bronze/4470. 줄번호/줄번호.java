import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        scan.nextLine();
        for(int i=1;i<=n;i++) {
        	String str= scan.nextLine();
        	System.out.printf("%d. %s\n",i,str);
        	
        }
        
    }
}