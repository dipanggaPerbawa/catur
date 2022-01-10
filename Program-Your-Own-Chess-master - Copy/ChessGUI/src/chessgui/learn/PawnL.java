package chessgui.learn;

public class PawnL extends pieceLearn {
    
    private boolean has_moved;
    public PawnL(int x, int y, boolean is_white, String file_path, boardLearn board) {
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
        // Remember: A pawn may only move towards the oponent's side of the board.
        // If the pawn has not moved yet in the game, for its first move it can 
        // move two spaces forward. Otherwise, it may only move one space. 
        // When not attacking it may only move straight ahead.
        // When attacking it may only move space diagonally forward

                // WRITE CODE HERE
           //kalo ada bidak warna sama pada destinasi, move tidak valid
           pieceLearn possiblePiece = board.getPiece(destination_x, destination_y);
           if (possiblePiece != null){
            if (possiblePiece.isWhite() && this.isWhite()){
                return false;
            }
            if (possiblePiece.isBlack() && this.isBlack()){
                return false;
            }
            if (possiblePiece.getX() == this.getX()){
                return false;
            }
            if (Math.abs(possiblePiece.getX() - this.getX()) == 1 ){
                return true;
            }
            }
        

            
            if (this.isWhite()){
                if (destination_y < this.getY()){
                    return false;
                }
                
            }

            if (this.isBlack()){
                if (destination_y > this.getY()){
                    return false;
                }
            }
            if (this.getHasMoved() == false){
                if (Math.abs(destination_y - this.getY()) > 2){
                    return false;
                }
            }

            else if (this.getHasMoved() == true)
            {
                if (Math.abs(destination_y - this.getY()) > 1){
                    return false;
                }
            }

            if (destination_x != this.getX()){
                return false;
            }

            
           

                
        return true;
    }
}
