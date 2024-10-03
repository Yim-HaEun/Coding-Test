import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a = 300;
    	int b = 60;
    	int c = 10;
    	int time = scan.nextInt();
    	int aa =time/a;
    	int bb = (time%a)/b;
    	int cc = (time%a)%b/c;
    	if(((time%a)%b)%c!=0) {
    		System.out.println(-1);
    	}else {
    		System.out.printf("%d %d %d",aa,bb,cc);
    	}
    	scan.close();
    }
}