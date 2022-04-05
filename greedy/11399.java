 import java.io.*;
 import java.util.Arrays;
import java.util.PriorityQueue;
 import java.util.StringTokenizer;

 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] p = new int[n];

        st=new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++)
            p[i]=Integer.parseInt(st.nextToken());

        //정렬
        Arrays.sort(p);

        int time=0,wait=0;      //time: 총합 대기시간 , wait: 사람별 대기시간
        for(int i=0;i<n;i++){
            wait=p[i]+wait;
            time+=wait;
        }

        System.out.println(time);

    }
}
