package ex3;
/**
 * @author kosta 
 * Document   : Temp1 Created on : 2014. 9. 15, ���� 7:47:53
 */
public class Temp1 {
    private TestVO vo;
    public void info(TestVO vo){
       
        if(vo.getAge()< 19){
            System.out.println("�̼����� ���ٱ���");
            System.exit(0);
        }
        this.vo=vo;
    }

    public TestVO getVo() {
        return vo;
    }

    
}
