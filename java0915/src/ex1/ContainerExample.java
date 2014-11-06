package ex1;

import ex3.InterFaceTest;
import ex3.MsgBank;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//extends JFrame은 가장 base, Container 인 객체이므로 
// 상속으로 처리하는것이 바랍직하다. 
// 인터페이스는 다중구현이 가능하다 
public class ContainerExample extends JFrame implements InterFaceTest, MsgBank {

    private JPanel p, p2;
    private JButton btn;
    private JLabel lb;

    public ContainerExample() {
        p = new JPanel();
        String msg = new Animal().msg("클릭");

        Animal ani = new Animal() {

            @Override
            public String msg(String msg) {
                return "" + msg;
            }

        };
        p.add(btn = new JButton(ani.msg("마이버튼")));
        add(p, "North");
        p2.add(lb = new JLabel("임시내용"));
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
        return "하이" + msg;
    }

}
