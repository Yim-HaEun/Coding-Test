
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//1=공 2 3
        int[] arr ={51,0,0};
        int answer=0;
        for(int i=0;i<n;i++) {
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	int temp = arr[x-1];
        	arr[x-1]=arr[y-1];
        	arr[y-1]=temp;
        }
        for(int i=0;i<3;i++) {
        	if(arr[i]==51) {
        		answer=i+1;
        	}
        }
        System.out.println(answer);
 
        scan.close();
    }
}