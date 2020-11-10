import java.util.Scanner;
public class Launcher {

	public static void main(String[] args) {
	
		Player p1 = new Player("X");
		Player p2 = new Player("O");
		Scanner getPosition = new Scanner(System.in);
		Board game = new Board();
		game.createBoard();
		
		System.out.println("Welcome to TIC TAC TOE ! ");
		System.out.println();
		System.out.println();
		
		game.printBoard();
		System.out.println();
		System.out.println();
		
		for(int findPosition = 0; findPosition<5; findPosition++) {
			
			System.out.print("It's player1's turn. Please enter a number: ");
			int number = getPosition.nextInt();
			game.board[number-1] = p1.getValue();
			game.printBoard();
			System.out.println();
			if(game.checkWinX()) {
				System.out.println("Player1 won the game!");
				break;
			}
			
			System.out.print("It's player2's turn. Please enter a number: ");
			int number2 = getPosition.nextInt();
			game.board[number2-1] = p2.getValue();
			game.printBoard();
			System.out.println();
			if(game.checkWinO()) {
				System.out.println("Player2 won the game!");
				break;
				
			}
			
			
			
			
		}
		getPosition.close();
		
	}

}
