import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rest = 1000-n;
        int count=0;
        
        count += rest/500;
        rest = rest%500;
        
        count += rest/100;
        rest = rest%100;
        
        count += rest/50;
        rest = rest%50;
        
        count += rest/10;
        rest = rest%10;
        
        count += rest/5;
        rest = rest%5;
        
        count+=rest;
        System.out.println(count);
        scan.close();

    }
}