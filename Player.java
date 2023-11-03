
/*
 * Activity 2.5.2
 *
 * A Player class the PhraseSolverGame
 * Developed By: Thaman Suggala
 *
 */
import java.util.Scanner;

public class Player {

  /* your code here - attributes */

  /* added with 2.5.2 */
  private String name;
  private int points;

  /* your code here - constructor(s) */

  /* added with 2.5.2 */
  public Player() {
    points = 600; // adjusted based on new game mechanics per group implement

    System.out.println("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();

    String username = name;
    System.out.println("\nHello " + username + "!!! \nWelcome to the game.\n");

    /* added with 2.5.5 */
    System.out.println("""
        How To Play:
           - Enter in a letter to reveal if it is in the phrase
           - Enter a full phrase if you would like to guess the word
           - If you enter a phrase and get it wrong, you will lose and lose all your points
           - Each guess will have a new value attatched to it, guess right to gain the points
           - Every wrong letter guess will deduct 200 points from your score
           - Each Player starts with 600 points

                """);
  }

  /* added with 2.5.2 */
  public Player(String inputName) {
    points = 600; // adjusted based on new game mechanics per group implement

    name = inputName;
    System.out.println("Hello " + inputName + "!!! \nWelcome to the game.\n");
  }

  /* your code here - accessor(s) */

  /* added with 2.5.4 */
  public String getPlayerName() {
    return name;
  }

  /* added with 2.5.5 */
  public int getPoints() {
    return points;
  }

  /* your code here - mutator(s) */
}
