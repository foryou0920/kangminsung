package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener {

    private JButton btn1, btn2, btn3; // 색상을 선택할 버튼
    private JPanel p1; // 버튼이 위치할 패널
    private Body body; 

    public Menu(Body body) { 
         // 다른메서드에서 사용하기 위해서 body의 주소를 
         // 멤버필드에 기억시킨다.
        this.body = body;
        p1 = new JPanel();
        p1.add(btn1 = new JButton("RED"));
        p1.add(btn2 = new JButton("BLUE"));
        p1.add(btn3 = new JButton("GREEN"));

        btn1.setBackground(Color.red);
        btn2.setBackground(Color.blue);
        btn3.setBackground(Color.green);
        // 각 버튼에 이벤트 리스너를 걸어놓고 , 이벤트 발생시 메인프레임에 이벤트 처리를 맡긴다
        add(p1); // 패널추가
        setBounds(300,10,300,200); // 창의 위치와 크기
        setVisible(false);
        
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
      
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        Color col = btn.getBackground();
      
    }


    }


    
    
    


