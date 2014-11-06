package ex_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author youngsub.lee Document : insertDemo Created on : 2014. 9. 29, 오후
 * 2:14:37
 */
public class InsertDemo {

    public static void main(String[] args) throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null; // 연결해주는 객체
        try {
            // 1. ojdbc로 부터 Driver로딩!
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩성공!");
            // 2. Connection 획득!
            // 
            // tnsnames.ora에 (SERVICE_NAME = pdborcl) 과 같아야한다!
            String url = "jdbc:oracle:thin:@localhost:1522/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            
            // 3. SQL문 작성!
            StringBuffer sql = new StringBuffer();
            // num -> member_seq.nextVal = 시퀀스 테이블의 번호 증가
            // RID, RPWD, RNAME, BIRTH, EMAIL - 5개 순서대로 바인딩 지정
            // RDATE -> sysdate 자동으로 현재 날짜
            // insert 작업시 변수값이 바인딩될 것 까지 포함해서 값을 지정할 수 있다.
            sql.append("insert into member values(");
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
            
            // 4. PreparedStatement 객체를 사용해서 Query를 전송
            pstm = con.prepareStatement(sql.toString());
            
            // 5. 바인딩을 사용해서 전송된 쿼리에게 값을 전송
            pstm.setString(1, "xman");
            pstm.setString(2, "xman00");
            pstm.setString(3, "이영섭");
            pstm.setString(4, "2000909");
            pstm.setString(5, "aa@a.com");
            pstm.executeUpdate(); // insert, delete, update일경우 사용!
            
        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩실패!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러발생 : ");
            ex.printStackTrace();
        }
    }
}
