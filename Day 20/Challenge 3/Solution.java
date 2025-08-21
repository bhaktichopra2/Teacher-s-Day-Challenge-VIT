import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] value = new Integer[n];
        int total =0;

        for(int i=0; i<n; i++){
            value[i] = sc.nextInt();
            total += value[i];
        }

        Arrays.sort(value, Collections.reverseOrder());

        int count =0;
        int sum =0;

        for(int i=0;i<n;i++){
            sum += value[i];            
            count++;
            if(sum>total/2){
                break;
            }
        }System.out.println(count);
        sc.close();
    }
}