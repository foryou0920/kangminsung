
package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            // 1ojbc�� ���� driver�ε�.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� ���� ����");
            // 2 connection ȹ��
            // TNS ��Ʈ�����Ӱ� �����ؾ��� 
            // <host> : <prot>/ <service_name> , or a SQL * net name-value pass
           String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
           String user = "myman";
           String pass = "new09";
           con = DriverManager.getConnection(url, user, pass);
           // 3. SQL�� �ۼ�!
           //num > member_seq.nextVal - ���������̺��� ��ȣ����
           //rid.rpw,rname,BIRTH,EMAIL
           //RDATE -> sysdate �ڵ����� ���糯¥ -> 5��
           StringBuffer sql = new StringBuffer();
           sql.append("insert into member values(");
           sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
           
           // 4. PreparedStatement ��ü�� ����ؼ� ������ ����
           pstm = con.prepareStatement(sql.toString());
           pstm.setString(1, "xman");
           pstm.setString(2, "xman00");
           pstm.setString(3, "��浿");
           pstm.setString(4, "20000909");
           pstm.setString(5, "aa@a.com");
           pstm.executeUpdate(); // insert.delete.update�϶� ���

        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ ����: ");
            ex.printStackTrace();
        }
        
    }

}
