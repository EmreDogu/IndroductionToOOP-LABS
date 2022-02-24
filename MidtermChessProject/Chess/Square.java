
public class Square {
    int row;
    int column;
    Piece piece = null;
    public Square(int row,int column) {
        this.row = row;
        this.column = column;
    }
    public Square (int row,int column,Piece piece){
        this.row = row;
        this.column = column;
        this.piece = piece;
    }
    
    public String toString(){
        if (this.piece == null)
            return "   ";
        return this.piece.toString();
    }
	public int getCol() {
		return this.column;
	}
	public int getRow() {
		return this.row;
	}
	public Piece getPiece() {
		return this.piece;
	}
	
	
}


