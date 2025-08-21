import java.util.Scanner; // Import the Scanner class

public class ChessWinner {
    public static String findWinner(String s) {
        int antonWins = 0;
        int danikWins = 0;

        for (char outcome : s.toCharArray()) {
            if (outcome == 'A') {
                antonWins++;
            } else if (outcome == 'D') {
                danikWins++;
            }
        }

        if (antonWins > danikWins) {
            return "Anton";
        } else if (danikWins > antonWins) {
            return "Danik";
        } else {
            return "Friendship";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(findWinner(s));

        scanner.close();
    }
}