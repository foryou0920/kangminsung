package inner;
//����Ŭ���� : Ư��Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���ǵǴ°��� �ǹ��Ѵ� 
//���� �� ���,����,static,�͸�

import exam.Animal2;


public class MemberInner {

    private int a = 10;
    private int b;
    private int c;

    public MemberInner() {
        b = 100;
        c = 200;
    }

    public class Inner extends Animal2{

        public void printData() {
            System.out.println("�ܺ�Ŭ������ private���ٰ���" + a);
            System.out.println("�ܺ�Ŭ������ private���ٰ���" + b);
            System.out.println("�ܺ�Ŭ������ private���ٰ���" + c);
        }

        @Override
        public String col() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }


//����Ŭ������ �����Ѵ�
public static void main(String[] args) {
   // �ܺ�Ŭ������ �����Ѵ�.
    
        MemberInner outer = new MemberInner();
   //�ܺ�Ŭ������ �ּҸ� ���ؼ� ����Ŭ������ ���� �� ����
        MemberInner.Inner inner = outer.new Inner();
        inner.printData();
        //��������.. �����Ѻ��� ���ٷ� 
   
     MemberInner.Inner inner1 = new MemberInner().new Inner();
     inner1.printData();
}
}
