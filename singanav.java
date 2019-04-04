
import java.awt.Dimension;
import java.awt.Toolkit;


public class singanav extends javax.swing.JFrame {

    /**
     * Creates new form mainProgFrame
     */
    public singanav() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lefteye = new javax.swing.JButton();
        righteye = new javax.swing.JButton();
        mouth = new javax.swing.JButton();
        rightear = new javax.swing.JButton();
        leftear = new javax.swing.JButton();
        lefthand = new javax.swing.JButton();
        righthand = new javax.swing.JButton();
        rightfoot = new javax.swing.JButton();
        leftfoot = new javax.swing.JButton();
        flavtext = new javax.swing.JLabel();
        flavtext2 = new javax.swing.JLabel();
        flavtext3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backhelpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        instruct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lefteye.setContentAreaFilled(false);
        lefteye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lefteyeActionPerformed(evt);
            }
        });
        jPanel1.add(lefteye, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 20, 10));

        righteye.setContentAreaFilled(false);
        righteye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                righteyeActionPerformed(evt);
            }
        });
        jPanel1.add(righteye, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 20, 10));

        mouth.setContentAreaFilled(false);
        mouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouthActionPerformed(evt);
            }
        });
        jPanel1.add(mouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 20, 20));

        rightear.setContentAreaFilled(false);
        rightear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightearActionPerformed(evt);
            }
        });
        jPanel1.add(rightear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 20, 20));

        leftear.setContentAreaFilled(false);
        leftear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftearActionPerformed(evt);
            }
        });
        jPanel1.add(leftear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 20, 20));

        lefthand.setContentAreaFilled(false);
        lefthand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lefthandActionPerformed(evt);
            }
        });
        jPanel1.add(lefthand, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 40, 40));

        righthand.setContentAreaFilled(false);
        righthand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                righthandActionPerformed(evt);
            }
        });
        jPanel1.add(righthand, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 30, 30));

        rightfoot.setContentAreaFilled(false);
        rightfoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightfootActionPerformed(evt);
            }
        });
        jPanel1.add(rightfoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 40, 40));

        leftfoot.setContentAreaFilled(false);
        leftfoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftfootActionPerformed(evt);
            }
        });
        jPanel1.add(leftfoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 40, 30));

        flavtext.setFont(new java.awt.Font("WeblySleek UI Light", 2, 18)); // NOI18N
        flavtext.setText("Click my eyes, ears");
        jPanel1.add(flavtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 150, 20));

        flavtext2.setFont(new java.awt.Font("WeblySleek UI Light", 2, 18)); // NOI18N
        flavtext2.setText("mouth, hands");
        jPanel1.add(flavtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 110, 20));

        flavtext3.setFont(new java.awt.Font("WeblySleek UI Light", 2, 18)); // NOI18N
        flavtext3.setText("and foot!");
        jPanel1.add(flavtext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gloss And Bloom", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Singapore");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Documents\\NetBeansProjects\\AccuFact\\src\\people\\singapore resized.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 400));

        backhelpButton.setBackground(new java.awt.Color(0, 153, 153));
        backhelpButton.setText("Back");
        backhelpButton.setBorder(null);
        backhelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhelpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backhelpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Documents\\NetBeansProjects\\AccuFact\\src\\photos and other resource\\singapore resized.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 520, 320));

        instruct.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\Gradient-Free-Blurry-Abstract-Background-Photos.png")); // NOI18N
        instruct.setText("jLabel1");
        jPanel1.add(instruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 690, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backhelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhelpButtonActionPerformed
        this.hide();
        mainProgScreen mps = new mainProgScreen();
        mps.setVisible(true);
    }//GEN-LAST:event_backhelpButtonActionPerformed

    private void lefteyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lefteyeActionPerformed
        this.setVisible(false);
        new vieteyenav().setVisible(true);
    }//GEN-LAST:event_lefteyeActionPerformed

    private void righteyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_righteyeActionPerformed
        this.setVisible(false);
        new vieteyenav().setVisible(true);
    }//GEN-LAST:event_righteyeActionPerformed

    private void mouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouthActionPerformed
        this.setVisible(true);
        new vietmouthnav().setVisible(true);
    }//GEN-LAST:event_mouthActionPerformed

    private void rightearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightearActionPerformed
        this.setVisible(false);
        new vietearnav().setVisible(true);
    }//GEN-LAST:event_rightearActionPerformed

    private void leftearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftearActionPerformed
        this.setVisible(false);
        new vietearnav().setVisible(true);
    }//GEN-LAST:event_leftearActionPerformed

    private void lefthandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lefthandActionPerformed
        this.setVisible(false);
        new viethandnav().setVisible(true);
    }//GEN-LAST:event_lefthandActionPerformed

    private void righthandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_righthandActionPerformed
        this.setVisible(false);
        new viethandnav().setVisible(true);
    }//GEN-LAST:event_righthandActionPerformed

    private void rightfootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightfootActionPerformed
        this.setVisible(false);
        new vietfootnav().setVisible(true);
    }//GEN-LAST:event_rightfootActionPerformed

    private void leftfootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftfootActionPerformed
        this.setVisible(true);
        new vietfootnav().setVisible(true);
    }//GEN-LAST:event_leftfootActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backhelpButton;
    private javax.swing.JLabel flavtext;
    private javax.swing.JLabel flavtext2;
    private javax.swing.JLabel flavtext3;
    private javax.swing.JLabel instruct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leftear;
    private javax.swing.JButton lefteye;
    private javax.swing.JButton leftfoot;
    private javax.swing.JButton lefthand;
    private javax.swing.JButton mouth;
    private javax.swing.JButton rightear;
    private javax.swing.JButton righteye;
    private javax.swing.JButton rightfoot;
    private javax.swing.JButton righthand;
    // End of variables declaration//GEN-END:variables
}