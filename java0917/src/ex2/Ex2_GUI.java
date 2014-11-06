package ex2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;


//1. Event����
//2. Event�� ���� �������̽��� ����
//3. ������ �߻�޼��带 �������ؼ� ���� �����ϰ� 
//4. Event�� ����� ���ü���� ������(addXXListener(this))�� ���·� �ۼ�
//5. �̿� ���� ����� ����Ŭ������ ���� �����ϴ�.

public class Ex2_GUI extends JFrame implements ActionListener {

    private JPanel p1, p2; // ������Ʈ�̸鼭 �����̳� ��ü
    private JButton btn1, btn2, btn3; // ������Ʈ ��ư ��ü 
    private JLabel lb; // text�� �������� ǥ�� ������Ʈ ��ü

    public Ex2_GUI() {
        p1 = new JPanel();
        p2 = new JPanel();
        //p1�� ��ܸ޴�, ��ư�� ����
        p1.add(btn1 = new JButton("red"));
        p1.add(btn2 = new JButton("green"));
        p1.add(btn3 = new JButton("Blue"));

        
        //EventListener �� ���
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
         
        //��ư�� ��������
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
        // JFrame�� ���� - ����(North) 
        add(p1, "North");
        //p2�� jLabel ����, �̺�Ʈ�� 
        p2.add(lb = new JLabel());
        add(p2);
        
        setBounds(100, 100, 300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       // â�� Ȱ��ȭ
    }

    public static void main(String[] args) {
        new Ex2_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object v = e.getSource();
       JButton vv = (JButton)e.getSource();
       String msg = "" ;
       //�ڵ鸵
       
       if( v == btn1) { 
           msg = "A����" ; 
       }else if (v == btn2) { 
           msg = "B����"; 
       } else { 
           msg = "C����";
       }
                   
         lb.setText(msg+" ������ ������ ���� ��� ��������.!");
         p1.setBackground(vv.getBackground());
         p2.setBackground(vv.getBackground());
}
        
}





