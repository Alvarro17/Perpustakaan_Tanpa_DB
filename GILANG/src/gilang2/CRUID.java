/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gilang2;
import gilang2.register;
import com.sun.glass.events.KeyEvent;
import com.sun.javafx.scene.control.skin.TableRowSkin;
import com.sun.jmx.remote.util.EnvHelp;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JCalendar;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import gilang2.About;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JTable;
import static jdk.nashorn.internal.objects.Global.print;
import sun.awt.AWTAccessor;
import static sun.misc.Version.print;
import static sun.misc.Version.print;
import gilang2.Struck;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.Locale;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.Timer;

/**
 *
 * @author 41varro
 */
public class CRUID extends javax.swing.JFrame {

    
    
    static String a,b,c;
    
    
      

    public CRUID() {
        initComponents();
        
        
        showDate();
        showTime();
        ActionListener AS = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=asw.getText();
               b=a.substring(0,1);
               c=a.substring(1, a.length());
               asw.setText(c+b);  
            }
        };new javax.swing.Timer(200, AS).start();
        
        
    }void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        TANGGAL.setText(s.format(d));
    }
    void showTime(){
        new Timer (0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        WAKTU.setText(s.format(d));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CLOSE = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        TANGGAL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        WAKTU = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        asw = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tjumlahawal = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tnisn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tselisih = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tnobuku = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        thapus = new javax.swing.JButton();
        tsimpan = new javax.swing.JButton();
        thapus1 = new javax.swing.JButton();
        tedit = new javax.swing.JButton();
        tcetak = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tsearch = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ttgl1 = new com.toedter.calendar.JCalendar();
        ttgl2 = new com.toedter.calendar.JCalendar();
        jLabel17 = new javax.swing.JLabel();
        txt_nu = new javax.swing.JTextField();
        tjudulbuku1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbuku = new javax.swing.JTable();
        txt_judul = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelclone = new javax.swing.JTable();
        cari1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JUDULBUKU = new javax.swing.JTextField();
        NOBUKU = new javax.swing.JTextField();
        NORAK = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(65, 158, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 55, 48));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("SMK NEGERI 1 AMPELGADING");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("PERPUSTAKAAN");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        CLOSE.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 255, 255));
        CLOSE.setBorderPainted(false);
        CLOSE.setContentAreaFilled(false);
        CLOSE.setFocusPainted(false);
        CLOSE.setFocusable(false);
        CLOSE.setLabel("X");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPanel5.add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, -1, 140));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("-");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jl.Klampis Ireng RT 02 RW 01 Tirtomarto Telp (0341) 851307");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 388, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Website:www.smknsagjatim.sch.id Email:smkn1ampelgadingjatim@gmail.com");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/LOGOSMK.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 140));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1320, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("TANGGAL :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 719, -1, 20));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TANGGAL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TANGGAL.setText("TANGGAL");
        jPanel8.add(TANGGAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 85, 20));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 719, 90, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WAKTU.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WAKTU.setText("WAKTU");
        jPanel2.add(WAKTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 85, 20));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 719, 90, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("JAM : ");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 719, -1, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/admin-user-icon.gif"))); // NOI18N
        jLabel22.setText("ADMIN");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 720, -1, 20));

        asw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        asw.setForeground(java.awt.Color.white);
        asw.setText(" HALLO ADMIN....  SELAMAT DATANG DI PROGRAM PERPUSTAKAAN SMK NEGERI 1 AMPELGADING                                                            ");
        jPanel3.add(asw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 719, 840, 20));

        jScrollPane3.setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NAMA :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 89, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NISN :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        tjumlahawal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tjumlahawalKeyTyped(evt);
            }
        });
        jPanel1.add(tjumlahawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 384, 34));

        tnama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tnama.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tnamaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tnama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tnamaFocusGained(evt);
            }
        });
        tnama.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tnamaInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });
        tnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnamaKeyTyped(evt);
            }
        });
        jPanel1.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 432, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TANGGAL PINJAM :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        tnisn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tnisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnisnActionPerformed(evt);
            }
        });
        tnisn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnisnKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnisnKeyTyped(evt);
            }
        });
        jPanel1.add(tnisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 432, 39));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TANGGAL KEMBALI : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 137, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("JUMLAH BUKU :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("SELISIH TANGGAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 137, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("PINJAM & KEMBALI:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 137, -1));

        tselisih.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tselisih.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tselisihAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tselisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tselisihActionPerformed(evt);
            }
        });
        tselisih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tselisihKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tselisihKeyTyped(evt);
            }
        });
        jPanel1.add(tselisih, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 270, 42));

        jButton1.setBackground(java.awt.Color.gray);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/perpanjangan_waktu.png"))); // NOI18N
        jButton1.setText("KONVERSI");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, -1, -1));

        tnobuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnobukuActionPerformed(evt);
            }
        });
        tnobuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnobukuKeyTyped(evt);
            }
        });
        jPanel1.add(tnobuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 384, 36));

        tbl1.setAutoCreateRowSorter(true);
        tbl1.setBackground(new java.awt.Color(204, 204, 204));
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NISN", "TANGGAL PINJAM", "TANGGAL KEMBALI", "LAMA PINJAM", "JUDUL BUKU", "JUMLAH BUKU"
            }
        ));
        tbl1.setGridColor(new java.awt.Color(204, 204, 204));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        tbl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbl1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 710, 1300, 109));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("NOMER RAK :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 100, 191));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thapus.setBackground(new java.awt.Color(255, 55, 48));
        thapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thapus.setForeground(new java.awt.Color(255, 255, 255));
        thapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/MetroUI_CCleaner.png"))); // NOI18N
        thapus.setText("HAPUS TABEL");
        thapus.setFocusPainted(false);
        thapus.setIconTextGap(1);
        thapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thapusActionPerformed(evt);
            }
        });
        thapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thapusKeyTyped(evt);
            }
        });
        jPanel4.add(thapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, -1, 60));

        tsimpan.setBackground(new java.awt.Color(240, 255, 255));
        tsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/Save-icon.png"))); // NOI18N
        tsimpan.setText("SIMPAN");
        tsimpan.setFocusPainted(false);
        tsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsimpanActionPerformed(evt);
            }
        });
        jPanel4.add(tsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 11, -1, -1));

        thapus1.setBackground(new java.awt.Color(240, 255, 255));
        thapus1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/unnamed.png"))); // NOI18N
        thapus1.setText("HAPUS");
        thapus1.setFocusPainted(false);
        thapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thapus1ActionPerformed(evt);
            }
        });
        jPanel4.add(thapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 11, -1, -1));

        tedit.setBackground(new java.awt.Color(240, 255, 255));
        tedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/refresh.png"))); // NOI18N
        tedit.setText("UPDATE");
        tedit.setFocusPainted(false);
        tedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teditActionPerformed(evt);
            }
        });
        jPanel4.add(tedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        tcetak.setBackground(new java.awt.Color(240, 255, 255));
        tcetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tcetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/printer-icon.png"))); // NOI18N
        tcetak.setText("PRINT");
        tcetak.setFocusPainted(false);
        tcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcetakActionPerformed(evt);
            }
        });
        jPanel4.add(tcetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 11, -1, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CARI  :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 27, -1, 28));

        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });
        tsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearchKeyReleased(evt);
            }
        });
        jPanel4.add(tsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 28, 185, 28));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/active-search-2-512.png"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1224, 11, -1, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1300, 80));

        ttgl1.setBackground(new java.awt.Color(0, 100, 191));
        ttgl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ttgl1KeyPressed(evt);
            }
        });
        jPanel1.add(ttgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 430, 210));

        ttgl2.setBackground(new java.awt.Color(0, 100, 191));
        ttgl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ttgl2KeyPressed(evt);
            }
        });
        jPanel1.add(ttgl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 430, 210));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("NOMER BUKU :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, 18));

        txt_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nuActionPerformed(evt);
            }
        });
        txt_nu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nuKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 384, 36));

        tjudulbuku1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tjudulbuku1KeyTyped(evt);
            }
        });
        jPanel1.add(tjudulbuku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 384, 37));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("JUDUL BUKU :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(65, 158, 221));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("CARI BUKU :");

        tblbuku.setAutoCreateRowSorter(true);
        tblbuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "Adobe", "A1"},
                {"002", "Blender", "B1"},
                {"003", "Camtasia", "C1"},
                {"004", "Maya", "M1"},
                {"005", "Perakitan Komputer", "P1"},
                {"006", "Pemrograman Berorientasi Object", "P2"},
                {"007", "Pemrograman Web", "P3"},
                {"008", "Photosop", "P3"},
                {"009", "Simulasi Digital", "S1"},
                {"010", "Sistem Operasi", "S2"}
            },
            new String [] {
                "No Buku", "Judul Buku", "No Rak"
            }
        ));
        tblbuku.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblbukuAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblbuku);

        txt_judul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_judulKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_judulKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel13.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jTabbedPane1.addTab("CARI BUKU", jPanel6);

        jPanel7.setBackground(new java.awt.Color(65, 158, 221));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelclone.setAutoCreateRowSorter(true);
        tabelclone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelclone.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelcloneAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelclone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelcloneMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelclone);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 276, 91));

        cari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cari1KeyReleased(evt);
            }
        });
        jPanel7.add(cari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 276, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("CARI BUKU :");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("NOMER BUKU :");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 161, -1, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("JUDUL BUKU :");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 201, -1, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("NOMER RAK :");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 244, -1, 20));
        jPanel7.add(JUDULBUKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 276, 29));
        jPanel7.add(NOBUKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 276, 30));
        jPanel7.add(NORAK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 276, 29));

        jButton3.setBackground(new java.awt.Color(19, 227, 91));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/Save-icon.png"))); // NOI18N
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, 70));

        jButton4.setBackground(java.awt.Color.white);
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/unnamed.png"))); // NOI18N
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, 70));

        jButton5.setBackground(new java.awt.Color(130, 220, 222));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/refresh.png"))); // NOI18N
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 80, 70));

        jTabbedPane1.addTab("EDIT DATA BUKU", jPanel7);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 520, 320));

        jScrollPane3.setViewportView(jPanel1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 1315, 540));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu2.setBackground(new java.awt.Color(50, 44, 44));
        jMenu2.setForeground(new java.awt.Color(50, 44, 44));
        jMenu2.setText("Home");

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/printer-icon.png"))); // NOI18N
        jMenuItem11.setText("Print Bukti Peminjaman");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/printer-icon.png"))); // NOI18N
        jMenuItem6.setText("Print Tabel");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/MINIMAZE.png"))); // NOI18N
        jMenuItem7.setText("Minimize");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/CLOSE.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/admin-user-icon.gif"))); // NOI18N
        jMenuItem15.setText("Logout Account");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(121, 212, 41));
        jMenu4.setForeground(new java.awt.Color(50, 44, 44));
        jMenu4.setText("Edit Data Pinjam");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/MetroUI_CCleaner.png"))); // NOI18N
        jMenuItem1.setText("Hapus Tabel");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/unnamed.png"))); // NOI18N
        jMenuItem4.setText("Hapus");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/refresh.png"))); // NOI18N
        jMenuItem9.setText("Update");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/perpanjangan_waktu.png"))); // NOI18N
        jMenuItem5.setText("Konversi");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/Save-icon.png"))); // NOI18N
        jMenuItem3.setText("Simpan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(50, 44, 44));
        jMenu5.setText("Edit Data Buku");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/Save-icon.png"))); // NOI18N
        jMenuItem10.setText("Simpan");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/unnamed.png"))); // NOI18N
        jMenuItem13.setText("Hapus");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/refresh.png"))); // NOI18N
        jMenuItem14.setText("Update");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        jMenu3.setBackground(new java.awt.Color(121, 212, 41));
        jMenu3.setForeground(new java.awt.Color(50, 44, 44));
        jMenu3.setText("Info");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/admin-user-icon.gif"))); // NOI18N
        jMenuItem8.setText("Tentang Programer");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/KEY.png"))); // NOI18N
        jMenuItem12.setText("Keyboard Shortcut");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconTools1/ABOUTME.png"))); // NOI18N
        jMenuItem16.setText("Bantuan");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1369, 766);
    }// </editor-fold>//GEN-END:initComponents

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Mau Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (ok == 0){
                    System.exit(0);
                }
                    
    }//GEN-LAST:event_CLOSEActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(CRUID.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            tbl1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CRUID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            DefaultTableModel dataModel = (DefaultTableModel) tbl1.getModel();
            if (tbl1.getRowCount() > 0) {
                for (int i = tbl1.getRowCount() - 1; i > -1; i--) {
                    dataModel.removeRow(i);
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();

        DefaultTableModel dataModel = (DefaultTableModel) tbl1.getModel();
        if(tnama.getText().equals("")){
         JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
           tnama.requestFocus();
       }else if(tnisn.getText().equals("")){
           JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
           tnisn.requestFocus();
         }else if(tselisih.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
         tselisih.requestFocus();
            }else if(tjudulbuku1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"SILAHKAN ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
          tjudulbuku1.requestFocus(); 
            }else if(tjumlahawal.getText().equals("")){
          JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
           tjumlahawal.requestFocus();
            }
           else{
         try{ 
        List list = new ArrayList<>();
        tbl1.setAutoCreateColumnsFromModel(true);
        list.add(tnama.getText());
        list.add(tnisn.getText());
        list.add(date1);
        list.add(date);
        list.add(tselisih.getText());
        list.add(tjudulbuku1.getText());
        list.add(tjumlahawal.getText());
        dataModel.addRow(list.toArray());
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }catch(Exception e){     
        JOptionPane.showMessageDialog(null, e);
        }finally{
    tnama.setText("");
    tnisn.setText("");
    tselisih.setText("");
    tjudulbuku1.setText("");
    tjumlahawal.setText("");
    tselisih.setText("");
    txt_nu.setText("");
    tnobuku.setText("");
    txt_judul.setText("");
    tsearch.setText("");
    }
            }   
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        int row = tbl1.getSelectedRow();
        if (row >= 0) {
            int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                model.removeRow(row);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
          SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model2 = (DefaultTableModel) tbl1.getModel();

        int i = tbl1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        if (i >= 0) {
            model.setValueAt(tnama.getText(), i, 0);
            model.setValueAt(tnisn.getText(), i, 1);
            model.setValueAt(date1, i, 2);
            model.setValueAt(date, i, 3);
            model.setValueAt(tselisih.getText(), i, 4);
            model.setValueAt(tjudulbuku1.getText(), i, 5);
            model.setValueAt(tjumlahawal.getText(), i, 6);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        try {
            //TglS = tanggal pertama
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            String tanggal1 = String.valueOf(date.format(ttgl1.getDate()));
            Date TglS = (Date) date.parse(tanggal1);
            //TglD = tanggal kedua
            String tanggal2 = String.valueOf(date.format(ttgl2.getDate()));
            Date TglD = (Date) date.parse(tanggal2);
            long Telat = Math.abs(TglD.getTime() - TglS.getTime());

            tselisih.setText("" + TimeUnit.MILLISECONDS.toDays(Telat) + " hari");
        } catch (HeadlessException | ParseException e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
          this.setState(CRUID.ICONIFIED);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        About INFO = new About ();
        INFO.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
 SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model2 = (DefaultTableModel) tbl1.getModel();
        
 Struck st = new Struck();
 Struck.TNAMA.setText(this.tnama.getText());
 Struck.TNISN.setText(this.tnisn.getText());
 Struck.TJUDULBUKU.setText(this.tjudulbuku1.getText());
 Struck.TJUMLAHBUKU.setText(this.tjumlahawal.getText());
 Struck.TGL1.setText(date);
 Struck.TGL2.setText(date1);
 
 st.setVisible(true);
 st.pack();
 st.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
      KeyboardShortcut a = new KeyboardShortcut();
      a.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelclone.getModel();
        int row = tabelclone.getSelectedRow();
        if (row >= 0) {
            int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                model.removeRow(row);
            }
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
     DefaultTableModel dataModel = (DefaultTableModel) tblbuku.getModel();
        if(NOBUKU.getText().equals("")){
         JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
          NOBUKU.requestFocus();
        }else if(JUDULBUKU.getText().equals("")){
           JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
           JUDULBUKU.requestFocus();
        }else if(NORAK.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
         NORAK.requestFocus();
           }
         
        else{
        try{ 
        List list = new ArrayList<>();
        tblbuku.setAutoCreateColumnsFromModel(true);
        list.add(NOBUKU.getText());
        list.add(JUDULBUKU.getText());
        list.add(NORAK.getText());
        dataModel.addRow(list.toArray());
        JOptionPane.showMessageDialog(null, "Data Buku Berhasil Disimpan");
        }catch(Exception e){     
        JOptionPane.showMessageDialog(null, e);
        }finally{
    NOBUKU.setText("");
    JUDULBUKU.setText("");
    NORAK.setText("");
    
    }
            }   
       
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      Login a = new Login();
      a.setVisible(true);
      dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    DefaultTableModel model = (DefaultTableModel) tabelclone.getModel();
        int i = tabelclone.getSelectedRow();
        if (i >= 0) {
            model.setValueAt(NOBUKU.getText(), i, 0);
            model.setValueAt(JUDULBUKU.getText(), i, 1);
            model.setValueAt(NORAK.getText(), i, 2);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
Bantuan b = new Bantuan();
b.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelclone.getModel();
        int i = tabelclone.getSelectedRow();
        if (i >= 0) {
            model.setValueAt(NOBUKU.getText(), i, 0);
            model.setValueAt(JUDULBUKU.getText(), i, 1);
            model.setValueAt(NORAK.getText(), i, 2);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelclone.getModel();
        int row = tabelclone.getSelectedRow();
        if (row >= 0) {
            int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                model.removeRow(row);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dataModel = (DefaultTableModel) tblbuku.getModel();
        if(NOBUKU.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            NOBUKU.requestFocus();
        }else if(JUDULBUKU.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            JUDULBUKU.requestFocus();
        }else if(NORAK.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            NORAK.requestFocus();
        }

        else{
            try{
                List list = new ArrayList<>();
                tblbuku.setAutoCreateColumnsFromModel(true);
                list.add(NOBUKU.getText());
                list.add(JUDULBUKU.getText());
                list.add(NORAK.getText());
                dataModel.addRow(list.toArray());
                JOptionPane.showMessageDialog(null, "Data Buku Berhasil Disimpan");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                NOBUKU.setText("");
                JUDULBUKU.setText("");
                NORAK.setText("");

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cari1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari1KeyReleased
        DefaultTableModel table = (DefaultTableModel) tblbuku.getModel();

        String Search = cari1.getText().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tabelclone.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_cari1KeyReleased

    private void tabelcloneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelcloneMouseClicked
        if(tabelclone.getRowCount()>0){
            NOBUKU.setText(tabelclone.getValueAt(tabelclone.getSelectedRow(), 0).toString());
            JUDULBUKU.setText(tabelclone.getValueAt(tabelclone.getSelectedRow(), 1).toString());
            NORAK.setText (tabelclone.getValueAt(tabelclone.getSelectedRow(),2).toString());

        }
    }//GEN-LAST:event_tabelcloneMouseClicked

    private void tabelcloneAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelcloneAncestorAdded
        tabelclone.setModel(tblbuku.getModel());
    }//GEN-LAST:event_tabelcloneAncestorAdded

    private void txt_judulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_judulKeyReleased

        DefaultTableModel table = (DefaultTableModel) tblbuku.getModel();

        String Search = txt_judul.getText().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tblbuku.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_txt_judulKeyReleased

    private void txt_judulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_judulKeyPressed
        if(evt.getKeyCode()==10)
        {tjumlahawal.requestFocus();
        }
    }//GEN-LAST:event_txt_judulKeyPressed

    private void tblbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbukuMouseClicked
        if(tblbuku.getRowCount()>0){
            tnobuku.setText(tblbuku.getValueAt(tblbuku.getSelectedRow(), 0).toString());
            tjudulbuku1.setText(tblbuku.getValueAt(tblbuku.getSelectedRow(), 1).toString());
            txt_nu.setText (tblbuku.getValueAt(tblbuku.getSelectedRow(),2).toString());

        }
    }//GEN-LAST:event_tblbukuMouseClicked

    private void tblbukuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblbukuAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblbukuAncestorAdded

    private void tjudulbuku1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tjudulbuku1KeyTyped
        double nilai = evt.getKeyChar();
        double nilai1 = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
            evt.consume();
            getToolkit().beep();
        } else if ((nilai >= '0') && (nilai <= '9') || (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
        }
        if (Character.isDigit(evt.getKeyChar())) {
        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tjudulbuku1KeyTyped

    private void txt_nuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nuKeyTyped
        double nilai = evt.getKeyChar();
        double nilai1 = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
            evt.consume();
            getToolkit().beep();
        } else if ((nilai >= '0') && (nilai <= '9') || (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
        }
        if (Character.isDigit(evt.getKeyChar())) {
        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nuKeyTyped

    private void txt_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nuActionPerformed

    private void ttgl2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttgl2KeyPressed
        if(evt.getKeyCode()==10)
        {tselisih.requestFocus();
        }
    }//GEN-LAST:event_ttgl2KeyPressed

    private void ttgl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttgl1KeyPressed
        if(evt.getKeyCode()==10)
        {ttgl2.requestFocus();
        }
    }//GEN-LAST:event_ttgl1KeyPressed

    private void tsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearchKeyReleased

        DefaultTableModel table = (DefaultTableModel) tbl1.getModel();

        String Search = tsearch.getText().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tbl1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_tsearchKeyReleased

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchActionPerformed

    private void tcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcetakActionPerformed
        SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model2 = (DefaultTableModel) tbl1.getModel();

        Struck st = new Struck();
        Struck.TNAMA.setText(this.tnama.getText());
        Struck.TNISN.setText(this.tnisn.getText());
        Struck.TJUDULBUKU.setText(this.tjudulbuku1.getText());
        Struck.TJUMLAHBUKU.setText(this.tjumlahawal.getText());
        Struck.TGL1.setText(date);
        Struck.TGL2.setText(date1);

        st.setVisible(true);
        st.pack();
        st.setLocationRelativeTo(null);
    }//GEN-LAST:event_tcetakActionPerformed

    private void teditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teditActionPerformed
        SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model2 = (DefaultTableModel) tbl1.getModel();

        int i = tbl1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        if (i >= 0) {
            model.setValueAt(tnama.getText(), i, 0);
            model.setValueAt(tnisn.getText(), i, 1);
            model.setValueAt(date1, i, 2);
            model.setValueAt(date, i, 3);
            model.setValueAt(tselisih.getText(), i, 4);
            model.setValueAt(tjudulbuku1.getText(), i, 5);
            model.setValueAt(tjumlahawal.getText(), i, 6);
        }
    }//GEN-LAST:event_teditActionPerformed

    private void thapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thapus1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        int row = tbl1.getSelectedRow();
        if (row != -1) {
            int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                model.removeRow(row);
            }
        }
    }//GEN-LAST:event_thapus1ActionPerformed

    private void tsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsimpanActionPerformed

        SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();

        DefaultTableModel dataModel = (DefaultTableModel) tbl1.getModel();
        if(tnama.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            tnama.requestFocus();
        }else if(tnisn.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            tnisn.requestFocus();
        }else if(tselisih.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            tselisih.requestFocus();
        }else if(tjudulbuku1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"SILAHKAN ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            tjudulbuku1.requestFocus();
        }else if(tjumlahawal.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ADA DATA YANG MASIH KOSONG ","pesan error",JOptionPane.WARNING_MESSAGE);
            tjumlahawal.requestFocus();
        }
        else{
            try{
                List list = new ArrayList<>();
                tbl1.setAutoCreateColumnsFromModel(true);
                list.add(tnama.getText());
                list.add(tnisn.getText());
                list.add(date1);
                list.add(date);
                list.add(tselisih.getText());
                list.add(tjudulbuku1.getText());
                list.add(tjumlahawal.getText());
                dataModel.addRow(list.toArray());
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                tnama.setText("");
                tnisn.setText("");
                tselisih.setText("");
                tjudulbuku1.setText("");
                tjumlahawal.setText("");
                tselisih.setText("");
                txt_nu.setText("");
                tnobuku.setText("");
                txt_judul.setText("");
                tsearch.setText("");
            }
        }

    }//GEN-LAST:event_tsimpanActionPerformed

    private void thapusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thapusKeyTyped
        DefaultTableModel dataModel = (DefaultTableModel) tbl1.getModel();
        if (tbl1.getRowCount() > 0) {
            for (int i = tbl1.getRowCount() - 1; i > -1; i--) {
                dataModel.removeRow(i);

                int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (ok == 0) {
                }
            }
        }
    }//GEN-LAST:event_thapusKeyTyped

    private void thapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Yakin Mau Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            DefaultTableModel dataModel = (DefaultTableModel) tbl1.getModel();
            if (tbl1.getRowCount() > 0) {
                for (int i = tbl1.getRowCount() - 1; i > -1; i--) {
                    dataModel.removeRow(i);
                }
            }
        }
    }//GEN-LAST:event_thapusActionPerformed

    private void tbl1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl1KeyTyped

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        SimpleDateFormat format_tanggal = new SimpleDateFormat("dd/MM/yyyy");
        String date = format_tanggal.format(ttgl2.getDate());
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        String date1 = format_tanggal.format(ttgl1.getDate());
        DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();

        if(tbl1.getRowCount()>0){

            tnama.setText(tbl1.getValueAt(tbl1.getSelectedRow(), 0).toString());
            tnisn.setText(tbl1.getValueAt(tbl1.getSelectedRow(), 1).toString());
            tselisih.setText(tbl1.getValueAt(tbl1.getSelectedRow(), 4).toString());
            tjudulbuku1.setText(tbl1.getValueAt(tbl1.getSelectedRow(), 5).toString());
            tjumlahawal.setText(tbl1.getValueAt(tbl1.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tbl1MouseClicked

    private void tnobukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnobukuKeyTyped
        double nilai = evt.getKeyChar();
        double nilai1 = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
            evt.consume();
            getToolkit().beep();
        } else if ((nilai >= '0') && (nilai <= '9') || (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
        }
        if (Character.isDigit(evt.getKeyChar())) {
        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tnobukuKeyTyped

    private void tnobukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnobukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnobukuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            //TglS = tanggal pertama
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            String tanggal1 = String.valueOf(date.format(ttgl1.getDate()));
            Date TglS = (Date) date.parse(tanggal1);
            //TglD = tanggal kedua
            String tanggal2 = String.valueOf(date.format(ttgl2.getDate()));
            Date TglD = (Date) date.parse(tanggal2);
            long Telat = Math.abs(TglD.getTime() - TglS.getTime());

            tselisih.setText("" + TimeUnit.MILLISECONDS.toDays(Telat) + " hari");
        } catch (HeadlessException | ParseException e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tselisihKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tselisihKeyTyped

        double nilai = evt.getKeyChar();
        double nilai1 = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            getToolkit().beep();
        } else if ((nilai >= '0') && (nilai <= '9') || (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
        }
        if (Character.isDigit(evt.getKeyChar())) {
        } else {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_tselisihKeyTyped

    private void tselisihKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tselisihKeyPressed
        if(evt.getKeyCode()==10)
        {txt_judul.requestFocus();
        }
    }//GEN-LAST:event_tselisihKeyPressed

    private void tselisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tselisihActionPerformed

    }//GEN-LAST:event_tselisihActionPerformed

    private void tselisihAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tselisihAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tselisihAncestorAdded

    private void tnisnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnisnKeyTyped
        if (tnisn.getText().length() >= 10) {
            evt.consume();
        }

        double nilai = evt.getKeyChar();
        if ((nilai >= '0') && (nilai <= '9') || (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tnisnKeyTyped

    private void tnisnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnisnKeyPressed
        if(evt.getKeyCode()==10)
        {ttgl1.requestFocus();
        }
    }//GEN-LAST:event_tnisnKeyPressed

    private void tnisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnisnActionPerformed

    private void tnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnamaKeyTyped
        if (tnama.getText().length() >= 50) {
            evt.consume();
        }

        String as = "!@#$%^&*(){}?<>[]\'|;.';'.;'./+=-_`!:;~,1234567890";
        String a = "\"\\";
        String huruf = as + a;

        int idex = huruf.indexOf(evt.getKeyChar());
        double nilai = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            getToolkit().beep();
        } else if (idex >= 0) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_tnamaKeyTyped

    private void tnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnamaKeyPressed
        if(evt.getKeyCode()==10)
        {tnisn.requestFocus();
        }

    }//GEN-LAST:event_tnamaKeyPressed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed

    }//GEN-LAST:event_tnamaActionPerformed

    private void tnamaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tnamaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaInputMethodTextChanged

    private void tnamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnamaFocusGained

    }//GEN-LAST:event_tnamaFocusGained

    private void tnamaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tnamaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaAncestorMoved

    private void tjumlahawalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tjumlahawalKeyTyped
        if (tjumlahawal.getText().length() >= 10) {
            evt.consume();
        }

        double nilai = evt.getKeyChar();
        if ((nilai >= '0') && (nilai <= '9') || (nilai == KeyEvent.VK_BACKSPACE) || (nilai == KeyEvent.VK_DELETE)) {
        } else {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tjumlahawalKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 try{
          JFXPanel k= new JFXPanel();
      String uri = new File("WIN.mp3").toURI().toString();
      new MediaPlayer(new Media(uri)).play();
      //JOptionPane.showMessageDialog(null, uri);
    }                                        
catch(Exception ex){  
            JOptionPane.showMessageDialog(null, ex);
        }                       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CRUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JTextField JUDULBUKU;
    private javax.swing.JTextField NOBUKU;
    private javax.swing.JTextField NORAK;
    private javax.swing.JLabel TANGGAL;
    private javax.swing.JLabel WAKTU;
    private javax.swing.JLabel asw;
    private javax.swing.JTextField cari1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelclone;
    private javax.swing.JTable tbl1;
    public javax.swing.JTable tblbuku;
    private javax.swing.JButton tcetak;
    private javax.swing.JButton tedit;
    private javax.swing.JButton thapus;
    private javax.swing.JButton thapus1;
    private javax.swing.JTextField tjudulbuku1;
    private javax.swing.JTextField tjumlahawal;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnisn;
    private javax.swing.JTextField tnobuku;
    private javax.swing.JTextField tsearch;
    private javax.swing.JTextField tselisih;
    private javax.swing.JButton tsimpan;
    private com.toedter.calendar.JCalendar ttgl1;
    private com.toedter.calendar.JCalendar ttgl2;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_nu;
    // End of variables declaration//GEN-END:variables
}
