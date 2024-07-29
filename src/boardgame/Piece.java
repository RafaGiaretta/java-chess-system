package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() { //Somente classes do pacote tem acesso
		return board;
	}	
	

}
