package chessgui.learn;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import chessgui.mainmenu;


public class opening extends JFrame {
    private String opening = "<html>Selamat datang pada perkenalan mengenai opening move catur. ada berbagai macam teknik dan teori dalam materi pembukaan diantaranya adalah teori Ruy Lopez, italian defense, sicilian, dll. secara umumnya opening move bertujuan sama yaitu mencoba meraih keuntungan sebesar mungkin dari awal permainan dan mengembangkan bidak-bidak yang kalian punya</html>";
    private int counter = 0;
    JLabel openingLabel = new JLabel();
    JButton nextB = new JButton();

    public opening (){
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

        openingLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        openingLabel.setText(opening);
        openingLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(openingLabel);
        openingLabel.setBounds(0, 0, 570, 130);
        openingLabel.getAccessibleContext().setAccessibleName("openingLabel");

        pack();
    }


    private void nextActionPerformed(ActionEvent evt) {
           if (counter == 0){
               opening = "<html>Empat opening terbaik untuk Putih adalah 1.e4, 1.d4, 1.c4 dan 1.Nf3 </html>";
               openingLabel.setText(opening);
           }
           else if (counter == 1){
            opening = "<html>Pembukaan catur terbaik setelah 1.e4 adalah Ruy Lopez, permainan Italia , Pertahanan Sisilia, Pertahanan Prancis, dan Caro Kann.  </html>";
            openingLabel.setText(opening);
           }
           else if (counter == 2){
            opening = "<html>Pembukaan catur terbaik setelah 1.d4 adalah Queen's Gambit, King's Indian Defense, Slav Defense, Grunfeld Defense, dan Nimzo Indian Defense.  </html>";
            openingLabel.setText(opening);
           }
           else if (counter == 3){
            opening = "<html>berjuang untuk pusat kanan dari awal sebagai Putih (jika tidak, yang terbaik yang bisa Anda dapatkan dari pembukaan Anda adalah posisi yang sama), jangan menyerah keuntungan penggerak pertama Anda – (bermain aktif), 1.e4 atau 1.d4 adalah gerakan pembuka catur yang bagus!   </html>";
            openingLabel.setText(opening);
            nextB.setText("Done");
           }
           else if (counter == 4){
            this.setVisible(false);
            new mainmenu().setVisible(true);
           }
           

      counter ++;
}
    
}
