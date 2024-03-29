/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package commission;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author penta
 */
public class ComissionForm extends javax.swing.JFrame {

    private Material mt;
    private Material locks;
    private Material stocks;
    private Material barrels;

    /**
     * Creates new form ComissionForm
     */
    public ComissionForm() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn5Unit = new javax.swing.JButton();
        btn7Unit = new javax.swing.JButton();
        lockQuantitytf = new javax.swing.JTextField();
        lockCost = new javax.swing.JTextField();
        stockQuantitytf = new javax.swing.JTextField();
        stockCost = new javax.swing.JTextField();
        barrelQuantity = new javax.swing.JTextField();
        barrelCost = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quantity");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cost");

        jLabel3.setText("Lock :");

        jLabel4.setText("Stock :");

        jLabel5.setText("Barrel :");

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

        lockQuantitytf.setText("0");
        lockQuantitytf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lockQuantitytfKeyTyped(evt);
            }
        });

        lockCost.setText("0");
        lockCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockCostActionPerformed(evt);
            }
        });
        lockCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lockCostKeyTyped(evt);
            }
        });

        stockQuantitytf.setText("0");
        stockQuantitytf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockQuantitytfKeyTyped(evt);
            }
        });

        stockCost.setText("0");
        stockCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockCostActionPerformed(evt);
            }
        });
        stockCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockCostKeyTyped(evt);
            }
        });

        barrelQuantity.setText("0");
        barrelQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barrelQuantityKeyTyped(evt);
            }
        });

        barrelCost.setText("0");
        barrelCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barrelCostKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn5Unit)
                        .addGap(37, 37, 37)
                        .addComponent(btn7Unit)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(barrelCost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(barrelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(stockQuantitytf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addComponent(stockCost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lockQuantitytf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lockCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lockQuantitytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lockCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stockQuantitytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(barrelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barrelCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5Unit)
                    .addComponent(btn7Unit))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stockCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockCostActionPerformed

    private void lockQuantitytfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lockQuantitytfKeyTyped
        // TODO add your handling code here:
        checkValidNumber(evt);
    }//GEN-LAST:event_lockQuantitytfKeyTyped

    private void lockCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lockCostActionPerformed

    private void lockCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lockCostKeyTyped
        checkValidNumber(evt);    // TODO add your handling code here:
    }//GEN-LAST:event_lockCostKeyTyped

    private void stockQuantitytfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockQuantitytfKeyTyped
        // TODO add your handling code here:
        checkValidNumber(evt);
    }//GEN-LAST:event_stockQuantitytfKeyTyped

    private void stockCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockCostKeyTyped
        // TODO add your handling code here:
        checkValidNumber(evt);
    }//GEN-LAST:event_stockCostKeyTyped

    private void barrelQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barrelQuantityKeyTyped
        // TODO add your handling code here:
        checkValidNumber(evt);
    }//GEN-LAST:event_barrelQuantityKeyTyped
    public void checkValidNumber(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    public void createTable(int unit) {
        JFrame tableFrame = new JFrame();
        tableFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tableFrame.setSize(400, 300);
        tableFrame.setLocationRelativeTo(null);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Testcase");
        model.addColumn("Locks");
        model.addColumn("Stocks");
        model.addColumn("Barrels");
        model.addColumn("Expected");

        locks = getMaterial(unit, Integer.parseInt(lockQuantitytf.getText()), Integer.parseInt(lockCost.getText()));
        stocks = getMaterial(unit, Integer.parseInt(stockQuantitytf.getText()), Integer.parseInt(stockCost.getText()));
        barrels = getMaterial(unit, Integer.parseInt(barrelQuantity.getText()), Integer.parseInt(barrelCost.getText()));
        int nomLock = locks.getUnits()[unit / 2];
        int nomStock = stocks.getUnits()[unit / 2];
        int nomBarrel = barrels.getUnits()[unit / 2];
        int[][] allPart = new int[3][];
        allPart[0] = locks.getUnits();
        allPart[1] = stocks.getUnits();
        allPart[2] = barrels.getUnits();
        int[] nom = new int[3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            nom[0] = nomLock;
            nom[1] = nomStock;
            nom[2] = nomBarrel;
            for (int a : allPart[i]) {
                if (i != 0 && a == allPart[i][unit / 2]) {
                    continue;
                } else {
                    nom[i] = a;
                    model.addRow(new Object[]{count, nom[0], nom[1], nom[2], commission(nom[0], nom[1], nom[2])});
                    count++;
                }
            }
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Set layout manager to BorderLayout
        tableFrame.setLayout(new BorderLayout());

        // Add table to nestedFrame center
        tableFrame.add(scrollPane, BorderLayout.CENTER);
        tableFrame.setVisible(true);

    }

    public double commission(int lock, int stock, int barrel) {
        double commission = 0;
        double sales = lock * locks.cost + stock * stocks.cost
                + barrel * barrels.cost;
        if (lock == 0 || stock == 0 || barrel == 0 || lock > locks.max
                || (stock > stocks.max) || barrel > barrels.max) {
            return 0;
        }
        if (sales > 1800) {
            commission = 0.10 * 1000.0;
            commission = commission + 0.15 * 800;
            commission = commission + 0.20 * (sales - 1800.0);
        } else if (sales > 1000) {
            commission = 0.10 * 1000;
            commission = commission + 0.15 * (sales - 1000);
        } else {
            commission = 0.10 * sales;
        }

        return commission;
    }

    public Material getMaterial(int unit, int max, int cost) {
        mt = new Material(unit, max, cost);
        return mt;
    }
    private void barrelCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barrelCostKeyTyped
        // TODO add your handling code here:
        checkValidNumber(evt);
    }//GEN-LAST:event_barrelCostKeyTyped

    private void btn5UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5UnitActionPerformed
        if (isZero()) {
            JOptionPane.showMessageDialog(rootPane, "All inputs must better than 0!!");
        } else
            createTable(5);
    }//GEN-LAST:event_btn5UnitActionPerformed

    private void btn7UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7UnitActionPerformed
        if (isZero()) {
            JOptionPane.showMessageDialog(rootPane, "All inputs must better than 0!!");
        } else
            createTable(7);
    }//GEN-LAST:event_btn7UnitActionPerformed
    public boolean isZero() {
        if (Integer.parseInt(lockQuantitytf.getText()) == 0 || Integer.parseInt(stockCost.getText()) == 0 || Integer.parseInt(lockCost.getText()) == 0
                || Integer.parseInt(stockQuantitytf.getText()) == 0 || Integer.parseInt(barrelQuantity.getText()) == 0
                || Integer.parseInt(barrelCost.getText()) == 0) {
            return true;
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(ComissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComissionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barrelCost;
    private javax.swing.JTextField barrelQuantity;
    private javax.swing.JButton btn5Unit;
    private javax.swing.JButton btn7Unit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lockCost;
    private javax.swing.JTextField lockQuantitytf;
    private javax.swing.JTextField stockCost;
    private javax.swing.JTextField stockQuantitytf;
    // End of variables declaration//GEN-END:variables
}
