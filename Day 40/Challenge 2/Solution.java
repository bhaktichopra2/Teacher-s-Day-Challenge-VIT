import java.util.ArrayList;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Integer> list = new ArrayList<>();

        if(n==0){
            System.out.println(0);
            sc.close();
            return;
        }
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int current = 1;
        int max =1;
        for(int i=1; i<list.size();i++){
            if(list.get(i) >= list.get(i-1)){
                current++;
            }else{
                current=1;
            }
            if(current>max){
            max = current;
            }
        }
        System.out.println(max);
        sc.close();
    }
}