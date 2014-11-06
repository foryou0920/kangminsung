package ex1;

import ex3.InterFaceTest;
import ex3.MsgBank;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//extends JFrame�� ���� base, Container �� ��ü�̹Ƿ� 
// ������� ó���ϴ°��� �ٶ����ϴ�. 
// �������̽��� ���߱����� �����ϴ� 
public class ContainerExample extends JFrame implements InterFaceTest, MsgBank {

    private JPanel p, p2;
    private JButton btn;
    private JLabel lb;

    public ContainerExample() {
        p = new JPanel();
        String msg = new Animal().msg("Ŭ��");

        Animal ani = new Animal() {

            @Override
            public String msg(String msg) {
                return "" + msg;
            }

        };
        p.add(btn = new JButton(ani.msg("���̹�ư")));
        add(p, "North");
        p2.add(lb = new JLabel("�ӽó���"));
        add(p2);
        setLocation(100, 100);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ContainerExample();
    }

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public String printMsg(String msg) {
        return "����" + msg;
    }

}
