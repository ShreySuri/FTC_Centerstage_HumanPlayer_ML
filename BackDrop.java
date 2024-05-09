public class BackDrop {

    Pixel[][] board;
    /*
    In 'board', lower indexed rows correspond to closer to the bottom
    The bottom-most row (index 0) has 6 columns for pixels
     */

    final static int BOARD_WIDTH = 6; // at bottom-most row
    final static int BOARD_HEIGHT = 15; // fixme

    public BackDrop() {
        board = new Pixel[BOARD_HEIGHT][BOARD_WIDTH + 1];
        for (int row = BOARD_HEIGHT - 1; row >= 0; row--) {
            for (int col = 0; col < (BOARD_WIDTH + row % 2); col++) {
                board[row][col] = Pixel.NONE;
            }
        }
    }

    public void putPixel(Pixel p, int row, int col) // row and col are 0-indexed
    {
        if (row < 0 || row >= BOARD_HEIGHT) return;
        if (col < 0 || col >= (BOARD_WIDTH + row % 2)) return;
        if (board[row][col] == Pixel.NONE) {
            board[row][col] = p;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = BOARD_HEIGHT - 1; row >= 0; row--) {
            sb.append("\t");
            if (row % 2 == 0) {
                sb.append("  ");
            }
            for (int col = 0; col < (BOARD_WIDTH + row % 2); col++) {
                sb.append(board[row][col]);
                sb.append("   ");
            }
            if (row % 2 == 0) {
                sb.append("  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
