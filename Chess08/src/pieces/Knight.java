package pieces;

import chess.Space;

/**
 * @author Jason Holley
 *
 */
public class Knight extends Piece {

	public Knight(int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}

	@Override
	public boolean move(Space moveTo) {
		
		if(Math.abs(moveTo.getY() - this.y) == 2 && Math.abs(moveTo.getX() - this.x) == 1) {
			moveTo.storePiece(this);
			return true;
		}

		if(Math.abs(moveTo.getY() - this.y) == 1 && Math.abs(moveTo.getX() - this.x) == 2) {
			moveTo.storePiece(this);
			return true;
		}
		
		return false;
	}

}
