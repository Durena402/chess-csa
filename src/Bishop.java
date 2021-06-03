public class Bishop extends RegPiece implements ChessPiece{
    public Bishop (boolean available, int x, int y) {
        super(available , x, y);

    }

    public boolean canMove(int row, int col){

        if (super.canMove(x, y)){
            return x == y;
        }else{
            return false;
        }
    }

}
