
package ex1;

public class Main {
    public static void main(String[] args) {
        D_carPhone ref = new D_carPhone("����Ʈ3","500000",1000,"20px");
        System.out.println("�𵨸� :" +ref.model); //�θ� 
        System.out.println("���� :" +ref.getNumber()); //�θ� 
        System.out.println("ȭ�� :" +ref.getChord());//�θ� ���
        System.out.println("�ȼ� :" +ref.getPixel());// �ڽ�
        
        MP3Phone mp = new MP3Phone("������6","990000",1000,50);
        System.out.println("");
        System.out.println("�𵨸� :" +mp.getModel()); //�θ� 
        System.out.println("���� :" +mp.getNumber()); //�θ� 
        System.out.println("ȭ�� :" +mp.getChord());//�θ� ���
        System.out.println("�ȼ� :" +mp.getSize());// �ڽ�
        
                
    }

}
