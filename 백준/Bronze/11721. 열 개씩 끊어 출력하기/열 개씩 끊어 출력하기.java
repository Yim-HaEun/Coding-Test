import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int len = str.length();
       for(int i=0;i<len;i+=10) {
    	   String line = str.substring(i,Math.min(len, i+10)); //Math.min을 이용해 범위를 벗어나는 걸 방지함.
    	   //만약 len이 25,라면 20-30일경우, 30과 25중에 25를 선택하도록 함.
    	   System.out.println(line);
       }
       
        scan.close();  
    }  
}