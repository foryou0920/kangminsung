
package ex1;
/** Ŭ������ �����ϰ� �����ϴ� ���
 * ���������� : public,default
 * class���� �ձ��ڴ� �׻� �빮�ڷ� �ۼ�, �ĺ��� ��� 
 * main�޼���� �и��Ѵ�.
 * @author kosta
 */

public class Ex1_Robo {
    /**
     * power�� ������ ���� ����ϴ� �Ӽ�,true�� ��������/ false�� ��������
     *  col�� ������ ��Ÿ���� string���ڿ�
     */
    boolean power;
    String col;
    
    /**
     * @param  num : �κ��� ���°����� 0���� ū���� ���۵ǵ��� �Ǿ� ���� 
     * @return boolean ������ ����� �޾Ƽ� �˾Ƽ� �����Ͻÿ� 
     * @param num
     * @return 
     */
    
public boolean move(int num){
    
    boolean res = false;
    if(num <= 0) { 
        System.out.println("�κ��� ����ϴ�");
    } else{
        System.out.println("�κ���"+num+"�� �ӵ��� �����Դϴ�.");
        res = true;
    }
            return res;
 

    

    }

    boolean isPower() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   