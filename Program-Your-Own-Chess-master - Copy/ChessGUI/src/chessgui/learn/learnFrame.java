package chessgui.learn;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;


public class learnFrame extends JFrame {
    Component component;
    public learnFrame()
    {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Chess");
        this.setResizable(false);
        component = new boardLearn();
        this.add(component, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       

        
    }
}