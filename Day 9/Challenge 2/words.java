import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for(int i =0; i<n; i++){
            list.add(sc.next());
        }

        for(String word : list){
            if(word.length()>10){
                char first = word.charAt(0);
                char last = word.charAt(word.length()-1);
                int mid = word.length()-2;

                System.out.println(""+first+mid+last);
            }
            else{
                System.out.println(word);
            }
        }
        sc.close();
    }
}
