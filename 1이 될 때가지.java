import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count=0;
        while (true)
        {
            //n이 k로 나누어 떨어지는 가장 가까운 수를 구한다
            int target = (n/k)*k;
            //총 연산을 진행하는 횟수 += (-1을 처리한 횟수를 한번에 구한 것)
            count+=(n-target);
            n=target;

            //더이상 나눌 수 없을 때 반복문 탈출
            if(n<k) break;
            count++;
            n/=k;
        }

        count+=(n-1);
        System.out.println(count);

    }
}
