import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int remove = 0;

        for(int i = 0; i < word.length()-1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                remove++;
            }
        }
        System.out.println(remove);
        sc.close();
    }
}
