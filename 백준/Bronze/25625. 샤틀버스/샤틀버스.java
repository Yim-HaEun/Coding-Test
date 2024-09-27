import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int time=0;
        if(y>=x) {
        	time=y-x;
        }else if(x>y){
        	time=x+y;
        }System.out.println(time);
        
        scan.close();  
    }  
}