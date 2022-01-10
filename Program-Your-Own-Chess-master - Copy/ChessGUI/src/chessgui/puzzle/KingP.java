package chessgui.puzzle;

public class KingP extends pieceP {
    private boolean has_moved;
    public KingP(int x, int y, boolean is_white, String file_path, puzzleBoard board) {
        super(x, y, is_white, file_path, board);
        //TODO Auto-generated constructor stub
    }

    public void setHasMoved(boolean has_moved)
    {
        this.has_moved = has_moved;
    }
    
    public boolean getHasMoved()
    {
        return has_moved;
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: a king can move one square up, right, left, or down, or
        // diagonally, but he can never put himself in danger of an oposing 
        // piece attacking him on the next turn. He cannot attack his own pieces.
        
                // WRITE CODE HERE
        
                pieceP possiblePiece = board.getPiece(destination_x, destination_y);
        
                //kalo ada bidak warna sama pada destinasi, move tidak valid
               if (possiblePiece != null){
                     if (possiblePiece.isWhite() && this.isWhite()){
                         return false;
                     }
                     if (possiblePiece.isBlack() && this.isBlack()){
                         return false;
                     }
               }

               
               if (Math.abs(this.getX() - destination_x) != 1 && Math.abs(this.getY() - destination_y) != 1){
                   return false;
               }

               

        
        return true;
    }
}
