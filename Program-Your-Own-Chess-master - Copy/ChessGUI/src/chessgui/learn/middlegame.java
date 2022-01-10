package chessgui.learn;


import javax.swing.JFrame;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import chessgui.mainmenu;

public class middlegame extends JFrame {
    private String middleGame = "<html>Selamat datang pada perkenalan middle game, ada 7 prinsip dalam bermain catur pada middle game</html>";
    private int counter = 0;
    JLabel middLabel = new JLabel();
    JButton nextB = new JButton();

    public middlegame(){
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

        middLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        middLabel.setText(middleGame);
        middLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(middLabel);
        middLabel.setBounds(0, 0, 570, 130);
        middLabel.getAccessibleContext().setAccessibleName("middLabel");

        pack();
    }


    private void nextActionPerformed(ActionEvent evt) {
           if (counter == 0){
               middleGame = "<html>Pusatkan bidak Anda, Ini adalah fakta yang terkenal bahwa di centerpieces mengontrol lebih banyak kotak daripada di tempat lain. Ini adalah aturan yang sangat penting untuk diingat ketika berhadapan dengan para kuda. Para kuda dapat mengontrol sebanyak 8 kotak saat terletak di pusat, sedangkan hanya 2 kotak jika terpojok. </html>";
               middLabel.setText(middleGame);
           }
           else if (counter == 1){
            middleGame = "<html>Tukarkan pion sayap Anda dengan pion tengah, pion tengah umumnya dianggap lebih berharga daripada pion sayap. Ini karena pion tengah memungkinkan pengendalian kotak pusat penting (d4-d5-e4-e5) yang dapat digunakan untuk mendukung bidak dan mengembangkan serangan yang kuat tidak hanya di tengah tetapi juga di sisi raja atau ratu. Pada saat yang sama, pion tengah menyediakan ruang dan meningkatkan mobilitas bidak. </html>";
            middLabel.setText(middleGame);
           }
           else if (counter == 2){
            middleGame = "<html>Hindari melemahkan pion, pion yang lemah adalah pion yang dapat memberi lawan Anda keunggulan instan dan memungkinkannya bermain dengan mudah dengan mengeksploitasinya. </html>";
            middLabel.setText(middleGame);
           }
           else if (counter == 3){
            middleGame = "<html>Hindari membuat kotak lemah di posisi Anda, Kotak lemah adalah kotak yang tidak dapat dilindungi oleh pion. Kotak lemah di posisi Anda adalah kandidat sempurna untuk menjadi pos terdepan yang kuat untuk bidak lawan Anda.  </html>";
            middLabel.setText(middleGame);
           }
           else if (counter == 4){
            middleGame = "<html>Selalu memblokade pion terisolasi lawan dengan kuda, Pion terisolasi adalah senjata yang ampuh dan dapat digunakan oleh lawan untuk melancarkan serangan yang kuat karena mendukung bidak dan memberikan ruang ekstra.  </html>";
            middLabel.setText(middleGame);
           }
           else if (counter == 5){
            middleGame = "<html>Menempati file terbuka dengan benteng Anda, bukan rahasia lagi bahwa benteng bekerja paling baik pada file yang terbuka. Jika ada file terbuka yang tersedia, langkah naluriah Anda harus menempati file dengan benteng Anda. Langkah selanjutnya adalah menggandakan benteng Anda pada file yang terbuka. Jika tidak ada file terbuka yang tersedia, Anda dapat menempati file semi terbuka yang dapat Anda buka paksa nanti. </html>";
            middLabel.setText(middleGame); 
           }
           else if (counter == 6){
            middleGame = "<html>Pertahankan pasangan menteri, Pasangan menteri sangat kuat di sebagian besar posisi. Hanya jika posisinya benar-benar terkunci, dua kuda mungkin lebih kuat dari pasangan menteri. Hindari menyerahkan salah satu menteri Anda di pembukaan atau awal permainan tengah  </html>";
            middLabel.setText(middleGame); 
            nextB.setText("Done!");
           }
           else if (counter == 7){
            this.setVisible(false);
            new mainmenu().setVisible(true);
           }



      counter ++;
}
}
