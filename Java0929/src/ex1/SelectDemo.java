package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kosta
 * Document  : SelectDemo Created on :2014. 9. 29, 오후 5:16:05
 */
public class SelectDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null; // Oracle의 select 된 cursor를 받기 위한 객체
        try {
            //자료를 검출
          Class.forName("Oracle.jdbc.driver.OracleDriver");
           String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        con = DriverManager.getConnection(url, user, pass);
        // select * from table: *컬럼을 조회하는 기능이 있어서 비추 
        StringBuffer sql = new StringBuffer();
        sql.append("select num.rid,rname, email,birth,rdate from member");
         //내림차순 desc 1- num // 최신회원 , 오름차순 - asc
        sql.append(" order by 1 desc");
        // 쿼리 전송
        pstm = con.prepareStatement(sql.toString());
        // Cursor 돌려받기위한 메서드 호출
        rs = pstm.executeQuery();
        // 돌려받은 커서를 사용해서 데이터 출력
        //rs.next는 커서가 있을 경우 true
        while (rs.next()){
            // rs.getXX("컬럼번호 || 컬럼명");
            System.out.println("번호" + rs.getInt("num"));
            System.out.println("아이디 : " +rs.getString("rid"));
            System.out.println("이름"  + rs.getString("rname"));
            System.out.println("이메일"  +rs.getString("email"));
            System.out.println("가입일" + rs.getString("rdate"));
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
