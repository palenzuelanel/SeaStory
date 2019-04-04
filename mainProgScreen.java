

import java.awt.Dimension;
import java.awt.Toolkit;

public class mainProgScreen extends javax.swing.JFrame {
    
    /**
     * Creates new form mainProgFrame
     */
    
    
  
    
    
    
    
    public mainProgScreen() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mpPanel = new javax.swing.JPanel();
        indonesia = new javax.swing.JButton();
        vietnam = new javax.swing.JButton();
        thailand = new javax.swing.JButton();
        malaysia = new javax.swing.JButton();
        singapore = new javax.swing.JButton();
        philippines = new javax.swing.JButton();
        cambodia = new javax.swing.JButton();
        laos = new javax.swing.JButton();
        myanmar = new javax.swing.JButton();
        brunei = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();
        bg4 = new javax.swing.JLabel();
        bg5 = new javax.swing.JLabel();
        mpGradientBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indonesia.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        indonesia.setForeground(new java.awt.Color(255, 255, 255));
        indonesia.setText("INDONESIA");
        indonesia.setOpaque(false);
        indonesia.setContentAreaFilled(false);
        indonesia.setBorderPainted(false);
        indonesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indonesiaActionPerformed(evt);
            }
        });
        mpPanel.add(indonesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 90));

        vietnam.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        vietnam.setForeground(new java.awt.Color(255, 255, 255));
        vietnam.setText("VIETNAM");
        vietnam.setOpaque(false);
        vietnam.setContentAreaFilled(false);
        vietnam.setBorderPainted(false);
        vietnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vietnamActionPerformed(evt);
            }
        });
        mpPanel.add(vietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 90));

        thailand.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        thailand.setForeground(new java.awt.Color(255, 255, 255));
        thailand.setText("THAILAND");
        thailand.setOpaque(false);
        thailand.setContentAreaFilled(false);
        thailand.setBorderPainted(false);
        thailand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thailandActionPerformed(evt);
            }
        });
        mpPanel.add(thailand, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 120, 90));

        malaysia.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        malaysia.setForeground(new java.awt.Color(255, 255, 255));
        malaysia.setText("MALAYSIA");
        malaysia.setOpaque(false);
        malaysia.setContentAreaFilled(false);
        malaysia.setBorderPainted(false);
        malaysia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malaysiaActionPerformed(evt);
            }
        });
        mpPanel.add(malaysia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 130, 90));

        singapore.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        singapore.setForeground(new java.awt.Color(255, 255, 255));
        singapore.setText("SINGAPORE");
        singapore.setOpaque(false);
        singapore.setContentAreaFilled(false);
        singapore.setBorderPainted(false);
        singapore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singaporeActionPerformed(evt);
            }
        });
        mpPanel.add(singapore, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 90));

        philippines.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        philippines.setForeground(new java.awt.Color(255, 255, 255));
        philippines.setText("PHILIPPINES");
        philippines.setOpaque(false);
        philippines.setContentAreaFilled(false);
        philippines.setBorderPainted(false);
        philippines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                philippinesActionPerformed(evt);
            }
        });
        mpPanel.add(philippines, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 140, 90));

        cambodia.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        cambodia.setForeground(new java.awt.Color(255, 255, 255));
        cambodia.setText("CAMBODIA");
        cambodia.setOpaque(false);
        cambodia.setContentAreaFilled(false);
        cambodia.setBorderPainted(false);
        cambodia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambodiaActionPerformed(evt);
            }
        });
        mpPanel.add(cambodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 130, 90));

        laos.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        laos.setForeground(new java.awt.Color(255, 255, 255));
        laos.setText("LAOS");
        laos.setOpaque(false);
        laos.setContentAreaFilled(false);
        laos.setBorderPainted(false);
        laos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laosActionPerformed(evt);
            }
        });
        mpPanel.add(laos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 120, 90));

        myanmar.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        myanmar.setForeground(new java.awt.Color(255, 255, 255));
        myanmar.setText("MYANMAR");
        myanmar.setOpaque(false);
        myanmar.setContentAreaFilled(false);
        myanmar.setBorderPainted(false);
        myanmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myanmarActionPerformed(evt);
            }
        });
        mpPanel.add(myanmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 130, 90));

        brunei.setFont(new java.awt.Font("Gloss And Bloom", 1, 15)); // NOI18N
        brunei.setForeground(new java.awt.Color(255, 255, 255));
        brunei.setText("BRUNEI");
        brunei.setOpaque(false);
        brunei.setContentAreaFilled(false);
        brunei.setBorderPainted(false);
        brunei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bruneiActionPerformed(evt);
            }
        });
        mpPanel.add(brunei, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 120, 90));

        jLabel2.setFont(new java.awt.Font("WeblySleek UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose your desired nation.");
        mpPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 220, -1));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\resources\\SEAstory Photos\\borders-2099214_640.png")); // NOI18N
        bg.setText("jLabel1");
        mpPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, -110, 560, 410));

        bg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\resources\\SEAstory Photos\\borders-2099206_640.png")); // NOI18N
        bg2.setText("jLabel1");
        mpPanel.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 390, 640, 260));

        bg4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\resources\\SEAstory Photos\\borders-2099212_640.png")); // NOI18N
        mpPanel.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 640, 680));

        bg5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\resources\\SEAstory Photos\\borders-2099236_640.png")); // NOI18N
        bg5.setText("jLabel3");
        mpPanel.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -490, 510, 700));

        mpGradientBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\Gradient-Free-Blurry-Abstract-Background-Photos.png")); // NOI18N
        mpGradientBackground.setText("jLabel1");
        mpPanel.add(mpGradientBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 530));

        getContentPane().add(mpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laosActionPerformed
        this.hide();
        laosnav ln = new laosnav();
        ln.setVisible(true);
    }//GEN-LAST:event_laosActionPerformed

    private void myanmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myanmarActionPerformed
        this.hide();
        myannav mv = new myannav();
        mv.setVisible(true);
    }//GEN-LAST:event_myanmarActionPerformed

    private void malaysiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malaysiaActionPerformed
        this.hide();
        malaynav mn = new malaynav();
        mn.setVisible(true);
    }//GEN-LAST:event_malaysiaActionPerformed

    private void indonesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indonesiaActionPerformed
        this.hide();
        indonav id = new indonav();
        id.setVisible(true);
    }//GEN-LAST:event_indonesiaActionPerformed

    private void vietnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vietnamActionPerformed
        this.hide();
        vietnav vn = new vietnav();
        vn.setVisible(true);
    }//GEN-LAST:event_vietnamActionPerformed

    private void singaporeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singaporeActionPerformed
        this.hide();
        singanav sv = new singanav();
        sv.setVisible(true);
    }//GEN-LAST:event_singaporeActionPerformed

    private void philippinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_philippinesActionPerformed
        this.hide();
        philnav ph = new philnav();
        ph.setVisible(true);
    }//GEN-LAST:event_philippinesActionPerformed

    private void cambodiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambodiaActionPerformed
        this.hide();
        cambonav cv = new cambonav();
        cv.setVisible(true);
    }//GEN-LAST:event_cambodiaActionPerformed

    private void bruneiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bruneiActionPerformed
        this.hide();
        brunav br = new brunav();
        br.setVisible(true);
    }//GEN-LAST:event_bruneiActionPerformed

    private void thailandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thailandActionPerformed
        this.hide();
        thainav tn = new thainav();
        tn.setVisible(true);
    }//GEN-LAST:event_thailandActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel bg4;
    private javax.swing.JLabel bg5;
    private javax.swing.JButton brunei;
    private javax.swing.JButton cambodia;
    private javax.swing.JButton indonesia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton laos;
    private javax.swing.JButton malaysia;
    private javax.swing.JLabel mpGradientBackground;
    private javax.swing.JPanel mpPanel;
    private javax.swing.JButton myanmar;
    private javax.swing.JButton philippines;
    private javax.swing.JButton singapore;
    private javax.swing.JButton thailand;
    private javax.swing.JButton vietnam;
    // End of variables declaration//GEN-END:variables
}