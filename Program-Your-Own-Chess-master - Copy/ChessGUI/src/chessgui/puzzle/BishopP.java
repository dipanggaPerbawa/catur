package chessgui.puzzle;

public class BishopP extends pieceP {
    public BishopP(int x, int y, boolean is_white, String file_path, puzzleBoard board) {
        super(x, y, is_white, file_path, board);
        
    }
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: For attacking or just moving, a bishop is allowed to move 
        // as many squares diagonally as it wants without jumping over another 
        // piece. He cannot attack his own pieces.
        
                // WRITE CODE HERE
        //kalo ada bidak pada destinasi, move tidak valid
          //menentukan destinasi bishop
          String direction = "";
          if (this.getX() < destination_x && this.getY() > destination_y){
              direction = "atas kanan";
          }
 
          if (this.getX() > destination_x && this.getY() < destination_y){
              direction = "bawah kiri";
            
          }
          if (this.getX() < destination_x && this.getY() < destination_y){
              direction = "bawah kanan";
              
          }
          if (this.getX() > destination_x && this.getY() > destination_y){
              direction = "atas kiri";
           
          }
 
         // mengecek apakah ada bidak lain sepanjang destinasi
         if (direction.equals("bawah kiri")){
             int spaces_to_move = Math.abs(destination_y - this.getY());
             for (int i = 1; i < spaces_to_move; i++)
             {
                 pieceP p = board.getPiece(this.getX() - i, this.getY() + i);
                 if (p != null){
                     return false;
                 }
                 
             }
         }
         if (direction.equals("bawah kanan")){
             int spaces_to_move = Math.abs(destination_y - this.getY());
             for (int i = 1; i < spaces_to_move; i++)
             {
               pieceP p = board.getPiece(this.getX() + i, this.getY() + i);
                 if (p != null){
                     return false;
                 }
             }
         }
         if (direction.equals("atas kiri")){
             int spaces_to_move = Math.abs(destination_y - this.getY());
             for (int i = 1; i < spaces_to_move; i++)
             {
               pieceP p = board.getPiece(this.getX() - i, this.getY() - i);
                 if (p != null){
                     return false;
                 }
             }
         }
         if (direction.equals("atas kanan")){
             int spaces_to_move = Math.abs(destination_y - this.getY());
             for (int i = 1; i < spaces_to_move; i++)
             {
               pieceP p = board.getPiece(this.getX() + i, this.getY() - i);
                 if (p != null){
                     return false;
                 }
             }
         }
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

          //menentukan moveset bishop
          if (  Math.abs(this.getX() - destination_x) == Math.abs (this.getY() - destination_y)){
            return true;
            }
            else {
                return false;
            }

         
         
       
        
    }
}
