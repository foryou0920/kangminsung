package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert_Member {

    private String id, pwd, name, birth, email;
    private Connection con; // 연결담당 
    private PreparedStatement pstm; // JDBC에서 오라클로 넘겨주는 방식

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Insert_Member() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 접속 성공");
            // 2 connection 획득
            // TNS 엔트리네임과 동일해야함 
            // <host> : <prot>/ <service_name> , or a SQL * net name-value pass
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
        public void execute() {
        StringBuffer sql = new StringBuffer();

        sql.append("insert into board values(");
        sql.append("board_seq.nextVal,?,?,?,?,?)");
        try {
            pstm = con.prepareStatement(sql.toString());
            pstm.setString(1, id);
            pstm.setString(2, pwd);
            pstm.setString(3, name);
            pstm.setString(4, birth);
            pstm.setString(5, email);
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }


}
