package demo_program;
import java.awt.*;
import java.awt.event.*;
import net.proteanit.sql.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class formambil extends javax.swing.JFrame {
Connection conn=null;
    ResultSet rs =null;
    PreparedStatement pst=null;
    private DefaultTableModel tabmode;

    public formambil() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
        datatable();
    }
    private void clear(){
        txt_noform.setText("");
        txt_kode.setText("");
        txt_namat.setText("");
        txt_ket.setText("");
        txt_prior.setText("");
        txt_nip.setText("");
        txt_namap.setText("");
        txt_divisi.setText("");
    }
    private void Update_table(){
        try{
        String sql ="select * from formambil";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tabel_ambil.setModel(DbUtils.resultSetToTableModel(rs));
        datatable();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void datatable(){
        Object[] Baris = {"Nomor Form","Kode Tugas","Nama Tugas","Keterangan","Prioritas","Nomor Induk Pegawai","Nama Pegawai","Divisi"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel_ambil.setModel(tabmode);
        String sql = "select * from formambil";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String a = hasil.getString("no_form");
                String b = hasil.getString("kd_tgs");
                String c = hasil.getString("nm_tgs");
                String d = hasil.getString("ket_tgs");
                String e = hasil.getString("prior");
                String f = hasil.getString("nip");
                String g = hasil.getString("nm_peg");
                String h = hasil.getString("divisi");
                               
                String[] data = {a,b,c,d,e,f,g,h};
                tabmode.addRow(data);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_ambil = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bersihkan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_noform = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txt_namat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ket = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_prior = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        txt_nip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_namap = new javax.swing.JTextField();
        txt_divisi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_ambil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_ambil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_ambilMouseClicked(evt);
            }
        });
        tabel_ambil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabel_ambilKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_ambil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 1150, 130));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        save.setBackground(new java.awt.Color(51, 0, 204));
        save.setFont(new java.awt.Font("Tropical Asian DEMO", 0, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/save.png"))); // NOI18N
        save.setText("Simpan");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 0, 204));
        jButton5.setFont(new java.awt.Font("Tropical Asian DEMO", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kembali.png"))); // NOI18N
        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bersihkan.setBackground(new java.awt.Color(51, 0, 204));
        bersihkan.setFont(new java.awt.Font("Tropical Asian DEMO", 0, 18)); // NOI18N
        bersihkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/clear.png"))); // NOI18N
        bersihkan.setText("Bersihkan");
        bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkanActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(51, 0, 204));
        hapus.setFont(new java.awt.Font("Tropical Asian DEMO", 0, 18)); // NOI18N
        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/delete.png"))); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bersihkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 240, 130));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FORM PENGAMBILAN TUGAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel1.add(txt_noform, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, -1));

        jLabel2.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Tugas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));
        jPanel1.add(txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 100, -1));

        jButton6.setText("Cari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));
        jPanel1.add(txt_namat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 157, -1));

        jLabel3.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Tugas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Keterangan Tugas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        txt_ket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ketActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ket, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 157, -1));

        jLabel6.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prioritas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));
        jPanel1.add(txt_prior, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 157, -1));

        jButton7.setText("Cari");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));
        jPanel1.add(txt_nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 100, -1));

        jLabel7.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nomor Induk Pegawai");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama Pegawai");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Happy Lucky", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Divisi");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));
        jPanel1.add(txt_namap, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 157, -1));
        jPanel1.add(txt_divisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 157, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 890, 170));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo protonema2.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/formambilbg.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, -670, -1, -1));

        setSize(new java.awt.Dimension(1213, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ketActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String sql ="select * from tugas where kd_tgs = '"+txt_kode.getText()+"'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nm_tgs");
                String b = hasil.getString("ket_tgs");
                String c = hasil.getString("prior");
                                
                txt_namat.setText(a);
                txt_ket.setText(b);
                txt_prior.setText(c);
                                
                txt_namat.setEnabled(false);
                txt_ket.setEnabled(false);
                txt_prior.setEnabled(false);
                
              }
        }catch (Exception e){}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         String sql ="select * from pegawai where nip = '"+txt_nip.getText()+"'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String d = hasil.getString("nm_peg");
                String e = hasil.getString("divisi");
                                
                txt_namap.setText(d);
                txt_divisi.setText(e);
                                
                txt_namat.setEnabled(false);
                txt_divisi.setEnabled(false);
                
              }
        }catch (Exception e){}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tabel_ambilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabel_ambilKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP);
        try{
            int row =tabel_ambil.getSelectedRow();
            String Table_click=(tabel_ambil.getModel().getValueAt(row, 0).toString());
            String sql="select * from formambil where no_form='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
            String add1 =rs.getString("no_form");
            txt_noform.setText(add1);
            String add2 =rs.getString("kd_tgs");
            txt_kode.setText(add2);
            String add3 =rs.getString("nm_tgs");
            txt_namat.setText(add3);
            String add4 =rs.getString("ket_tgs");
            txt_ket.setText(add4);
            String add5 =rs.getString("prior");
            txt_prior.setText(add5);
            String add6 =rs.getString("nip");
            txt_nip.setText(add6);
            String add7 =rs.getString("nm_peg");
            txt_namap.setText(add7);
            String add8 =rs.getString("divisi");
            txt_divisi.setText(add8);
                                    
        }
        } catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabel_ambilKeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            String sql ="insert into formambil (no_form,kd_tgs,nm_tgs,ket_tgs,prior,nip,nm_peg,divisi) values (?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_noform.getText());
            pst.setString(2, txt_kode.getText());
            pst.setString(3, txt_namat.getText());
            pst.setString(4, txt_ket.getText());
            pst.setString(5, txt_prior.getText());
            pst.setString(6, txt_nip.getText());
            pst.setString(7, txt_namap.getText());
            pst.setString(8, txt_divisi.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Tersimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        clear();
        Update_table();
    }//GEN-LAST:event_saveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Menu s = new Menu();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanActionPerformed
        clear();
    }//GEN-LAST:event_bersihkanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int row =tabel_ambil.getSelectedRow();
        int p = JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin?","Terhapus",JOptionPane.YES_NO_OPTION);
        if(p==0){
            String Table_click=(tabel_ambil.getModel().getValueAt(row, 0).toString());
            String sql="delete from formambil where no_form='"+Table_click+"'";
            try {
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Terhapus");

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            clear();
            Update_table();
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tabel_ambilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_ambilMouseClicked
        DefaultTableModel tabmode=(DefaultTableModel)tabel_ambil.getModel();
        int bar = tabel_ambil.getSelectedRow();   
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
                
        txt_noform.setText(a);
        txt_kode.setText(b);
        txt_namat.setText(c);
        txt_ket.setText(d);
        txt_prior.setText(e);
        txt_nip.setText(f);
        txt_namap.setText(g);
        txt_divisi.setText(h);
    }//GEN-LAST:event_tabel_ambilMouseClicked

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
            java.util.logging.Logger.getLogger(formambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formambil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersihkan;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel_ambil;
    private javax.swing.JTextField txt_divisi;
    private javax.swing.JTextField txt_ket;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_namap;
    private javax.swing.JTextField txt_namat;
    private javax.swing.JTextField txt_nip;
    private javax.swing.JTextField txt_noform;
    private javax.swing.JTextField txt_prior;
    // End of variables declaration//GEN-END:variables
}