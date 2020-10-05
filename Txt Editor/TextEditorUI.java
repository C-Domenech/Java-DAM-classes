package textEditorUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Cristina Domenech <github.com/C-Domenech>
 */
public class TextEditorUI extends javax.swing.JFrame {

    /**
     * Creates new form textEditorUI
     */
    public TextEditorUI() {
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

        textArea = new javax.swing.JTextArea();
        verScrollBar = new javax.swing.JScrollBar();
        filePath = new javax.swing.JTextField();
        nWords = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        submenuFile = new javax.swing.JMenu();
        newSub = new javax.swing.JMenuItem();
        openSub = new javax.swing.JMenuItem();
        saveSub = new javax.swing.JMenuItem();
        saveAsSub = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        exitSub = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Txt Editor");

        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(null);

        filePath.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        filePath.setDoubleBuffered(true);
        filePath.setEnabled(false);
        filePath.setSelectionColor(new java.awt.Color(240, 240, 240));

        nWords.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nWords.setDoubleBuffered(true);
        nWords.setEnabled(false);
        nWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nWordsActionPerformed(evt);
            }
        });

        submenuFile.setText("File");

        newSub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newSub.setText("New");
        newSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSubActionPerformed(evt);
            }
        });
        submenuFile.add(newSub);

        openSub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openSub.setText("Open...");
        openSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSubActionPerformed(evt);
            }
        });
        submenuFile.add(openSub);

        saveSub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveSub.setText("Save");
        saveSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSubActionPerformed(evt);
            }
        });
        submenuFile.add(saveSub);

        saveAsSub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveAsSub.setText("Save as...");
        saveAsSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsSubActionPerformed(evt);
            }
        });
        submenuFile.add(saveAsSub);
        submenuFile.add(separator);

        exitSub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitSub.setText("Exit");
        exitSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitSubActionPerformed(evt);
            }
        });
        submenuFile.add(exitSub);

        menuBar.add(submenuFile);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nWords, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSubActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        if (file != null) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file.getPath(), StandardCharsets.UTF_8));
                String aux, currentText = "";
                while((aux = reader.readLine()) != null) {
                    currentText += aux + "\n";
                }
                reader.close();
                textArea.setText(currentText);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        filePath.setText("Path: " + file.getPath());
    }//GEN-LAST:event_openSubActionPerformed

    private void saveSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSubActionPerformed
        File file = new File(filePath.getText());
        if (file.exists()) {
            try {
                textArea.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            saveAsSub.doClick();
        }
    }//GEN-LAST:event_saveSubActionPerformed

    private void exitSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitSubActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitSubActionPerformed

    private void newSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSubActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
        filePath.setText("");
    }//GEN-LAST:event_newSubActionPerformed

    private void saveAsSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsSubActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Save as...");
        int userSelection = fc.showSaveDialog(saveAsSub);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if (file != null) {
                if (!file.getName().toLowerCase().endsWith(".txt")) {
                    file = new File(file.getParentFile(), file.getName() + ".txt");
                    filePath.setText("Path: " + file.getPath());
                }
                try {
                    textArea.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TextEditorUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_saveAsSubActionPerformed

    private void nWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nWordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nWordsActionPerformed

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
            java.util.logging.Logger.getLogger(TextEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextEditorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitSub;
    private javax.swing.JTextField filePath;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nWords;
    private javax.swing.JMenuItem newSub;
    private javax.swing.JMenuItem openSub;
    private javax.swing.JMenuItem saveAsSub;
    private javax.swing.JMenuItem saveSub;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.JMenu submenuFile;
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollBar verScrollBar;
    // End of variables declaration//GEN-END:variables
}
