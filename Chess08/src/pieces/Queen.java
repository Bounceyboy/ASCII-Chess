package pieces;

import chess.Space;

public class Queen extends Piece{

	public Queen(int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}

	@Override
	public boolean move(Space moveTo) {
		
		if(Math.abs(moveTo.getY() - this.y) == 0 ||
				Math.abs(moveTo.getX() - this.x) == 0 ||
				Math.abs(moveTo.getY() - this.y) == Math.abs(moveTo.getX() - this.x)) {

		moveTo.storePiece(this);
		return true;
		}
		
		return false;
	}

}
