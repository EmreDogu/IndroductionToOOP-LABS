
public class Rook extends Piece {

	public Rook(int i) {
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
			if((Math.abs(fromSquare.getRow() - toSquare.getRow()) > 1 && Math.abs(toSquare.getCol() - fromSquare.getCol()) == 0) || (Math.abs(fromSquare.getRow() - toSquare.getRow()) == 0 && Math.abs(toSquare.getCol() - fromSquare.getCol()) > 1) ) {
    				if(ChessBoard.BetweenisEmpty(fromSquare, toSquare)) {
    					return true;
    				}
			}if((Math.abs(fromSquare.getRow() - toSquare.getRow()) == 1 && Math.abs(toSquare.getCol() - fromSquare.getCol()) == 0) || (Math.abs(fromSquare.getRow() - toSquare.getRow()) == 0 && Math.abs(toSquare.getCol() - fromSquare.getCol()) == 1)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return i == ChessBoard.WHITE ? " R " : " r ";
	}

}
