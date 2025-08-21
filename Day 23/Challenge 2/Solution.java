import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long time = 0;
        int current = 1;

        for (int i = 0; i < m; i++) {
            int dest = sc.nextInt();

            if(dest>=current){
                time += dest-current;
            }else{
                time+= (n-current)+dest;
            }
            current=dest;
        }
        System.out.println(time);
        sc.close();
    }
}
