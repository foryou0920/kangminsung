package ex1;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.html.ListView;
import oracle.jdbc.driver.OracleDriver;

public class MyMember extends javax.swing.JFrame {

    // 1. 카드레이아웃 객체를 선언
    private CardLayout card;
    private Insert_Member im;
    private Connection con;
    private PreparedStatement pstm;

    public MyMember() {
        initComponents();
        card = (CardLayout) pp.getLayout();
        // 2. 카드레이아웃을 
        im = new Insert_Member();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        join = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pwd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        birth = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        rlist = new javax.swing.JButton();
        mlist = new javax.swing.JPanel();
        seachcombo = new javax.swing.JComboBox();
        searchValue = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listview = new javax.swing.JTextArea();

        jTextField2.setText("jTextField2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setLayout(new java.awt.CardLayout());

        join.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("        아이디");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jButton1.setText("중복검사");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("     비밀번호");

        jLabel3.setText("           이름");

        jLabel5.setText("     생년월일");

        jLabel6.setText("        이메일");

        save.setText("가입");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        rlist.setText("LIST");
        rlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout joinLayout = new javax.swing.GroupLayout(join);
        join.setLayout(joinLayout);
        joinLayout.setHorizontalGroup(
            joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(joinLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(birth)
                            .addComponent(email)
                            .addGroup(joinLayout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 112, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(pwd))
                            .addComponent(rlist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        joinLayout.setVerticalGroup(
            joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(rlist))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        pp.add(join, "c1");

        mlist.setBackground(new java.awt.Color(153, 255, 102));

        seachcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=선택=", "이름", "이메일", "아이디" }));

        searchBtn.setText("검색");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        listview.setColumns(20);
        listview.setRows(5);
        jScrollPane1.setViewportView(listview);

        javax.swing.GroupLayout mlistLayout = new javax.swing.GroupLayout(mlist);
        mlist.setLayout(mlistLayout);
        mlistLayout.setHorizontalGroup(
            mlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mlistLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(seachcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        mlistLayout.setVerticalGroup(
            mlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mlistLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seachcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pp.add(mlist, "c2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        im.setId(id.getText().trim());
        im.setPwd(pwd.getText().trim());
        im.setName(name.getText().trim());
        im.setBirth(birth.getText().trim());
        im.setEmail(email.getText().trim());
        im.execute();


    }//GEN-LAST:event_saveActionPerformed

    private void rlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlistActionPerformed
        card.show(pp, "c2");
    }//GEN-LAST:event_rlistActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idv = id.getText().trim();
        int resNum = findIdResult(idv);
        String msg = "";
        if (resNum > 0) {
            msg = "이미 존재하는 아이디 입니다.";
            JOptionPane.showMessageDialog(this, msg);
            id.setText("");
            id.requestFocus(); // 포커스이동 

        } else {
            msg = "사용가능한 아이디 입니다.";
            JOptionPane.showMessageDialog(this, msg);
            pwd.requestFocus();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String sv = searchValue.getText().trim();
        String type = seachcombo.getSelectedItem().toString().trim();
        String st = "";
        if (type.equals("이름")) {
            st = "rnmame";
        } else if (type.equals("이메일")) {
            st = "email";

        } else if (type.equals("아이디")) {
            st = "rid";
        }
        getSeach(sv, st);


    }//GEN-LAST:event_searchBtnActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MyMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birth;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel join;
    private javax.swing.JTextArea listview;
    private javax.swing.JPanel mlist;
    private javax.swing.JTextField name;
    private javax.swing.JPanel pp;
    private javax.swing.JTextField pwd;
    private javax.swing.JButton rlist;
    private javax.swing.JButton save;
    private javax.swing.JComboBox seachcombo;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchValue;
    // End of variables declaration//GEN-END:variables

    // 아이디 중복검사를 위한 메서드
    public int findIdResult(String idv) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection con = null;

        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        int resN = 0;
        try {
            con = DriverManager.getConnection(url, user, pass);
            StringBuffer sql = new StringBuffer();
            sql.append("select count(*) con from member ");
            sql.append("where rid=?");
            
            pstm = con.prepareStatement(sql.toString());
            pstm.setString(1, idv);
            rs = pstm.executeQuery();
            if (rs.next()) {
                resN = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resN;

    }

    public void getList() {
        Connection con = null;
        ResultSet rs = null;
        try {
            // 1. 데이터베이스를 접속하기 위한 드라이버 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 접속 성공");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            StringBuffer sql = new StringBuffer();
            sql.append("select * from member");
            
            pstm = con.prepareStatement(sql.toString());
            rs = pstm.executeQuery();
            while (rs.next()) {
                // num / rid / pwd / rname / birth / email / rdate
                listview.append("번호" + rs.getInt("num") + "\n");
                listview.append("아이디" + rs.getString("rid") + "\n");
                listview.append("이름" + rs.getString("rname") + "\n");
                listview.append("생일" + rs.getString("birth") + "\n");
                listview.append("이메일" + rs.getString("email") + "\n");
                listview.append("날짜" + rs.getString("rdate") + "\n");
                listview.append("------------------------------------");

            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    // sv: 검색값 st : 검색타입을 넘겨받는다 
    public void getSeach(String sv, String st) {
        System.out.println(sv + "," + st);
         Connection con = null;
       ResultSet rs = null;
        try {
            // 1. 데이터베이스를 접속하기 위한 드라이버 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 접속 성공");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            StringBuffer sql = new StringBuffer();
            sql.append("select * from member order by num desc");
            sql.append("where" ).append(st)
            pstm = con.prepareStatement(sql.toString());
            rs = pstm.executeQuery(); 
            while (rs.next()){
                // num / rid / pwd / rname / birth / email / rdate
                listview.append("번호" + rs.getInt("num") + "\n");
                listview.append("아이디" + rs.getString("rid") + "\n");
                listview.append("이름" + rs.getString("rname") + "\n");
                listview.append("생일" + rs.getString("birth") + "\n");
                listview.append("이메일" + rs.getString("email") + "\n");
                listview.append("날짜" + rs.getString("rdate") + "\n");
                listview.append("------------------------------------");

            }
            

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    }
}
