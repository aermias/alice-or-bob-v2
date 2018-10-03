import java.util.Scanner;

public class Application {
    public static Boolean validate(String s) {
        return s.toLowerCase().equals("alice") || s.toLowerCase().equals("bob");
    }

    public static void prompt() {
        System.out.println("What is your name?");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Integer incorrectGuessCount = 0;

        while (!validate(input)) {
            System.out.println("What is your name?");

            input = sc.nextLine();
            incorrectGuessCount++;
        }

        System.out.printf("Welcome %s\n\n", input);

        System.out.printf("It took you %d wrong %s before you got it right",
                incorrectGuessCount,
                incorrectGuessCount == 1 ? "try" : "tries"
        );
    }

    public static void main(String[] args) {
        // Alice or Bob v2

        prompt();
    }
}
