package exception.bitmasking;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        /*
         * 64 32 16 8 4 2 1
         * 예를 들어 23은 2진수로 표현하면 16+4+2+1이다.
         * 그럼 0 0 1 0 1 1 1 이다.
         * 
         */
        int result = 0;
        for (int i = 0; i < 7; i++) {
            if ((x & (1 << i)) > 0)
                result++;
        }
        System.out.println(result);
        
    }
}
