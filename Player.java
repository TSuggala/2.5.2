
/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
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
    points = 0;

    System.out.println("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();

    String username = name;
    System.out.println("\nHello " + username + "!!! \nWelcome to the game.\n");
  }

  /* added with 2.5.2 */
  public Player(String inputName) {
    points = 0;

    name = inputName;
    System.out.println("Hello " + inputName + "!!! \nWelcome to the game.\n");
  }

  /* your code here - accessor(s) */

  /* added with 2.5.4 */
  public String getPlayerName() {
    return name;
  }

  /* your code here - mutator(s) */
}