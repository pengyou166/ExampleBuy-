package claire.peng;

public class GameofLife {
	public int[][] setState(int[][] board){
		int height = board.length;
        int width = height>0 ? board[0].length : 0;
        if (height==0 || width==0) {
            return board;
        }	

	for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                int life = getSingleState(board, height - 1, width - 1, i, j);
                if (board[i][j] == 1 && (life == 2 || life == 3)) {
                    board[i][j] = 3;
                } else if (board[i][j] == 0 && life == 3) {
                    board[i][j] = 2;
                }
            }
        }
		for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                board[i][j] >>= 1;
            }
        }
		return board;
}

int getSingleState(int[][] board, int height, int width, int i, int j) {
        int res = 0;
        for (int h = i-1 < 0?0:i-1; h <= (i+1 > height ? height:(i+1)); ++h) {
            for (int w = j-1 > 0?j-1:0; w <= (j+1< width?j+1:width); ++w) {
                res += board[h][w] & 1;
            }
        }
        return res;
    }
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
