import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        String s = sc.next();
        char[] queue = s.toCharArray();

        for(int time=0; time<t; time++){
            int i=0;
            while(i <n-1){
                if(queue[i] == 'B' && queue[i+1] =='G'){
                    char temp = queue[i];
                    queue[i] = queue[i+1];
                    queue[i+1] = temp;

                    i+=2;
                }else{
                    i++;
                }
            }
        }System.out.println(new String(queue));
        sc.close();
    }
}
