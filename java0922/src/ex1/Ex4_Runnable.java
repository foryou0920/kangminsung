package ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex4_Runnable extends JFrame implements Runnable {

    private JPanel p1, p2;
    private JButton btn1;
    private JTextArea res;
    private JLabel lb;
    //�������� : ����ڰ� �Է��ϴ� �ð��� üũ�ؼ� 
    //10�ʾȿ� �Է��ϵ��� �����Ͻÿ� 
    // ��) �Է��� ������ ī��Ʈ�� ���ߵ��� �����Ǿ�� �� 
    //10�ʸ� �ѱ��� ���޽����� ���!(2���� ������� ����
    public Ex4_Runnable() {
        setTitle("���� ������ �׽�Ʈ");
        p1 = new JPanel();
        p1.add(btn1 = new JButton("Click"));
        add(p1, "South");
        p2 = new JPanel();
        res = new JTextArea(20, 50);
        p2.add(res);
        add(p2);
        setBounds(200, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Thread
                Thread t = new Thread(Ex4_Runnable.this);
                t.start();

                String input = JOptionPane.showInputDialog("���� �Է�");
                t.interrupt();
                res.append("�Է��Ͻ� ����: " + input + "�Դϴ�.\n");
            
//               for(int i =10; i>0; i--) {                 
//                   
//                   try {
//                       res.append(String.valueOf(i)+"\n");
//                       res.repaint();
//                       Thread.sleep(1000);
//                       
//                   } catch (InterruptedException ex) {
//                   }
//               }
//            }

            }
        });
    }

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {

            try {
                res.append(String.valueOf(i) + "\n");
                res.repaint();
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
            }
        }
    }


public static void main(String[] args) {
        new Ex4_Runnable();
}
}
