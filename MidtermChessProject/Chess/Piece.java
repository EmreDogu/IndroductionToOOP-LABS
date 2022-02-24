
public abstract class Piece {
	protected int i;
	String p;
	public Piece(int i) {
		this.i = i;
	}

	public boolean isWhite() {
		return false;
	}

	public String getPiece() {
		return p;
	}

	public int getColor() {
		return this.i;
	}

	protected abstract boolean canMove(Piece toPiece, Piece fromPiece, Square toSquare, Square fromSquare);

	protected abstract void move(int r2, int c2, int r1, int c1, Piece fromPiece, Square toSquare);
	
}
