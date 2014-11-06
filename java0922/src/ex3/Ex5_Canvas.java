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
        // Canvas를 내부클래스로 정의하기 
        add(can = new Canvas() {
            // 그림을 그리기 위한 그래픽적 요소와 그려주는 동작

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

         // Adapter 사용하면 추상클래스이기 때문에 
            // emty메서드를 정의해놓고 이것을 상속, 익명내부클래스
            // 로 생성 및 정의할때 사용자가 필요한 것만 선택이 가능           
            @Override
            public void mouseDragged(MouseEvent e) {

                x = e.getX();
                y = e.getY();
                System.out.println(x + ":" + y);
        //paint는 jvm이 호출 - 그래서 사용자 정의
                //repaint()를 호출
                //순서) repaint() -> jvm -> update -> paint() 
                // update() :기존의 캔버스를 지워주는 역할
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
