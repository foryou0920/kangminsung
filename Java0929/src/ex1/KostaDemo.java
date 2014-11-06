package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


/**
 * @author kosta
 * Document  : KostaDemo Created on :2014. 9. 29, 오후 3:57:07
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
        System.out.println("드라이버 로딩 성공");
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "kosta86";
        String pass = "new14";
        con = DriverManager.getConnection(url,user,pass);
            System.out.println("connection 획득"+con);
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
        
        // Connection 획득
        } catch (ClassNotFoundException ex) {
            System.out.println("로딩 실패");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러");
            ex.printStackTrace();
        }
    }
}
