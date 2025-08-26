import java.util.Scanner;

public class Solution {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    StringBuilder res = new StringBuilder();

    for(int i=0; i<a.length(); i++){
        if(a.charAt(i) == b.charAt(i)){
            res.append('0');
        }else{
            res.append('1');
        }
    }
    System.out.println(res.toString());
    sc.close();
   } 
}
