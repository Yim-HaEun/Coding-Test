import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int k = scan.nextInt();
        int h = scan.nextInt();
        int sum = s+k+h;
        if(sum>=100) {
        	System.out.println("OK");
        }else if(s<k && s<h) {
        	System.out.println("Soongsil");
        }else if(k<s&&k<h) {
        	System.out.println("Korea");
        }else if(h<s && h<k) {
        	System.out.println("Hanyang");
        }
       	
    }
}