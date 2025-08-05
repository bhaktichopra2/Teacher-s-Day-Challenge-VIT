import java.util.Scanner;

public class Team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int solved = 0;
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a+b+c;
            if(sum>=2){
                solved++;
            }
        }
        sc.close();
        System.err.println(solved);
    }
}