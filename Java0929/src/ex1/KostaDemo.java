package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


/**
 * @author kosta
 * Document  : KostaDemo Created on :2014. 9. 29, ���� 3:57:07
 */
public class KostaDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        int num = 0;
        String sub, writer, kcontent =null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("����̹� �ε� ����");
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "kosta86";
        String pass = "new14";
        con = DriverManager.getConnection(url,user,pass);
            System.out.println("connection ȹ��"+con);
        StringBuffer sql = new StringBuffer();
            System.out.println(num);
            System.out.println("Sub :");
            sub = sc.nextLine();
             System.out.println("Writer :");
            writer = sc.nextLine();
             System.out.println("rcontent :");
            kcontent = sc.nextLine();
        
        sql.append("insert into kosta86 values(");
        sql.append("kosta86_seq.nextval,?,?,?,sysdate)");
        pstm = con.prepareStatement(sql.toString());
        pstm.setString(1, "msg1");
        pstm.setString(2, "msg2");
        pstm.setString(3, "msg3");
        pstm.executeUpdate();
        
        // Connection ȹ��
        } catch (ClassNotFoundException ex) {
            System.out.println("�ε� ����");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ ����");
            ex.printStackTrace();
        }
    }
}
