public class RealisticBackDrop extends BackDrop {

    // todo - add constants

    public RealisticBackDrop() {
    } // uses BackDrop constructor

    public void dropPixel(Pixel p, int col) {
        if (col < 0 || col >= 7) return;
    }

    public void putPixel(Pixel p, int row, int col) {
    } // This method should not be available for RealisticBackDrop


    private void knock(int row, int col, double strength) {
        // todo
        /*
        this method determines where the pixel at board[row][col] should go, based on the strength of what hits it
         */
    }


}
