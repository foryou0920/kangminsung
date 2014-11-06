package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author youngsub.lee Document : ExamClass Created on : 2014. 9. 29, 오후
 * 3:58:56
 */
public class ExamClass {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공!");

            String url = "jdbc:oracle:thin:@localhost:1522/pdborcl";
            String user = "kosta88";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);

            StringBuffer sql = new StringBuffer();
            sql.append("insert into board values(");
            sql.append("board_seq.nextVal,?,?,?,sysdate)");

            Scanner sc = new Scanner(System.in);
            System.out.print("sub : ");
            String msg1 = sc.nextLine();
            System.out.print("writter : ");
            String msg2 = sc.nextLine();
            System.out.print("rcontent : ");
            String msg3 = sc.nextLine();
            
            pstm = con.prepareStatement(sql.toString());
            pstm.setString(1, msg1);
            pstm.setString(2, msg2);
            pstm.setString(3, msg3);
            pstm.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩실패!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러발생!");
            ex.printStackTrace();
        }
    }
}