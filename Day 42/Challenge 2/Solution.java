import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String photo = sc.next();

        System.out.println(26*(photo.length()+1)-photo.length());
        sc.close();
    }
}
