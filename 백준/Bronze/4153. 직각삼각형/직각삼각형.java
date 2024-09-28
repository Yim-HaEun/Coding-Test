import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        
        while(true) {
        	 int a = scan.nextInt();
             int b = scan.nextInt();
             int c = scan.nextInt();
             double x = (a/3);
        	if(a==0&&b==0&&c==0) {
        		break;
        	}else {
        		 if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b)) {
                     System.out.println("right");
                 } else {
                     System.out.println("wrong");
                 }
             }
        }
        scan.close();
    }
}