import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
            String str = br.readLine();
  
            int count = 0;

            // 문자열의 각 문자를 순회하면서 모음 개수를 셈
            for (char c : str.toCharArray()) {
                switch (c) {
                    case 'i': 
                    case 'a': 
                    case 'e':
                    case 'o': 
                    case 'u': 
                        count++;
                        break;
                }
            }

            
                System.out.println(count);
                br.close();
   			

    }
}