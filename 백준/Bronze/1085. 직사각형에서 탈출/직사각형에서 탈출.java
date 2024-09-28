import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        
        int ox;
        int oy;
        if(w-x<(float)w/2) {
        	ox =w-x;
        }else {
        	ox=x;
        }
        if(h-y<(float)h/2) {
        	oy=h-y;
        }else {
        	oy=y;
        }
        if(ox>=oy) {
        	System.out.println(oy);
        }else {
        	System.out.println(ox);
        }

        scan.close();  
    }  
}