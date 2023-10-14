package exception.bitmasking;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class prob2309 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int array[] = new int[9];
        int sum=0;
        int fake1=0, fake2=0;

        for(int i=0;i<9;i++){
            array[i] = Integer.parseInt(br.readLine());
            sum+=array[i];
        }
        Arrays.sort(array);

        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(sum-array[i]-array[j]==100){
                    fake1 = array[i];
                    fake2 = array[j];
                }
            }
        }
        for(int i=0;i<9;i++){
            if(array[i]==fake1||array[i]==fake2)continue;
            System.out.println(array[i]);
        }
    }
}
