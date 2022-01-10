package chessgui.pieces;

import chessgui.Board;

public class Queen extends Piece {

    public Queen(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A Queen can move as many squares as she wants forward, 
        // backward, sideways, or diagonally, without jumping over any pieces.
        // She cannot attack her own pieces.
        
                // WRITE CODE HERE

         //menentukan destinasi queen
         Piece possiblePiece = board.getPiece(destination_x, destination_y);
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
            if (direction.equals("bawah kiri")){
                int spaces_to_move = Math.abs(destination_y - this.getY());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    Piece p = board.getPiece(this.getX() - i, this.getY() + i);
                    if (p != null){
                        return false;
                    }
                    
                }
            }
            if (direction.equals("bawah kanan")){
                int spaces_to_move = Math.abs(destination_y - this.getY());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    Piece p = board.getPiece(this.getX() + i, this.getY() + i);
                    if (p != null){
                        return false;
                    }
                }
            }
            if (direction.equals("atas kiri")){
                int spaces_to_move = Math.abs(destination_y - this.getY());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    Piece p = board.getPiece(this.getX() - i, this.getY() - i);
                    if (p != null){
                        return false;
                    }
                }
            }
            if (direction.equals("atas kanan")){
                int spaces_to_move = Math.abs(destination_y - this.getY());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    Piece p = board.getPiece(this.getX() + i, this.getY() - i);
                    if (p != null){
                        return false;
                    }
                }
            }

            if (direction.equals("selatan")){
                int spaces_to_move = Math.abs(destination_y - this.getY());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    Piece p = board.getPiece(this.getX(), this.getY() + i);
                    if (p != null){
                        return false;
                    }
                }
            }
            if (direction.equals("utara")){
                int spaces_to_move = Math.abs(destination_y - this.getY());
                for (int i = 1; i < spaces_to_move; i++)
                {
                    Piece p = board.getPiece(this.getX(), this.getY() - i);
                    if (p != null){
                        return false;
                    }
                }
            }
            if (direction.equals("timur")){
               int spaces_to_move = Math.abs(destination_x - this.getX());
               for (int i = 1; i < spaces_to_move; i++)
               {
                   Piece p = board.getPiece(this.getX() + 1, this.getY());
                   if (p != null){
                       return false;
                   }
               }
           }
               if (direction.equals("barat")){
                   int spaces_to_move = Math.abs(destination_x - this.getX());
                   for (int i = 1; i < spaces_to_move; i++)
                   {
                       Piece p = board.getPiece(this.getX() - 1, this.getY());
                       if (p != null){
                           return false;
                       }
                   }
           }
         //kalo ada bidak sama warna pada destinasi, move tidak valid
        
        
         if (possiblePiece != null){
               if (possiblePiece.isWhite() && this.isWhite()){
                   return false;
               }
               if (possiblePiece.isBlack() && this.isBlack()){
                   return false;
               }
         }

         if (  Math.abs(this.getX() - destination_x) == Math.abs (this.getY() - destination_y)){
            return false;
            }
         if (this.getX() != destination_x && this.getY() != destination_y){
            return false;
            }
        
        return true;
    }
}
