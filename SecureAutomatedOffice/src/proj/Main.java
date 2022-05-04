
package proj;


public class Main extends javax.swing.JFrame {

    
    public Main() {
       
        initComponents();
    
    
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Controls = new javax.swing.JButton();
        SensorData = new javax.swing.JButton();
        AccessDb = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1063, 749));

        jPanel1.setLayout(null);

        Controls.setBackground(new java.awt.Color(0, 0, 0));
        Controls.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Controls.setForeground(new java.awt.Color(255, 255, 255));
        Controls.setText("Controls");
        Controls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlsActionPerformed(evt);
            }
        });
        jPanel1.add(Controls);
        Controls.setBounds(196, 131, 137, 34);

        SensorData.setBackground(new java.awt.Color(0, 0, 0));
        SensorData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SensorData.setForeground(new java.awt.Color(255, 255, 255));
        SensorData.setText("SensorData");
        SensorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SensorDataActionPerformed(evt);
            }
        });
        jPanel1.add(SensorData);
        SensorData.setBounds(603, 131, 137, 31);

        AccessDb.setBackground(new java.awt.Color(0, 0, 0));
        AccessDb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccessDb.setForeground(new java.awt.Color(255, 255, 255));
        AccessDb.setText("AccessDatabase");
        AccessDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessDbActionPerformed(evt);
            }
        });
        jPanel1.add(AccessDb);
        AccessDb.setBounds(373, 297, 179, 37);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(920, 550, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj/proj images/shutterstock_329520023_1080.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-470, -60, 1500, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ControlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlsActionPerformed
 Controls sd=new Controls();
sd.setVisible(true);
dispose();
        
    }//GEN-LAST:event_ControlsActionPerformed

    private void SensorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SensorDataActionPerformed
       SensorData c=new SensorData();
c.setVisible(true);
dispose();
        // TODO add your handling code here:
      
    }//GEN-LAST:event_SensorDataActionPerformed

    private void AccessDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessDbActionPerformed
AccessDB adb=new AccessDB();
adb.setVisible(true);
dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_AccessDbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
l.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccessDb;
    private javax.swing.JButton Controls;
    private javax.swing.JButton SensorData;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
