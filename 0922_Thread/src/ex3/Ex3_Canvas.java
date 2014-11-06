package ex3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * @author kosta Document : Ex3_Canvas Created on : 2014. 9. 22, ���� 2:44:35
 */
//Canvas���� 
public class Ex3_Canvas extends JFrame implements Runnable{

    private Canvas can;
    private int x,y,arcNum;
    public Ex3_Canvas() {
        Thread t = new Thread(this);
        t.start();
        // Canvas�� ����Ŭ������ �����ϱ�
        add(can = new Canvas() {
            // ��r���� �׸��� ���� �׷����� ��ҿ� �׷��ִ� ����
            @Override
            public void update(Graphics g) {
                paint(g);
            }
            @Override
            public void paint(Graphics g) {
                // �� �׷�����
                g.setColor(Color.pink);
                g.fillOval(x, y, 30, 30);
                g.setColor(Color.red);
                g.drawArc(200, 100, 100, 100, 0, arcNum);
            }
        });
        can.setBackground(Color.white);
        can.addMouseMotionListener(new MouseMotionAdapter() {
            // Adapter ����ϸ� �߻�Ŭ�����̱� ������
            // empty�޼��带 ���� �س��� �̰��� ���, �͸���Ŭ����
            // �� ������ ���� �� �� ����ڰ� �ʿ��� �͸� ������ ����
            @Override
            public void mouseDragged(MouseEvent e) {
                 x = e.getX();
                 y = e.getY();
                System.out.println(x+":"+y);
                // paint�� JVM�� ȣ�� - �׷��� ����� ���� 
                // repaint()�� ȣ��
                // ����) repaint() -> JVM -> update() -> paint();
                // update() : ������ ĵ������ �����ִ� ����
                can.repaint();
            }
            
            
        });
        setBounds(100, 100, 400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new Ex3_Canvas();
    }

    @Override
    public void run() {
        while(true){
        if(arcNum <=360){
            arcNum +=10;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
             can.repaint();
        }else{
            break;
        }
        }
    }
}
