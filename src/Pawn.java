public class Pawn extends RegPiece implements ChessPiece {
    public Pawn(boolean available, int x, int y) {
        super(available, x, y);
    }
    public boolean canMove(int x, int y) {
        if ( super.canMove(x, y)){
            return x == getX() && ( y == getY() + 1);
        } else{
            return false;
        }
    }


    public boolean canKill(ChessPiece piece) {
        if (piece.getColumn() == this.getX() + 1 && ((piece.getRow() == this.getY() +1 ) || piece.getY() == this.getY() - 1 )){
            return true;
        } else{
            return false;
        }
    }
}
