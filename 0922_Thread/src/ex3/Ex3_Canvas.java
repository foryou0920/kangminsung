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
 * @author kosta Document : Ex3_Canvas Created on : 2014. 9. 22, 오후 2:44:35
 */
//Canvas연습 
public class Ex3_Canvas extends JFrame implements Runnable{

    private Canvas can;
    private int x,y,arcNum;
    public Ex3_Canvas() {
        Thread t = new Thread(this);
        t.start();
        // Canvas를 내부클래스로 정의하기
        add(can = new Canvas() {
            // 그r림을 그리기 위한 그래픽적 요소와 그려주는 동작
            @Override
            public void update(Graphics g) {
                paint(g);
            }
            @Override
            public void paint(Graphics g) {
                // 원 그려보기
                g.setColor(Color.pink);
                g.fillOval(x, y, 30, 30);
                g.setColor(Color.red);
                g.drawArc(200, 100, 100, 100, 0, arcNum);
            }
        });
        can.setBackground(Color.white);
        can.addMouseMotionListener(new MouseMotionAdapter() {
            // Adapter 사용하면 추상클래스이기 때문에
            // empty메서드를 정의 해놓고 이것을 상속, 익명내부클래스
            // 로 생성및 정의 할 때 사용자가 필요한 것만 선택이 가능
            @Override
            public void mouseDragged(MouseEvent e) {
                 x = e.getX();
                 y = e.getY();
                System.out.println(x+":"+y);
                // paint는 JVM이 호출 - 그래서 사용자 정의 
                // repaint()를 호출
                // 순서) repaint() -> JVM -> update() -> paint();
                // update() : 기존의 캔버스를 지워주는 역할
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
