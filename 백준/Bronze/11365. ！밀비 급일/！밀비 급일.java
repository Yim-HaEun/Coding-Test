import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
        	String str = scan.nextLine();
        	if(str.equals("END")) {
        		break;
        	}
        	StringBuilder rv = new StringBuilder(str);
        	rv.reverse();
        	System.out.println(rv.toString());
        }
        
    }
}