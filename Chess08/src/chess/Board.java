package chess;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

/**
 * Contains the board.
 * 
 * @author Jason Holley
 *
 */
public class Board {
	public Space[][] Spaces = new Space[8][8];
	
	/**
	 * Builds the board and places all pieces in their starting locations.
	 */
	public Board(){
		for (int x = 0; x<8; x++) {
			for (int y = 0; y<8; y++) {
				Spaces[x][y] = new Space(x,y);
			}
		}
		
		//add rooks
		Spaces[0][0].storePiece(new Rook(0, 0, true));
		Spaces[7][0].storePiece(new Rook(7, 0, true));
		Spaces[0][7].storePiece(new Rook(0, 7, false));
		Spaces[7][7].storePiece(new Rook(7, 7, false));
		
		//add Knights
		Spaces[1][0].storePiece(new Knight(1, 0, true));
		Spaces[6][0].storePiece(new Knight(6, 0, true));
		Spaces[1][7].storePiece(new Knight(1, 7, false));
		Spaces[6][7].storePiece(new Knight(6, 7, false));
		
		//add Bishops
		Spaces[2][0].storePiece(new Bishop(2, 0, true));
		Spaces[5][0].storePiece(new Bishop(5, 0, true));
		Spaces[2][7].storePiece(new Bishop(2, 7, false));
		Spaces[5][7].storePiece(new Bishop(6, 7, false));
		
		//add Queens
		Spaces[3][0].storePiece(new Queen(3, 0, true));
		Spaces[3][7].storePiece(new Queen(3, 7, false));
		
		//add Kings
		Spaces[4][0].storePiece(new King(4, 0, true));
		Spaces[4][7].storePiece(new King(4, 7, false));
		
		//add Pawns
		for(int a = 0; a<8; a++) {
			Spaces[a][1].storePiece(new Pawn(a, 1, true));
			Spaces[a][6].storePiece(new Pawn(a, 6, false));
		}
		
	}
	
}
