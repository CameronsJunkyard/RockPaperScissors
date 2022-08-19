import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // User would choose

        System.out.println("Enter your choice: ");
        String userChoice = scan.nextLine();

        String[] words = {"Rock", "Paper", "Scissors"};
        // Computer Chooses
        String computerChoice =  (words[(int) (Math.random() * words.length)]);
        System.out.println("The Computer Choose: " + computerChoice);
   

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            System.out.println("You win!");
        } else if (userChoice.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("You lose!");
        } else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
            System.out.println("You win!");
        } else if (userChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            System.out.println("You lose!");
        } else if (userChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            System.out.println("You lose!");
        } else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Invalid input");
        }



}
}
