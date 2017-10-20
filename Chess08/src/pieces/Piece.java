package pieces;

import chess.Space;

/**
 * @author Jason Holley
 * 
 */
public class Piece {
	protected int x,y;
	protected boolean isWhite;	
	
	Piece (int x, int y, boolean isWhite){
		this.x = x;
		this.y = y;
		this.isWhite = isWhite;
	}
	
	//no need for out of bounds checking anymore because this takes a space as an argument and not a coordinate
	/**
	 * Make sure that you remove the piece from the space you're moving from before using this move method.
	 * <p>Also be sure to not be moving the piece to the same space because there is no check for that.
	 * 
	 * @param moveTo	The space to attempt moving the piece to.
	 * @return			False if illegal move, true if legal move (for the piece. This will overwrite a piece existing in the moveTo spot).
	 */
	public boolean move(Space moveTo) {
		return false;
	};
	
	
}
