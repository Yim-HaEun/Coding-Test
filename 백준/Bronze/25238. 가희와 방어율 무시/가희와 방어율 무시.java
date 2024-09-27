import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double s = a-(a*(b/100));
        if(s>=100) {
        	System.out.println(0);
        }else if(s<100) {
        	System.out.println(1);
        }
        scan.close();  
    }  
}