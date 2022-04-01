import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String str = br.readLine();
        int sum = 0;

        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        int len = charArr.length;

        StringBuilder sb = new StringBuilder();
        for(int i=len-1;i>=0;i--){
            int num = charArr[i] - '0'; //형변환 아스키코드'0' =48 을 빼줘서
            sum+=num;
            sb.append(num);
        }

        if(charArr[0] != '0' || sum % 3!=0){
            System.out.println(-1);
            return;
        }

        System.out.println(sb.toString());
    }
}
