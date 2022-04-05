 import java.io.*;
 import java.util.Arrays;
import java.util.PriorityQueue;
 import java.util.StringTokenizer;

 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[1001];

        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        for(int i=0;i<n;i++)
            p[Integer.parseInt(st.nextToken())]++;

        int sum=0,wait=0;
        for(int i=0;i<n;i++){
            while (p[i]-- > 0 ){
                sum += wait+i;
                wait += i;
            }
        }

        System.out.println(sum);
    }
}
