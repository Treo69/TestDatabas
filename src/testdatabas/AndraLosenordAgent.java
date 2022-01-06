
package testdatabas;

import oru.inf.InfDB;


public class AndraLosenordAgent extends javax.swing.JFrame {

    private InfDB idb;
    
    public AndraLosenordAgent(InfDB idb) {
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

        lblAndra = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblGamlaPw = new javax.swing.JLabel();
        lblNyttPw = new javax.swing.JLabel();
        passGamla = new javax.swing.JPasswordField();
        passNytt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAndra.setText("Ändra lösenord");

        lblNamn.setText("Namn:");

        lblGamlaPw.setText("Gamla lösenordet:");

        lblNyttPw.setText("Nytt lösenord:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblAndra))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNyttPw)
                        .addGap(41, 41, 41)
                        .addComponent(passNytt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGamlaPw)
                            .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passGamla)
                            .addComponent(txtNamn))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAndra)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGamlaPw)
                    .addComponent(passGamla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttPw)
                    .addComponent(passNytt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAndra;
    private javax.swing.JLabel lblGamlaPw;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNyttPw;
    private javax.swing.JPasswordField passGamla;
    private javax.swing.JPasswordField passNytt;
    private javax.swing.JTextField txtNamn;
    // End of variables declaration//GEN-END:variables
}
