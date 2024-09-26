import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int time = c/(a*2);
        int mile = time*b;
        scan.close();
        System.out.println(mile);
    }  
}