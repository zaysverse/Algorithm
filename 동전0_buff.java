import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] cointypes = new int[n];

        for(int i=0;i<n;i++)
        {
            cointypes[i]=Integer.parseInt(br.readLine());
        }

        int result = 0;
        for(int i=n-1;i>=0;i--){
            if(k>=cointypes[i])
            {
                result += (k/cointypes[i]);
                k %= cointypes[i];
            }
        }
        System.out.println(result);
    }
}
