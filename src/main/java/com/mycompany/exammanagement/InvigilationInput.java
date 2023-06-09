/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.exammanagement;

import java.awt.Color;

/**
 *
 * @author siddh
 */
public class InvigilationInput extends javax.swing.JFrame {

    /**
     * Creates new form InvigilationInput
     */
    public InvigilationInput() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btncreateTimeTable = new javax.swing.JButton();
        btnGenerateInvigilation = new javax.swing.JButton();
        btnGenerateSeating = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(503, 473));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Upload The Following Files");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("List of Available Invigilators");

        jButton4.setText("Next");

        btncreateTimeTable.setBackground(new java.awt.Color(0, 128, 128));
        btncreateTimeTable.setForeground(new java.awt.Color(255, 255, 255));
        btncreateTimeTable.setText("Create Time table");
        btncreateTimeTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 3, true));
        btncreateTimeTable.setOpaque(true);
        btncreateTimeTable.setRolloverEnabled(false);
        btncreateTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncreateTimeTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncreateTimeTableMouseExited(evt);
            }
        });
        btncreateTimeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateTimeTableActionPerformed(evt);
            }
        });

        btnGenerateInvigilation.setBackground(new java.awt.Color(0, 128, 128));
        btnGenerateInvigilation.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateInvigilation.setText("Generate Invigilation List");
        btnGenerateInvigilation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        btnGenerateInvigilation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerateInvigilationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerateInvigilationMouseExited(evt);
            }
        });
        btnGenerateInvigilation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateInvigilationActionPerformed(evt);
            }
        });

        btnGenerateSeating.setBackground(new java.awt.Color(0, 128, 128));
        btnGenerateSeating.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateSeating.setText("Generate Seating Arrangement");
        btnGenerateSeating.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        btnGenerateSeating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerateSeatingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerateSeatingMouseExited(evt);
            }
        });

        jButton1.setText("Upload File");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerateSeating, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncreateTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateInvigilation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btncreateTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerateSeating, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnGenerateInvigilation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateTimeTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateTimeTableMouseEntered
        btncreateTimeTable.setBackground(new Color(24, 154, 180));
        btncreateTimeTable.setForeground(Color.black);
    }//GEN-LAST:event_btncreateTimeTableMouseEntered

    private void btncreateTimeTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateTimeTableMouseExited
        // TODO add your handling code here:
        btncreateTimeTable.setBackground(new Color(0, 128, 128));
        btncreateTimeTable.setForeground(Color.WHITE);

    }//GEN-LAST:event_btncreateTimeTableMouseExited

    private void btncreateTimeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateTimeTableActionPerformed

    }//GEN-LAST:event_btncreateTimeTableActionPerformed

    private void btnGenerateInvigilationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateInvigilationMouseEntered
        // TODO add your handling code here:
        btnGenerateInvigilation.setBackground(new Color(24, 154, 180));
        btnGenerateInvigilation.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnGenerateInvigilationMouseEntered

    private void btnGenerateInvigilationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateInvigilationMouseExited
        // TODO add your ha
        btnGenerateInvigilation.setBackground(new Color(0, 128, 128));
        btnGenerateInvigilation.setForeground(Color.WHITE);

    }//GEN-LAST:event_btnGenerateInvigilationMouseExited

    private void btnGenerateInvigilationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInvigilationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateInvigilationActionPerformed

    private void btnGenerateSeatingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateSeatingMouseEntered
        btnGenerateSeating.setBackground(new Color(24, 154, 180));
        btnGenerateSeating.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnGenerateSeatingMouseEntered

    private void btnGenerateSeatingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateSeatingMouseExited
        // TODO add your handling code here:
        btnGenerateSeating.setBackground(new Color(0, 128, 128));
        btnGenerateSeating.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGenerateSeatingMouseExited

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
            java.util.logging.Logger.getLogger(InvigilationInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvigilationInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvigilationInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvigilationInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new InvigilationInput().setVisible(true);
                InvigilationInput invigilationInput = new InvigilationInput();
                invigilationInput.setVisible(true);
                invigilationInput.getContentPane().setBackground(new Color(47, 79, 79));

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerateInvigilation;
    private javax.swing.JButton btnGenerateSeating;
    private javax.swing.JButton btncreateTimeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
