package ex_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author youngsub.lee Document : insertDemo Created on : 2014. 9. 29, ����
 * 2:14:37
 */
public class InsertDemo {

    public static void main(String[] args) throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null; // �������ִ� ��ü
        try {
            // 1. ojdbc�� ���� Driver�ε�!
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε�����!");
            // 2. Connection ȹ��!
            // 
            // tnsnames.ora�� (SERVICE_NAME = pdborcl) �� ���ƾ��Ѵ�!
            String url = "jdbc:oracle:thin:@localhost:1522/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            
            // 3. SQL�� �ۼ�!
            StringBuffer sql = new StringBuffer();
            // num -> member_seq.nextVal = ������ ���̺��� ��ȣ ����
            // RID, RPWD, RNAME, BIRTH, EMAIL - 5�� ������� ���ε� ����
            // RDATE -> sysdate �ڵ����� ���� ��¥
            // insert �۾��� �������� ���ε��� �� ���� �����ؼ� ���� ������ �� �ִ�.
            sql.append("insert into member values(");
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
            
            // 4. PreparedStatement ��ü�� ����ؼ� Query�� ����
            pstm = con.prepareStatement(sql.toString());
            
            // 5. ���ε��� ����ؼ� ���۵� �������� ���� ����
            pstm.setString(1, "xman");
            pstm.setString(2, "xman00");
            pstm.setString(3, "�̿���");
            pstm.setString(4, "2000909");
            pstm.setString(5, "aa@a.com");
            pstm.executeUpdate(); // insert, delete, update�ϰ�� ���!
            
        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε�����!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ �����߻� : ");
            ex.printStackTrace();
        }
    }
}
