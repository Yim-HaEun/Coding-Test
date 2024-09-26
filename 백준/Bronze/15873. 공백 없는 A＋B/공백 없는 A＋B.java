import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0;
        if(n==1010) {
        	sum =20;
        }
        else if(n/100==0){//두자리일때
        	sum+=n/10;
        	sum+=n%10;
        }else if(n/1000==0) {
        	if(n%10==0) {
        		sum+=n/100;
        		sum+=n%100;
        	}else {
        		sum+=n/10;
        		sum+=n%10;
        	}
        }
       System.out.println(sum);
    }  
}