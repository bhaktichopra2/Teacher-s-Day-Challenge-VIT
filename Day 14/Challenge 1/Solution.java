import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        Set<Character> diff = new HashSet<>();

        for(char x : name.toCharArray()){
            diff.add(x);
        }

        if(diff.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
