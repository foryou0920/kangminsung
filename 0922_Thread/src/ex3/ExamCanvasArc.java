package ex3;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author kosta 
 * Document   : ExamCanvasArc Created on : 2014. 9. 22, 오후 3:41:12
 * // 버튼을 클릭했을 때 arc을 0 -> 10 도씩 증가해서 360만큼그리시오. 
 * // 즉 스레드1 개를 사용해서 원을 2개를 그리도록 한다.
 */
public class ExamCanvasArc extends JFrame{
    private Canvas can;
    private JPanel p1;
    private JButton btn1;
    private boolean  flag;
    private int arcNum1,arcNum2;
    public ExamCanvasArc() {
        can = new Canvas(){

            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                if(flag == false){
                    g.drawArc(100, 100, 100, 100, 0, arcNum1);
                }else{
                    g.drawArc(100, 100, 100, 100, 0, arcNum2);
                }
            }
        
    };
    }
    
}
