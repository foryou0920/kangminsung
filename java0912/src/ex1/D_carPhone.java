
package ex1;

public class D_carPhone extends Ex1_Super {
    private String pixel ;
    public D_carPhone(String model, String num,int chord,String pixel){
        this.pixel = pixel;
    // �θ��� �ڿ��� �����ϱ� ���ؼ� super�� Ű���带 ���
        super.model = model;
    //�θ��� �ڿ��̶�� �ص� private�� ������ �Ұ����ϴ� 
    //�θ�Ŭ������ ���� �� �޼��嵵 �ڽ��� �ڿ�ó�� ȣ�Ⱑ��
       setNumber(num);
       super.chord = chord;
       
        
        
    }

    public String getPixel() {
        return pixel;
    }

    }


// [��������] MP3Phone Ŭ������ ���� Ex1_Super�� ��ӹް� 
// ����ʵ������� int size // ����뷮 
// �ϳ��ΰ� ���Ͱ��� �ʱ�ȭ ��Ű�ÿ�
// �� Ex1_Super�� �ڽ� Ŭ������ ������ �Ǵ� �θ�Ŭ������ ����Ǿ���.

