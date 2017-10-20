package pieces;

import chess.Space;

/**
 * There's no castling checking in this yet because it needs information from the whole board.
 * This needs to be handled separately.
 * 
 * @author Jason Holley
 *
 */
public class King extends Piece {
	public boolean hasMoved = false;

	public King(int x, int y, boolean isWhite) {
		super(x, y, isWhite);

	}

	@Override
	public boolean move(Space moveTo) {
		if(Math.abs(moveTo.getX() - this.x) > 1 || Math.abs(moveTo.getY() - this.y) > 1)
			return false;
		
		this.hasMoved = true;
		moveTo.storePiece(this);
		
		return true;
	}

}
