package exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamConst {

    private String name;
    private int age;
    private String date;

    // 재사용이 가능하도록 설계해보고 , 모든값은 생성자를 통해서 값을 초기화
    //시켜보자
    //객체를 생성하기 위한 다양한 방법을 오버로딩으로 제공해줘야 한다.
    public ExamConst(String name) {
        this.name = name;
        age = 19;
        date = new SimpleDateFormat("yyyy-mm-dd").format(new Date());
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        date = f.format(d);
    }

    public ExamConst(int age) {
        this.age = age;
    }

    public ExamConst(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean insert(String name, int age) {
        if (age > 19) {
            System.out.println(name + "님 통과");
            return true ;
        } else {
            System.out.println(name + "님 접근금지");
            return false;
        }
    }

    boolean insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
