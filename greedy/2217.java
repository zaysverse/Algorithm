 import java.io.*;
 import java.util.Arrays;
import java.util.PriorityQueue;
 import java.util.StringTokenizer;

 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] rope = new int[n];

        for(int i =0;i<n;i++){
            rope[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int weight=0,result=0;
        for(int i=0;i<n;i++){
            weight = (n-i)*rope[i];
            result = (weight > result) ? weight : result;
        }

        System.out.println(result);
    }
}
