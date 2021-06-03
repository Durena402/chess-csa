public class Rook extends RegPiece implements ChessPiece {
    public Rook(boolean available, int x, int y) {
        super(available, x, y);
    }


    public boolean isValid(ChessPiece board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(ChessBoard board, fromX, fromY, toX, toY) == false)
            return false;
        if(toX == fromX) {
            return true;
        }
        if(toY == fromY){
            return true;
        }

        return false;
    }

    public boolean canMove(int x, int y) {
        if ( super.canMove(x, y)){
            return y == getY() && (x == getX() + 1);
        } else{
            return false;
        }
    }

    public boolean canKill(ChessPiece piece) {
        if (piece.getY() == this.getY() + 1 && ((piece.getX() == this.getX() +1 ) || piece.getY() == this.getY() - 1 )){
            return true;
        } else{
            return false;
        }
    }
}
