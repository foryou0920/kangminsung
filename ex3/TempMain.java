package ex3;
/**
 * @author kosta 
 * Document   : TempMain Created on : 2014. 9. 15, 오후 7:50:05
 */
public class TempMain {
    public static void main(String[] args) {
        Temp1 ref = new Temp1();
        TestVO vo = null;
        vo = new TestVO();
        // setter로 값을 저장 
        vo.setMsg("hello");
        vo.setAge(23);
        vo.setAgree(true);
        //그 VO의 주소를 info에 CallbyReference로 전달
        ref.info(vo);
        
   
        System.out.println(ref.getVo().getMsg());
        System.out.println(ref.getVo().getAge());
        System.out.println(ref.getVo().isAgree());
    }
}
