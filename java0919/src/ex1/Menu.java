package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener {

    private JButton btn1, btn2, btn3; // ������ ������ ��ư
    private JPanel p1; // ��ư�� ��ġ�� �г�
    private Body body; 

    public Menu(Body body) { 
         // �ٸ��޼��忡�� ����ϱ� ���ؼ� body�� �ּҸ� 
         // ����ʵ忡 ����Ų��.
        this.body = body;
        p1 = new JPanel();
        p1.add(btn1 = new JButton("RED"));
        p1.add(btn2 = new JButton("BLUE"));
        p1.add(btn3 = new JButton("GREEN"));

        btn1.setBackground(Color.red);
        btn2.setBackground(Color.blue);
        btn3.setBackground(Color.green);
        // �� ��ư�� �̺�Ʈ �����ʸ� �ɾ���� , �̺�Ʈ �߻��� ���������ӿ� �̺�Ʈ ó���� �ñ��
        add(p1); // �г��߰�
        setBounds(300,10,300,200); // â�� ��ġ�� ũ��
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


    
    
    


