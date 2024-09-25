import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String pre1 = str.substring(0,5);
        
        int n = scan.nextInt();
        scan.nextLine();
        int count=0;
        
        for(int i=0;i<n;i++) {
    	   String sub = scan.nextLine();
    	   
    	   String pre2 = sub.substring(0,5);
    	  if(pre1.equals(pre2)) {

    		   count++;
    	   }
    	   
       }
       System.out.println(count);
       	
    }
    
}