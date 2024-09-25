import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        for(int i=1;i<=3;i++) {
        	
         	
         	
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	int c = scan.nextInt();
        	int a2 = scan.nextInt();
        	int b2 = scan.nextInt();
        	int c2 = scan.nextInt();
        	int s=c2-c;
        	int m=b2-b;
        	int h=a2-a;
        	
        	if(s<0) {
        		s += 60;
        		m-=1;
        	}
        	if(m<0) {
        		m+=60;
        		h-=1;
        	}
        	System.out.println(h+" "+m+" "+s);
        	}
    }
}