package exam;

public class Ani_Main {

    public static void main(String[] args) {
        Animal[] ani = new Animal[3];

        ani[0] = new Bird();
        ani[1] = new Dog();
        ani[2] = new Cat();
        // instanceof : ������ ��ü�� �����ʿ� ����� Ŭ�����κ��� 
        // ������ ��ü(�������� ��ü������) ������ �����ִ� �����
       
        Animal ref1 = new Cat(); //�������̽�
        Dog ref2 = new Dog(); // ��ü����
        Bird ref3 = new Bird();
        
        System.out.println(ref1 instanceof Animal2);
        System.out.println(ref2 instanceof Animal2);
        System.out.println(ref3 instanceof Animal2);
   
        for(Animal e : ani) { 
            e.cry();
        }
    }


}
