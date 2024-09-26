import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bun = scan.nextInt();
        int pat = scan.nextInt();
        int bb = bun/2;
        if(bb>=pat) {
        	System.out.println(pat);
        }else if(pat>bb) {
        	System.out.println(bb);
        }else if(bb<=1) {
        	System.out.println(0);
        }

        scan.close();  
    }  
}