/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoVien;

import Check.Check;
import MonHoc.IMonHocDAO;
import MonHoc.MonHoc;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BKHN
 */
public class frmGiaoVien extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbm;
    ArrayList<MonHoc> listmh = null;
    ArrayList<GiaoVien> listgv = null;
    public static String regexDDMMYYYY = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";

    /**
     * Creates new form frmGiaoVien
     */
    public frmGiaoVien() {
        try {
            initComponents();
            dcbm = new DefaultComboBoxModel();
            dtm = new DefaultTableModel();
            IMonHocDAO monHocDAO = (IMonHocDAO) Class.forName("MonHoc.MonHocDAO").newInstance();
            listmh = monHocDAO.getAll();
            for (MonHoc mh : listmh) {
                dcbm.addElement(mh.getMamh());
            }
            jcbgiangday.setModel(dcbm);

            dtm.addColumn("ID Giáo Viên");
            dtm.addColumn("Họ Tên");
            dtm.addColumn("Môn Dạy");
            dtm.addColumn("Ngày Sinh");
            dtm.addColumn("Giới Tính");
            dtm.addColumn("Email");
            dtm.addColumn("Địa Chỉ");
            dtm.addColumn("Số ĐT");
            data();
            // loaddata();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void data() {
        try {
            IGiaoVienDAO giaoVienDAO = (IGiaoVienDAO) Class.forName("GiaoVien.GiaoVienDAO").newInstance();
            listgv = new GiaoVienDAO().getAll();
            for (GiaoVien gv : listgv) {
                dtm.addRow(toObjectsData(gv));
            }
            jtbTTGV.setModel(dtm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static Object[] toObjectsData(GiaoVien gv) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(gv.getNgaysinh());
        boolean flag = gv.isGioitinh();
        String gioitinh = "Nam";
        if (!flag) {
            gioitinh = "Nữ";
        }

        Object[] objectsData = {gv.getMagv(), gv.getHotengv(), gv.getMamh(), date, gioitinh, gv.getEmail(), gv.getDiachi(), gv.getSdt()};
        return objectsData;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTTGV = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfMaGV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfngaysinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jrbsex = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jcbgiangday = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jtfDienThoai = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jbAdd = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setPreferredSize(new java.awt.Dimension(863, 370));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN GIẢNG VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jtbTTGV = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        jtbTTGV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã GV", "Họ Tên", "Môn Dạy", "Ngày Sinh ", "Giới Tính", "Email", "Địa Chỉ", "Số ĐT"
            }
        ));
        jtbTTGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTTGVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbTTGV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel4.setLayout(new java.awt.GridLayout(4, 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Giảng Viên");
        jPanel4.add(jLabel2);

        jtfMaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMaGVActionPerformed(evt);
            }
        });
        jPanel4.add(jtfMaGV);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ngày Sinh");
        jPanel4.add(jLabel3);

        jtfngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfngaysinhActionPerformed(evt);
            }
        });
        jPanel4.add(jtfngaysinh);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Họ Tên");
        jPanel4.add(jLabel4);
        jPanel4.add(jtfHoTen);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Địa Chỉ");
        jPanel4.add(jLabel5);
        jPanel4.add(jtfDiaChi);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email");
        jPanel4.add(jLabel6);
        jPanel4.add(jtfEmail);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Giới Tính");
        jPanel4.add(jLabel7);

        jrbsex.setText("Nam/Nữ");
        jPanel4.add(jrbsex);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Môn Giảng Dạy");
        jPanel4.add(jLabel8);

        jPanel4.add(jcbgiangday);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Điện Thoại");
        jPanel4.add(jLabel9);
        jPanel4.add(jtfDienThoai);

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel5.setLayout(new java.awt.GridLayout(4, 1));

        jbAdd.setBackground(new java.awt.Color(102, 255, 102));
        jbAdd.setForeground(new java.awt.Color(0, 0, 204));
        jbAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/login.png"))); // NOI18N
        jbAdd.setText("AddNew");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });
        jPanel5.add(jbAdd);

        jbUpdate.setBackground(new java.awt.Color(255, 102, 204));
        jbUpdate.setForeground(new java.awt.Color(0, 51, 51));
        jbUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save.png"))); // NOI18N
        jbUpdate.setText("Update");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(jbUpdate);

        jbDelete.setBackground(new java.awt.Color(255, 255, 153));
        jbDelete.setForeground(new java.awt.Color(204, 0, 51));
        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jbDelete);

        jbExit.setBackground(new java.awt.Color(204, 255, 204));
        jbExit.setForeground(new java.awt.Color(0, 51, 0));
        jbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset.png"))); // NOI18N
        jbExit.setText("Reset");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jPanel5.add(jbExit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        // TODO add your handling code here:
        String magv = jtfMaGV.getText();
        String hoten = jtfHoTen.getText();
        String email = jtfEmail.getText();
        String sdt = jtfDienThoai.getText();
        String ngaysinh = jtfngaysinh.getText();
        boolean gioitinh = jrbsex.isSelected();
        String diachi = jtfDiaChi.getText();
        String mamh = listmh.get(jcbgiangday.getSelectedIndex()).getMamh();
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }

        Date d = null;
        if (ngaysinh == null || ngaysinh.equals("") || !ngaysinh.matches(regexDDMMYYYY)) {
            JOptionPane.showMessageDialog(this, "Nhập ngày sinh sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfngaysinh.setText("");
            jtfngaysinh.requestFocus();
            return;
        } else {
            try {
                d = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Nhập ngày sinh sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        GiaoVien giaoVien = new GiaoVien(magv, hoten, d, gioitinh, email, diachi, sdt, mamh);
        ArrayList<GiaoVien> listCheck = new GiaoVienDAO().CheckID(magv);
        if (listCheck.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã ID bị trùng", "vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            jtfMaGV.setText("");
            jtfMaGV.requestFocus();

        } else {
            GiaoVien insert = new GiaoVienDAO().addNew(giaoVien);
            if (insert != null) {
                showAll();
            }
        }

    }//GEN-LAST:event_jbAddActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        // TODO add your handling code here:
        String magv = jtfMaGV.getText();
        String hoten = jtfHoTen.getText();
        String email = jtfEmail.getText();
        String sdt = jtfDienThoai.getText();
        String ngaysinh = jtfngaysinh.getText();
        boolean gioitinh = jrbsex.isSelected();
        String diachi = jtfDiaChi.getText();
        String mamh = listmh.get(jcbgiangday.getSelectedIndex()).getMamh();

        Date d = null;
        if (ngaysinh == null || ngaysinh.equals("") || !ngaysinh.matches(regexDDMMYYYY)) {
            JOptionPane.showMessageDialog(this, "Nhập ngày sinh sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfngaysinh.setText("");
            jtfngaysinh.requestFocus();
            return;
        } else {
            try {
                d = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Nhập ngày sinh sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        GiaoVien giaoVien = new GiaoVien(magv, hoten, d, gioitinh, email, diachi, sdt, mamh);
        GiaoVien update = new GiaoVienDAO().updateByID(giaoVien);
        if (update != null) {
            showAll();
        }
        jbAdd.setEnabled(true);
        jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        jtfMaGV.setEnabled(true);
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {

            String magv = jtfMaGV.getText();
            try {
                new GiaoVienDAO().deleteIDGV(magv);
            } catch (SQLException ex) {
                Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            data();
            jbAdd.setEnabled(true);
            jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
            jtfMaGV.setEnabled(true);
        }

    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:

        this.resetForm();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jtbTTGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTTGVMouseClicked
        // TODO add your handling code here:
        jtfMaGV.setText(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 0).toString());
        jtfHoTen.setText(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 1).toString());
        jcbgiangday.setSelectedItem(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 2).toString());
        jtfngaysinh.setText(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 3).toString());
        String sex = jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 4).toString();
        if (sex.equals("true")) {
            jrbsex.setSelected(true);
        } else {
            jrbsex.setSelected(false);
        }
        jtfEmail.setText(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 5).toString());
        jtfDiaChi.setText(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 6).toString());
        jtfDienThoai.setText(jtbTTGV.getValueAt(jtbTTGV.getSelectedRow(), 7).toString());

        jbAdd.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        jtfMaGV.setEnabled(false);
    }//GEN-LAST:event_jtbTTGVMouseClicked

    private void jtfngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfngaysinhActionPerformed

    private void jtfMaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMaGVActionPerformed
    public boolean checkinfo() {
        Check c = new Check();
        if (!c.checkID(jtfMaGV.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập mã giảng viên sai.", "Vui lòng kiểm tra lại!", JOptionPane.ERROR_MESSAGE);
            jtfMaGV.setText("");
            jtfMaGV.requestFocus();
            return false;
        } else if (!c.checkSpace(jtfHoTen.getText()) || !c.check(jtfHoTen.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập tên sai.", "Vui lòng kiểm tra lại!", JOptionPane.ERROR_MESSAGE);
            jtfHoTen.setText("");
            jtfHoTen.requestFocus();
            return false;

        } else if (!c.checkSpace(jtfEmail.getText()) || !c.check(jtfEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email nhập sai.", "Vui lòng kiểm tra lại!", JOptionPane.ERROR_MESSAGE);
            jtfEmail.setText("");
            jtfEmail.requestFocus();
            return false;

            // } else if (!c.checkSpace(jtfngaysinh.getText()) || !c.check(jtfngaysinh.getText()) || c.checkDate(jtfngaysinh.getText())) {
            //     JOptionPane.showMessageDialog(this, "Nhập ngày sinh sai.", "Vui lòng kiểm tra lại!", JOptionPane.ERROR_MESSAGE);
            //     jtfngaysinh.setText("");
            //     jtfngaysinh.requestFocus();
            //     return false;
        } else if (!c.checkSpace(jtfDiaChi.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập địa chỉ sai", "Vui lòng kiểm tra lại!", JOptionPane.ERROR_MESSAGE);
            jtfDiaChi.setText("");
            jtfDiaChi.requestFocus();
            return false;

        } else if (!c.checkSpace(jtfDienThoai.getText()) || !c.checkPhone(jtfDienThoai.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập số điện thoại sai.", "Vui lòng kiểm tra lại!", JOptionPane.ERROR_MESSAGE);
            jtfDienThoai.setText("");
            jtfDienThoai.requestFocus();
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox jcbgiangday;
    private javax.swing.JRadioButton jrbsex;
    private javax.swing.JTable jtbTTGV;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfDienThoai;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfMaGV;
    private javax.swing.JTextField jtfngaysinh;
    // End of variables declaration//GEN-END:variables

    private void showAll() {

        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        int selectedIndex = jcbgiangday.getSelectedIndex();
        MonHoc getmh = listmh.get(selectedIndex);
        ArrayList<GiaoVien> list = new GiaoVienDAO().findByIDMonHoc(getmh.getMamh());
        for (GiaoVien gv : list) {
            Vector vector = new Vector();
            vector.add(gv.getMagv());
            vector.add(gv.getHotengv());
            vector.add(gv.getMamh());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            vector.add(dateFormat.format(gv.getNgaysinh()));
            if (gv.isGioitinh() == true) {
                vector.add("Nam");
            } else {
                vector.add("Nữ");
            }
            vector.add(gv.getEmail());
            vector.add(gv.getDiachi());
            vector.add(gv.getSdt());
            dtm.addRow(vector);
        }
        resetForm();

    }

    private void resetForm() {

        jtfMaGV.setText("");
        jtfHoTen.setText("");
        jtfEmail.setText("");
        jtfDiaChi.setText("");
        jtfDienThoai.setText("");
        jtfngaysinh.setText("");
        jtfMaGV.requestFocus();

    }
}
