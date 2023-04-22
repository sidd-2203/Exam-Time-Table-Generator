/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.exammanagement;

import Utilities.CreateConnection;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author siddh
 */
public class SeatingArrangmentIn extends javax.swing.JFrame {

    String firstYearTableNameString = "firstyearstudents";
    String secondYearTableNameString = "secondyearstudents";
    String thirdYearTableNameString = "thirdyearstudents";
    String fourthYearTableNameString = "fourthyearstudents";

    String firstYearSubject = "firstyearSubject";
    String secondYearTableSubject = "secondyearSubject";
    String thirdYearTableSubject = "thirdyearSubject";
    String fourthYearTableSubject = "fourthyearSubject";
    String LtTableNameString = "LTSeating";
    String allLtsNameString = "AllLectureHalls";

    boolean semester;
    ArrayList<String> allSubjectArrayList = new ArrayList<>();

    /**
     * Creates new form SeatingArrangmentIn
     */
    public SeatingArrangmentIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        nextSeatingArrangement = new javax.swing.JButton();
        uploadSeatingArrangement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(0, 128, 128));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Time Table Create");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 128, 128));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seating Arrangement");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 128, 128));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Invigilation");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        nextSeatingArrangement.setText("Next");
        nextSeatingArrangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSeatingArrangementActionPerformed(evt);
            }
        });

        uploadSeatingArrangement.setText("Upload Seating File");
        uploadSeatingArrangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSeatingArrangementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uploadSeatingArrangement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(nextSeatingArrangement)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(nextSeatingArrangement)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadSeatingArrangement))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleName("Exam Management");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void nextSeatingArrangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextSeatingArrangementActionPerformed
        String semeString = semester == true ? "EndSem" : "Midsem";

        String itemString = jComboBox1.getSelectedItem().toString();
        SeatingArrangementGenerated seatingArrangementGenerated = new SeatingArrangementGenerated();
        seatingArrangementGenerated.main(new String[]{itemString, semeString});
        this.dispose();
    }//GEN-LAST:event_nextSeatingArrangementActionPerformed

    private void uploadSeatingArrangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadSeatingArrangementActionPerformed
        InputFile(LtTableNameString, allLtsNameString);
    }//GEN-LAST:event_uploadSeatingArrangementActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InvigilationListCreated invigilationListCreated = new InvigilationListCreated();
        invigilationListCreated.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String semeString = semester == true ? "EndSem" : "Midsem";
        CreateTimeTable timeTable = new CreateTimeTable();
        timeTable.main(new String[]{semeString});
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setToolTipText("Time Table Created");
        jButton1.setBackground(new Color(24, 154, 180));
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(0, 128, 128));
        jButton1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setToolTipText("Seating Arrangement");
        jButton2.setBackground(new Color(24, 154, 180));
        jButton2.setForeground(Color.black);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new Color(0, 128, 128));
        jButton2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setToolTipText("Invigilation");
        jButton3.setBackground(new Color(24, 154, 180));
        jButton3.setForeground(Color.black);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(new Color(0, 128, 128));
        jButton3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton3MouseExited

    public void InputFile(String tableName, String subjectTableName) {
        Connection connection = CreateConnection.getInstance();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("show tables;");
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(tableName)) {
                    statement.executeUpdate("drop table " + tableName + ";");
                    System.out.println("Previous table deleted");
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }

        File excelFile;
        FileInputStream fileInputStream;
        BufferedInputStream buffered;

        JFileChooser jfile = new JFileChooser("C:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XLS Files", "xlsx");

        jfile.setFileFilter(filter);
        jfile.setAcceptAllFileFilterUsed(false);
        int chosen = jfile.showOpenDialog(null);

        ArrayList<String> totalLTs = new ArrayList<>();

        if (chosen == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = jfile.getSelectedFile();
                fileInputStream = new FileInputStream(excelFile);
                buffered = new BufferedInputStream(fileInputStream);
                XSSFWorkbook wb = new XSSFWorkbook(buffered);
                XSSFSheet sheet = wb.getSheetAt(0);

                Iterator<Row> itr = sheet.iterator();
                int rowNumber = 0;
                int numberOfColumns = 0;

                while (itr.hasNext()) {
                    Row row = itr.next();
                    rowNumber++;
                    if (rowNumber == 1) {
                        String tableCreatorString = "create table " + tableName + "(";
                        Iterator<Cell> cellIterator = row.cellIterator();
                        while (cellIterator.hasNext()) {
                            Cell cell = cellIterator.next();
                            numberOfColumns++;

                            totalLTs.add(cell.getStringCellValue());

                            tableCreatorString += cell.getStringCellValue() + " varchar(10)";
                            if (cellIterator.hasNext()) {
                                tableCreatorString += ",";
                            }
                        }
                        tableCreatorString += ");";
                        System.out.println(tableCreatorString);

                        if (connection != null) {
//                            Statement stmt = connection.createStatement();
                            statement = connection.createStatement();
                            statement.executeUpdate(tableCreatorString);

                            try {

                                boolean flag = false;
                                ResultSet rs = statement.executeQuery("show tables;");
                                while (rs.next()) {
                                    System.out.println(rs.getString(1));
                                    if (rs.getString(1).equalsIgnoreCase(subjectTableName)) {
                                        statement.executeUpdate("drop table " + subjectTableName + ";");
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
                                System.out.println("Error");
                            }

                            String tableCreate = "Create table " + subjectTableName + "(names varchar(10));";
                            statement.executeUpdate(tableCreate);
                            for (int i = 0; i < totalLTs.size(); i++) {
                                String insert = "Insert into " + subjectTableName + " values(\'" + totalLTs.get(i)
                                        + "\');";
                                System.out.println(insert);
                                statement.executeUpdate(insert);
                            }

                            System.out.println(tableName + "has been created");
                        } else {
                            System.out.println("Connection was null");
                        }

                    } else {
                        String valuesString = "";
                        Iterator<Cell> cellIterator = row.cellIterator();

                        while (cellIterator.hasNext()) {
                            Cell cell = cellIterator.next();
                            if (!cell.getStringCellValue().equals("NULL")) {
                                valuesString += "\'" + cell.getStringCellValue() + "\'";
                            } else {
                                valuesString += "NULL";
                            }
                            if (cellIterator.hasNext()) {
                                valuesString += ",";
                            }
                        }
                        String sqlString = "Insert into " + tableName + " values (" + valuesString + ");";
                        System.out.println(sqlString);
                        if (connection != null) {
                            Statement stmt = connection.createStatement();
                            stmt.executeUpdate(sqlString);
                            System.out.println("Data has been added " + valuesString);
                        }
                    }
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);

            } catch (SQLException ex) {
                Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(SeatingArrangmentIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangmentIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangmentIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangmentIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeatingArrangmentIn seating = new SeatingArrangmentIn();
                seating.setVisible(true);
                seating.setUpTable(args[0]);
                seating.getContentPane().setBackground(new Color(47, 79, 79));
            }
        });
    }

    public void setUpTable(String type) {
        ArrayList<String> firstYearArrayList = setEachYearTable(firstYearTableNameString, firstYearSubject);
        ArrayList<String> secondYearArrayList = setEachYearTable(secondYearTableNameString, secondYearTableSubject);
        ArrayList<String> thirdYearArrayList = setEachYearTable(thirdYearTableNameString, thirdYearTableSubject);
        ArrayList<String> fourthYeaArrayList = setEachYearTable(fourthYearTableNameString, fourthYearTableSubject);
        if (type.equalsIgnoreCase("Midsem")) {
            semester = false;
            DefaultTableModel model = new DefaultTableModel();
//            String headers[]={"SLOT 4","SLOT 3","SLOT 2","SLOT 1"};
//               model.setColumnIdentifiers(headers);
            model.addColumn("SLOT 4(1st Year)", firstYearArrayList.toArray());
            model.addColumn("SLOT 3(2nd Year)", secondYearArrayList.toArray());
            model.addColumn("SLOT 2(3rd Year)", thirdYearArrayList.toArray());
            model.addColumn("SLOT 1(4th Year)", fourthYeaArrayList.toArray());
            jTable1.setModel(model);
        } else {
            semester = true;
            DefaultTableModel model = new DefaultTableModel();
            ArrayList<String> columnArrayList = combineAlternate(firstYearArrayList, secondYearArrayList);
            ArrayList<String> columnArrayList2 = combineAlternate(thirdYearArrayList, fourthYeaArrayList);
            model.addColumn("SLOT 1(1st and 2nd Year)", columnArrayList.toArray());
            model.addColumn("SLOT 2(3rd and 4th Year)", columnArrayList2.toArray());
            jTable1.setModel(model);
        }
    }

    public ArrayList<String> combineAlternate(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> combine = new ArrayList<>();
        int index = 0;
        int firstIndex = 0, secondIndex = 0;
        while (true) {
            if (firstIndex >= a.size() && secondIndex >= b.size()) {
                break;
            }
            if (firstIndex < a.size()) {
                combine.add(a.get(firstIndex));
                firstIndex++;
            }
            if (secondIndex < b.size()) {
                combine.add(b.get(secondIndex));
                secondIndex++;
            }
        }
        return combine;
    }

    public ArrayList<String> setEachYearTable(String tableNameString, String SubjectTableName) {
        Connection connection = CreateConnection.getInstance();
        Statement statement;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from " + SubjectTableName + ";");
            ArrayList<String> subjectsArrayList = new ArrayList<>();
            ArrayList<String> finalTableList = new ArrayList<>();
            ArrayList<Integer> visitedArrayList = new ArrayList<>();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                subjectsArrayList.add(rs.getString(1));
            }
            for (int i = 0; i < subjectsArrayList.size(); i++) {
                visitedArrayList.add(0);
            }

            for (int index = 0; index < subjectsArrayList.size(); index++) {
                boolean flag = false;
                if (visitedArrayList.get(index) == 1) {
                    continue;
                }
                for (int i = index + 1; i < subjectsArrayList.size(); i++) {
                    if (visitedArrayList.get(i) == 1) {
                        continue;
                    }
                    String queryString = "Select f1." + subjectsArrayList.get(index) + " from " + tableNameString + " f1,"
                            + tableNameString + " f2 where f1." + subjectsArrayList.get(index)
                            + "= f2." + subjectsArrayList.get(i) + ";";
                    System.out.println(queryString);
                    ResultSet rs1 = statement.executeQuery(queryString);
                    if (!rs1.first()) {
                        visitedArrayList.set(i, 1);
                        String valueString = subjectsArrayList.get(index) + "/" + subjectsArrayList.get(i);
                        finalTableList.add(valueString);
                        allSubjectArrayList.add(valueString);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    finalTableList.add(subjectsArrayList.get(index));
                    allSubjectArrayList.add(subjectsArrayList.get(index));
                }
                visitedArrayList.set(index, 1);
            }
            DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<>();
            defaultComboBoxModel.addAll(allSubjectArrayList);
            jComboBox1.setModel(defaultComboBoxModel);
            jComboBox1.setSelectedIndex(0);
            return finalTableList;

        } catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextSeatingArrangement;
    private javax.swing.JButton uploadSeatingArrangement;
    // End of variables declaration//GEN-END:variables
}
