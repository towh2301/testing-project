/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package generateunit;

import javax.swing.JFrame;

/**
 *
 * @author penta
 */
public class ImplementUnitForm extends javax.swing.JFrame {

    /**
     * Creates new form ImplementUnitForm
     */
    public ImplementUnitForm() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deriveta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        computeta = new javax.swing.JTextArea();
        numberOfUnittf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn5Unit = new javax.swing.JButton();
        btn7Unit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        totalElementtp = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        uniqueElementtp = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number Of Variables :");

        deriveta.setColumns(20);
        deriveta.setRows(5);
        jScrollPane1.setViewportView(deriveta);

        computeta.setColumns(20);
        computeta.setRows(5);
        jScrollPane2.setViewportView(computeta);

        numberOfUnittf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numberOfUnittf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberOfUnittf.setText("0");
        numberOfUnittf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfUnittfActionPerformed(evt);
            }
        });
        numberOfUnittf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberOfUnittfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOfUnittfKeyTyped(evt);
            }
        });

        jLabel2.setText("Total Element :");

        btn5Unit.setText("5 Unit");
        btn5Unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5UnitActionPerformed(evt);
            }
        });

        btn7Unit.setText("7 Unit");
        btn7Unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7UnitActionPerformed(evt);
            }
        });

        jLabel3.setText("Unique Element :");

        jScrollPane3.setViewportView(totalElementtp);

        jScrollPane4.setViewportView(uniqueElementtp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberOfUnittf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btn5Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn7Unit)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numberOfUnittf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5Unit)
                            .addComponent(btn7Unit))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numberOfUnittfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfUnittfActionPerformed
            
    }//GEN-LAST:event_numberOfUnittfActionPerformed
    
    private void btn5UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5UnitActionPerformed
        String[] unit5 = {"min","min+","nom","max-","max"};
        handleUnit(unit5);
    }//GEN-LAST:event_btn5UnitActionPerformed
    public void handleUnit(String[] unit) {
        this.deriveta.setText("");
        iu= new ImplementUnit(numberOfUnit, unit);
        for(String a : iu.getDeriveSet()) {
            this.deriveta.append(a);
            this.deriveta.append("\n");
        }
        this.computeta.setText(iu.computeSet);
        computeta.setLineWrap(true);
        computeta.setWrapStyleWord(true);
        this.totalElementtp.setText(String.valueOf(iu.totalElement));
        this.uniqueElementtp.setText(String.valueOf(iu.uniqueElement));
    }
    private void numberOfUnittfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOfUnittfKeyTyped
        try {
            char c= evt.getKeyChar();
        if(!Character.isDigit(c)) {
            evt.consume();
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_numberOfUnittfKeyTyped

    private void numberOfUnittfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOfUnittfKeyReleased
            this.numberOfUnit = Integer.parseInt(numberOfUnittf.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfUnittfKeyReleased

    private void btn7UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7UnitActionPerformed
        String[] unit7 = {"min-","min","min+","nom","max-","max","max+"};
        handleUnit(unit7);
    }//GEN-LAST:event_btn7UnitActionPerformed

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
            java.util.logging.Logger.getLogger(ImplementUnitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImplementUnitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImplementUnitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImplementUnitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImplementUnitForm().setVisible(true);
            }
        });
    }
    public int numberOfUnit;
    ImplementUnit iu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5Unit;
    private javax.swing.JButton btn7Unit;
    private javax.swing.JTextArea computeta;
    private javax.swing.JTextArea deriveta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField numberOfUnittf;
    private javax.swing.JTextPane totalElementtp;
    private javax.swing.JTextPane uniqueElementtp;
    // End of variables declaration//GEN-END:variables
}
