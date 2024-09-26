import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        scan.nextLine();
        for(int i=0; i<n;i++) {
        	String str = scan.nextLine();
        	StringBuilder sb = new StringBuilder(str);
        	sb.reverse();
        	System.out.println(sb);
        }
        scan.close();
    }  
}