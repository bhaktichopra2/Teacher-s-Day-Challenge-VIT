import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        if (n <= 1) {
            System.out.println(0);
            sc.close();
            return; 
        }
        int max = list.get(0);
        int min = list.get(0);
        int count = 0;

        for(int i=1; i<list.size(); i++){
            int current = list.get(i);
            if(current < min){
                count++;
                min=current;
            }
            if(current > max){
                count++;
                max=current;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

