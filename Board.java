
public class Board {
	
	public String[] board;
	boolean validity = false;;
	
	public void createBoard() {
		board = new String[9];
		for (int position=0; position<9; position++) {
			board[position] = "" + (position+1) + "" ;
			
		}
	}
	
	public void printBoard() {
		
		System.out.println("|----|----|----|");
		System.out.println("|"+ board[0] +"   |  "+ board[1] +  " | "+ board[2] + "  |");
		System.out.println("|----|----|----|");
		System.out.println("|"+ board[3] +"   |  "+ board[4] +  " | "+ board[5] + "  |");
		System.out.println("|----|----|----|");
		System.out.println("|"+ board[6] +"   |  "+ board[7] +  " | "+ board[8] + "  |");
		System.out.println("|----|----|----|");
				}
	public boolean checkWinX() {
		
		if(board[0] == "X" && board[1] == "X" && board[2] == "X") {
			validity=true;
		}
		else if(board[3] == "X" && board[4] == "X" && board[5] == "X") {
			validity=true;
		}
		else if(board[6] == "X" && board[7] == "X" && board[8] == "X") {
			validity=true;
		}
		else if(board[0] == "X" && board[3] == "X" && board[6] == "X") {
			validity=true;
		}
		else if(board[1] == "X" && board[4] == "X" && board[7] == "X") {
			validity=true;
		}
		else if(board[2] == "X" && board[5] == "X" && board[8] == "X") {
			validity=true;
		}
		else if(board[0] == "X" && board[4] == "X" && board[8] == "X") {
			validity=true;
		}
		else if(board[2] == "X" && board[4] == "X" && board[6] == "X") {
			validity=true;
		}
		return validity;
	}
		
		
	public boolean checkWinO() {
		
		if(board[0] == "O" && board[1] == "O" && board[2] == "O") {
			validity=true;
		}
		else if(board[3] == "O" && board[4] == "O" && board[5] == "O") {
			validity=true;
		}
		else if(board[6] == "O" && board[7] == "O" && board[8] == "O") {
			validity=true;
		}
		else if(board[0] == "O" && board[3] == "O" && board[6] == "O") {
			validity=true;
		}
		else if(board[1] == "O" && board[4] == "O" && board[7] == "O") {
			validity=true;
		}
		else if(board[2] == "O" && board[5] == "O" && board[8] == "O") {
			validity=true;
		}
		else if(board[0] == "O" && board[4] == "O" && board[8] == "O") {
			validity=true;
		}
		else if(board[2] == "O" && board[4] == "O" && board[6] == "O") {
			validity=true;
		}
		
		return validity;
	}
			
		 
		
	
	
	
	
	
	
	
	
	
	
}
	
