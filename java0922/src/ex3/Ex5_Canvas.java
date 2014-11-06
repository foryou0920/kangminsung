package ex3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class Ex5_Canvas extends JFrame {

    private Canvas can;
    private int x, y;

    public Ex5_Canvas() {
        // Canvas�� ����Ŭ������ �����ϱ� 
        add(can = new Canvas() {
            // �׸��� �׸��� ���� �׷����� ��ҿ� �׷��ִ� ����

            public void paint(Graphics g) {

                g.setColor(Color.pink);
                g.fillOval(x, y, 30, 30);
                g.setColor(Color.red);
                g.drawArc(200, 100, 100, 100, 0, 90);
            }

            @Override
            public void update(Graphics g) {
                paint(g);
            }
        });

        can.setBackground(Color.white);
        can.addMouseMotionListener(new MouseMotionAdapter() {

         // Adapter ����ϸ� �߻�Ŭ�����̱� ������ 
            // emty�޼��带 �����س��� �̰��� ���, �͸���Ŭ����
            // �� ���� �� �����Ҷ� ����ڰ� �ʿ��� �͸� ������ ����           
            @Override
            public void mouseDragged(MouseEvent e) {

                x = e.getX();
                y = e.getY();
                System.out.println(x + ":" + y);
        //paint�� jvm�� ȣ�� - �׷��� ����� ����
                //repaint()�� ȣ��
                //����) repaint() -> jvm -> update -> paint() 
                // update() :������ ĵ������ �����ִ� ����
                can.repaint(x, y, 50, 50);

            }
        });
        setBounds(100, 100, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex5_Canvas();
    }
}
