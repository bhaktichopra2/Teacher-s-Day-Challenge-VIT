import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        for(int i=0; i<n; i++){
            int col= sc.nextInt();
            int row= sc.nextInt();

            int res =(row*col+1)/2;
            System.out.println(res);
        }
        sc.close();
    }   
}
