import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice (rock, paper, scissors) or 'quit' to exit:");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("quit")) {
                break;
            }

            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            String computerChoice = getComputerChoice(random);
            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String getComputerChoice(Random random) {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[random.nextInt(choices.length)];
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "You win! Rock beats Scissors." : "Computer wins! Paper beats Rock.";
            case "paper":
                return computerChoice.equals("rock") ? "You win! Paper beats Rock." : "Computer wins! Scissors beats Paper.";
            case "scissors":
                return computerChoice.equals("paper") ? "You win! Scissors beats Paper." : "Computer wins! Rock beats Scissors.";
            default:
                return "Invalid choice";
        }
    }
}
