import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] cointypes = new int [n];

        for(int i=0;i<n;i++)
        {
            cointypes[i]=sc.nextInt();
        }

        int result = 0;
        for(int i=n-1;i>=0;i--){
            if(k>cointypes[i])
            {
                result += (k/cointypes[i]);
                k %= cointypes[i];
            }
        }
        System.out.println(result);
    }
}
