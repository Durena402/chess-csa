public class Queen extends RegPiece implements ChessPiece {

    public Queen(boolean available, int x, int y) {
        super(available, x, y);
    }
    public boolean canMove(int x, int y) {
            if(super.isValid(ChessBoard Board, int fromX, int fromY, int toX, int toY) == false){
            return false;
        }
            if(toX - fromX == toY - fromY) {
                return true;
            }
            if(toX == fromX) {
                return true;
            }
            if(toY == fromY) {
                return true;
            }
        return false;
        }

    }
