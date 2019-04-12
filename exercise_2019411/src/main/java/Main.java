import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Author:lorrie
 * Create:2019/4/11
 */

public class Main {
    //约瑟夫环
    public static void win(int n,int m){
        if (n==0||m==0){
            return;
        }
        Queue<Integer> queue=new LinkedBlockingQueue();
        for (int i=0;i<n;i++) {
            queue.add(i+1);
        }
        int count =0;
        while (queue.size()>1) {
           int f= queue.poll();
            count++;
            if (count%m==0){
                System.out.print(f+" ");
            }
            else {
                queue.add(f);
            }
        }
        System.out.println("\n"+queue.peek());


    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        win(n,m);
    }
}
