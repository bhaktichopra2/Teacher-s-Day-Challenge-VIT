import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str1 = sc.next().toLowerCase();
    String str2 = sc.next().toLowerCase();

    int res = str1.compareTo(str2);

    if(res < 0){
        System.out.println("-1");
    }
    else if(res > 0){
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
    sc.close();
    }
}
