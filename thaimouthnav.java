
import java.awt.Dimension;
import java.awt.Toolkit;


public class thaimouthnav extends javax.swing.JFrame {

    /**
     * Creates new form mainProgFrame
     */
    public thaimouthnav() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        backhelpButton = new javax.swing.JButton();
        instruct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backhelpButton.setBackground(new java.awt.Color(0, 153, 153));
        backhelpButton.setText("Back");
        backhelpButton.setBorder(null);
        backhelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhelpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backhelpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 20));

        instruct.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\Gradient-Free-Blurry-Abstract-Background-Photos.png")); // NOI18N
        instruct.setText("jLabel1");
        jPanel1.add(instruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 850));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backhelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhelpButtonActionPerformed
        this.setVisible(false);
        new thainav().setVisible(true);
    }//GEN-LAST:event_backhelpButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backhelpButton;
    private javax.swing.JLabel instruct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
