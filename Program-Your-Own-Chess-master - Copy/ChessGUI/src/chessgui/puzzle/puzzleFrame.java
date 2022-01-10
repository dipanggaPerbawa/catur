package chessgui.puzzle;


import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;


public class puzzleFrame extends JFrame {
    Component component;
    public puzzleFrame()
    {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Chess");
        this.setResizable(false);
        component = new puzzleBoard();
        this.add(component, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       

        
    }
}