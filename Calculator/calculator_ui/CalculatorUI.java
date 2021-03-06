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
package com.cdomenech.calculator_ui;

import com.cdomenech.calculator.Calculator;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class CalculatorUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorUI
     */
    public CalculatorUI() {
        initComponents();
        // Set invisible all the extra buttons
        btnPercentage.setVisible(false);
        btnSquareRoot.setVisible(false);
        btnSquare.setVisible(false);
        btnFraction.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        opPanel = new javax.swing.JPanel();
        lbAllInputs = new javax.swing.JLabel();
        lbLastOp = new javax.swing.JLabel();
        btnMore = new javax.swing.JButton();
        buttonsPanel = new javax.swing.JPanel();
        btnPercentage = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnFraction = new javax.swing.JButton();
        btnClearError = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRemoveLastN = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new java.awt.Dimension(510, 520));
        setSize(new java.awt.Dimension(450, 520));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {1};
        jPanel2Layout.rowHeights = new int[] {3};
        jPanel2Layout.columnWeights = new double[] {1.0};
        jPanel2Layout.rowWeights = new double[] {3.0};
        opPanel.setLayout(jPanel2Layout);

        lbAllInputs.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        lbAllInputs.setForeground(new java.awt.Color(102, 102, 102));
        lbAllInputs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAllInputs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 397;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        opPanel.add(lbAllInputs, gridBagConstraints);

        lbLastOp.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lbLastOp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLastOp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLastOp.setMaximumSize(new java.awt.Dimension(112, 30));
        lbLastOp.setMinimumSize(new java.awt.Dimension(112, 30));
        lbLastOp.setPreferredSize(new java.awt.Dimension(112, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 372;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        opPanel.add(lbLastOp, gridBagConstraints);

        btnMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/additionbutton.png"))); // NOI18N
        btnMore.setBorder(null);
        btnMore.setBorderPainted(false);
        btnMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMore.setOpaque(false);
        btnMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        opPanel.add(btnMore, gridBagConstraints);

        buttonsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonsPanel.setLayout(new java.awt.GridLayout(6, 4));

        btnPercentage.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnPercentage.setText("%");
        btnPercentage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPercentage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnPercentage);

        btnSquareRoot.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnSquareRoot.setText("√");
        btnSquareRoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSquareRoot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareRootActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnSquareRoot);

        btnSquare.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnSquare.setText("x²");
        btnSquare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSquare.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnSquare);

        btnFraction.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnFraction.setText("⅟ₓ");
        btnFraction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFraction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFractionActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnFraction);

        btnClearError.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnClearError.setText("CE");
        btnClearError.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClearError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearErrorActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnClearError);

        btnClear.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnClear.setText("C");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnClear);

        btnRemoveLastN.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnRemoveLastN.setText("←");
        btnRemoveLastN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveLastN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemoveLastN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveLastNActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnRemoveLastN);

        btnDiv.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnDiv);

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setOpaque(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn7);

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setOpaque(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn8);

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setOpaque(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn9);

        btnMult.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnMult.setText("×");
        btnMult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnMult);

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setOpaque(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn4);

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setOpaque(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn5);

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setOpaque(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn6);

        btnSub.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnSub.setText("-");
        btnSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnSub);

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setOpaque(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn1);

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setOpaque(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn2);

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setOpaque(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn3);

        btnAdd.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnAdd.setText("+");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnAdd);

        btnPlusMinus.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnPlusMinus.setText("±");
        btnPlusMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlusMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnPlusMinus);

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setOpaque(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        buttonsPanel.add(btn0);

        btnDecimal.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnDecimal);

        btnEqual.setBackground(new java.awt.Color(153, 153, 255));
        btnEqual.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        btnEqual.setText("=");
        btnEqual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEqual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEqual.setOpaque(false);
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnEqual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Set visible or invisible the extra buttons
     *
     * @param evt
     */
    private void btnMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreActionPerformed
        if (!extraVisible) {
            btnPercentage.setVisible(true);
            btnSquareRoot.setVisible(true);
            btnSquare.setVisible(true);
            btnFraction.setVisible(true);
            extraVisible = true;
        } else {
            btnPercentage.setVisible(false);
            btnSquareRoot.setVisible(false);
            btnSquare.setVisible(false);
            btnFraction.setVisible(false);
            extraVisible = false;
        }

    }//GEN-LAST:event_btnMoreActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        lbLastOp.setText(lbLastOp.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed
    /**
     * Check if the number is decimal before add a dot
     *
     * @param evt
     */
    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        if (lbLastOp.getText().contains(".")) {

        } else {
            if (lbLastOp.getText().length() > 0) {

                lbLastOp.setText(lbLastOp.getText() + ".");
            }
        }
    }//GEN-LAST:event_btnDecimalActionPerformed
    /**
     * Clear everything
     *
     * @param evt
     */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lbLastOp.setText("");
        lbAllInputs.setText("");
    }//GEN-LAST:event_btnClearActionPerformed
    /**
     * Clear only the last input
     *
     * @param evt
     */
    private void btnClearErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearErrorActionPerformed
        lbLastOp.setText("");
    }//GEN-LAST:event_btnClearErrorActionPerformed
    /**
     * Invert to negative or positive
     *
     * @param evt
     */
    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
        String value = lbLastOp.getText();
        if (value.length() > 0) {
            if (!value.contains("-")) {
                lbLastOp.setText("-" + value);
            } else {
                try {
                    lbLastOp.setText(value.split("-")[1]);
                } catch (IndexOutOfBoundsException e) {
                    lbLastOp.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnPlusMinusActionPerformed
    /**
     * Remove last number
     *
     * @param evt
     */
    private void btnRemoveLastNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveLastNActionPerformed
        String value = lbLastOp.getText();
        int length = value.length();
        if (length > 0) {
            StringBuilder builder = new StringBuilder(value);
            builder.deleteCharAt(length - 1);
            lbLastOp.setText(builder.toString());
        }
    }//GEN-LAST:event_btnRemoveLastNActionPerformed
    /**
     * Resize font to a more legible size
     *
     * @param evt
     */
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        lbLastOp.setFont(new Font("Lato", Font.PLAIN, (int) width / 50));
        lbAllInputs.setFont(new Font("Lato", Font.PLAIN, (int) width / 80));
    }//GEN-LAST:event_formComponentResized
    /**
     * Connect to the Calculator class and send the values It sets the result
     * too
     *
     * @param evt
     */
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        Calculator cal = new Calculator();
        // Two operator methods
        if (lbLastOp.getText().length() > 0) {
            double op2 = Double.parseDouble(lbLastOp.getText());
            switch (sign) {
                case "÷":
                    result = cal.divide(toBeCalculatedValue, op2);
                    break;
                case "×":
                    result = cal.multiply(toBeCalculatedValue, op2);
                    break;
                case "-":
                    result = cal.substract(toBeCalculatedValue, op2);
                    break;
                case "+":
                    result = cal.add(toBeCalculatedValue, op2);
                    break;
            }
            // One operator methods
        } else if (sign.equals("%") || sign.equals("√") || sign.equals("²") || sign.equals("⅟ₓ")) {
            switch (sign) {
                case "%":
                    result = cal.percentage(toBeCalculatedValue);
                    break;
                case "√":
                    result = cal.squareRoot(toBeCalculatedValue);
                    break;
                case "²":
                    result = cal.square(toBeCalculatedValue);
                    break;
                case "⅟ₓ":
                    result = cal.fraction(toBeCalculatedValue);
                    break;
            }
        }
        // Set the result
        lbLastOp.setText(Double.toString(result));

    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        sign = "÷";
        if (lbLastOp.getText().length() > 0)
            storeValue(sign);
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        sign = "×";
        if (lbLastOp.getText().length() > 0)
            storeValue(sign);
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        sign = "-";
        if (lbLastOp.getText().length() > 0) {
            storeValue(sign);
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        sign = "+";
        if (lbLastOp.getText().length() > 0) {
            storeValue(sign);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        sign = "%";
        if (lbLastOp.getText().length() > 0) {
            storeValue(sign);
        }
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void btnSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareRootActionPerformed
        sign = "√";
        if (lbLastOp.getText().length() > 0) {
            storeValue(sign);
        }
    }//GEN-LAST:event_btnSquareRootActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        sign = "²";
        if (lbLastOp.getText().length() > 0) {
            storeValue(sign);
        }
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btnFractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFractionActionPerformed
        sign = "⅟ₓ";
        if (lbLastOp.getText().length() > 0) {
            storeValue(sign);
        }
    }//GEN-LAST:event_btnFractionActionPerformed
    /**
     * Store the first value added and clear the label to continue
     *
     * @param sign
     */
    private void storeValue(String sign) {
        String value = lbLastOp.getText();
        toBeCalculatedValue = Double.parseDouble(value);
        lbAllInputs.setText(value + " " + sign);
        lbLastOp.setText("");

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
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }
    private String sign;
    private boolean extraVisible = false;
    private double toBeCalculatedValue;
    private double result;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearError;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnMore;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnRemoveLastN;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnSub;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel lbAllInputs;
    private javax.swing.JLabel lbLastOp;
    private javax.swing.JPanel opPanel;
    // End of variables declaration//GEN-END:variables
}
