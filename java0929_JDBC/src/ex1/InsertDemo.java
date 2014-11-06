
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
            // 1ojbc로 부터 driver로딩.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 접속 성공");
            // 2 connection 획득
            // TNS 엔트리네임과 동일해야함 
            // <host> : <prot>/ <service_name> , or a SQL * net name-value pass
           String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
           String user = "myman";
           String pass = "new09";
           con = DriverManager.getConnection(url, user, pass);
           // 3. SQL문 작성!
           //num > member_seq.nextVal - 시퀀스테이블의 번호증가
           //rid.rpw,rname,BIRTH,EMAIL
           //RDATE -> sysdate 자동으로 현재날짜 -> 5개
           StringBuffer sql = new StringBuffer();
           sql.append("insert into member values(");
           sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
           
           // 4. PreparedStatement 객체를 사용해서 쿼리를 전송
           pstm = con.prepareStatement(sql.toString());
           pstm.setString(1, "xman");
           pstm.setString(2, "xman00");
           pstm.setString(3, "김길동");
           pstm.setString(4, "20000909");
           pstm.setString(5, "aa@a.com");
           pstm.executeUpdate(); // insert.delete.update일때 사용

        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러: ");
            ex.printStackTrace();
        }
        
    }

}
