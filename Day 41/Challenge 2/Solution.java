import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        for(int i=0; i<n; i++){
            int dish = sc.nextInt();

            if(dish == 1){
                if(m>0){
                    m--;
                }else{
                    res++;
                }
            }else {
                if(k > 0){
                    k--;
                }else if(m>0){
                    m--;
                }else {
                    res++;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}