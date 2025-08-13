import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int c=1;
        boolean check=false;

        for(int i=1; i< s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                c++;
                if(c>=7){
                    check =true;
                    break;
                }
            }
            else{
                c = 1;
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
