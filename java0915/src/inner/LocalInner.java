package inner;

public class LocalInner {
    private int a = 100; // �������

    public void myMethod(int n) {
        int b = 200; // �޼��� ���� ��������
        final int c = 300;
        class Inner {

            public void getData() {
                //�ܺ�Ŭ������ �ڿ� ����!
                System.out.println("int a : " + a);
                // ���������� ���� ����(jdk8���� ����, jdk5,6,7 �ȵ�)
                // jdk5~7������� �ݵ�� ���������� ����� �����ؾ� �� 
                System.out.println("local int b : " + n);
            }
        }
        Inner i = new Inner();
        i.getData();
    }

    public static void main(String[] args) {
        

    }
}
