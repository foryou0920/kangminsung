
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
            // 1ojbc로 부터 driver로딩.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 접속 성공");
            // 2 connection 획득
            // TNS 엔트리네임과 동일해야함 
            // <host> : <prot>/ <service_name> , or a SQL * net name-value pass
           String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
           String user = "kosta86";
           String pass = "new14";
           con = DriverManager.getConnection(url, user, pass);
           // 3. SQL문 작성!
           //num > member_seq.nextVal - 시퀀스테이블의 번호증가
           //rid.rpw,rname,BIRTH,EMAIL
           //RDATE -> sysdate 자동으로 현재날짜 -> 5개
           StringBuffer sql = new StringBuffer();
           sql.append("insert into bord values(");
           sql.append("board_seq.nextVal,?,?,?,sysdate)");
           
           // 4. PreparedStatement 객체를 사용해서 쿼리를 전송
           pstm = con.prepareStatement(sql.toString());
            System.out.print("제목입력");
           pstm.setString(1, sc.nextLine());
           System.out.print("작성자");
           pstm.setString(2, sc.nextLine());
            System.out.print("내용입력");
           pstm.setString(3, sc.nextLine());
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

