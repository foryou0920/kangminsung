package ex1;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author kosta
 * Document  : InsertDemo Created on :2014. 9. 29, ���� 2:14:37
 */
public class InsertDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
        // 1 object�� ���� Driver �ε�.
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("����̹� �ε� ����");
            // Connection ȹ��
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        con = DriverManager.getConnection(url,user,pass);
        //System.out.println("Connection ȹ��!" + con);
        // 3,SQL�� �ۼ�!
        StringBuffer sql = new StringBuffer();
        // num -> member_seq.nextVal - ������ ���̺��� ��ȣ ����
        // rid.rpwd.rname, Birth, Email - >5�� ���ε� �������
        // Rdate - > sysdate �ڵ����� ���� ��¥
        // insert �۾��� �������� ���ε� �� �� ���� �����ؼ� 
        // ���� ������ �� �ִ�.
                    

        sql.append("insert into member values(");
        sql.append("member_seq.nextval,?,?,?,?,?,sysdate)");
        //4.preparedStatement ��ü�� ����ؼ� ������ ����
        pstm = con.prepareStatement(sql.toString());
        // 5. ���۵� �������� ���� ����
        pstm.setString(1, "xman");
        pstm.setString(2, "xman00");
        pstm.setString(3, "��浿");
        pstm.setString(4, "20000909");
        pstm.setString(5, "aa@a.com");
        pstm.executeUpdate();  //insert, delete, update�� ��� ���
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����");
            ex.printStackTrace();
        }catch (SQLException ex){
            System.out.println("����Ŭ ����");
            ex.printStackTrace();
        }
        
    }
}
