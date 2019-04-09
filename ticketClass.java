
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class ticketClass extends javax.swing.JFrame {

    
    public ticketClass() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public ticketClass(String name, String city, String seat, String destination, String no ){
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        randnumber.setText(no);
        nameDisplay.setText(name);
        cityDisplay.setText(city);
        seatDisplay.setText(seat);
        destinationDisplay.setText(destination);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        footerText1 = new javax.swing.JLabel();
        randnumber = new javax.swing.JLabel();
        footerText = new javax.swing.JLabel();
        destinationtext = new javax.swing.JLabel();
        departuretext = new javax.swing.JLabel();
        seattext = new javax.swing.JLabel();
        destinationDisplay = new javax.swing.JLabel();
        seatDisplay = new javax.swing.JLabel();
        cityDisplay = new javax.swing.JLabel();
        nameDisplay = new javax.swing.JLabel();
        passtext = new javax.swing.JLabel();
        titletext = new javax.swing.JLabel();
        mapbg = new javax.swing.JLabel();
        qrcode = new javax.swing.JLabel();
        gradientBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(373, 431));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(385, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        footerText1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        footerText1.setText("unique serial code:");
        jPanel1.add(footerText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, 20));

        randnumber.setFont(new java.awt.Font("Cash Currency", 0, 36)); // NOI18N
        randnumber.setText("i3xf5");
        jPanel1.add(randnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 150, 50));

        footerText.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        footerText.setText("Present this ticket to your airline for verification and payment. ");
        jPanel1.add(footerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 20));

        destinationtext.setFont(new java.awt.Font("WeblySleek UI Light", 0, 18)); // NOI18N
        destinationtext.setText("Destination Country:");
        jPanel1.add(destinationtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, -1));

        departuretext.setFont(new java.awt.Font("WeblySleek UI Light", 0, 18)); // NOI18N
        departuretext.setText("Departure City:");
        jPanel1.add(departuretext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, -1));

        seattext.setFont(new java.awt.Font("WeblySleek UI Light", 0, 18)); // NOI18N
        seattext.setText("Seat Class:");
        jPanel1.add(seattext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 90, -1));

        destinationDisplay.setFont(new java.awt.Font("WeblySleek UI Semibold", 0, 18)); // NOI18N
        destinationDisplay.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(destinationDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 310, -1));

        seatDisplay.setFont(new java.awt.Font("WeblySleek UI Semibold", 0, 18)); // NOI18N
        seatDisplay.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(seatDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 310, -1));

        cityDisplay.setFont(new java.awt.Font("WeblySleek UI Semibold", 0, 18)); // NOI18N
        cityDisplay.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(cityDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 310, -1));

        nameDisplay.setFont(new java.awt.Font("WeblySleek UI Semibold", 0, 18)); // NOI18N
        nameDisplay.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(nameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 310, -1));

        passtext.setFont(new java.awt.Font("WeblySleek UI Light", 0, 18)); // NOI18N
        passtext.setText("Passenger Name:");
        jPanel1.add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 140, -1));

        titletext.setFont(new java.awt.Font("Gloss And Bloom", 0, 24)); // NOI18N
        titletext.setForeground(new java.awt.Color(255, 255, 51));
        titletext.setText(" SEAstory Ticket");
        jPanel1.add(titletext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 60));

        mapbg.setIcon(new javax.swing.ImageIcon("D:\\WRLD-SEA-01-0001\\SEAAAA.png")); // NOI18N
        jPanel1.add(mapbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -70, 200, 200));

        qrcode.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Documents\\NetBeansProjects\\AccuFact\\src\\photos and other resource\\qr resized.png")); // NOI18N
        jPanel1.add(qrcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 100, 130));

        gradientBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\Gradient-Free-Blurry-Abstract-Background-Photos.png")); // NOI18N
        gradientBackground.setText("jLabel1");
        jPanel1.add(gradientBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-830, -10, 1370, 840));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        JOptionPane jop = new JOptionPane();
        JOptionPane.showConfirmDialog(jop,"Do you want to print another ticket?");
        
        
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityDisplay;
    private javax.swing.JLabel departuretext;
    private javax.swing.JLabel destinationDisplay;
    private javax.swing.JLabel destinationtext;
    private javax.swing.JLabel footerText;
    private javax.swing.JLabel footerText1;
    private javax.swing.JLabel gradientBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mapbg;
    private javax.swing.JLabel nameDisplay;
    private javax.swing.JLabel passtext;
    private javax.swing.JLabel qrcode;
    private javax.swing.JLabel randnumber;
    private javax.swing.JLabel seatDisplay;
    private javax.swing.JLabel seattext;
    private javax.swing.JLabel titletext;
    // End of variables declaration//GEN-END:variables
}
