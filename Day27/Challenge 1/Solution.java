import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int i=0;
        while(a<=b && i<10){
            a *= 3;
            b *= 2;
            c++;
            i++;
        }
        System.out.println(c);
        sc.close();
    }
}
