import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        
        int drinkToasts = (k * l) / (n * nl);
        int limeToasts = (c * d) / n;
        int saltToasts = p / (n * np);
        int minToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));

        System.out.println(minToasts);
        sc.close();
    }
}
