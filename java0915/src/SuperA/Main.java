
package SuperA;
/**
 *
 * @author kosta
 * Document : Main Created on : 2014. 9. 15 , ���� 10:21:28
 */
public class Main {
    public static void main(String[] args) {
        Super su = new Super() { 
            public void draw(String msg) { 
                System.out.println("�� :" + msg);
            }
        };
        su.draw("test");
        
        //�߻�Ŭ������ new�� �����ɼ� ����.
        Super[] ar = new Super[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"�簢��" , "������"};
        int i = 0; 
        for(Super e : ar) { 
            e.draw(msg[i]);
            i++;
        }
    }
                
}
