import java.util.Scanner;

public class Diner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        float b =0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            b+=a;
        }
        float c = b/n;
        System.out.println(c); 
        sc.close();
    }
}