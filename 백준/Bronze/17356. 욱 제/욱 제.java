import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double M = (b-a)/400;
        double win = 1/(1+Math.pow(10,M));
        System.out.println(win);
        scan.close();  
    }  
}