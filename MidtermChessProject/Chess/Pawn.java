public class Pawn extends Piece {
	static int movecount;
	public Pawn(int i) {
		super(i);
	}

	public String toString() {
		return i == ChessBoard.WHITE ? " P " : " p ";
	}

	public void move(int r2, int c2, int r1, int c1, Piece fromPiece, Square toSquare) { 
		ChessBoard.board[r2][c2] = new Square(r2, c2, fromPiece);
		if ((toSquare.getRow() == 0 && fromPiece.getColor() == 1) || (toSquare.getRow() == 7 && fromPiece.getColor() == 0))
			ChessBoard.board[r2][c2] = new Square(r2, c2, new Queen(fromPiece.getColor()));
		ChessBoard.board[r1][c1] = new Square(r1, c1);
		ChessBoard.turn += 1;
	}

	@Override
	protected boolean canMove(Piece toPiece, Piece fromPiece, Square toSquare, Square fromSquare) {
		if(toPiece == null || toPiece.getColor()!=fromPiece.getColor()) {
			if((fromSquare.getRow() == 1) || (fromSquare.getRow() == 6)) {
				if (ChessBoard.BetweenisEmpty(fromSquare, toSquare) && Math.abs(toSquare.getRow() - fromSquare.getRow()) ==2 && Math.abs(toSquare.getCol() - fromSquare.getCol()) == 0) {
					if((fromPiece.getColor() == 1) && toSquare.getRow() < fromSquare.getRow()) {
						return true;
					}if((fromPiece.getColor() == 0) && toSquare.getRow() > fromSquare.getRow()) {
						return true;
					}
				}if((Math.abs(fromSquare.getRow() - toSquare.getRow()) == 1) && toSquare.getPiece()==null) {
						if((fromPiece.getColor() == 1) && toSquare.getRow() < fromSquare.getRow()) {
							return true;
						}if((fromPiece.getColor() == 0) && toSquare.getRow() > fromSquare.getRow()) {
							return true;
						}
				}if (Math.abs(fromSquare.getRow() - toSquare.getRow())==1 && Math.abs(toSquare.getCol() - fromSquare.getCol()) == 1 && toSquare.getPiece()!= null) {
					if((fromPiece.getColor() == 1) && toSquare.getRow() < fromSquare.getRow()) {
						return true;
					}
					if((fromPiece.getColor() == 0) && toSquare.getRow() > fromSquare.getRow()) {
						return true;
					}
				}
				
			}else {
				if((Math.abs(fromSquare.getRow() - toSquare.getRow()) == 1) && toSquare.getPiece()==null) {
					if((fromPiece.getColor() == 1) && toSquare.getRow() < fromSquare.getRow()) {
						return true;
					}
					if((fromPiece.getColor() == 0) && toSquare.getRow() > fromSquare.getRow()) {
						return true;
					}
			}
				if(Math.abs(fromSquare.getRow() - toSquare.getRow()) == 1 && Math.abs(toSquare.getCol() - fromSquare.getCol()) == 1 && toSquare.getPiece()!= null) {
					if((fromPiece.getColor() == 1) && toSquare.getRow() < fromSquare.getRow()) {
						return true;
					}
					if((fromPiece.getColor() == 0) && toSquare.getRow() > fromSquare.getRow()) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

