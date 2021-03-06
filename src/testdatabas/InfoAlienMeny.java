
package testdatabas;

import oru.inf.InfDB;


public class InfoAlienMeny extends javax.swing.JFrame {

    private InfDB idb;
    
    public InfoAlienMeny(InfDB idb) {
        initComponents();
        this.idb=idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInfo = new javax.swing.JLabel();
        btnEnskild = new javax.swing.JButton();
        btnPlats = new javax.swing.JButton();
        btnRas = new javax.swing.JButton();
        btnDatum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInfo.setText("Information om aliens");

        btnEnskild.setText("Enskild alien");
        btnEnskild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnskildActionPerformed(evt);
            }
        });

        btnPlats.setText("Aliens på viss plats");
        btnPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatsActionPerformed(evt);
            }
        });

        btnRas.setText("Aliens av viss ras");
        btnRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRasActionPerformed(evt);
            }
        });

        btnDatum.setText("Aliens registrerade mellan vissa datum");
        btnDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnskild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInfo)
                .addGap(18, 18, 18)
                .addComponent(btnEnskild)
                .addGap(18, 18, 18)
                .addComponent(btnPlats)
                .addGap(18, 18, 18)
                .addComponent(btnRas)
                .addGap(18, 18, 18)
                .addComponent(btnDatum)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnskildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnskildActionPerformed
        
        new InfoEnskildAlien(idb).setVisible(true);
        super.dispose();
        
    }//GEN-LAST:event_btnEnskildActionPerformed

    private void btnPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatsActionPerformed
        
        new InfoAlienPlats(idb).setVisible(true);
        super.dispose();
        
    }//GEN-LAST:event_btnPlatsActionPerformed

    private void btnRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRasActionPerformed
        
        new InfoAlienRas(idb).setVisible(true);
        super.dispose();
        
    }//GEN-LAST:event_btnRasActionPerformed

    private void btnDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatumActionPerformed
        
        new InfoAlienDatum(idb).setVisible(true);
        super.dispose();
        
    }//GEN-LAST:event_btnDatumActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatum;
    private javax.swing.JButton btnEnskild;
    private javax.swing.JButton btnPlats;
    private javax.swing.JButton btnRas;
    private javax.swing.JLabel lblInfo;
    // End of variables declaration//GEN-END:variables
}
