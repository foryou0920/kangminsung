package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author kosta Document : Ex4_Runnable Created on : 2014. 9. 22, ���� 11:44:58
 */
public class Ex5_Runnable1 extends JFrame {

    private JPanel p1, p2;
    private JButton btn1;
    private JTextArea res;
    private JLabel lb;
// �������� : ����ڰ� �Է��ϴ� �ð��� üũ�ؼ�
// 10�ʾȿ� �Է��ϵ��� �����Ͻÿ�.
// ��) �Է��� ������ ī��Ʈ�� ���ߵ��� �����Ǿ�� ��.
// 10�ʸ� �ѱ��� ����޼����� ���!(2�������� ������� ����-��������)
    private static boolean inputCheck;
    public Ex5_Runnable1() {
        setTitle("���� ������ �׽�Ʈ");
        p1 = new JPanel();
        p1.add(btn1 = new JButton("Click"));
        p1.add(lb = new JLabel("10"));
        add(p1, "North");
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
                new Thread() {
                    @Override
                    public void run() {
                        String input = JOptionPane.showInputDialog("���� �Է�");
                        inputCheck=true;
                        res.append("�Է��ϽŰ��� :" + input + "�Դϴ�.\n");
                    }
                }.start();
                new Thread() {
                    @Override
                    public void run() {
                        for (int i = 10; i > 0; i--) {
                            try {
                                if(inputCheck){
                                    lb.setText("Good Job");
                                    inputCheck=false;
                                    return;
                                }
                                lb.setText(String.valueOf(i));
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                        }
                        JOptionPane.showMessageDialog
                                (Ex5_Runnable1.this, "10�ʵ��� �Է��߾�� �մϴ�.");
                        System.exit(0);
                    }
                }.start();
            }
        });
    }

    public static void main(String[] args) {
        new Ex5_Runnable1();
    }
}