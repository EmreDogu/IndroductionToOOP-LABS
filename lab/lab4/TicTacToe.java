import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {
                
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
       		int moveCount = 0;
		int currentPlayer = 1;
		int row, col;
		boolean flag = true; 
           	do {
		        System.out.print("Player " + currentPlayer  + " enter row number: ");
		        row = reader.nextInt();
		        System.out.print("Player " + currentPlayer + " enter column number: ");
		        col = reader.nextInt();
               		if ((col>3)||(row>3)){
				System.out.println("Coordinates are not valid! Please enter again!");
				continue;
			} else if (board[row-1][col-1 ] != ' ') {
                		System.out.println("There is already a X or O here! Please enter again!");
				continue;
			} else {
				if (currentPlayer % 2 == 1) {
					board[row-1][col-1] = 'X';
					printBoard(board);
					currentPlayer = 2;
					moveCount++;
				} else {
					board[row-1][col-1] = 'O';
					printBoard(board);
					currentPlayer = 1;
					moveCount++;
				}
			}
			if (checkBoard1(board,row,col)==true || checkBoard2(board,row,col)==true){
				flag = false;
				if ((currentPlayer + 1) % 2 == 1) {
					System.out.println("Player 1 wins!");
					reader.close();
					break;
				} else {
					System.out.println("Player 2 wins!");
					reader.close();
					break;
				}
			} else if (moveCount >= 9) {
				System.out.println("Game Finished! Draw!");
				flag = false;
				reader.close();
			}
		} while (flag = true);
	}
    
	public static boolean checkBoard1(char[][] board, int rowlast, int collast){
        	char symbol = board[rowlast - 1][collast - 1];
        	boolean win = true;
        	for (int col = 0; col < 3; col++) {
                	if (board[rowlast - 1][col] != symbol) {
                		win = false;
                		break;
            		}
        	}  if((board[0][0]==symbol)&&(board[1][1]==symbol)&&(board[2][2]==symbol)){           	
            		win=true;		
			return win;
            	} else if((board[0][2]==symbol)&&(board[1][1]==symbol)&&(board[2][0]==symbol)){           		
			win=true;		
			return win;
            	}
		return win;    
	}
        
	public static boolean checkBoard2(char[][] board,int rowlast,int collast){
		char symbol=board[rowlast-1][collast-1];
		boolean win=true;
		for(int row = 0 ; row<3 ; row++) { 
	    		if(board[row][collast-1] != symbol){
                	win = false;
                	break;
	    		}    	 	    
		}
		return win;
	}    
	
    public static void printBoard(char[][] board) {
		System.out.println("    1   2   3");
		System.out.println("   -----------");
		for (int row = 0; row < 3; ++row) {
			System.out.print(row + 1 + " ");
			for (int col = 0; col < 3; ++col) {
				System.out.print("|");
				System.out.print(" " + board[row][col] + " ");
				if (col == 2)
					System.out.print("|");

			}
			System.out.println();
			System.out.println("   -----------");

		}

	}

}
