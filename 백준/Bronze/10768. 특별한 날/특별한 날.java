import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a==2&&b==18) {
        	System.out.println("Special");
        }else if(a>2) {
        	System.out.println("After");
        }else if(a<2) {
        	System.out.println("Before");
        }else if(a==2 && b>18) {
        	System.out.println("After");
        }else if(a==2 && b<18) {
        	System.out.println("Before");
        }

    }
}