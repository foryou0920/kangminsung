package ex3;
/**
 * @author kosta 
 * Document   : TempMain Created on : 2014. 9. 15, ���� 7:50:05
 */
public class TempMain {
    public static void main(String[] args) {
        Temp1 ref = new Temp1();
        TestVO vo = null;
        vo = new TestVO();
        // setter�� ���� ���� 
        vo.setMsg("hello");
        vo.setAge(23);
        vo.setAgree(true);
        //�� VO�� �ּҸ� info�� CallbyReference�� ����
        ref.info(vo);
        
   
        System.out.println(ref.getVo().getMsg());
        System.out.println(ref.getVo().getAge());
        System.out.println(ref.getVo().isAgree());
    }
}
