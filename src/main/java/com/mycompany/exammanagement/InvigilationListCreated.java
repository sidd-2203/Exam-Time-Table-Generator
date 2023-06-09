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
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author siddh
 */
public class InvigilationListCreated extends javax.swing.JFrame {

    /**
     * Creates new form InvigilationListCreated
     */
    String allLtsNameString = "AllLectureHalls";
    public InvigilationListCreated() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btncreateTimeTable = new javax.swing.JButton();
        btnGenerateInvigilation = new javax.swing.JButton();
        btnGenerateSeating = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setBackground(new java.awt.Color(0, 128, 128));
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

        jButton4.setText("Download");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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
        btnGenerateSeating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateSeatingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Upload The Following Files");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("List of Available Invigilators");

        jButton1.setText("Upload File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(74, 74, 74)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerateSeating, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncreateTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerateInvigilation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btncreateTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerateSeating, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnGenerateInvigilation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleName("Exam Management");

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
           AddDocuments addDocuments=new AddDocuments();
           addDocuments.main(new String[]{});
           this.dispose();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            InputFile();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int rows = jTable1.getRowCount();
        int cols = jTable1.getColumnCount();
        System.out.println(rows+" " +cols);
         
        String arr[][] = new String[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(jTable1.getValueAt(i, j)==null){
                        arr[i][j]="";
                }else 
                    arr[i][j]=jTable1.getValueAt(i, j).toString();
            }
        }
        saveToExcel(arr);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnGenerateSeatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateSeatingActionPerformed
         JOptionPane.showMessageDialog(null, " First Generate Time table ");
    }//GEN-LAST:event_btnGenerateSeatingActionPerformed

    public void saveToExcel(String arr[][]) {
        int rows = jTable1.getRowCount();
        int cols = jTable1.getColumnCount();
      
        XSSFWorkbook workbook = new XSSFWorkbook();

        // spreadsheet object
        XSSFSheet spreadsheet = workbook.createSheet(" Invigilation Arrangement");

        // creating a row object
        XSSFRow row;
        // This data needs to be written (Object[])
        Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
        
            studentData.put("1", new Object[]{"Invigilators", "Lecture Halls"});
            for (int i = 0; i < rows; i++) {
                studentData.put(String.valueOf(i+2), arr[i]);
            }
            Set<String> keyid = studentData.keySet();

            int rowid = 0;

            // writing the data into the sheets...
            for (String key : keyid) {
                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = studentData.get(key);
                int cellid = 0;

                for (Object obj : objectArr) {
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String) obj);
                }
            }
            try (
                    // .xlsx is the format for Excel Sheets...
                    // writing the workbook into the file...
                     FileOutputStream out = new FileOutputStream(new File("E:/ExamManagement/Invigilation.xlsx"))) {
                    workbook.write(out);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    public void InputFile() {
        
      
        File excelFile;
        FileInputStream fileInputStream;
        BufferedInputStream buffered;

        JFileChooser jfile = new JFileChooser("C:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XLS Files", "xlsx");

        jfile.setFileFilter(filter);
        jfile.setAcceptAllFileFilterUsed(false);
        int chosen = jfile.showOpenDialog(null);

        ArrayList<String> teachersArrayList = new ArrayList<>();

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
                    
                    Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        numberOfColumns++;
                        teachersArrayList.add(cell.getStringCellValue());
                    }
                }   
            } catch (Exception ex) {
                Logger.getLogger(InvigilationListCreated.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setTable(teachersArrayList);
    }

    public void setTable(ArrayList<String> teacArrayList){
        Connection connection = CreateConnection.getInstance();
        Statement statement;
    
         try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from " + allLtsNameString + ";");
            ArrayList<String> ltsNameArrayList = new ArrayList<>();
         
            while (rs.next()) {
                if(rs.getString(1)!=null){
                    System.out.println(rs.getString(1));
                    ltsNameArrayList.add(rs.getString(1));
                    ltsNameArrayList.add(rs.getString(1));
                }
            }
             Collections.shuffle(teacArrayList);
             if(teacArrayList.size()<ltsNameArrayList.size()){
                 JOptionPane.showMessageDialog(null, "Teachers are not enough");
//            System.out.println(studentsArrayList.size()+" "+seatsList.size());
                    return;
             }
             while(teacArrayList.size()!=ltsNameArrayList.size()){
                 teacArrayList.remove(teacArrayList.size()-1);
             }
             
               DefaultTableModel model = new DefaultTableModel();
               model.addColumn("Invigilators",teacArrayList.toArray());       
               model.addColumn("Lecture Halls",ltsNameArrayList.toArray());
               jTable1.setModel(model);
            
         }
            catch (SQLException ex) {
            Logger.getLogger(AddDocuments.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
            java.util.logging.Logger.getLogger(InvigilationListCreated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvigilationListCreated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvigilationListCreated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvigilationListCreated.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InvigilationListCreated invigilationListCreated=new InvigilationListCreated();
                invigilationListCreated.setVisible(true);
                invigilationListCreated.getContentPane().setBackground(new Color(47,79,79));
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerateInvigilation;
    private javax.swing.JButton btnGenerateSeating;
    private javax.swing.JButton btncreateTimeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
