import java.util.Scanner;

public class Main {
	static Square fromSquare;
	static Piece fromPiece;
	static Square toSquare;
	static Piece toPiece;
	static int r1;
	static int r2;
	static int c1;
	static int c2;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ChessBoard c = new ChessBoard();
		System.out.println(c);
		
		while (!c.isGameEnded()){
			System.out.println("It is " + (ChessBoard.isWhitePlaying() ? "White" : "Black") + "'s turn");
			String a1;
			do {
			System.out.print("Enter the location of piece: ");
			a1 = reader.next();
			char ch1 = a1.charAt(0);
			char ch2 = a1.charAt(1);
			switch (ch1) {
			case 'a':
				Main.c1 = 0;
				break;
			case 'b':
				Main.c1 = 1;
				break;
			case 'c':
				Main.c1 = 2;
				break;
			case 'd':
				Main.c1 = 3;
				break;
			case 'e':
				Main.c1 = 4;
				break;
			case 'f':
				Main.c1 = 5;
				break;
			case 'g':
				Main.c1 = 6;
				break;
			case 'h':
				Main.c1 = 7;
				break;
			}
			
			switch (ch2) {
			case '1':
				Main.r1 = 7;
				break;
			case '2':
				Main.r1 = 6;
				break;
			case '3':
				Main.r1 = 5;
				break;
			case '4':
				Main.r1 = 4;
				break;
			case '5':
				Main.r1 = 3;
				break;
			case '6':
				Main.r1 = 2;
				break;
			case '7':
				Main.r1 = 1;
				break;
			case '8':
				Main.r1 = 0;
				break;
			}
			fromSquare = ChessBoard.board[r1][c1];
			fromPiece = ChessBoard.findPiece(fromSquare);
			
			}while(fromPiece == null || fromPiece.getColor()!=(ChessBoard.isWhitePlaying() ? ChessBoard.WHITE : ChessBoard.BLACK));
			String a2;
			do {
			System.out.print("Enter the new location of piece: ");
			a2 = reader.next();
			char ch1 = a2.charAt(0);
			char ch2 = a2.charAt(1);
			switch (ch1) {
			case 'a':
				Main.c2 = 0;
				break;
			case 'b':
				Main.c2 = 1;
				break;
			case 'c':
				Main.c2 = 2;
				break;
			case 'd':
				Main.c2 = 3;
				break;
			case 'e':
				Main.c2 = 4;
				break;
			case 'f':
				Main.c2 = 5;
				break;
			case 'g':
				Main.c2 = 6;
				break;
			case 'h':
				Main.c2 = 7;
				break;
			}
			
			switch (ch2) {
			case '1':
				Main.r2 = 7;
				break;
			case '2':
				Main.r2 = 6;
				break;
			case '3':
				Main.r2 = 5;
				break;
			case '4':
				Main.r2 = 4;
				break;
			case '5':
				Main.r2 = 3;
				break;
			case '6':
				Main.r2 = 2;
				break;
			case '7':
				Main.r2 = 1;
				break;
			case '8':
				Main.r2 = 0;
				break;
			}
			
			toSquare = ChessBoard.board[r2][c2];
			toPiece = ChessBoard.findPiece(toSquare);
		}while(!fromPiece.canMove(toPiece, fromPiece, toSquare, fromSquare));
			fromPiece.move(r2, c2, r1, c1, fromPiece, toSquare);
			System.out.println(c);
		}
		reader.close();
	}
}

