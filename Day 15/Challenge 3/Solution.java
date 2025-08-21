import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int rows = -1;
        int cols = -1;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            for(int j = 0;j<5; j++){
                arr[i][j] = sc.nextInt();

                if(arr[i][j] == 1){
                    rows = i;
                    cols = j;
                }
            }
        }

        int rMoved = Math.abs(rows-2);
        int cMoved = Math.abs(cols-2);

        int total = rMoved + cMoved;

        System.out.println(total);
        sc.close();
    }
}