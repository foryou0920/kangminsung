package ex3;

// ��ư�� Ŭ�������� arc�� 0 -> 10���� �����ؼ� 360��ŭ �׸��ÿ�
import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �� ������2���� ����ؼ� �� 2���� �׸����� �Ѵ�. 
public class ExamCanvasArc extends JFrame {

    public JPanel p1;
    public Canvas can;
    public JButton btn1;
    public int x;

    public ExamCanvasArc() {
        p1 = new JPanel();
        p1.add(btn1 = new JButton("draw"));
        add(p1,"North");
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(can = new Canvas() {

            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);
                g.drawArc(100, 100, 100, 100, 0, x);
                g.setColor(Color.blue);
                g.drawArc(400, 100, 100, 100, 0, x);
            }

        });
               

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread() {
                    
                    @Override
                    public void run() {
                        for (x = 0; x <= 360; x = x + 20) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace(); // �����޽��� ��� 
                            }
                            can.repaint();

                        }
                           
                    }
                    

                }.start();

            }
        });

    }

    public static void main(String[] args) {
        new ExamCanvasArc();
    }

}
