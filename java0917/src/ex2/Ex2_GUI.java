package ex2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;


//1. Event결정
//2. Event에 따른 인터페이스를 구현
//3. 구현된 추상메서드를 재정의해서 일을 정의하고 
//4. Event가 적용될 대상객체에게 감지자(addXXListener(this))의 형태로 작성
//5. 이와 같은 방법을 내부클래스로 정의 가능하다.

public class Ex2_GUI extends JFrame implements ActionListener {

    private JPanel p1, p2; // 컴포넌트이면서 컨테이너 객체
    private JButton btn1, btn2, btn3; // 컴포넌트 버튼 객체 
    private JLabel lb; // text나 아이콘을 표시 컴포넌트 객체

    public Ex2_GUI() {
        p1 = new JPanel();
        p2 = new JPanel();
        //p1은 상단메뉴, 버튼을 적재
        p1.add(btn1 = new JButton("red"));
        p1.add(btn2 = new JButton("green"));
        p1.add(btn3 = new JButton("Blue"));

        
        //EventListener 를 등록
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
         
        //버튼의 색상지정
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
        // JFrame에 적재 - 윗쪽(North) 
        add(p1, "North");
        //p2는 jLabel 적재, 이벤트에 
        p2.add(lb = new JLabel());
        add(p2);
        
        setBounds(100, 100, 300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       // 창을 활성화
    }

    public static void main(String[] args) {
        new Ex2_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object v = e.getSource();
       JButton vv = (JButton)e.getSource();
       String msg = "" ;
       //핸들링
       
       if( v == btn1) { 
           msg = "A구역" ; 
       }else if (v == btn2) { 
           msg = "B구역"; 
       } else { 
           msg = "C구역";
       }
                   
         lb.setText(msg+" 공격이 왔으니 총을 들고 대응하자.!");
         p1.setBackground(vv.getBackground());
         p2.setBackground(vv.getBackground());
}
        
}





