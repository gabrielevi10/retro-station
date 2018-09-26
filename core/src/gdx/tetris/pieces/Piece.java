package gdx.tetris.pieces;

public class Piece {
	//0 -> nothing
	//1 ~~ 7 -> static brick
	//9 -> actual brick (use the save number to know the color)
	
	public int key=0;
	public int[][] piece1 = new int[3][3]; //piece 1 for tests
	public int numberOfBlocks=0;
	public void setKey(int newKey) {
		this.key = newKey;
	}
	
	//all pieces have a type of rotate: 2X2 or 3X3 or 4X4
	
	//9 0 0 0	0 0 0 0
	//9 0 0 0	0 0 0 0
	//9 0 0 0	0 0 0 0
	//9 0 0 0	9 9 9 9	//4x4 rotate
	
	//0 0 0		0 9 0
	//0 9 9		0 9 9
	//9 9 0 	0 0 9	//3x3 rotate
	
	//9 9
	//9 9	//do not rotate
	
	//test if can rotate
	public boolean canRotate(int[][] board) {
		//find the number 9 (the number of movement piece)
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j] == 9) {
					//Create a sub-matrix with the numbers 9
					//identify if can rotate
						//look the type of rotate (3x3 4x4)
						//see if have 0 in the spaces to do the rotate
				}
			}
		}
		return false;
	}

	/*PIECE 1 (EXEMPLE)
	 * 0 1 0
	 * 1 1 1
	 * 
	 * In movement
	 * 0 9 0
	 * 9 9 9
	 */
	
	//piece1 create
	public void piece() {
		numberOfBlocks=0;
		piece1[0][0] = 0;
		piece1[0][1] = 0;
		piece1[0][2] = 0;
		piece1[1][0] = 0;
		piece1[1][1] = 9;numberOfBlocks++;
		piece1[1][2] = 0;
		piece1[2][0] = 9;numberOfBlocks++;
		piece1[2][1] = 9;numberOfBlocks++;
		piece1[2][2] = 9;numberOfBlocks++;
	}
	
	
}
