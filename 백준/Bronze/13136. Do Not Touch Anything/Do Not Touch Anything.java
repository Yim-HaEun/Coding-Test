import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        long v = (long)Math.ceil(a/c);
        long h = (long)Math.ceil(b/c);
       
        scan.close();
        System.out.println(v*h);
    }  
}