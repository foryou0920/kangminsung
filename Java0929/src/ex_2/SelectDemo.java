package ex_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Cursor;

/**
 * @author youngsub.lee Document : SelectDemo Created on : 2014. 9. 29, ����
 * 5:15:32
 */
public class SelectDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null; // Oracle�� Select�� Cursor�� �ޱ� ���� ��ü
        try {
            // �ڷḦ ����
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1522/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            // select*from table : *Į���� ��ȸ�ϴ� ����� �־ ����
            StringBuffer sql = new StringBuffer();
            sql.append("select num, rname, rid, email, birth, rdate from member");
            sql.append(" order by 1 desc");
            // �������� desc1 = num // �ֽ�ȸ��, �������� = asc
            // ���� ����
            pstm = con.prepareStatement(sql.toString());
            // Cursor�� �����ޱ��� �޼ҵ带 ȣ��
            rs = pstm.executeQuery();
            // �������� Ŀ���� ����ؼ� �����͸� ���
            // rs.next()�� Ŀ���� ���� ��� true
            while (rs.next()) {
                // rs.getXX("�÷���ȣ or �÷���")
                System.out.println("��ȣ : " + rs.getInt("num"));
                System.out.println("�̸� : " + rs.getString("rname"));
                System.out.println("���̵� : " + rs.getString("rid"));
                System.out.println("�̸��� : " + rs.getString("email"));
                System.out.println("������ : " + rs.getString("rdate"));
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
