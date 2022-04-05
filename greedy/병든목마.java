import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count;

        if(N == 1) count = 0;
        else if (N==2)
            count = Math.min((M-1)/2, 4);
        else  if(M < 7)
            count = Math.min(M-1,4);
        else
            count= (M-3);

        count++;
        System.out.println(count);
    }
}
