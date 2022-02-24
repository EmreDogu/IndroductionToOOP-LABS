
public class Knight extends Piece {

	public Knight(int i) {
		super(i);
	}

	public void move(int r2, int c2, int r1, int c1, Piece fromPiece, Square toSquare) {
		ChessBoard.board[r2][c2] = new Square(r2, c2, fromPiece);
		ChessBoard.board[r1][c1] = new Square(r1, c1);
		ChessBoard.turn += 1;
	}

	@Override
	protected boolean canMove(Piece toPiece, Piece fromPiece, Square toSquare, Square fromSquare) {
		if(toPiece==null || toPiece.getColor()!=fromPiece.getColor()) {
			int x = Math.abs(fromSquare.getCol() - toSquare.getCol()); 
	        int y = Math.abs(fromSquare.getRow() - toSquare.getRow()); 
	        if (x*y == 2) {
	        	return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return i == ChessBoard.WHITE ? " N " : " n ";
	}
}
