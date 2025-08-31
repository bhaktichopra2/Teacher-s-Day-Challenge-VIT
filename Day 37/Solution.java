import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long answer = 0;

        if(n%2==0){
            answer = n/2;
        }else if(n%2 != 0){
            answer = -(n+1)/2;
        }
        System.out.println(answer);
        sc.close();
    }
}
