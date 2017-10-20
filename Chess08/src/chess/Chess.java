package chess;

import pieces.Piece;

/**
 * Main Class
 * 
 * @author Jason Holley
 * 
 */
public class Chess {

	
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		Board game = new Board();
		
		//random code for testing
		Piece temp = game.Spaces[3][1].emptySpace();
		temp.move(game.Spaces[3][5]);

		
		/* TODO: (for Jason)
		 * - promotion
		 * - en passant
		 * - castling
		 * 
		 * I will handle these after the rules are implemented since en passant is
		 * only possible for 1 turn after a specific move and castling requires
		 * accessing two spaces.
		 */
		
	}

}
