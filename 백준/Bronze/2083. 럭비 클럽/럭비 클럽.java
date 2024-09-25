import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
        	
        	String name = scan.next();
            int n = scan.nextInt();
            int m = scan.nextInt();
            if(name.equals("#")&& n==0 && m==0) {
            	break;
            }
            if(n>17) {
            	System.out.println(name + " Senior");
            }else if(n<=17 && m>=80 ) {
            	System.out.println(name + " Senior");
            }else {
            	System.out.println(name + " Junior");
            }
        }
    }
}