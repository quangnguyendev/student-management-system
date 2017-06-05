/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonHoc;

import Check.Check;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class frmMonHoc extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbmthi;
    private ArrayList<MonHoc> list;

    /**
     * Creates new form frmMonHoc
     */
    public frmMonHoc() {
        initComponents();
        dcbmthi = new DefaultComboBoxModel();

        dtm = new DefaultTableModel();

        dcbmthi.addElement("Thi Tự Luận");
        dcbmthi.addElement("Thi Thực Hành");
        dcbmthi.addElement("Thi Trắc Nghiệm");
        jcbThi.setModel(dcbmthi);

        dtm.addColumn("Mã MH");
        dtm.addColumn("Tên MH");
        dtm.addColumn("Số Trình");
        dtm.addColumn("Hình Thức Thi");
        dtm.addColumn("Học Kỳ");
        dtm.addColumn("Phòng Học");

        loaddata();
    }

    private void loaddata() {
        try {

            IMonHocDAO monHocDAO = (IMonHocDAO) Class.forName("MonHoc.MonHocDAO").newInstance();
            list = new MonHocDAO().getAll();
            for (MonHoc mh : list) {
                dtm.addRow(toObjectsData(mh));
            }
            jtbMonHoc.setModel(dtm);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object[] toObjectsData(MonHoc hoc) {
        Object[] objectsData = {hoc.getMamh(), hoc.getTenmh(), hoc.getSotrinh(), hoc.getHinhthucthi(), hoc.getHocky(), hoc.getPhonghoc()};
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
        jtnMonHoc = new javax.swing.JScrollPane();
        jtbMonHoc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jbNew = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfMaMH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPhongHoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTenMH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtffhocky = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfSoTrinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbThi = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(51, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setPreferredSize(new java.awt.Dimension(863, 372));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN MÔN HỌC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jtnMonHoc.setBackground(new java.awt.Color(51, 255, 255));
        jtnMonHoc.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jtbMonHoc = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        jtbMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Môn Học", "Tên Môn Học", "Số Trình ", "Hình Thức Thi", "Học Kỳ ", "Phòng Học"
            }
        ));
        jtbMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbMonHocMouseClicked(evt);
            }
        });
        jtnMonHoc.setViewportView(jtbMonHoc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtnMonHoc)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtnMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        jbNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbNew.setForeground(new java.awt.Color(0, 51, 255));
        jbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/login.png"))); // NOI18N
        jbNew.setText("AddNew");
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });
        jPanel4.add(jbNew);

        jbUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbUpdate.setForeground(new java.awt.Color(0, 204, 204));
        jbUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save.png"))); // NOI18N
        jbUpdate.setText("Update");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jbUpdate);

        jbDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbDelete.setForeground(new java.awt.Color(255, 51, 51));
        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Remove.png"))); // NOI18N
        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jbDelete);

        jbExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbExit.setForeground(new java.awt.Color(102, 255, 255));
        jbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset.png"))); // NOI18N
        jbExit.setText("Reset");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jPanel4.add(jbExit);

        jPanel5.setBackground(new java.awt.Color(51, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel5.setLayout(new java.awt.GridLayout(3, 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Môn Học");
        jPanel5.add(jLabel2);
        jPanel5.add(jtfMaMH);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phòng Học");
        jPanel5.add(jLabel3);
        jPanel5.add(jtfPhongHoc);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tên Môn Học");
        jPanel5.add(jLabel4);
        jPanel5.add(jtfTenMH);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kỳ Học ");
        jPanel5.add(jLabel6);
        jPanel5.add(jtffhocky);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Số Trình");
        jPanel5.add(jLabel5);

        jtfSoTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoTrinhActionPerformed(evt);
            }
        });
        jPanel5.add(jtfSoTrinh);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hình Thức Thi");
        jPanel5.add(jLabel7);

        jcbThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbThiActionPerformed(evt);
            }
        });
        jPanel5.add(jcbThi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtbMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbMonHocMouseClicked
        // TODO add your handling code here:
        jtfMaMH.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 0).toString());
        jtfTenMH.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 1).toString());
        jtfSoTrinh.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 2).toString());
        jcbThi.setSelectedItem(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 3).toString());
        jtffhocky.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 4).toString());
        jtfPhongHoc.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 5).toString());

        jbNew.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        jtfMaMH.setEnabled(false);
    }//GEN-LAST:event_jtbMonHocMouseClicked

    private void jtfSoTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoTrinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoTrinhActionPerformed

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        // TODO add your handling code here:
        String maMH = jtfMaMH.getText();
        String tenMH = jtfTenMH.getText();
        String soTrinh = jtfSoTrinh.getText();
        String htThi = (String) jcbThi.getSelectedItem();
        String hocKy = jtffhocky.getText();
        String phongHoc = jtfPhongHoc.getText();
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }

        int strinh;
        strinh = Integer.parseInt(soTrinh);
        int hky;
        hky = Integer.parseInt(hocKy);

        MonHoc monHoc = new MonHoc(maMH, strinh, tenMH, htThi, hky, phongHoc);
        ArrayList<MonHoc> listCheck = new MonHocDAO().CheckID(maMH);
        if (listCheck.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã ID bị trùng", "vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            jtfMaMH.setText("");
            jtfMaMH.requestFocus();
        } else {
            MonHoc insert = new MonHocDAO().addNew(monHoc);
            if (insert != null) {
                showAll();
            }
        }
    }//GEN-LAST:event_jbNewActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        // TODO add your handling code here:
        String maMH = jtfMaMH.getText();
        String tenMH = jtfTenMH.getText();
        String soTrinh = jtfSoTrinh.getText();
        String htThi = (String) jcbThi.getSelectedItem();
        String hocKy = jtffhocky.getText();
        String phongHoc = jtfPhongHoc.getText();
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }

        int strinh;
        strinh = Integer.parseInt(soTrinh);
        int hky;
        hky = Integer.parseInt(hocKy);
        MonHoc monHoc = new MonHoc(maMH, strinh, tenMH, htThi, hky, phongHoc);
        MonHoc update = new MonHocDAO().updateByID(monHoc);
        if (update != null) {
            showAll();
        }
        jbNew.setEnabled(true);
        jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        jtfMaMH.setEnabled(true);
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        String maMh = jtfMaMH.getText();
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                new MonHocDAO().delMonHoc(maMh);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, có tồn tại điểm của môn này, hãy xóa dữ liệu điểm trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, có tồn tại điểm của môn này, hãy xóa dữ liệu điểm trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            loaddata();
            jbNew.setEnabled(true);
            jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
            jtfMaMH.setEnabled(true);
        }
    }//GEN-LAST:event_jbDeleteActionPerformed
    private void showAll() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        ArrayList<MonHoc> hocs = new MonHocDAO().getAll();
        for (MonHoc mh : hocs) {
            Vector v = new Vector();
            v.add(mh.getMamh());
            v.add(mh.getTenmh());
            v.add(mh.getSotrinh());
            v.add(mh.getHinhthucthi());
            v.add(mh.getHocky());
            v.add(mh.getPhonghoc());

            dtm.addRow(v);
        }
        resetForm();
        // jtfthi.setText("");
    }

    public void resetForm() {
        jtfMaMH.setText("");
        jtfTenMH.setText("");
        jtfPhongHoc.setText("");
        jtfSoTrinh.setText("");
        jtffhocky.setText("");
        jtfMaMH.requestFocus();
    }

    public boolean checkinfo() {
        Check c = new Check();
        if (!c.checkID(jtfMaMH.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập mã sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfMaMH.setText("");
            jtfMaMH.requestFocus();
            return false;
        } else if (!c.checkSpace(jtfTenMH.getText()) || !c.check(jtfTenMH.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập tên môn học sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfTenMH.setText("");
            jtfTenMH.requestFocus();
            return false;

        } else if (!c.checkSpace(jtfSoTrinh.getText()) || !c.checkNumber(jtfSoTrinh.getText())) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại số trình", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfSoTrinh.setText("");
            jtfSoTrinh.requestFocus();
            return false;
        } else if (!c.checkSpace(jtffhocky.getText()) || !c.checkNumber(jtffhocky.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập sai học kỳ phải là số", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtffhocky.setText("");
            jtffhocky.requestFocus();
            return false;
        } else if (!c.checkSpace(jtfPhongHoc.getText()) || !c.check(jtfPhongHoc.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập tên phòng học sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfPhongHoc.setText("");
            jtfPhongHoc.requestFocus();
            return false;

        }
        return true;
    }
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
        this.resetForm();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jcbThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbThiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbThiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox jcbThi;
    private javax.swing.JTable jtbMonHoc;
    private javax.swing.JTextField jtfMaMH;
    private javax.swing.JTextField jtfPhongHoc;
    private javax.swing.JTextField jtfSoTrinh;
    private javax.swing.JTextField jtfTenMH;
    private javax.swing.JTextField jtffhocky;
    private javax.swing.JScrollPane jtnMonHoc;
    // End of variables declaration//GEN-END:variables
}
