import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int l = str.length()/2;
        
        String first = "";
        String last = "";
        if(str.length()%2==0) {
	       first = str.substring(0,l);
	       last = str.substring(l,str.length());
	        StringBuilder reverse = new StringBuilder(last).reverse();
	        last = reverse.toString();
        }else if(str.length()%2==1) {
        	first = str.substring(0,l);
            last = str.substring(l+1,str.length());
            StringBuilder reverse = new StringBuilder(last).reverse();
            last = reverse.toString();
        }
       
        if(first.equals(last)) {
        	System.out.println(1);
        }else {
        	System.out.println(0);
        }
        scan.close();
    }
}
