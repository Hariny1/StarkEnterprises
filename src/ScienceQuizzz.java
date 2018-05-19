
import java.awt.Color;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R. Ganapathy
 */
public class ScienceQuizzz extends javax.swing.JFrame {

    class quiz{
        void disp()
        {
   


if(n==0)
{
    Ta1.setText("We have a pair of scales, with a block of lead on the left scale,"
            +'\n'+ " and a block of wood on the right scale. "
            + '\n'+"Both blocks have the same weight, so the scales are in balance. "
    +'\n'+"If the blocks are immersed in water what will happen to the scales???");
    Rb1.setText("Block of lead will go down");
    Rb2.setText("Block of wood will go down");
    Rb3.setText("The scales remain in balance");
    Rb4.setText("The scales will break");
La1.setText("Your score is "+ score);
} 
if(n==1)
{
    Ta1.setText("What does airbag, used for safety of car driver, contain? ");
    Rb1.setText("Sodium Carbonate");
    Rb2.setText("Sodium peroxide");
    Rb3.setText("Sodium nitrite");
    Rb4.setText("Sodium azide");     
    La1.setText("Your score is "+ score);
}
if(n==2)
{
    Ta1.setText("The weight of an object will be minimum when it is placed at....  ");
    Rb1.setText("North Pole");
    Rb2.setText("The center of the Earth");
    Rb3.setText("South Pole");
    Rb4.setText("Doesn't differ from place to place"); 
    La1.setText("Your score is "+ score);
}
if(n==3)
{
    Ta1.setText("Which of the following planets rotates clock wise ");
    Rb1.setText("Earth");
    Rb2.setText("Mars");
    Rb3.setText("Venus");
    Rb4.setText("Jupiter");       
    La1.setText("Your score is "+ score);
}
if(n==4)
{
    Ta1.setText("When 1 litre of water freezes, the volume of ice formed will be.... ");
    Rb1.setText("0.9 l");
    Rb2.setText("1.0 l");
    Rb3.setText("1.1 l");
    Rb4.setText("0.98 l");       
    La1.setText("Your score is "+ score);
}
if(n==5)
{
    Ta1.setText("Which one of the following types of waves are used in a night vision apparatus? ");
    Rb1.setText("Radio wave");
    Rb2.setText("Micro wave");
    Rb3.setText("Gamma rays");
    Rb4.setText("Infra-red waves");       
    La1.setText("Your score is "+ score);
}

if(n==6)
{
    Ta1.setText("The age of most ancient geological formations is estimated by... ");
    Rb1.setText("Uranium-lead method");
    Rb2.setText("C-14 method");
    Rb3.setText("Ra-Si method");
    Rb4.setText("Potassium-Argon method");       
La1.setText("Your score is "+ score);}
if(n==7)
{
    Ta1.setText("Chlorophyll is a naturally occurring chelate compound in which central metal? ");
    Rb1.setText("Copper");
    Rb2.setText("Iron");
    Rb3.setText("Magnesium");
    Rb4.setText("Calcium");       
La1.setText("Your score is "+ score);}
if(n==8)
{
    Ta1.setText("Which of the following can be used to control the speed of a D. C. motor?");
    Rb1.setText("Thermister");
    Rb2.setText("Thyrister");
    Rb3.setText("Thyratron");
    Rb4.setText("Transistor");       
La1.setText("Your score is "+ score);}
if(n==9)
{
    Ta1.setText("Which one of the following is a water soluble vitamin?");
    Rb1.setText("Vitamin-A");
    Rb2.setText("Vitamin-E");
    Rb3.setText("Vitamin-K");
    Rb4.setText("Vitamin-C");       
La1.setText("Your score is "+ score);}
if(n==10)
{
    Ta1.setText("Brass gets discoloured in air because of the presence of which of the following gases in air?");
    Rb1.setText("Oxygen");
    Rb2.setText("Hydrogen Sulphide");
    Rb3.setText("Hydrogen Peroxide");
    Rb4.setText("Nitrogen");       
La1.setText("Your score is "+ score);}
if(n==11)
{
    Ta1.setText("You use a hydrometer to check the condition of the electrolyte "
            +'\n'+ "in your car battery. It is actually measuring what property of the fluid? ");
    Rb1.setText("Density");
    Rb2.setText("Charge");
    Rb3.setText("Temperature");
    Rb4.setText("Surface Tension");       
La1.setText("Your score is "+ score);}
if(n==12){
    Ta1.append("A diver under water,looks obliquely at a fisherman standing on the bank"+'\n'+
            "of a lake.How does the fisherman look to the diver? ");
    Rb2.setText("Taller than he actually is.");
    Rb1.setText("Shorter than he actually is.");
    Rb3.setText("Looks of the same hieght");
    Rb4.setText("Fatter than he actually is.");  
La1.setText("Your score is "+ score);}
if(n==13){
    Ta1.append("The amount of light entering into the camera depends upon....");
    Rb1.setText("Focal length of the objective lens");
    Rb2.setText("Product of focal length and"+'\n'
            +"diameter of the objective lens");
    Rb3.setText("Distance of object from camera");
    Rb4.setText("Aperture setting of the camera");  
La1.setText("Your score is "+ score);}
if(n==14)
{
    Ta1.setText("Beta rays emitted by a radioactive material are...");
    Rb1.setText("Electromagnetic radiations");
    Rb2.setText("Neutral particles");
    Rb3.setText("The electrons orbiting around "
            + '\n'+"the nucleus");
    Rb4.setText("Charged particles emitted by the nucleus");       
La1.setText("Your score is "+ score);}
if(n==15)
{
    Ta1.setText("Which one of the following glands produces the Growth Hormone (Somatotropin)? ");
    Rb1.setText("Adrenal");
    Rb2.setText("Pancreas");
    Rb3.setText("Pituitary");
    Rb4.setText("Thyroid");       
La1.setText("Your score is "+ score);}
             }
              
}
       
    
    /**
     * Creates new form ScienceQuizzz
     */
    public ScienceQuizzz() {
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
        jPanel1 = new javax.swing.JPanel();
        La2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ta1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Rb1 = new javax.swing.JRadioButton();
        Rb2 = new javax.swing.JRadioButton();
        Rb3 = new javax.swing.JRadioButton();
        Rb4 = new javax.swing.JRadioButton();
        L1 = new javax.swing.JLabel();
        La1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(805, 360));
        setMinimumSize(new java.awt.Dimension(805, 330));
        setPreferredSize(new java.awt.Dimension(674, 547));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(938, 495));
        jPanel1.setLayout(null);

        La2.setBackground(new java.awt.Color(0, 0, 204));
        La2.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        La2.setForeground(new java.awt.Color(255, 255, 0));
        La2.setText("<html>                Welcome to ................ <br>             this is a science quiz.It will test your  <br>             scientific  knowledge,  scientific temper.  <br>            Take this quiz to find out about your  <br>            knowledge  on science!!!!!!!!!!!   </html>");
        La2.setMaximumSize(new java.awt.Dimension(21475, 11280));
        La2.setMinimumSize(new java.awt.Dimension(1182, 1280));
        La2.setOpaque(true);
        La2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                La2MouseClicked(evt);
            }
        });
        jPanel1.add(La2);
        La2.setBounds(0, -180, 850, 720);

        jScrollPane1.setBorder(null);

        Ta1.setColumns(20);
        Ta1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        Ta1.setLineWrap(true);
        Ta1.setRows(5);
        Ta1.setWrapStyleWord(true);
        Ta1.setOpaque(false);
        jScrollPane1.setViewportView(Ta1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 553, 191);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 390, 100, 50);

        buttonGroup1.add(Rb1);
        Rb1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        Rb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rb2);
        Rb2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        Rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rb3);
        Rb3.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        Rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rb4);
        Rb4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        Rb4.setOpaque(false);
        Rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb4ActionPerformed(evt);
            }
        });

        L1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rb2)
                    .addComponent(Rb4))
                .addGap(160, 160, 160))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rb2)
                    .addComponent(Rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rb4)
                    .addComponent(Rb3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(12, 253, 480, 200);
        jPanel1.add(La1);
        La1.setBounds(530, 230, 140, 60);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 320, 97, 58);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 738, 495);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int n,score;

    private void Rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb1ActionPerformed
if(n==0){
        L1.setBackground(Color.green);
score++;}
if(n==1)
        L1.setBackground(Color.red);
if(n==2)
        L1.setBackground(Color.red);
if(n==3)
        L1.setBackground(Color.red);
if(n==4)
        L1.setBackground(Color.red);
if(n==5)
        L1.setBackground(Color.red);
if(n==6)
        {
        L1.setBackground(Color.green);
score++;}
if(n==7)
        L1.setBackground(Color.red);
if(n==8)
        L1.setBackground(Color.red);
if(n==9)
        L1.setBackground(Color.red);
if(n==10)
        L1.setBackground(Color.red);
if(n==11)
        {
        L1.setBackground(Color.green);
score++;}
if(n==12)
        L1.setBackground(Color.red);
if(n==13)
        L1.setBackground(Color.red);
if(n==14)
        L1.setBackground(Color.red);
if(n==15)
       {
        L1.setBackground(Color.green);
score++;
      JOptionPane.showMessageDialog(this, "Your score is " +score);
       }// TODO add your handling code here:
    }//GEN-LAST:event_Rb1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   jButton1.setVisible(false);
   jButton2.setVisible(false);
  Ta1.setVisible(false);
  La1.setVisible(false);
  Rb1.setVisible(false);
  Rb2.setVisible(false);
  Rb3.setVisible(false);
  Rb4.setVisible(false);
       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void Rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb2ActionPerformed
 if(n==0)
       L1.setBackground(Color.red); 
 if(n==1)
        L1.setBackground(Color.red);
if(n==2)
       {
        L1.setBackground(Color.green);
score++;
      }
if(n==3)
        L1.setBackground(Color.red);
if(n==4)
        L1.setBackground(Color.red);
if(n==5)
        L1.setBackground(Color.red);
if(n==6)
        L1.setBackground(Color.red);
if(n==7)
        L1.setBackground(Color.red);
if(n==8)
       {
        L1.setBackground(Color.green);
score++;
       }
if(n==9)
        L1.setBackground(Color.red);
if(n==10)
        {
        L1.setBackground(Color.green);
score++;
       }
if(n==11)
        L1.setBackground(Color.red);
if(n==12)
        {
        L1.setBackground(Color.green);
score++;
       }
if(n==13)
        L1.setBackground(Color.red);
if(n==14)
        L1.setBackground(Color.red);
if(n==15)
        L1.setBackground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_Rb2ActionPerformed

    private void Rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb3ActionPerformed
 if(n==0)
        L1.setBackground(Color.red); 
 if(n==1)
        L1.setBackground(Color.red); 
 if(n==2)
        L1.setBackground(Color.red);
if(n==3)
        {
        L1.setBackground(Color.green);
score++;
       }
if(n==4)
        {
        L1.setBackground(Color.green);
score++;
        Ta1.append("score = "+score);}
if(n==5)
        L1.setBackground(Color.red);
if(n==6)
        L1.setBackground(Color.red);
if(n==7)
        {
        L1.setBackground(Color.green);
score++;
}
if(n==8)
        L1.setBackground(Color.red);
if(n==9)
        L1.setBackground(Color.red);
if(n==10)
        L1.setBackground(Color.red);
if(n==11)
        L1.setBackground(Color.red);
if(n==12)
        L1.setBackground(Color.red);
if(n==13)
        L1.setBackground(Color.red);
if(n==14)
        L1.setBackground(Color.red);
if(n==15)
        L1.setBackground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_Rb3ActionPerformed

    private void Rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb4ActionPerformed
 if(n==0)
        L1.setBackground(Color.red); 
 if(n==1)
       {
        L1.setBackground(Color.green);
score++;
      }
 if(n==2)
        L1.setBackground(Color.red);
if(n==3)
        L1.setBackground(Color.red);
if(n==4)
        L1.setBackground(Color.red);
if(n==5)
        {
        L1.setBackground(Color.green);
score++;
        }
if(n==6)
        L1.setBackground(Color.red);
if(n==7)
        L1.setBackground(Color.red);
if(n==8)
        L1.setBackground(Color.red);
if(n==9)
       {
        L1.setBackground(Color.green);
score++;
       }
if(n==10)
        L1.setBackground(Color.red);
if(n==11)
        L1.setBackground(Color.red);
if(n==12)
        L1.setBackground(Color.red);
if(n==13)
        {
        L1.setBackground(Color.green);
score++;
        }
if(n==14)
       {
        L1.setBackground(Color.green);
score++;
       }
if(n==15)
        L1.setBackground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_Rb4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   n++;
   quiz obj=new quiz();
   obj.disp(); 
     
L1.setBackground(Color.white);
buttonGroup1.clearSelection();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Choosequiz_1 Obj= new Choosequiz_1();
        Obj.setVisible(true);
        ScienceQuizzz.this.setVisible(false);    
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void La2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_La2MouseClicked
        La2.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        Ta1.setVisible(true);
        La1.setVisible(true);
  Rb1.setVisible(true);
  Rb2.setVisible(true);
  Rb3.setVisible(true);
  Rb4.setVisible(true);
        quiz obj=new quiz();
        obj.disp();// TODO add your handling code here:
    }//GEN-LAST:event_La2MouseClicked

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
            java.util.logging.Logger.getLogger(ScienceQuizzz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScienceQuizzz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScienceQuizzz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScienceQuizzz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScienceQuizzz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel La1;
    private javax.swing.JLabel La2;
    private javax.swing.JRadioButton Rb1;
    private javax.swing.JRadioButton Rb2;
    private javax.swing.JRadioButton Rb3;
    private javax.swing.JRadioButton Rb4;
    private javax.swing.JTextArea Ta1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
