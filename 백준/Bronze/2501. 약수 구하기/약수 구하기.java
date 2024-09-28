import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int p = scan.nextInt();
        int n = scan.nextInt();
        for(int i=1;i<=p;i++) {
        	if (p%i==0) {
        		list.add(i);
        	}
        }
        
        if(list.size()<n) {
        	System.out.println(0);
        }else {
        	int answer = list.get(n-1);
        	System.out.println(answer);
        }
        
       
        scan.close();  
    }

}