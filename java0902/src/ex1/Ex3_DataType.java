
package ex1;

public class Ex3_DataType {
  
    public static void main(String[] args) { 
     byte a = 10; 
     byte b = 20;
//     demotion : ū�ڷ������� ���� �ڷ������� �����Ͱ� �̵��ɶ�
//     �ڷ��� �ս��� ������ ����(ĳ����)
//     promotion : ���� �ڷ������� ū �ڷ������� �����Ͱ� �̵��ɶ� 
//     �ڿ�����������
//     JVM�� int 4����Ʈ ������ ������ �����Ҷ� int������ �°ݽ�Ŵ 
//     �׷��� a+b�� ������ �̷�� ���� int������ ���� ����� ������ �Ǳ� ������
//     �̰��� byte c�� �����ϱ� ���ؼ��� demotion�� �Ͼ 
     byte c = (byte)(a+b);
     System.out.println(c);
     int d = a+b;
      System.out.println(d);
      
      long myL = a+b;
        int f;
        f = (int) myL;
}
}
