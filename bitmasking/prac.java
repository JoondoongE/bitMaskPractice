package exception.bitmasking;

import java.util.Scanner;

public class prac {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        //공집합과 꽉 찬 집합 구하기
        //꽉 찬 집합은 bit가 모두 켜진 상황이기 때문에 111111111의 값으로 표현한다.
        // AND = & , OR = | , XOR = ^  , NOT = ~

        int A= 0;
        A = (1<<10)-1;
        System.out.println(A);
        

        //원소 추가
        /*
         * A집합에 특정 원소를 추가하는 방법이다. 
         * 원소에 해당하는 bit만 켜야 하기 때문에 해당 bit를 항상 1로 만드는 연산이 필요하기 때문에 OR연산을 이용한다.
         */
        int b = sc.nextInt();
        A=0;
        A |=(1<<b);
        System.out.println(A);

        //원소 삭제
        /*
         * A집합에 포함된 특정 원소를 삭제하는 방법이다.
         * A에 K번째 원소의 포함 여부와 상관없이 해당 bit를 끄기위해서는 AND연산을 이용해야 한다.
         */
        A &= ~(1 << b);
        System.out.println(A);

        //원소의 토글
        /*
         * A집합에 해당 원소가 빠져있는 경우에는 추가하고, 들어있는 경우에는 삭제하는 방법이다. XOR연산을 이용한다.
         */
        A ^= (1<<b);
        sc.close();
    }
}
