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

        Lecture[] lectures = new Lecture[n];

        //배열을 돌면서 시작시간과 종료시간을 lecture[i]에 저장
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lectures[i] = new Lecture(start, end);
        }

        //시작시간에 따라 정렬
        Arrays.sort(lectures);

        //우선순위큐에 첫번째 강의의 종료시간을 넣어준다
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(lectures[0].end);

        // lectures 배열을 반복분으로 돌면서 강의를 강의실에 하나씩 배정
        for(int i =1;i<n;i++){
            //pq의 peek 종료시간이 시작시간보다 작으면 pq를 꺼낸다
            if(pq.peek() <= lectures[i].start) pq.poll();
            pq.offer(lectures[i].end);
        }

        System.out.println(pq.size());
        br.close();
    }

     static class Lecture implements Comparable<Lecture>{
         int start;
         int end;

         Lecture(int start, int end){
             this.start = start;
             this.end = end;
         }

         @Override
         public int compareTo(Lecture o){
             //시작시간이 같으면 종료시간으로 정렬
             if(start == o.start)
                 return end-o.end;
             return start - o.start;
         }
     }
}
