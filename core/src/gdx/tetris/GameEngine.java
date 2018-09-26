package gdx.tetris;

import gdx.tetris.pieces.Piece;

public class GameEngine {
	//0 -> nothing
	//1 ~~ 7 -> static brick
	//9 -> actual brick (use the save number to know the color)
	
	public int[][] board;
	public int[][] pieceState;
	private int width= 50;
	private int height= 54;
	
	private int brickX = 50;
	private int brickY = 54;
	private int totalBricks =0;
	
	private int nowPiece = 0; //save the number of the actual piece
	private int nextPiece = 0; //number of the next piece
	private Piece actualPiece = new Piece();
	private boolean rotate = false; //when start a new piece set true
	
	//needs to put this
	//actualPiece.setKey(nowPiece);
	
	//start game
	public GameEngine() {
		board = new int[width][height];
		pieceState = new int[7][1];
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
				board[i][j] = 0;
				totalBricks++;
			}
		}
		putPiece(2,25,0);
	}
	
	public void putPiece (int piece, int x, int y) {
		if(piece == 1) {
			board[x][y] = 9;
			board[x+1][y] = 9;
			board[x+2][y] = 9;
			board[x+3][y] = 9;
		}
		else if(piece == 2) {
			board[x][y] = 9;
			board[x][y+1] = 9;
			board[x+1][y+1] = 9;
			board[x+2][y+1] = 9;
		}
		else if(piece == 3) {
			board[x][y+1] = 9;
			board[x+1][y+1] = 9;
			board[x+2][y+1] = 9;
			board[x+2][y] = 9;
		}
		else if(piece == 4) {
			board[x][y] = 9;
			board[x+1][y] = 9;
			board[x+1][y+1] = 9;
			board[x][y+1] = 9;
		}
		else if(piece == 5) {
			board[x][y+1] = 9;
			board[x+1][y+1] = 9;
			board[x+1][y] = 9;
			board[x+2][y] = 9;
		}
		else if(piece == 6) {
			board[x][y+1] = 9;
			board[x+1][y+1] = 9;
			board[x+1][y] = 9;
			board[x+2][y+1] = 9;
		}
		else if(piece == 7) {
			board[x][y] = 9;
			board[x+1][y] = 9;
			board[x+1][y+1] = 9;
			board[x+2][y+1] = 9;
		}
		printMatrix();
//		fallPiece(piece);
//		printMatrix();
//		fallPiece(piece);
//		printMatrix();
//		moveRight();
//		printMatrix();
//		moveLeft();
//		printMatrix();
	}
	
	public void rotatePiece(int piece, int x, int y) {
		
	}
	
	public void fallPiece (int piece) {
		boolean flag = false;
		
		for(int i = 49; i >= 0; i--) {
			for(int j = 49; j >= 0; j--) {
				if(board[i][j] == 9) {
					if(board[i][j+1] != 0 || j == height - 1) {
						flag = true;
					}
					if(!flag) {
						board[i][j+1] = 9;
						board[i][j] = 0;
					}else {
						board[i][j] = piece;
					}
				}
			}
		}
	}
	
	public void moveRight() {
		boolean flag = false;
		
		for(int j = 49; j >= 0; j--) {
			for(int i = 49; i >= 0; i--) {
				if(board[i][j] == 9) {
					if(board[i+1][j] != 0 || i == width - 1) {
						flag = true;
					}
					if(!flag) {
						board[i+1][j] = 9;
						board[i][j] = 0;
					}else {
						break;
					}
				}
			}
		}
	}
	
	public void moveLeft() {
		boolean flag = false;
		
		for(int j = 0; j < height; j++) {
			for(int i = 0; i < 50; i++) {
				if(board[i][j] == 9) {
					if(board[i-1][j] != 0 || i == 0) {
						flag = true;
					}
					if(!flag) {
						board[i-1][j] = 9;
						board[i][j] = 0;
					}else {
						break;
					}
				}
			}
		}
	}
	
	private boolean canRotate() {
		return true;
	}
	
	
	public void printMatrix() {
		for(int i = 0; i < 50; i++) {
			for(int j = 0; j < 50; j++) {
				System.out.print(board[j][i]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
		
}