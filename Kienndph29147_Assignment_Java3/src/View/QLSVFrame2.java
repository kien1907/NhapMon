/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.StudentFpoly;
import Service.StudentFpolyService;
import java.awt.HeadlessException;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QLSVFrame2 extends javax.swing.JFrame {

    private StudentFpolyService studentFpolyService = new StudentFpolyService();
    private  File imageFile = new File("anh/chandung.png");
    public QLSVFrame2() {
        initComponents();

        ImageIcon add = new ImageIcon("anh/add.png");
        ImageIcon save = new ImageIcon("anh/save.png");
        ImageIcon delete = new ImageIcon("anh/delete.png");
        ImageIcon update = new ImageIcon("anh/update.png");

        ImageIcon chanDung = new ImageIcon("anh/chandung.png");

        this.btnSave.setIcon(save);
        this.btnadd.setIcon(add);
        this.btndelete.setIcon(delete);
        this.btnUpdate.setIcon(update);
        this.lbimg.setIcon(chanDung);

        this.loadTable();
    }

    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tbl_bang1.getModel();
        dtm.setRowCount(0);
        ArrayList<StudentFpoly> list = this.studentFpolyService.getAllStudentFpolys();
        for (StudentFpoly studentFpoly : list) {
            Object[] row = {
                studentFpoly.getMaSV(),
                studentFpoly.getTen(),
                studentFpoly.geteMail(),
                studentFpoly.getsDT(),
                studentFpoly.getGioiTinh() == 1 ? "nam" : "nữ",
                studentFpoly.getDiaChi(),
                studentFpoly.getTenAnh(),};
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_masv = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        lbimg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_diachi = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bang1 = new javax.swing.JTable();
        cbnam = new javax.swing.JRadioButton();
        cbnu = new javax.swing.JRadioButton();
        txt_sdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("MaSv");

        jLabel3.setText("Họ và Tên");

        jLabel4.setText("Email");

        jLabel5.setText("Giới Tính");

        jLabel6.setText("Địa chỉ");

        txt_masv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_masvActionPerformed(evt);
            }
        });

        lbimg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbimgMouseClicked(evt);
            }
        });

        txt_diachi.setColumns(20);
        txt_diachi.setRows(5);
        jScrollPane1.setViewportView(txt_diachi);

        btnadd.setText("New");
        btnadd.setPreferredSize(new java.awt.Dimension(77, 23));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setMinimumSize(new java.awt.Dimension(77, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tbl_bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSV", "Họ và Tên", "Email", "SDT", "Giới Tính", "Đại Chỉ", "Hình Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_bang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bang1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_bang1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );

        buttonGroup1.add(cbnam);
        cbnam.setText("Nam");

        buttonGroup1.add(cbnu);
        cbnu.setText("Nữ");
        cbnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnuActionPerformed(evt);
            }
        });

        jLabel7.setText("Số ĐT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(31, 31, 31)
                                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_masv, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbnam)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbnu)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(31, 31, 31)
                                        .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbimg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_masv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(lbimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbnu))
                    .addComponent(cbnam))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_masvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_masvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_masvActionPerformed

    private void cbnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = this.tbl_bang1.getSelectedRow();
        if (row == -1) {
            return;
        }
        StudentFpoly sf = this.dataStudentFpoly();
        if (sf == null) {
            return;
        }
        boolean a = this.studentFpolyService.sua(sf);
        if (a==true) {
            JOptionPane.showMessageDialog(this, "thành công");
        }else
            JOptionPane.showMessageDialog(this, "thất bại");
        loadTable();
        clear();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void lbimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbimgMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int a = fileChooser.showOpenDialog(this.getRootPane());
        if (a != JFileChooser.APPROVE_OPTION) {
            return;
        }
         imageFile = fileChooser.getSelectedFile();
        if (imageFile.exists() == false) {
            JOptionPane.showMessageDialog(this, "Không tìm Thây File");
            return ;
        }
        ImageIcon icon = new ImageIcon(this.imageFile.getAbsolutePath());
        this.lbimg.setIcon(icon);
    }//GEN-LAST:event_lbimgMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StudentFpoly sf = this.dataStudentFpoly();
        if (sf == null) {
            return;
        }
        boolean a = this.studentFpolyService.them(sf);
        if (a == true) {
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất bại");
        }

        loadTable();
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbl_bang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bang1MouseClicked
        int row = this.tbl_bang1.getSelectedRow();
        if (row == -1) {
            return;
        }
        String masv = this.tbl_bang1.getValueAt(row, 0).toString();
        String ten = this.tbl_bang1.getValueAt(row, 1).toString();
        String mail = this.tbl_bang1.getValueAt(row, 2).toString();
        String sdt = this.tbl_bang1.getValueAt(row, 3).toString();
        String gt = this.tbl_bang1.getValueAt(row, 4).toString();
        String dc = this.tbl_bang1.getValueAt(row, 5).toString();
        ImageIcon hA = new ImageIcon(this.tbl_bang1.getValueAt(row, 6).toString());

        this.txt_masv.setText(masv);
        this.txt_ten.setText(ten);
        this.txt_mail.setText(mail);
        this.txt_sdt.setText(sdt);
        this.txt_diachi.setText(dc);
        this.lbimg.setIcon(hA);
        if (gt.equals("nam")) {
            this.cbnam.setSelected(true);
        } else {
            this.cbnu.setSelected(true);
        }

    }//GEN-LAST:event_tbl_bang1MouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        this.clear();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int row = this.tbl_bang1.getSelectedRow();
        if (row == -1) {
            return;
        }
        StudentFpoly sf = this.dataStudentFpoly();
        if (sf == null) {
            return;
        }
        boolean a = this.studentFpolyService.xoa(sf);
        int b = JOptionPane.showConfirmDialog(this, "bạn có muốn xóa đối tượng này");
        if (b != JOptionPane.YES_OPTION) {
            return;
        }
        if (a == true) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
        loadTable();
        clear();
    }//GEN-LAST:event_btndeleteActionPerformed
    private void clear() {
        this.txt_masv.setText("");
        this.txt_ten.setText("");
        this.txt_mail.setText("");
        this.txt_sdt.setText("");
        this.txt_diachi.setText("");
        this.lbimg.setIcon(null);
        this.cbnam.setSelected(true);

    }

    private StudentFpoly dataStudentFpoly() {
        String masv = this.txt_masv.getText().trim();
        String ten = this.txt_ten.getText().trim();
        String mail = this.txt_mail.getText().trim();
        String sdt = this.txt_sdt.getText().trim();
        int gioiTinh = this.cbnam.isSelected() ? 1 : 2;
        String diaChi = this.txt_diachi.getText().trim();
        String tenFile = this.imageFile.getAbsolutePath();
        if (vaLiDate(masv, ten, mail, sdt, diaChi)) {
            return null;
        }

        StudentFpoly sf = new StudentFpoly(masv, ten, mail, sdt, gioiTinh, diaChi, tenFile);

        return sf;

    }

    private boolean vaLiDate(String masv, String ten, String mail, String sdt, String diaChi, String tenFile) throws HeadlessException {

        if (masv.trim().length() == 0 || ten.trim().length() == 0
                || mail.trim().length() == 0 || sdt.trim().length() == 0
                || diaChi.trim().length() == 0||tenFile.trim().length()==0) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống !!! 2");
            return true;
        }
        if (sdt.trim().length() != 10) {
            JOptionPane.showMessageDialog(this, "Số Điện thoại chỉ có 10 số");
            return true;
        }
        String regexSDT = "[0-9]+";
        if (!sdt.trim().matches(regexSDT)) {
            JOptionPane.showMessageDialog(this, "Số Điện thoại Không chứa chữ và khí tự đặc biệt");
            return true;
        }
        String regexTen = "([^0-9`~!@#$%^&*?<>/|+=_-]*) ([^0-9`~!@#$%^&*?<>/|+=_-]*)";
        if (!ten.matches(regexTen)) {
            JOptionPane.showMessageDialog(this, "Tên Không chứa số và khí tự đặc biệt");
            return true;
        }
        String regexMail = "^[a-z]+[0-9]+(@{1}fpt\\.edu\\.vn)$";
        if (!mail.matches(regexMail)) {
            JOptionPane.showMessageDialog(this, "Không đúng định dạng Email");
            return true;
        }

        return false;
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
            java.util.logging.Logger.getLogger(QLSVFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cbnam;
    private javax.swing.JRadioButton cbnu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbimg;
    private javax.swing.JTable tbl_bang1;
    private javax.swing.JTextArea txt_diachi;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_masv;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
