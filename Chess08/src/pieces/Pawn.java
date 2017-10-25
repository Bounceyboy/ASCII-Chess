package pieces;

import chess.Space;

/**
 * @author Jason Holley
 *
 */
public class Pawn extends Piece {
	private int moves = 0;
	public Pawn(int x, int y, boolean isWhite) {
		super(x, y, isWhite);
	}
	
	@Override
	public boolean move(Space moveTo) {
		
		if(moveTo.getX() != this.x) {
			//maybe en passant, should be checked in game implementation
			return false;
		}
		
		if(this.isWhite) {
			if((moveTo.getY() - this.y) >= 1) {
				if((moveTo.getY() - this.y) >= 2) {
					if(this.moves != 0 || (moveTo.getY() - this.y) >= 3)
						return false;
				}
			}
		}
		
		else {
			if((this.y - moveTo.getY()) >= 1) {
				if((this.y - moveTo.getY()) >= 2) {
					if(this.moves != 0 || (this.y - moveTo.getY()) >= 3)
						return false;
				}
			}
		}
		
		this.moves++;
		moveTo.storePiece(this);
		return true;
	}

}
