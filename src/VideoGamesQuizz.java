

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Kumar
 */
public class VideoGamesQuizz extends javax.swing.JFrame {
    
    class quiz{
        void disp()
        {

if(k==0)
{
    Ta1.setText("Who is the Most Famous Video Game Character of all Time? ");
    Rb1.setText("Donkey Kong ");
    Rb2.setText("Sonic ");
    Rb3.setText("Mario ");
    Rb4.setText("Link ");
} 
      
if(k==1)
{
    Ta1.setText("In video gaming, what is the name of the character"
            +'\n'+ " whom Mario repeatedly stops Bowser from kidnapping?");
    Rb1.setText("Chimmy");
    Rb2.setText("Roland Kane");
    Rb3.setText("Daisy");
    Rb4.setText("Princess Peach");
} 
  
if(k==2)
{
    Ta1.setText("How many dots are there on a Pac-Man board?");
    Rb1.setText("240");
    Rb2.setText("360");
    Rb3.setText("170");
    Rb4.setText("460");
} 
if(k==3)
{
    Ta1.setText("Nintendo is named after a Japanese word meaning:");
    Rb1.setText("Leave luck to heaven");
    Rb2.setText("Nintendo in Japanese");
    Rb3.setText("Mother of all video games");
    Rb4.setText("Better than Sony");
} 

if(k==4)
{
    Ta1.setText("Including those from the new \"Pokémon Ruby and Sapphire\", how many Pokémon are there in total?");
    Rb1.setText("651");
    Rb2.setText("767");
    Rb3.setText("5");
    Rb4.setText("886");
} 

if(k==5)
{
    Ta1.setText("Name the first arcade game manufactured by Atari. ");
    Rb1.setText("Asteroids");
    Rb2.setText("Yar's Revenge");
    Rb3.setText("Pong");
    Rb4.setText("Adventure");
} 

if(k==6)
{
    Ta1.setText("Before becoming a plumber in the 1983 game Mario Bros., Mario had a different profession. What was it?");
    Rb1.setText("Zookeeper");
    Rb2.setText("Carpenter");
    Rb3.setText("Pizza maker");
    Rb4.setText("Doorkeeper");
} 

if(k==7)
{
    Ta1.setText("Who says \"@!#?@!\" every time he is hit by something? ");
    Rb1.setText("Donkey Kong");
    Rb2.setText("Q*bert");
    Rb3.setText("Wimpy");
    Rb4.setText("Peter");
} 

if(k==8)
{
    Ta1.setText("What must be destroyed in Star Wars to get to the next level of difficulty? ");
    Rb1.setText("Fireballs");
    Rb2.setText("TIE fighters");
    Rb3.setText("Darth Vader ");
    Rb4.setText("the Death Star ");
} 
if(k==9)
{
    Ta1.setText("How does Rodrigo Borgia die?");
    Rb1.setText("Ezio stabs him");
    Rb2.setText("Cesare poisones him");
    Rb3.setText("Ezio throws him off the walls of Monteriggioni");
    Rb4.setText("Cesare shoots him");
} 
if(k==10)
{
    Ta1.setText("What is the assassins signature move?");
    Rb1.setText("The leap of Faith");
    Rb2.setText("The leap of execution");
    Rb3.setText("There assassination styles");
    Rb4.setText("The Clothes they walk around in");
} 
if(k==11)
{
    Ta1.setText("How can you capture a Pokémon?");
    Rb1.setText("calling it by name. ");
    Rb2.setText("singing to it");
    Rb3.setText("capturing it in a pokéball");
    Rb4.setText("By defeating it");
} 
if(k==12)
{
    Ta1.setText("What are the three (main) kinds of Pokémon?");
    Rb1.setText("Fire, water and electric.");
    Rb2.setText(" Earth, wind and fire. ");
    Rb3.setText("Body, soul and mind.");
    Rb4.setText("Fire, soul and fire.");
} 
if(k==13)
{
    Ta1.setText("The first two Call of Duty games featured single player campaigns that challenged the player to take on missions from the perspectives of three nations. What were they?");
    Rb1.setText("USA, Britain and Russia");
    Rb2.setText("Britain, France and Germany");
    Rb3.setText("USA, Canada and Australia");
    Rb4.setText("USA, France and Germany");
} 
      if(k==14)
{
    Ta1.setText("Call of Duty: Modern Warfare 2 set a record for sales. How many copies were sold in the first 24 hours?");
    Rb1.setText("2.3 million");
    Rb2.setText("4.7 million");
    Rb3.setText("5.8 million");
    Rb4.setText("3.3 million");
}   
        if(k==15){
            JOptionPane.showMessageDialog(rootPane, "Your score is "+score);
            
        try {
           
              Class.forName("java.sql.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ipproject","root","sarvani");
             Statement st = con.createStatement();
          
             
             
            String q = ("insert into VideoGQuix values("+"'"+"a"+"'"+","+score+");");
          
              st.executeUpdate(q);
               st.close();
            con.close();
    }
       catch(Exception e) {
            System.out.print(e.getMessage());
       }
        
        }
        
        
        }}
    /**
     * Creates new form VideoGamesQuizz
     */
    public VideoGamesQuizz() {
        initComponents();
    }
    
    /**
       * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ll = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        Rb1 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JPanel();
        Rb3 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JPanel();
        Rb2 = new javax.swing.JRadioButton();
        p4 = new javax.swing.JPanel();
        Rb4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        pan = new javax.swing.JScrollPane();
        Ta1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(850, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        ll.setBackground(new java.awt.Color(0, 0, 0));
        ll.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        ll.setForeground(new java.awt.Color(102, 255, 255));
        ll.setText("<html>  <center>RULES </center><br><br>     This quiz is like any other regular quizes with 15 questions and 4 options for one correct answer.  <br><br>Click on ony one option and we will show you if your answer is correct or not by displaying  a corresponding color (red for wrong and green for right).  <br><br>Once you answer a question click on the next  button to proceed.  <br><br>At the end of the quiz your score will be displayed. <br><br> <center>Click   to Start</center>   </html>");
        ll.setOpaque(true);
        ll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llMouseClicked(evt);
            }
        });
        getContentPane().add(ll);
        ll.setBounds(0, 0, 720, 520);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 60, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        p1.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(Rb1);
        Rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Rb1)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Rb1)
                .addGap(24, 24, 24))
        );

        p3.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(Rb3);
        Rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Rb3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Rb3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(Rb2);
        Rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Rb2)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Rb2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        p4.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(Rb4);
        Rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Rb4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Rb4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 180, 680, 200);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(343, 447, 55, 23);

        Ta1.setEditable(false);
        pan.setViewportView(Ta1);

        getContentPane().add(pan);
        pan.setBounds(139, 89, 417, 56);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Video Games Quiz");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(268, 19, 218, 44);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 430, 55, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int k;
int score;
int count=1;
int a,b;
    private void Rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb1ActionPerformed

        
        if(k==0)
        p1.setBackground(Color.red);  
if(k==1)
p1.setBackground(Color.red); 
if(k==2){
p1.setBackground(Color.green);score++;}
if(k==3){
p1.setBackground(Color.green);score++;}
if(k==4)
p1.setBackground(Color.red);
if(k==5)
p1.setBackground(Color.red);
if(k==6)
p1.setBackground(Color.red);
if(k==7)
p1.setBackground(Color.red);
if(k==8)
p1.setBackground(Color.red);
if(k==9)
p1.setBackground(Color.red);
if(k==10)
p1.setBackground(Color.red);
if(k==11)
p1.setBackground(Color.red);
if(k==12){
p1.setBackground(Color.green);score++;}
if(k==13){
p1.setBackground(Color.green);score++;}
if(k==14)
p1.setBackground(Color.red);
if(k==15)
p1.setBackground(Color.red);

// TODO add your handling code here:
    }//GEN-LAST:event_Rb1ActionPerformed

    private void Rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb2ActionPerformed
if(k==0)
        p2.setBackground(Color.red);     
if(k==1)
p2.setBackground(Color.red); 
if(k==2){
p2.setBackground(Color.green);score++;}
if(k==3)
p2.setBackground(Color.red);
if(k==4){
p2.setBackground(Color.green);score++;}
if(k==5)
p2.setBackground(Color.red);
if(k==6){
p2.setBackground(Color.green);score++;}
if(k==7){
p2.setBackground(Color.green);score++;}
if(k==8)
p2.setBackground(Color.red);
if(k==9)
p2.setBackground(Color.red);
if(k==10)
p2.setBackground(Color.red);
if(k==11)
p2.setBackground(Color.red);
if(k==12)
p2.setBackground(Color.red);
if(k==13)
p2.setBackground(Color.red);
if(k==14){
p2.setBackground(Color.green);score++;}
if(k==15)
p2.setBackground(Color.red);

// TODO add your handling code here:
    }//GEN-LAST:event_Rb2ActionPerformed

    private void Rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb3ActionPerformed
if(k==0){
        p3.setBackground(Color.green);     }
if(k==1)
p3.setBackground(Color.red); 
if(k==2)
p3.setBackground(Color.red);
if(k==3)
p3.setBackground(Color.red);
if(k==4)
p3.setBackground(Color.red);
if(k==5){
p3.setBackground(Color.green);score++;}
if(k==6)
p3.setBackground(Color.red);
if(k==7)
p3.setBackground(Color.red);
if(k==8)
p3.setBackground(Color.red);
if(k==9)
p3.setBackground(Color.red);
if(k==10)
p3.setBackground(Color.red);
if(k==11){
p3.setBackground(Color.green);score++;}
if(k==12)
p3.setBackground(Color.red);
if(k==13)
p3.setBackground(Color.red);
if(k==14)
p3.setBackground(Color.red);
if(k==15)
p3.setBackground(Color.red);

 
    }//GEN-LAST:event_Rb3ActionPerformed

    private void Rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb4ActionPerformed
if(k==0)
        p4.setBackground(Color.red);     
if(k==1){
p4.setBackground(Color.green);score++; }
if(k==2)
p4.setBackground(Color.red);
if(k==3)
p4.setBackground(Color.red);
if(k==4)
p4.setBackground(Color.red);
if(k==5)
p4.setBackground(Color.red);
if(k==6)
p4.setBackground(Color.red);
if(k==7)
p4.setBackground(Color.red);
if(k==8){
p4.setBackground(Color.green);score++;}
if(k==9){
p2.setBackground(Color.green);score++;}
if(k==10)
p4.setBackground(Color.red);
if(k==11)
p4.setBackground(Color.red);
if(k==12)
p4.setBackground(Color.red);
if(k==13)
p4.setBackground(Color.red);
if(k==14)
p4.setBackground(Color.red);
if(k==15)
p4.setBackground(Color.red);



// TODO add your handling code here:
    }//GEN-LAST:event_Rb4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        getContentPane().setBackground(Color.BLACK);
        quiz obj=new quiz();
   obj.disp();  
   jLabel2.setText("1");

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
buttonGroup1.clearSelection();
k++;System.out.println(k);
      int h=k+1;  
        quiz obj=new quiz();
   obj.disp(); 
   jLabel2.setText(""+h);
   
   p1.setBackground(Color.white);  
   p2.setBackground(Color.white);  
   p3.setBackground(Color.white);  
   p4.setBackground(Color.white);  
   
   Rb1.setSelected(false);
   Rb2.setSelected(false);
   Rb3.setSelected(false);
   Rb4.setSelected(false);
   // TODO add your handling code here:
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Choosequiz_1 Obj= new Choosequiz_1();
        Obj.setVisible(true);
        VideoGamesQuizz.this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void llMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseClicked
ll.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_llMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VideoGamesQuizz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoGamesQuizz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoGamesQuizz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoGamesQuizz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoGamesQuizz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rb1;
    private javax.swing.JRadioButton Rb2;
    private javax.swing.JRadioButton Rb3;
    private javax.swing.JRadioButton Rb4;
    private javax.swing.JTextPane Ta1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ll;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JScrollPane pan;
    // End of variables declaration//GEN-END:variables
}
