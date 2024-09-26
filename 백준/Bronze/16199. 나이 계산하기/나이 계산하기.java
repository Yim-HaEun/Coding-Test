import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        int y1 = scan.nextInt();
        int m1 = scan.nextInt();
        int d1 = scan.nextInt();
        int man =y1-y;
        if( m1<m ||(m1==m)&&d1<d){//생일 안지나면
        	man-=1;
        }
        
        if(man<0) {
        	man=0;
        }
        int se = (y1-y)+1;
        int yeon=y1-y;
        System.out.println(man);
        System.out.println(se);
        System.out.println(yeon);
        scan.close();  
    }  
}