package chessgui.puzzle;

public class RookP extends pieceP {
    public RookP(int x, int y, boolean is_white, String file_path, puzzleBoard board) {
        super(x, y, is_white, file_path, board);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A rook can move as many squares as he wants either forward,
        // backward, or sideways without jumping any pieces. He cannot attack
        // his own pieces.
        
                // WRITE CODE HERE
        //kalo ada bidak warna sama pada destinasi, move tidak valid
         pieceP possiblePiece = board.getPiece(destination_x, destination_y);
        
         if (possiblePiece != null){
               if (possiblePiece.isWhite() && this.isWhite()){
                   return false;
               }
               if (possiblePiece.isBlack() && this.isBlack()){
                   return false;
               }
         }

         //kalo destinasi rook tidak sesuai dengan moveset rook
         if (this.getX() != destination_x && this.getY() != destination_y){
             return false;
         }

         //menentukan destinasi rook

         String direction = "";
         if (destination_y > this.getY()){
             direction = "selatan";
         }
         if (destination_y < this.getY()){
            direction = "utara";
         }

         if (destination_x > this.getX()){
             direction = "timur";
         }

         if (destination_x < this.getX()){
             direction = "barat";
         }
        
         // mengecek apakah ada bidak lain sepanjang destinasi
         if (direction.equals("selatan")){
             int spaces_to_move = Math.abs(destination_y - this.getY());
             for (int i = 1; i < spaces_to_move; i++)
             {
                pieceP p = board.getPiece(this.getX(), this.getY() + i);
                 if (p != null){
                     return false;
                 }
             }
         }
         if (direction.equals("utara")){
             int spaces_to_move = Math.abs(destination_y - this.getY());
             for (int i = 1; i < spaces_to_move; i++)
             {
                pieceP p = board.getPiece(this.getX(), this.getY() - i);
                 if (p != null){
                     return false;
                 }
             }
         }
         if (direction.equals("timur")){
            int spaces_to_move = Math.abs(destination_x - this.getX());
            for (int i = 1; i < spaces_to_move; i++)
            {
                pieceP p = board.getPiece(this.getX() + 1, this.getY());
                if (p != null){
                    return false;
                }
            }
        }
            if (direction.equals("barat")){
                int spaces_to_move = Math.abs(destination_x - this.getX());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    pieceP p = board.getPiece(this.getX() - 1, this.getY());
                    if (p != null){
                        return false;
                    }
                }
        }
        
        return true;
    }
}
