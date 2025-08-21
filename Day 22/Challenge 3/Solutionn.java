import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solutionn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set <Integer> set = new HashSet<>();
        set.add(sc.nextInt());
        set.add(sc.nextInt());
        set.add(sc.nextInt());
        set.add(sc.nextInt());
         
        int res = 4-set.size();
        System.out.println(res);
        sc.close();
    }
}
