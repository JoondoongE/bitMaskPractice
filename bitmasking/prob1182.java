package exception.bitmasking;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob1182 {

    static int n,s, ans;
    static int[]arr;
    static int flag =0;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        ans =0;
        method(0,0);
        System.out.println(ans);
    }

    private static void method(int flag, int cnt){

        if(cnt==n){
            //공집합인 경우
            if(flag==0){return;}
            int sum=0;
            for(int i=0;i<n;i++){
                if (((1 << i) & flag) > 0) {
					sum += arr[i];
				}
			}
			// 합이 S가 된다면 개수 추가
			if (sum == s)
			    ans++;
			return; 
        }
        //cnt번째 비트를 선택하지 않는 경우
        method(flag, cnt+1);
        
        //cnt번째 비트를 선택한 경우
        flag = (1 << cnt) | flag;
        method(flag, cnt+1);
    }
    
}
