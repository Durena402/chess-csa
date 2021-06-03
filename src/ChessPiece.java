
public interface ChessPiece {

    int getRow();
    int getColumn();
    boolean canMove(int x, int y);
    boolean canKill(ChessPiece piece);


}
