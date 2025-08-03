import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
         
        word = word.toLowerCase();

        StringBuilder res = new StringBuilder();

        for(int i =0; i < n; i++){
            char ch = word.charAt(i);

            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'y'){
            }
            else{
                res.append('.');
                res.append(ch);
            }
        }
        System.out.println(res.toString());
        sc.close();
    }
    
}