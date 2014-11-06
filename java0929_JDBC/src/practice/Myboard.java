
package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Myboard {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        Scanner sc = new Scanner(System.in);
        try {
            // 1ojbc�� ���� driver�ε�.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� ���� ����");
            // 2 connection ȹ��
            // TNS ��Ʈ�����Ӱ� �����ؾ��� 
            // <host> : <prot>/ <service_name> , or a SQL * net name-value pass
           String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
           String user = "kosta86";
           String pass = "new14";
           con = DriverManager.getConnection(url, user, pass);
           // 3. SQL�� �ۼ�!
           //num > member_seq.nextVal - ���������̺��� ��ȣ����
           //rid.rpw,rname,BIRTH,EMAIL
           //RDATE -> sysdate �ڵ����� ���糯¥ -> 5��
           StringBuffer sql = new StringBuffer();
           sql.append("insert into bord values(");
           sql.append("board_seq.nextVal,?,?,?,sysdate)");
           
           // 4. PreparedStatement ��ü�� ����ؼ� ������ ����
           pstm = con.prepareStatement(sql.toString());
            System.out.print("�����Է�");
           pstm.setString(1, sc.nextLine());
           System.out.print("�ۼ���");
           pstm.setString(2, sc.nextLine());
            System.out.print("�����Է�");
           pstm.setString(3, sc.nextLine());
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

