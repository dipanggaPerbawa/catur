package chessgui.learn;

public class KnightL extends pieceLearn {

    public KnightL(int x, int y, boolean is_white, String file_path, boardLearn board) {
        super(x, y, is_white, file_path, board);
        //TODO Auto-generated constructor stub
    }
     
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: a knight can move in any L shape and can jump over anyone
        // in order to do so. He cannot attack his own pieces.
        // By an L shape, I mean it can move to a square that is 2 squares away
        // horizontally and 1 square away vertically, or 1 square away horizontally
        // and 2 squares away vertically.
        // some examples:
        //
        //  * *       * * *           *       *
        //  *             *       * * *       *
        //  *                                 * *
            
                // WRITE CODE HERE
                pieceLearn possiblePiece = board.getPiece(destination_x, destination_y);
                //kalo ada bidak warna sama pada destinasi, move tidak valid
                if (possiblePiece != null){
                      if (possiblePiece.isWhite() && this.isWhite()){
                          return false;
                      }
                      if (possiblePiece.isBlack() && this.isBlack()){
                          return false;
                      }
                }

                //menentukan moveset knight
                int x = Math.abs(this.getX() - destination_x);
                int y = Math.abs(this.getY() - destination_y);

                if (x * y != 2){
                    return false;
                }

        
        return true;
    }
}
