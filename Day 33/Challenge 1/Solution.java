import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        boolean check = false;
        for(int i=0; i<word.length();i++){
            char c = word.charAt(i);
            if(c == 'H' || c == 'Q'|| c == '9'){
                check = true;
                break;
            }else{
                check = false;
            }
        }
        if(check){
            System.out.println("YES");
        }else{
                System.out.println("NO");
        }
        sc.close();
    }
}
