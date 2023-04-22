package com.mycompany.exammanagement;

import Utilities.CreateConnection;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddDocuments extends javax.swing.JFrame {

    String firstYearTableNameString = "firstyearstudents";
    String secondYearTableNameString = "secondyearstudents";
    String thirdYearTableNameString = "thirdyearstudents";
    String fourthYearTableNameString = "fourthyearstudents";

    String firstYearSubject = "firstyearSubject";
    String secondYearTableSubject = "secondyearSubject";
    String thirdYearTableSubject = "thirdyearSubject";
    String fourthYearTableSubject = "fourthyearSubject";
    ArrayList<String> allTableArrayList;

    public AddDocuments() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        semSelectionGroup = new javax.swing.ButtonGroup();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btncreateTimeTable = new javax.swing.JButton();
        btnGenerateInvigilation = new javax.swing.JButton();
        btnGenerateSeating = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnfirstPrevFiles = new javax.swing.JButton();
        btnFirstUpload = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSecondUpload = new javax.swing.JButton();
        btnSecondPrevFiles = new javax.swing.JButton();
        btnFourthUpload = new javax.swing.JButton();
        btnFourthPrevFiles = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnThirdPrevFiles = new javax.swing.JButton();
        btnThirdUpload = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exam Management");
        setBackground(new java.awt.Color(47, 79, 79));
        setMinimumSize(new java.awt.Dimension(780, 429));
        setResizable(false);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Upload the Following Files");

        btncreateTimeTable.setBackground(new java.awt.Color(0, 128, 128));
        btncreateTimeTable.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
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
        btnGenerateInvigilation.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
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
        btnGenerateSeating.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        btnGenerateSeating.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateSeating.setText("Generate \nSeating Arrangement");
        btnGenerateSeating.setToolTipText("Generate  Seating Arrangement");
        btnGenerateSeating.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        btnGenerateSeating.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerateSeatingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerateSeatingMouseExited(evt);
            }
        });
        btnGenerateSeating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateSeatingActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Year Course Enrollments");

        btnfirstPrevFiles.setText("Use Previous Files");
        btnfirstPrevFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstPrevFilesActionPerformed(evt);
            }
        });

        btnFirstUpload.setText("Upload New Files");
        btnFirstUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstUploadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Second Year Course Enrollments");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Third Year Course Enrollments");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fourth Year Course Enrollments");

        btnSecondUpload.setText("Upload New Files");
        btnSecondUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondUploadActionPerformed(evt);
            }
        });

        btnSecondPrevFiles.setText("Use Previous Files");
        btnSecondPrevFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondPrevFilesActionPerformed(evt);
            }
        });

        btnFourthUpload.setText("Upload New Files");
        btnFourthUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourthUploadActionPerformed(evt);
            }
        });

        btnFourthPrevFiles.setText("Use Previous Files");
        btnFourthPrevFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourthPrevFilesActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(47, 79, 79));
        semSelectionGroup.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("MidSem");

        jRadioButton2.setBackground(new java.awt.Color(47, 79, 79));
        semSelectionGroup.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("EndSem");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnThirdPrevFiles.setText("Use Previous Files");
        btnThirdPrevFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdPrevFilesActionPerformed(evt);
            }
        });

        btnThirdUpload.setText("Upload New Files");
        btnThirdUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdUploadActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSecondPrevFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSecondUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnfirstPrevFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFirstUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnFourthPrevFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFourthUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThirdPrevFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnThirdUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(75, 75, 75))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncreateTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerateSeating, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnGenerateInvigilation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirstUpload)
                            .addComponent(btnfirstPrevFiles))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSecondPrevFiles)
                            .addComponent(btnSecondUpload))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThirdPrevFiles)
                            .addComponent(btnThirdUpload))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFourthUpload, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFourthPrevFiles))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (checkIfComplete()) {
            String arr[] = new String[1];
            if (jRadioButton1.isSelected()) {
                arr[0] = "Midsem";
                CreateTimeTable.main(arr);
                this.dispose();
            } else if (jRadioButton2.isSelected()) {
                arr[0] = "Endsem";
                CreateTimeTable.main(arr);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Please Select the Semester");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Upload the Files");
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnfirstPrevFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstPrevFilesActionPerformed
        Connection connection = CreateConnection.getInstance();
        Statement statement;

        try {
            statement = connection.createStatement();
            boolean flag = false;
            ResultSet rs = statement.executeQuery("show tables;");
            while (rs.next()) {
                if (rs.getString(1).equals(firstYearTableNameString)) {
                    flag = true;
                    int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (response == JOptionPane.YES_OPTION) {
                        btnFirstUpload.setEnabled(false);
                        System.out.println("Yes option selected");
                        //TOdO:Get data needed to process furthur
                    }
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "No previous data present");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfirstPrevFilesActionPerformed

    private void btnSecondPrevFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondPrevFilesActionPerformed
        Connection connection = CreateConnection.getInstance();
        Statement statement;

        try {
            statement = connection.createStatement();
            boolean flag = false;
            ResultSet rs = statement.executeQuery("show tables;");
            while (rs.next()) {
                if (rs.getString(1).equals(secondYearTableNameString)) {
                    flag = true;
                    int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (response == JOptionPane.YES_OPTION) {
                        btnSecondUpload.setEnabled(false);
                        System.out.println("Yes option selected");
                        //TOdO:Get data needed to process furthur
                    }
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "No previous data present");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSecondPrevFilesActionPerformed

    private void btnFourthPrevFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourthPrevFilesActionPerformed
        Connection connection = CreateConnection.getInstance();
        Statement statement;

        try {
            statement = connection.createStatement();
            boolean flag = false;
            ResultSet rs = statement.executeQuery("show tables;");
            while (rs.next()) {
                if (rs.getString(1).equals(fourthYearTableNameString)) {
                    flag = true;
                    int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (response == JOptionPane.YES_OPTION) {
                        btnFourthUpload.setEnabled(false);
                        System.out.println("Yes option selected");
                        //TOdO:Get data needed to process furthur
                    }
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "No previous data present");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFourthPrevFilesActionPerformed

    private void btnFirstUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstUploadActionPerformed
        /*
        
        1. drop the table
        2. create a new table first row elements(Subjects) =col names
        3. Enroll students
        create 
         */
        InputFile(firstYearTableNameString, firstYearSubject);
        btnFirstUpload.setEnabled(false);
    }//GEN-LAST:event_btnFirstUploadActionPerformed

    private void btnFourthUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourthUploadActionPerformed
        InputFile(fourthYearTableNameString, fourthYearTableSubject);
        btnFourthUpload.setEnabled(false);
    }//GEN-LAST:event_btnFourthUploadActionPerformed

    private void btncreateTimeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateTimeTableActionPerformed
        if (checkIfComplete()) {
            String arr[] = new String[1];
            if (jRadioButton1.isSelected()) {
                arr[0] = "Midsem";
            } else if (jRadioButton2.isSelected()) {
                arr[0] = "Endsem";
            } else {
                JOptionPane.showMessageDialog(null, "Please Select the Semester");
                return;
            }
            CreateTimeTable.main(arr);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Please Upload All Files to Proceed");
        }
    }//GEN-LAST:event_btncreateTimeTableActionPerformed

    public boolean checkIfComplete() {
        return (!btnFirstUpload.isEnabled() && !btnSecondUpload.isEnabled() && !btnThirdUpload.isEnabled() && !btnFourthUpload.isEnabled());
    }

    private void btnGenerateInvigilationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInvigilationActionPerformed
        InvigilationListCreated invigilationListCreated = new InvigilationListCreated();
        invigilationListCreated.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btnGenerateInvigilationActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnSecondUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondUploadActionPerformed
        InputFile(secondYearTableNameString, secondYearTableSubject);
        btnSecondUpload.setEnabled(false);
    }//GEN-LAST:event_btnSecondUploadActionPerformed

    private void btnThirdUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdUploadActionPerformed
        InputFile(thirdYearTableNameString, thirdYearTableSubject);
        btnThirdUpload.setEnabled(false);
    }//GEN-LAST:event_btnThirdUploadActionPerformed

    private void btnThirdPrevFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdPrevFilesActionPerformed
        Connection connection = CreateConnection.getInstance();
        Statement statement;

        try {
            statement = connection.createStatement();
            boolean flag = false;
            ResultSet rs = statement.executeQuery("show tables;");
            while (rs.next()) {
                if (rs.getString(1).equals(thirdYearTableNameString)) {
                    flag = true;
                    int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (response == JOptionPane.YES_OPTION) {
                        btnThirdUpload.setEnabled(false);
                        System.out.println("Yes option selected");
                        //TOdO:Get data needed to process furthur
                    }
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "No previous data present");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThirdPrevFilesActionPerformed

    private void btncreateTimeTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateTimeTableMouseEntered
        
        btncreateTimeTable.setBackground(new Color(24, 154, 180));
        btncreateTimeTable.setForeground(Color.black);
    }//GEN-LAST:event_btncreateTimeTableMouseEntered

    private void btncreateTimeTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreateTimeTableMouseExited
        // TODO add your handling code here:
        btncreateTimeTable.setBackground(new Color(0, 128, 128));
        btncreateTimeTable.setForeground(Color.WHITE);


    }//GEN-LAST:event_btncreateTimeTableMouseExited

    private void btnGenerateSeatingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateSeatingMouseEntered
        btnGenerateSeating.setToolTipText("Generate Seating Arrangement");

        btnGenerateSeating.setBackground(new Color(24, 154, 180));
        btnGenerateSeating.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnGenerateSeatingMouseEntered

    private void btnGenerateSeatingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateSeatingMouseExited
        // TODO add your handling code here:
        btnGenerateSeating.setBackground(new Color(0, 128, 128));
        btnGenerateSeating.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGenerateSeatingMouseExited

    private void btnGenerateInvigilationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateInvigilationMouseEntered
        // TODO add your handling code here:
        btnGenerateInvigilation.setToolTipText("Generate Invigilation List");
        btnGenerateInvigilation.setBackground(new Color(24, 154, 180));
        btnGenerateInvigilation.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnGenerateInvigilationMouseEntered

    private void btnGenerateInvigilationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateInvigilationMouseExited
        // TODO add your ha
        btnGenerateInvigilation.setBackground(new Color(0, 128, 128));
        btnGenerateInvigilation.setForeground(Color.WHITE);

    }//GEN-LAST:event_btnGenerateInvigilationMouseExited

    private void btnGenerateSeatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateSeatingActionPerformed
        JOptionPane.showMessageDialog(null, "First Generate Time table to Proceed");
    }//GEN-LAST:event_btnGenerateSeatingActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddDocuments().setVisible(true);
                AddDocuments addDocuments = new AddDocuments();
                addDocuments.setVisible(true);
                addDocuments.getContentPane().setBackground(new Color(47, 79, 79));
            }
        });
    }

    public void InputFile(String tableName, String subjectTableName) {
        Connection connection = CreateConnection.getInstance();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("show tables;");
            while (rs.next()) {
                if (rs.getString(1).equals(tableName)) {
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

        ArrayList<String> subjectArrayList = new ArrayList<>();

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

                            subjectArrayList.add(cell.getStringCellValue());

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
                            for (int i = 0; i < subjectArrayList.size(); i++) {
                                String insert = "Insert into " + subjectTableName + " values(\'" + subjectArrayList.get(i)
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
        } else {
            AddDocuments documents = new AddDocuments();
            documents.main(new String[]{});
            this.dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirstUpload;
    private javax.swing.JButton btnFourthPrevFiles;
    private javax.swing.JButton btnFourthUpload;
    private javax.swing.JButton btnGenerateInvigilation;
    private javax.swing.JButton btnGenerateSeating;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSecondPrevFiles;
    private javax.swing.JButton btnSecondUpload;
    private javax.swing.JButton btnThirdPrevFiles;
    private javax.swing.JButton btnThirdUpload;
    private javax.swing.JButton btncreateTimeTable;
    private javax.swing.JButton btnfirstPrevFiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.ButtonGroup semSelectionGroup;
    // End of variables declaration//GEN-END:variables
}
