/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BarangCtl;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class FrameUtama extends javax.swing.JFrame {
      BarangCtl brg = new BarangCtl(this);

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
        brg.muatData();
        brg.TampilCombo();
        
    }
    
    /**
     *
     * @return
     */
    public JButton getBtnHapus() {
        return HapusButton;
    }

    /**
     *
     * @return
     */
    public JButton getBtnTambah() {
        return TambahButton;
    }

    /**
     *
     * @return
     */
    public JButton getBtnEdit() {
        return RubahButton;
    }
    
    /**
     *
     * @return
     */
    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    /**
     *
     * @return
     */
    public JTable getBarangTable() {
        return barangTable;
    }
    
    /**
     *
     * @return
     */
    public JTextField getTxtNama() {
        return NamaTextField;
    }

    /**
     *
     * @return
     */
    public JTextField getTxtMaterial() {
        return MaterialTextField;
    }
    
    /**
     *
     * @return
     */
    public JTextField getTxtUkuran() {
        return UkuranTextField;
    }
    
    /**
     *
     * @return
     */
    public JTextField getTxtHargaSatuan() {
        return HargaSatuanTextField;
    }
    
    /**
     *
     * @return
     */
    public JComboBox getComboNama(){
        return ComboBoxNama;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        PenawaranButton = new javax.swing.JButton();
        BarangButton = new javax.swing.JButton();
        KontenPanel = new javax.swing.JPanel();
        PenawaranPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePenawaran = new javax.swing.JTable();
        LabelST = new javax.swing.JLabel();
        RubahPdfButton = new javax.swing.JButton();
        TampilSubTotal = new javax.swing.JLabel();
        ComboBoxNama = new javax.swing.JComboBox<>();
        ComboBoxMaterial = new javax.swing.JComboBox<>();
        ComboBoxUkuran = new javax.swing.JComboBox<>();
        hargaTxt = new javax.swing.JTextField();
        jmlhTxt = new javax.swing.JTextField();
        jButtonTmbh = new javax.swing.JButton();
        jButtonRbh = new javax.swing.JButton();
        jButtonHps = new javax.swing.JButton();
        BarangPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        barangTable = new javax.swing.JTable();
        NamaTextField = new javax.swing.JTextField();
        MaterialTextField = new javax.swing.JTextField();
        UkuranTextField = new javax.swing.JTextField();
        HargaSatuanTextField = new javax.swing.JTextField();
        TambahButton = new javax.swing.JButton();
        RubahButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        MainPanel.setBackground(new java.awt.Color(102, 255, 102));

        MenuPanel.setBackground(new java.awt.Color(0, 51, 51));

        PenawaranButton.setText("Penawaran");
        PenawaranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenawaranButtonActionPerformed(evt);
            }
        });

        BarangButton.setText("Barang");
        BarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PenawaranButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BarangButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(PenawaranButton)
                .addGap(18, 18, 18)
                .addComponent(BarangButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        KontenPanel.setBackground(new java.awt.Color(153, 153, 255));
        KontenPanel.setLayout(new java.awt.CardLayout());

        PenawaranPanel.setBackground(new java.awt.Color(255, 102, 102));
        PenawaranPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Penawaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        TablePenawaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Material", "Ukuran", "Jumlah", "Harga", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablePenawaran);

        LabelST.setText("Sub Total : Rp");

        RubahPdfButton.setText("Rubah ke PDF");

        TampilSubTotal.setText("TampilSubTotal");

        ComboBoxNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih" }));

        hargaTxt.setText("harga");

        jmlhTxt.setText("jumlah");

        jButtonTmbh.setText("Tambah");

        jButtonRbh.setText("Rubah");

        jButtonHps.setText("Hapus");

        javax.swing.GroupLayout PenawaranPanelLayout = new javax.swing.GroupLayout(PenawaranPanel);
        PenawaranPanel.setLayout(PenawaranPanelLayout);
        PenawaranPanelLayout.setHorizontalGroup(
            PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PenawaranPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenawaranPanelLayout.createSequentialGroup()
                        .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxNama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxUkuran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hargaTxt)
                                .addComponent(jmlhTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonHps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRbh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonTmbh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenawaranPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenawaranPanelLayout.createSequentialGroup()
                                .addComponent(LabelST)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TampilSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenawaranPanelLayout.createSequentialGroup()
                                .addComponent(RubahPdfButton)
                                .addGap(72, 72, 72))))))
        );
        PenawaranPanelLayout.setVerticalGroup(
            PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PenawaranPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PenawaranPanelLayout.createSequentialGroup()
                        .addComponent(ComboBoxNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jmlhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButtonTmbh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRbh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonHps)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PenawaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelST, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(TampilSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RubahPdfButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        KontenPanel.add(PenawaranPanel, "card2");

        BarangPanel.setBackground(new java.awt.Color(255, 102, 102));
        BarangPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        barangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Material", "Ukuran", "Harga Satuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        barangTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barangTableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(barangTable);

        NamaTextField.setText("NAMA");
        NamaTextField.setToolTipText("NAMA");

        MaterialTextField.setText("MATERIAL");
        MaterialTextField.setToolTipText("MATERIAL");

        UkuranTextField.setText("UKURAN");
        UkuranTextField.setToolTipText("UKURAN");

        HargaSatuanTextField.setText("HARGA SATUAN");
        HargaSatuanTextField.setToolTipText("HARGA SATUAN");
        HargaSatuanTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HargaSatuanTextFieldKeyTyped(evt);
            }
        });

        TambahButton.setText("Tambah");
        TambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahButtonActionPerformed(evt);
            }
        });

        RubahButton.setText("Rubah");
        RubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RubahButtonActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarangPanelLayout = new javax.swing.GroupLayout(BarangPanel);
        BarangPanel.setLayout(BarangPanelLayout);
        BarangPanelLayout.setHorizontalGroup(
            BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NamaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addComponent(MaterialTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UkuranTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HargaSatuanTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(BarangPanelLayout.createSequentialGroup()
                        .addComponent(TambahButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RubahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarangPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnRefresh)
                        .addContainerGap(311, Short.MAX_VALUE))
                    .addGroup(BarangPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        BarangPanelLayout.setVerticalGroup(
            BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BarangPanelLayout.createSequentialGroup()
                        .addComponent(NamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MaterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UkuranTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HargaSatuanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TambahButton)
                            .addComponent(RubahButton)
                            .addComponent(HapusButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        KontenPanel.add(BarangPanel, "card3");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KontenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KontenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(MainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PenawaranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenawaranButtonActionPerformed
        // TODO add your handling code here:
        brg.TampilCombo();
        KontenPanel.removeAll();
        KontenPanel.repaint();
        KontenPanel.revalidate();
        //add panel
        KontenPanel.add(PenawaranPanel);
        KontenPanel.repaint();
        KontenPanel.revalidate();
    }//GEN-LAST:event_PenawaranButtonActionPerformed

    private void BarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangButtonActionPerformed
        // TODO add your handling code here:
        ComboBoxNama.removeAllItems();
        KontenPanel.removeAll();
        KontenPanel.repaint();
        KontenPanel.revalidate();
        //add panel
        KontenPanel.add(BarangPanel);
        KontenPanel.repaint();
        KontenPanel.revalidate();
    }//GEN-LAST:event_BarangButtonActionPerformed

    private void barangTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangTableMouseClicked
        // TODO add your handling code here:
        brg.tabelKlik();
    }//GEN-LAST:event_barangTableMouseClicked

    private void barangTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangTableMouseReleased
        // TODO add your handling code here:
        brg.tabelKlik();
    }//GEN-LAST:event_barangTableMouseReleased

    private void HargaSatuanTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HargaSatuanTextFieldKeyTyped
        // TODO add your handling code here:
        brg.hanyaNomor(evt);
    }//GEN-LAST:event_HargaSatuanTextFieldKeyTyped

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahButtonActionPerformed
        // TODO add your handling code here:
        brg.tambah();
    }//GEN-LAST:event_TambahButtonActionPerformed

    private void RubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RubahButtonActionPerformed
        // TODO add your handling code here:
        brg.edit();
    }//GEN-LAST:event_RubahButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        // TODO add your handling code here:
        brg.hapus();
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        brg.muatData();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BarangButton;
    private javax.swing.JPanel BarangPanel;
    private javax.swing.JComboBox<String> ComboBoxMaterial;
    private javax.swing.JComboBox<String> ComboBoxNama;
    private javax.swing.JComboBox<String> ComboBoxUkuran;
    private javax.swing.JButton HapusButton;
    private javax.swing.JTextField HargaSatuanTextField;
    private javax.swing.JPanel KontenPanel;
    private javax.swing.JLabel LabelST;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField MaterialTextField;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JTextField NamaTextField;
    private javax.swing.JButton PenawaranButton;
    private javax.swing.JPanel PenawaranPanel;
    private javax.swing.JButton RubahButton;
    private javax.swing.JButton RubahPdfButton;
    private javax.swing.JTable TablePenawaran;
    private javax.swing.JButton TambahButton;
    private javax.swing.JLabel TampilSubTotal;
    private javax.swing.JTextField UkuranTextField;
    private javax.swing.JTable barangTable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTextField hargaTxt;
    private javax.swing.JButton jButtonHps;
    private javax.swing.JButton jButtonRbh;
    private javax.swing.JButton jButtonTmbh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jmlhTxt;
    // End of variables declaration//GEN-END:variables
}
