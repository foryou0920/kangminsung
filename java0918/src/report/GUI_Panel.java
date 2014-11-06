package report;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_Panel extends JFrame implements ActionListener{

    private JPanel p1, p2;  
    private JButton btn1, btn2, btn3;
    private JLabel lb;

    public GUI_Panel() {
        p1 = new JPanel();
        p2 = new JPanel();

        p1.add(btn1 = new JButton("red"));
        p1.add(btn2 = new JButton("green"));
        p1.add(btn3 = new JButton("blue"));

        btn1.addActionListener( this);
        btn2.addActionListener( this);
        btn3.addActionListener( this);

        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);

        add(p1);
        p2.add(lb = new JLabel());
        add(p2);

        setBounds(100, 100, 300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GUI_Panel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object v = e.getSource();
        JButton vv = (JButton) e.getSource();

    }
}
