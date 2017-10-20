package pieces;

import chess.Space;

/**
 * @author Jason Holley
 *
 */
public class Bishop extends Piece {

	public Bishop(int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}

	@Override
	public boolean move(Space moveTo) {
		if (Math.abs(moveTo.getY() - this.y) != Math.abs(moveTo.getX() - this.x))
			return false;
		
		moveTo.storePiece(this);
		return true;
	}

}
