import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int d =0;
        int p =0;
        while(times>0) {
        	if(d-p==2||p-d==2) {
        		break;
        	}
        	else {
        		String str= scan.next();
            	if(str.equals("D")) {
            		d++;
            	}else if(str.equals("P")) {
            		p++;
            	}
            	times--;
        	}
        }
        
        System.out.printf("%d:%d",d,p);
        scan.close();  
    }  
}