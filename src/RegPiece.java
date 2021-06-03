public class RegPiece {
    public boolean available;
    public int x;
    public int y;

    public RegPiece(boolean available, int x, int y) {
        super();
        this.available = available;
        this.x = x;
        this.y = y;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
// ChessBoard needs to be 2D Array established when board is made
    public boolean isValid(ChessBoard Board, int fromX, int fromY, int toX, int toY) {
        if (toX == fromX && toY == fromY)
            return false;
        if (toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY < 0 || fromY > 7) {
            return false;
        }
        return true;
    }
    public boolean canMove(int x, int y){
        return x > 7 || y > 7;

    }
    public boolean canKill(ChessPiece piece){
        return canMove(x, y);
    }
}


