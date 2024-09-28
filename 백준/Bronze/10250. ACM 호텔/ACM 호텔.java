import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        
        for(int i=0;i<n;i++) {
        	int floor = scan.nextInt();
        	int room = scan.nextInt();
        	int guest =scan.nextInt();
        	int f = guest%floor;//층
        	int ho = guest/floor+1;//배정할 방 호수
        	
        	if(f==0){//나누어떨어지면 가장 높은 층
        		f=floor;
        		ho--;
        	}
        	System.out.printf("%d%02d\n",f,ho);//방번호는 두자리로
        }
        scan.close();  
    }  
}