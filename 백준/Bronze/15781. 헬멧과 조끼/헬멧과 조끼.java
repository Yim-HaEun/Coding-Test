import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a =scan.nextInt();
    	int b =scan.nextInt();
    	int[] h = new int[a];
    	int[] v = new int[b];
    	
    	for(int i=0;i<a;i++) {
    		h[i] = scan.nextInt();
    	}for(int j=0;j<b;j++) {
    		v[j] = scan.nextInt();
    	}
    	Arrays.sort(h);
    	Arrays.sort(v);
    	
    	System.out.println(h[a-1]+v[b-1]);
    	
    	
    	scan.close();
    }
}