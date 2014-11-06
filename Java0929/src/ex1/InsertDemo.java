package ex1;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author kosta
 * Document  : InsertDemo Created on :2014. 9. 29, 오후 2:14:37
 */
public class InsertDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
        // 1 object로 부터 Driver 로딩.
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("드라이버 로딩 성공");
            // Connection 획득
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        con = DriverManager.getConnection(url,user,pass);
        //System.out.println("Connection 획득!" + con);
        // 3,SQL문 작성!
        StringBuffer sql = new StringBuffer();
        // num -> member_seq.nextVal - 시퀀스 테이블의 번호 증가
        // rid.rpwd.rname, Birth, Email - >5개 바인딩 순서대로
        // Rdate - > sysdate 자동으로 현재 날짜
        // insert 작업시 변수값이 바인딩 될 것 까지 포함해서 
        // 값을 지정할 수 있다.
                    

        sql.append("insert into member values(");
        sql.append("member_seq.nextval,?,?,?,?,?,sysdate)");
        //4.preparedStatement 객체를 사용해서 쿼리를 전송
        pstm = con.prepareStatement(sql.toString());
        // 5. 전송된 쿼리에게 값을 전송
        pstm.setString(1, "xman");
        pstm.setString(2, "xman00");
        pstm.setString(3, "김길동");
        pstm.setString(4, "20000909");
        pstm.setString(5, "aa@a.com");
        pstm.executeUpdate();  //insert, delete, update일 경우 사용
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패");
            ex.printStackTrace();
        }catch (SQLException ex){
            System.out.println("오라클 에러");
            ex.printStackTrace();
        }
        
    }
}
