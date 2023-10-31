
/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver {
  /* your code here - attributes */

  /* added with 2.5.2 */
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;

  /* your code here - constructor(s) */

  /* added with 2.5.2 */
  public PhraseSolver() {
    player1 = new Player();
    player2 = new Player();
    board = new Board();
    solved = false;
  }

  /* your code here - accessor(s) */

  public String getPlayerName() {
    /* */
    return "yes";
  }

  /* your code here - mutator(s) */

  public void play() {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    while (!solved) {

      /* your code here - game logic */

      /* added with 2.5.4 */

      // checks for which player is currently playing
      if (currentPlayer == 1) {
        // prints player and their name
        System.out.println("Player 1: " + player1.getPlayerName());
      }
      // if player 2 is active this will run
      else {
        // prints player and their name
        System.out.println("Player 2: " + player2.getPlayerName());
      }

      // phrase 'unsolved'
      System.out.println(board.getPhrase());

      // point value of the next letter guess
      System.out.println("Points for next guess: " + board.getCurrentLetterValue());

      /* your code here - determine how game ends */
      solved = true;
    }

  }

}