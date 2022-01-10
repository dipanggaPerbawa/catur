package chessgui.learn;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class introduction extends JFrame {
    private String perkenalan = "Selamat datang dalam perkenalan bidak catur, silahkan pilih bidak catur yang ada pada papan catur";
   
    JLabel introLabel = new JLabel();
    JButton Next = new JButton();
  

    public introduction() { 
        initComponents();
        setSize(580, 280);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

      

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next);
        Next.setBounds(410, 170, 93, 37);

        introLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        introLabel.setText(perkenalan);
        introLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(introLabel);
        introLabel.setBounds(0, 0, 570, 130);
        introLabel.getAccessibleContext().setAccessibleName("introLabel");

        pack();
    }

    public void getText (String bidak){
        String pawn = "<html> ini adalah bidak pion.  Bidak ini mempunyai beberapa sifat yang berlainan. Dia dapat bergerak hanya dengan satu petak ke depan. Pada langkah pertama, ia dapat melangkah dua petak. Dalam memukul buah catur lawan, ia dapat memukul pada arah diagonal kepetak yang berhubungan dengan petak tempat dia berada, dan arahnya ke depan. Kelebihan Bidak adalah apabila dia bisa mencapai baris ke 8, maka dia dapat dipromosikan menjadi Menteri, Gajah, Kuda, Benteng, atau Kuda, Dalam banyak kasus, biasanya promosi ini menjadi Menteri, karena buah catur inilah yang paling kuat. Silahkan pilih sebuah pion dan mainkan pion tersebut</html> ";
        String salah = "destinasi yang anda inginkan tidak sesaui dengan aturan bidak yang dipilih";
        String King = "<html>bidak ini bernama bidak raja.  Raja dapat bergerak kesegala arah, tapi tiap kali bergerak atau melangkah hanya satu petak, Silahkan pilih raja dan mainkan raja tersebut </html> ";
        String Queen = "<html>bidak ini bernama bidak ratu/menteri. Menteri dapat bergerak vertikal, horizontal, dan arah diagonal (miring), dan tiap kali bergerak dapat satu, dua, tiga, atau seluruh petak yang mungkin. Jalan Menteri dapat tertutup oleh buah catur kawannya, sedang buah catur lawan yang berada di lintasan Menteri dapat dimakan (dipukul)-nya.</html> ";
        String Knight = "<html>bidak ini bernama bidak kuda.  inilah satu-satunya buah catur yang dapat melangkah dengan melompati buah catur lain. Tiap langkahnya selalu punya jarak yang sama; Bergerak ke atas satu petak (atau ke bawah), diikuti dengan ke kanan atau ke kiri dua petak. Ia dapat memukul buah catur lawan hanya dengan memukul buah catur yang berada di akhir dari langkahnya. Langkah Kuda dapat juga berupa tiga petak ke atas atau ke bawah disusul dengan satu petak ke kanan atau ke kiri.</html>";
        String Rook = "<html>bidak ini bernama benteng.   dapat bergerak horizontal dan vertikal, tapi hanya satu arah tiap kali bergerak.</html>";
        String Bishop = "<html>bidak ini bernama gajah.  bergerak dalam arah diagonal, dan ke satu arah tiap kali bergerak.</html>";
        
        if (bidak.equals("king")){
            introLabel.setText(King);
            this.setVisible(true);
        }
        else if (bidak.equals("queen")){
            introLabel.setText(Queen);
            this.setVisible(true);
        }
        else if (bidak.equals("bishop")){
            introLabel.setText(Bishop);
            this.setVisible(true);
        }
        else if (bidak.equals("knight")){
            introLabel.setText(Knight);
            this.setVisible(true);
        }
        else if (bidak.equals("rook")){
            introLabel.setText(Rook);
            this.setVisible(true);
        }
        else if (bidak.equals("pawn")){
            introLabel.setText(pawn);
            this.setVisible(true);
        }
        
    }

   
    private void NextActionPerformed(ActionEvent evt) {
           
            this.setVisible(false);
          
    }
    
    
}
