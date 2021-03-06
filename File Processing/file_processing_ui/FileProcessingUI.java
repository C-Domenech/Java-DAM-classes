/*
 * Copyright (C) 2020 Cristina Domenech <linkedin.com/in/c-domenech/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cdomenech.file_processing_ui;

import com.cdomenech.caesar_cipher.CaesarCipher;
import com.cdomenech.run_length.RunLength;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class FileProcessingUI extends javax.swing.JFrame {

    public CaesarCipher cc;
    public RunLength rl;

    /**
     * Creates new form CaesarCipherUI
     */
    public FileProcessingUI() {
        initComponents();
        // Create an instance of type CaesarCipher and RunLength
        cc = new CaesarCipher();
        rl = new RunLength();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAction = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelCaesarCipher = new javax.swing.JPanel();
        btnChoose = new javax.swing.JButton();
        lbFile = new javax.swing.JLabel();
        jLabelShift = new javax.swing.JLabel();
        sldShift = new javax.swing.JSlider();
        lbCurrentShift = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        tfFilename = new javax.swing.JTextField();
        rbEncrypt = new javax.swing.JRadioButton();
        rbDecrypt = new javax.swing.JRadioButton();
        btnRun = new javax.swing.JButton();
        panelRLE = new javax.swing.JPanel();
        btnRLEChoose = new javax.swing.JButton();
        lbRLEFile = new javax.swing.JLabel();
        jLabelRLEName = new javax.swing.JLabel();
        tfRLEFilename = new javax.swing.JTextField();
        rbRLECompress = new javax.swing.JRadioButton();
        rbRLEDecompress = new javax.swing.JRadioButton();
        btnRLERun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnChoose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChoose.setText("Choose File");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        lbFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelShift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelShift.setText("Shift:");

        sldShift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sldShift.setMajorTickSpacing(10);
        sldShift.setMaximum(10);
        sldShift.setMinimum(1);
        sldShift.setMinorTickSpacing(1);
        sldShift.setPaintTicks(true);
        sldShift.setToolTipText("");
        sldShift.setValue(1);
        sldShift.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldShiftStateChanged(evt);
            }
        });

        lbCurrentShift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCurrentShift.setText("Current shift: 1");

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName.setText("New file name:");

        tfFilename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfFilename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFilenameActionPerformed(evt);
            }
        });

        btnGroupAction.add(rbEncrypt);
        rbEncrypt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbEncrypt.setText("Encrypt file");
        rbEncrypt.setActionCommand("0");
        rbEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEncryptActionPerformed(evt);
            }
        });

        btnGroupAction.add(rbDecrypt);
        rbDecrypt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbDecrypt.setText("Decrypt file");
        rbDecrypt.setActionCommand("1");
        rbDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDecryptActionPerformed(evt);
            }
        });

        btnRun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRun.setText("RUN");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCaesarCipherLayout = new javax.swing.GroupLayout(panelCaesarCipher);
        panelCaesarCipher.setLayout(panelCaesarCipherLayout);
        panelCaesarCipherLayout.setHorizontalGroup(
            panelCaesarCipherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaesarCipherLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(panelCaesarCipherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCaesarCipherLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelCaesarCipherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCaesarCipherLayout.createSequentialGroup()
                                .addGroup(panelCaesarCipherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(btnChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jLabelShift, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(sldShift, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(lbCurrentShift, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfFilename, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(3, 3, 3))
                            .addGroup(panelCaesarCipherLayout.createSequentialGroup()
                                .addComponent(rbEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(52, 52, 52)
                                .addComponent(rbDecrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btnRun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        panelCaesarCipherLayout.setVerticalGroup(
            panelCaesarCipherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaesarCipherLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnChoose)
                .addGap(18, 18, 18)
                .addComponent(lbFile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelShift)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCurrentShift)
                .addGap(18, 18, 18)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFilename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelCaesarCipherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEncrypt)
                    .addComponent(rbDecrypt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnRun)
                .addContainerGap())
        );

        panelCaesarCipherLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChoose, btnRun, jLabelName, jLabelShift, lbCurrentShift, lbFile, rbDecrypt, rbEncrypt, sldShift, tfFilename});

        jTabbedPane1.addTab("Caesar Cipher", panelCaesarCipher);

        btnRLEChoose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRLEChoose.setText("Choose File");
        btnRLEChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRLEChooseActionPerformed(evt);
            }
        });

        lbRLEFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbRLEFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelRLEName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRLEName.setText("New file name:");

        tfRLEFilename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnGroupAction.add(rbRLECompress);
        rbRLECompress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbRLECompress.setText("Compress file");
        rbRLECompress.setActionCommand("0");
        rbRLECompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRLECompressActionPerformed(evt);
            }
        });

        btnGroupAction.add(rbRLEDecompress);
        rbRLEDecompress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbRLEDecompress.setText("Decompress file");
        rbRLEDecompress.setActionCommand("1");
        rbRLEDecompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRLEDecompressActionPerformed(evt);
            }
        });

        btnRLERun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRLERun.setText("RUN");
        btnRLERun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRLERunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRLELayout = new javax.swing.GroupLayout(panelRLE);
        panelRLE.setLayout(panelRLELayout);
        panelRLELayout.setHorizontalGroup(
            panelRLELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRLELayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(panelRLELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRLEChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, panelRLELayout.createSequentialGroup()
                        .addComponent(rbRLECompress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(rbRLEDecompress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRLERun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfRLEFilename, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRLEName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRLEFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(122, 122, 122))
        );
        panelRLELayout.setVerticalGroup(
            panelRLELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRLELayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRLEChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lbRLEFile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabelRLEName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRLEFilename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(panelRLELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRLECompress)
                    .addComponent(rbRLEDecompress))
                .addGap(74, 74, 74)
                .addComponent(btnRLERun)
                .addContainerGap())
        );

        panelRLELayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRLERun, jLabelRLEName, lbRLEFile, rbRLECompress, rbRLEDecompress, tfRLEFilename});

        jTabbedPane1.addTab("RLE", panelRLE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Get and send to the readFile method in CaesarCipher class all the
     * required data
     *
     * @param evt
     */
    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        // Get the path of the selected file from the label
        String path = lbFile.getText();
        // Turn it to a file
        File file = new File(path);
        // Get the shift selected and the filename
        int shift = sldShift.getValue();
        String filename = tfFilename.getText();
        // ActionCommand set to 0 -> Encrypt file and 1 -> Decrypt file 
        String op = btnGroupAction.getSelection().getActionCommand();
        int action = 0;
        String msg = "";
        if (Integer.parseInt(op) == 0) {
            action = 0;
            msg = "File encrypted.";
        } else if (Integer.parseInt(op) == 1) {
            action = 1;
            msg = "File decrypted.";
        }

        cc.readFile(file, shift, action, filename);
        // Show a MessageDialog when the process is finished
        JOptionPane.showMessageDialog(rootPane, msg);


    }//GEN-LAST:event_btnRunActionPerformed

    private void sldShiftStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldShiftStateChanged
        lbCurrentShift.setText("Current shift: " + Integer.toString(sldShift.getValue()));
    }//GEN-LAST:event_sldShiftStateChanged
    /**
     * Choose File method that use a filter for txt files and go to an specific
     * directory
     *
     * @param evt
     */
    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // Set JFileChooser in the user's Desktop to make the experience better
        String userDir = System.getProperty("user.home");
        JFileChooser fc = new JFileChooser(userDir + "/Desktop");
        // The file chooser is going to show only .txt format files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents (*.txt)", "txt", "text");
        fc.setFileFilter(filter);
        fc.setDialogTitle("Select file");
        fc.showOpenDialog(this); // Show JFileChooser
        File file = fc.getSelectedFile();
        lbFile.setText(file.getPath());
    }//GEN-LAST:event_btnChooseActionPerformed

    private void rbDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDecryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDecryptActionPerformed

    private void rbEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEncryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEncryptActionPerformed

    private void rbRLECompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRLECompressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRLECompressActionPerformed

    private void rbRLEDecompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRLEDecompressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRLEDecompressActionPerformed
    /**
     * Get and send to the readFile method in RunLength class all the required
     * data
     *
     * @param evt
     */
    private void btnRLERunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRLERunActionPerformed
        String path = lbRLEFile.getText();
        File file = new File(path);
        String filename = tfRLEFilename.getText();
        String op = btnGroupAction.getSelection().getActionCommand();
        System.out.println("op " + op);
        int action = 0;
        String msg = "";
        if (Integer.parseInt(op) == 0) {
            action = 0;
            msg = "File compressed.";
        } else if (Integer.parseInt(op) == 1) {
            action = 1;
            msg = "File decompressed.";
        }

        rl.readFile(file, action, filename);
        JOptionPane.showMessageDialog(rootPane, msg);
    }//GEN-LAST:event_btnRLERunActionPerformed

    private void tfFilenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFilenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFilenameActionPerformed
    /**
     * Choose File method that use a filter for txt files and go to an specific
     * directory
     *
     * @param evt
     */
    private void btnRLEChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRLEChooseActionPerformed
        String userDir = System.getProperty("user.home");
        JFileChooser fc = new JFileChooser(userDir + "/Desktop");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents (*.txt)", "txt", "text");
        fc.setFileFilter(filter);
        fc.setDialogTitle("Select file");
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        lbRLEFile.setText(file.getPath());
    }//GEN-LAST:event_btnRLEChooseActionPerformed

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
            java.util.logging.Logger.getLogger(FileProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileProcessingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileProcessingUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.ButtonGroup btnGroupAction;
    private javax.swing.JButton btnRLEChoose;
    private javax.swing.JButton btnRLERun;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRLEName;
    private javax.swing.JLabel jLabelShift;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCurrentShift;
    private javax.swing.JLabel lbFile;
    private javax.swing.JLabel lbRLEFile;
    private javax.swing.JPanel panelCaesarCipher;
    private javax.swing.JPanel panelRLE;
    private javax.swing.JRadioButton rbDecrypt;
    private javax.swing.JRadioButton rbEncrypt;
    private javax.swing.JRadioButton rbRLECompress;
    private javax.swing.JRadioButton rbRLEDecompress;
    private javax.swing.JSlider sldShift;
    private javax.swing.JTextField tfFilename;
    private javax.swing.JTextField tfRLEFilename;
    // End of variables declaration//GEN-END:variables
}
