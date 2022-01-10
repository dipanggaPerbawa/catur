package chessgui.learn;



public class pieceLearn {
    private int x;
    private int y;
    final private boolean is_white;
    private String file_path;
    public boardLearn board;
    
    public pieceLearn(int x, int y, boolean is_white, String file_path, boardLearn board)
    {
        this.is_white = is_white;
        this.x = x;
        this.y = y;
        this.file_path = file_path;
        this.board = board;
    }
    
    public String getFilePath()
    {
        return file_path;
    }
    
    public void setFilePath(String path)
    {
        this.file_path = path;
    }
    
    public boolean isWhite()
    {
        return is_white;
    }
    
    public boolean isBlack()
    {
        return !is_white;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public boolean canMove(int destination_x, int destination_y)
    {
        return false;
    }
}
