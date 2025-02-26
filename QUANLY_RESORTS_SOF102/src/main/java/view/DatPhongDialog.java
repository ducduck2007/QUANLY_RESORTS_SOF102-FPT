/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Phong;
import services.PhongDal;

/**
 *
 * @author Admin
 */
public class DatPhongDialog extends javax.swing.JDialog {

    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form DatPhongDialog
     */
    public DatPhongDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initTable();
        fill();
    }

    public void initTable() {
        String[] cols = new String[]{"Mã phòng", "Số phòng", "Loại phòng", "Giá phòng"};
        tableModel.setColumnIdentifiers(cols);
        tblDatphong.setModel(tableModel);
    }

    public void fill() {
        tableModel.setRowCount(0);
        PhongDal pDal = new PhongDal();
        List<Phong> list = pDal.findAll();
        for (Phong phong : list) {
            tableModel.addRow(new Object[]{phong.getMaP(), phong.getSoP(), phong.getLoaiP(), phong.getGiaP()});
        }
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
        txtSearch = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSophong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboLoai = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnCapthat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatphong = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Quản Lý Đặt Phòng");

        jLabel2.setText("Tìm kiếm");

        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã phòng");

        jLabel4.setText("Số phòng");

        jLabel5.setText("Loại phòng");

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng thường", "Phòng VIP", "Phòng tổng thống" }));

        jLabel6.setText("Giá phòng");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapthat.setText("Cập nhật trạng thái");
        btnCapthat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapthatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        tblDatphong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Số phòng", "Loại phòng", "Giá Phòng"
            }
        ));
        tblDatphong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatphongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatphong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLammoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSophong, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCapthat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSophong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapthat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLammoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMa.getText().equals("")) {
            sb.append("Xin nhập mã phòng\n");
        }
        if (txtSophong.getText().equals("")) {
            sb.append("Xin nhập số phòng\n");
        } else {
            try {
                int soP = Integer.parseInt(txtSophong.getText());
            } catch (Exception e) {
                sb.append("Số phòng không được nhập chữ\n");
            }
        }
        if (txtGia.getText().equals("")) {
            sb.append("Xin nhập giá\n");
        } else {
            try {
                float giaP = Float.parseFloat(txtGia.getText());
            } catch (Exception e) {
                sb.append("Giá không được nhập chữ\n");
            }
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }

        Phong p = new Phong();
        p.setMaP(txtMa.getText());
        int soP = Integer.parseInt(txtSophong.getText());
        p.setSoP(soP);
        p.setLoaiP(String.valueOf(cboLoai.getSelectedItem()));
        float giaP = Float.parseFloat(txtGia.getText());
        p.setGiaP(giaP);

        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không ?");
        if (choice == JOptionPane.YES_OPTION) {
            try {
                PhongDal pDal = new PhongDal();
                if (pDal.insert(p)) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        fill();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapthatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapthatActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMa.getText().equals("")) {
            sb.append("Xin nhập mã phòng\n");
        }
        if (txtSophong.getText().equals("")) {
            sb.append("Xin nhập số phòng\n");
        } else {
            try {
                int soP = Integer.parseInt(txtSophong.getText());
            } catch (Exception e) {
                sb.append("Số phòng không được nhập chữ\n");
            }
        }
        if (txtGia.getText().equals("")) {
            sb.append("Xin nhập giá\n");
        } else {
            try {
                float giaP = Float.parseFloat(txtGia.getText());
            } catch (Exception e) {
                sb.append("Giá không được nhập chữ\n");
            }
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }

        Phong p = new Phong();
        p.setMaP(txtMa.getText());
        int soP = Integer.parseInt(txtSophong.getText());
        p.setSoP(soP);
        p.setLoaiP(String.valueOf(cboLoai.getSelectedItem()));
        float giaP = Float.parseFloat(txtGia.getText());
        p.setGiaP(giaP);

        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhập không ?");
        if (choice == JOptionPane.YES_OPTION) {
            try {
                PhongDal pDal = new PhongDal();
                if (pDal.update(p)) {
                    JOptionPane.showMessageDialog(this, "Cập nhập thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhập thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        fill();
    }//GEN-LAST:event_btnCapthatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMa.getText().equals("")) {
            sb.append("Xin nhập mã phòng\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }

        try {
            PhongDal pDal = new PhongDal();
            if (pDal.delete(txtMa.getText())) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        fill();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtSearch.getText().equals("")) {
            sb.append("Xin nhập mã phòng vào textbox tìm kiếm\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
        try {
            PhongDal pDal = new PhongDal();
            Phong p = pDal.findId(txtSearch.getText());

            txtMa.setText(p.getMaP());
            txtSophong.setText(String.valueOf(p.getSoP()));
            cboLoai.setSelectedItem(p.getLoaiP());
            txtGia.setText(String.valueOf(p.getGiaP()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtSophong.setText("");
        cboLoai.setSelectedIndex(0);
        txtGia.setText("");
        txtSearch.setText("");
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void tblDatphongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatphongMouseClicked
        // TODO add your handling code here:
        int row = tblDatphong.getSelectedRow();
        if (row >= 0) {
            String maP = (String) tblDatphong.getValueAt(row, 0);
            try {
                PhongDal pDal = new PhongDal();
                Phong p = pDal.findId(maP);

                txtMa.setText(p.getMaP());
                txtSophong.setText(String.valueOf(p.getSoP()));
                cboLoai.setSelectedItem(p.getLoaiP());
                txtGia.setText(String.valueOf(p.getGiaP()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tblDatphongMouseClicked

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
            java.util.logging.Logger.getLogger(DatPhongDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatPhongDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatPhongDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatPhongDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatPhongDialog dialog = new DatPhongDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapthat;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatphong;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSophong;
    // End of variables declaration//GEN-END:variables
}
