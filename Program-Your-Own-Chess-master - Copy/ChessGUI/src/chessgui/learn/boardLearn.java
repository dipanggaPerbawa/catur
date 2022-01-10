package chessgui.learn;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;



public class boardLearn extends JComponent{
    private static Image NULL_IMAGE = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

    private final int Square_Width = 65;
    public ArrayList<pieceLearn> White_Pieces;
   
    public pieceLearn Active_Piece;

    public ArrayList<DrawingShape> Static_Shapes;
    public ArrayList<DrawingShape> Piece_Graphics;
    private final int rows = 4;
    private final int cols = 8;
    private Integer[][] BoardGrid;
    private String board_file_path = "C:/Users/ASUS/Desktop/Program-Your-Own-Chess-master/ChessGUI/images/boardLearn.png";
    private String active_square_file_path = "C:/Users/ASUS/Desktop/Program-Your-Own-Chess-master/ChessGUI/images/active_square.png";
    
    public void initGrid()
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                BoardGrid[i][j] = 0;
            }
        }

     
        White_Pieces.add(new KingL(3,0,true,"King.png",this));
        White_Pieces.add(new QueenL(4,0,true,"Queen.png",this));
        White_Pieces.add(new BishopL(2,0,true,"Bishop.png",this));
        White_Pieces.add(new BishopL(5,0,true,"Bishop.png",this));
        White_Pieces.add(new KnightL(1,0,true,"Knight.png",this));
        White_Pieces.add(new KnightL(6,0,true,"Knight.png",this));
        White_Pieces.add(new RookL(0,0,true,"Rook.png",this));
        White_Pieces.add(new RookL(7,0,true,"Rook.png",this));
        White_Pieces.add(new PawnL(0,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(1,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(2,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(3,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(4,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(5,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(6,1,true,"Pawn.png",this));
        White_Pieces.add(new PawnL(7,1,true,"Pawn.png",this));

    }

    public boardLearn() {

        BoardGrid = new Integer[rows][cols];
        Static_Shapes = new ArrayList();
        Piece_Graphics = new ArrayList();
        White_Pieces = new ArrayList();
        //Black_Pieces = new ArrayList();

        initGrid();

        this.setBackground(new Color(37,13,84));
        this.setPreferredSize(new Dimension(520, 263));
        this.setMinimumSize(new Dimension(100, 100));
        this.setMaximumSize(new Dimension(1000, 1000));

        this.addMouseListener(mouseAdapter);
        this.addComponentListener(componentAdapter);
        this.addKeyListener(keyAdapter);


        
        this.setVisible(true);
        this.requestFocus();
        drawBoard();
    }

    private void drawBoard()
    {
        Piece_Graphics.clear();
        Static_Shapes.clear();
        
        Image board = loadImage(board_file_path);
        Static_Shapes.add(new DrawingImage(board, new Rectangle2D.Double(0, 0, board.getWidth(null), board.getHeight(null))));
        if (Active_Piece != null)
        {
            Image active_square = loadImage(active_square_file_path);
            Static_Shapes.add(new DrawingImage(active_square, new Rectangle2D.Double(Square_Width*Active_Piece.getX(),Square_Width*Active_Piece.getY(), active_square.getWidth(null), active_square.getHeight(null))));
        }
        for (int i = 0; i < White_Pieces.size(); i++)
        {
            int COL = White_Pieces.get(i).getX();
            int ROW = White_Pieces.get(i).getY();
            Image piece = loadImage("C:/Users/ASUS/Desktop/Program-Your-Own-Chess-master/ChessGUI/images/white_pieces/"+ White_Pieces.get(i).getFilePath());  
            Piece_Graphics.add(new DrawingImage(piece, new Rectangle2D.Double(Square_Width*COL,Square_Width*ROW, piece.getWidth(null), piece.getHeight(null))));
        }
        this.repaint();
    }

    public pieceLearn getPiece(int x, int y) {
        for (pieceLearn p : White_Pieces)
        {
            if (p.getX() == x && p.getY() == y)
            {
                return p;
            }
        }
        return null;
    }
        
    private MouseAdapter mouseAdapter = new MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {

                
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int d_X = e.getX();
            int d_Y = e.getY();  
            int Clicked_Row = d_Y / Square_Width;
            int Clicked_Column = d_X / Square_Width;
            boolean is_whites_turn = true;
            String bidak = "";
           
            pieceLearn clicked_piece = getPiece(Clicked_Column, Clicked_Row);
            
            if (Active_Piece == null && clicked_piece != null && 
                    ((is_whites_turn && clicked_piece.isWhite()) || (!is_whites_turn && clicked_piece.isBlack())))
            {
                Active_Piece = clicked_piece;
            }
            else if (Active_Piece != null && Active_Piece.getX() == Clicked_Column && Active_Piece.getY() == Clicked_Row)
            {
                Active_Piece = null;
            }
            else if (Active_Piece != null && Active_Piece.canMove(Clicked_Column, Clicked_Row) 
                    && ((is_whites_turn && Active_Piece.isWhite()) || (!is_whites_turn && Active_Piece.isBlack())))
            {
                
                Active_Piece.setX(Clicked_Column);
                Active_Piece.setY(Clicked_Row);
             
               
               
                Active_Piece = null;
                
            }
            if (Active_Piece.getClass().equals(PawnL.class))
            {
                 bidak = "pawn";
                new introduction().getText(bidak);
                Active_Piece = null;
            }

            if (Active_Piece.getClass().equals(KingL.class)){
               bidak = "king";
               new introduction().getText(bidak);
               Active_Piece = null;
            }

            if (Active_Piece.getClass().equals(QueenL.class)){
                bidak = "queen";
                new introduction().getText(bidak);
                Active_Piece = null;
             }
            
             if (Active_Piece.getClass().equals(BishopL.class)){
                bidak = "bishop";
                new introduction().getText(bidak);
                Active_Piece = null;

             }

             if (Active_Piece.getClass().equals(RookL.class)){
                bidak = "rook";
                new introduction().getText(bidak);
                Active_Piece = null;
             }

             if (Active_Piece.getClass().equals(KnightL.class)){
                bidak = "knight";
                new introduction().getText(bidak);
                Active_Piece = null;
             }

            drawBoard();
        }

        @Override
        public void mouseDragged(MouseEvent e) {		
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) 
        {
        }	

        
    };

    private void adjustShapePositions(double dx, double dy) {

        Static_Shapes.get(0).adjustPosition(dx, dy);
        this.repaint();

    } 
        
        
      
    private Image loadImage(String imageFile) {
        try {
                return ImageIO.read(new File(imageFile));
        }
        catch (IOException e) {
                return NULL_IMAGE;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        drawBackground(g2);
        drawShapes(g2);
    }

    private void drawBackground(Graphics2D g2) {
        g2.setColor(getBackground());
        g2.fillRect(0,  0, getWidth(), getHeight());
    }
       

    private void drawShapes(Graphics2D g2) {
        for (DrawingShape shape : Static_Shapes) {
            shape.draw(g2);
        }	
        for (DrawingShape shape : Piece_Graphics) {
            shape.draw(g2);
        }
    }

    private ComponentAdapter componentAdapter = new ComponentAdapter() {

        @Override
        public void componentHidden(ComponentEvent e) {

        }

        @Override
        public void componentMoved(ComponentEvent e) {

        }

        @Override
        public void componentResized(ComponentEvent e) {

        }

        @Override
        public void componentShown(ComponentEvent e) {

        }	
    };

    private KeyAdapter keyAdapter = new KeyAdapter() {

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }	
    };

}



interface DrawingShape {
    boolean contains(Graphics2D g2, double x, double y);
    void adjustPosition(double dx, double dy);
    void draw(Graphics2D g2);
}


class DrawingImage implements DrawingShape {

    public Image image;
    public Rectangle2D rect;

    public DrawingImage(Image image, Rectangle2D rect) {
            this.image = image;
            this.rect = rect;
    }

    @Override
    public boolean contains(Graphics2D g2, double x, double y) {
            return rect.contains(x, y);
    }

    @Override
    public void adjustPosition(double dx, double dy) {
            rect.setRect(rect.getX() + dx, rect.getY() + dy, rect.getWidth(), rect.getHeight());	
    }

    @Override
    public void draw(Graphics2D g2) {
            Rectangle2D bounds = rect.getBounds2D();
            g2.drawImage(image, (int)bounds.getMinX(), (int)bounds.getMinY(), (int)bounds.getMaxX(), (int)bounds.getMaxY(),
                                            0, 0, image.getWidth(null), image.getHeight(null), null);
    }	


}