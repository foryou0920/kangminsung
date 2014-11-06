package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kosta
 * Document  : SelectDemo Created on :2014. 9. 29, ���� 5:16:05
 */
public class SelectDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null; // Oracle�� select �� cursor�� �ޱ� ���� ��ü
        try {
            //�ڷḦ ����
          Class.forName("Oracle.jdbc.driver.OracleDriver");
           String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        con = DriverManager.getConnection(url, user, pass);
        // select * from table: *�÷��� ��ȸ�ϴ� ����� �־ ���� 
        StringBuffer sql = new StringBuffer();
        sql.append("select num.rid,rname, email,birth,rdate from member");
         //�������� desc 1- num // �ֽ�ȸ�� , �������� - asc
        sql.append(" order by 1 desc");
        // ���� ����
        pstm = con.prepareStatement(sql.toString());
        // Cursor �����ޱ����� �޼��� ȣ��
        rs = pstm.executeQuery();
        // �������� Ŀ���� ����ؼ� ������ ���
        //rs.next�� Ŀ���� ���� ��� true
        while (rs.next()){
            // rs.getXX("�÷���ȣ || �÷���");
            System.out.println("��ȣ" + rs.getInt("num"));
            System.out.println("���̵� : " +rs.getString("rid"));
            System.out.println("�̸�"  + rs.getString("rname"));
            System.out.println("�̸���"  +rs.getString("email"));
            System.out.println("������" + rs.getString("rdate"));
            System.out.println("============================================");
            
        }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            try {
                if(rs != null)rs.close();
                if(pstm != null)pstm.close();
                if(con != null)con.close();
            } catch (SQLException ex) {
            }
        }
    }
}
