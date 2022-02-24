public class ChessBoard {
	public static int BLACK = 0;
	public static int WHITE = 1;
    public static Square[][] board = new Square[8][8];
    String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int[] numbers = {8, 7, 6, 5, 4, 3, 2, 1};
    public static int turn = 0;
    public void initalize() {
    	//Creates the chess board at the beginning of the game.
        board[1][0] = new Square(1, 0, new Pawn(BLACK));
        board[1][1] = new Square(1, 1, new Pawn(BLACK));
        board[1][2] = new Square(1, 2, new Pawn(BLACK));
        board[1][3] = new Square(1, 3, new Pawn(BLACK));
        board[1][4] = new Square(1, 4, new Pawn(BLACK));
        board[1][5] = new Square(1, 5, new Pawn(BLACK));
        board[1][6] = new Square(1, 6, new Pawn(BLACK));
        board[1][7] = new Square(1, 7, new Pawn(BLACK));
        board[6][0] = new Square(6, 0, new Pawn(WHITE));
        board[6][1] = new Square(6, 1, new Pawn(WHITE));
        board[6][2] = new Square(6, 2, new Pawn(WHITE));
        board[6][3] = new Square(6, 3, new Pawn(WHITE));
        board[6][4] = new Square(6, 4, new Pawn(WHITE));
        board[6][5] = new Square(6, 5, new Pawn(WHITE));
        board[6][6] = new Square(6, 6, new Pawn(WHITE));
        board[6][7] = new Square(6, 7, new Pawn(WHITE));
        board[0][0] = new Square(0, 0, new Rook(BLACK));
        board[0][7] = new Square(0, 7, new Rook(BLACK));
        board[7][0] = new Square(7, 0, new Rook(WHITE));
        board[7][7] = new Square(7, 7, new Rook(WHITE));
        board[0][1] = new Square(0, 1, new Knight(BLACK));
        board[0][6] = new Square(0, 6, new Knight(BLACK));
        board[7][1] = new Square(7, 1, new Knight(WHITE));
        board[7][6] = new Square(7, 6, new Knight(WHITE));
        board[0][2] = new Square(0, 2, new Bishop(BLACK));
        board[0][5] = new Square(0, 5, new Bishop(BLACK));
        board[7][2] = new Square(7, 2, new Bishop(WHITE));
        board[7][5] = new Square(7, 5, new Bishop(WHITE));
        board[0][3] = new Square(0, 3, new Queen(BLACK));
        board[0][4] = new Square(0, 4, new King(BLACK));
        board[7][3] = new Square(7, 3, new Queen(WHITE));
        board[7][4] = new Square(7, 4, new King(WHITE));

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square(i, j);
            }
        }
    }

    public ChessBoard() {
        this.initalize();

    }
    
    public static boolean isWhitePlaying(){
        if (turn % 2 == 0)
            return true;
        return false;
    }


    public String toString() {
        StringBuilder bld = new StringBuilder(1000);
        bld.append("   ");
        for(int i =0;i<8;i++){
            bld.append(letters[i]);
            bld.append("   ");
        }
        bld.append("\n");
            for (int i = 0; i < 8; i++) {
                bld.append(" ---------------------------------");
                bld.append("\n");
                bld.append(numbers[i]);
                for (int j = 0; j < 8; j++) {
                    bld.append("|").append(board[i][j].toString());
                }
                bld.append("|");
                bld.append(numbers[i]);
                bld.append("\n");
            }


             bld.append(" ---------------------------------");
             bld.append("\n").append("   ");
            for(int i =0;i<8;i++){
                bld.append(letters[i]);
                bld.append("   ");
            }
             return bld.toString();
    }

	public boolean isGameEnded() {
		
        return false;
	}

	public Square getSquare(int r1, int c1) {
		return board[r1][c1];
	}

	 public static Piece findPiece(Square s){
	        return board[s.getRow()][s.getCol()].getPiece();
	 }

	 public static boolean BetweenisEmpty(Square fromSquare, Square toSquare) {
		 boolean result = false;
		 if (Math.abs(fromSquare.getRow() - toSquare.getRow()) > 0) {
			 if (Math.abs(fromSquare.getCol() - toSquare.getCol()) == 0) {
				 if (fromSquare.getRow() > toSquare.getRow()) {
					 for (int i = toSquare.getRow()+1; i < fromSquare.getRow(); i++)  {
						 if(board[i][fromSquare.getCol()].getPiece()!=null) { 
							 result = false;
						 	break;
						 }if (board[i][fromSquare.getCol()].getPiece()==null) 
							 result = true;
					 }
					 
				 }else {
					 for (int i = toSquare.getRow()-1; i > fromSquare.getRow(); i--) {
						 if(board[i][fromSquare.getCol()].getPiece()!=null) {
							 result = false;
							 break;
						 } if (board[i][fromSquare.getCol()].getPiece()==null) 
							 result = true;
					 }
				 }
				 
				 
			 }else {
				 if (Math.abs(fromSquare.getCol() - toSquare.getCol()) == Math.abs(fromSquare.getRow() - toSquare.getRow())) { 
					 if (fromSquare.getRow() > toSquare.getRow()) {
						 if (fromSquare.getCol() > toSquare.getCol()) {
							 for (int k = toSquare.getRow()+1, l = toSquare.getCol()+1 ; k<fromSquare.getRow() && l < fromSquare.getCol(); k++, l++) {
								 if(board[k][l].getPiece()!=null){  
									 result = false;
								 	break;
							 	}if(board[k][l].getPiece()==null)  
									 result = true;
							 }
	
					 }else {
						 for (int k = toSquare.getRow()+1, l = toSquare.getCol()-1; k<fromSquare.getRow() && l>fromSquare.getCol(); k++, l--) {
							 if(board[k][l].getPiece()!=null){  
								 result = false;
							 	break;
						 	}if(board[k][l].getPiece()==null)  
								 result = true;
						}
					 }
				 }else { 
						 if (fromSquare.getCol() > toSquare.getCol()) {
							 for (int k = toSquare.getRow()-1, l = toSquare.getCol()+1; k> fromSquare.getRow() && l < fromSquare.getCol(); k--, l++) {
								 if(board[k][l].getPiece()!=null){  
									 result = false;
								 	break;
							 	}if(board[k][l].getPiece()==null) 
									 result = true;
							 }
								 
						 }else { 
								 for (int k = toSquare.getRow()-1, l = toSquare.getCol()-1; k> fromSquare.getRow() && l > fromSquare.getCol(); k--, l--) { 
									 if(board[k][l].getPiece()!=null){  
										 result = false;
										 	break;
									 	}if(board[k][l].getPiece()==null) 
										 result = true;
								 }
						 }
				 	}
				 }
			 }
		
		 }else {
			 if (fromSquare.getCol() > toSquare.getCol()) {
				 for (int j = toSquare.getCol()+1; j < fromSquare.getCol(); j++) {
					 if(board[fromSquare.getRow()][j].getPiece()!=null){  
						 result = false;
					 	break;
				 	}if(board[fromSquare.getRow()][j].getPiece()==null) 
						 result = true;
				 }
			 }else {
				 for (int j = toSquare.getCol()-1; j > fromSquare.getCol(); j--) {
					 System.out.println(board[fromSquare.getRow()][j].getPiece());
					 if(board[fromSquare.getRow()][j].getPiece()!=null){  
						 result = false;
					 	break;
				 	}if(board[fromSquare.getRow()][j].getPiece()==null) 
						 result = true;
				 }
			 }
		 }
		 return result;
	 }
}
