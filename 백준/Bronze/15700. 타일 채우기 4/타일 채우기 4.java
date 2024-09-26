
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
       
        long tile = (a*b)/2;
        
        scan.close();
        System.out.println(tile);
    }  
}