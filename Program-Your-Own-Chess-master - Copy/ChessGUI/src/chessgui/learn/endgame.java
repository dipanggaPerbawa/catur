package chessgui.learn;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import chessgui.mainmenu;
public class endgame extends JFrame {
    private String endgame = "<html>Selamat datang pada perkenalan mengenai endgame move catur. berikut adalah beberapa konsep endgame pada catur</html>";
    private int counter = 0;
    JLabel endgameLabel = new JLabel();
    JButton nextB = new JButton();

    public endgame (){
        initComponents();
        setSize(580, 280);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

      

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nextB.setText("Next");
        nextB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(nextB);
        nextB.setBounds(410, 170, 93, 37);

        endgameLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        endgameLabel.setText(endgame);
        endgameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(endgameLabel);
        endgameLabel.setBounds(0, 0, 570, 130);
        endgameLabel.getAccessibleContext().setAccessibleName("endgameLabel");

        pack();
    }


    private void nextActionPerformed(ActionEvent evt) {
           if (counter == 0){
               endgame = "<html>Aktivitas Raja.Ini hal yang kritis dalam semua jenis permainan akhir, tetapi tidak terlalu berlaku ketika tidak ada perwira yang tersisa.</html>";
               endgameLabel.setText(endgame);
           }
           else if (counter == 1){
            endgame = "<html>Oposisi Raja baik langsung maupun jauh, adalah ide kunci dalam permainan akhir. Triangulasi, Kehilangan Tempo dan Memaksa Gerakan ke Lawan, adalah teknik standar. </html>";
            endgameLabel.setText(endgame);
           }
           else if (counter == 2){
            endgame = "<html>Pion Passpawn sering menentukan, begitu juga halnya Pion Passpawn terproteksi. </html>";
            endgameLabel.setText(endgame);
           }
           else if (counter == 3){
            endgame = "<html>Tempo & Variasi, permainan akhir Raja dan Pion mungkin adalah yang paling konkret dari semuanya, dalam hal ini tempo biasanya penting, dan variasi adalah segalanya. Dalam permainan akhir Raja dan Pion, adalah penting untuk dapat menghitung semuanya secara rinci.</html>";
            endgameLabel.setText(endgame);
            nextB.setText("Done");
           }
           else if (counter == 4){
            this.setVisible(false);
            new mainmenu().setVisible(true);
           }
           

      counter ++;
}
}
