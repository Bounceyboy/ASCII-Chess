package pieces;

import chess.Space;

/**
 * @author Jason Holley
 */
public class Rook extends Piece {
	boolean hasMovedYet = false;
	public Rook(int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}

	@Override
	public boolean move(Space moveTo) {
		
		if(moveTo.getX() != this.x && moveTo.getY() != this.y)
			return false;
		
		this.hasMovedYet = true;
		moveTo.storePiece(this);		
		
		return true;
	}

}
