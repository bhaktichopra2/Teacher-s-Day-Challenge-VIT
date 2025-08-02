import java.util.Scanner;

public class round {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        int[] scores = new int[n];
        for(int i = 0; i<n; i++){
            scores[i]=s.nextInt();
        }
        int cutoff=scores[k-1];
        int adv=0;

        for(int score:scores){
            if(score>=cutoff && score>0){
                adv++;
            }
        }
        System.out.println(adv);
        s.close();
    }
}