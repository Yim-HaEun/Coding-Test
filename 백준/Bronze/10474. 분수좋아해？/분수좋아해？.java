import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
        	 int a = scan.nextInt();
             int b =scan.nextInt();
             if(a==0&&b==0) {
            	 break;
             }else {
            	 int p = a/b;
                 if(p==0) {
                 	p=0;
                 }
                 int pp = a%b;
                 System.out.printf("%d %d / %d\n",p,pp,b);
             }
             
        }
       
        scan.close();
    }
}