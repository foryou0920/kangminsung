
package ex1;

public class Client {
    public static void main(String[] args) {
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        int size = ar.length;
        System.out.println("�迭�� ũ�� :" + ar.length);
        //ȿ������ �ڵ带 ����ϴ� ��� 
        for(int i=0 ; i<size; i++) { 
            ar[i].cry();
        //jdk5���� ���� for
        //(�迭 / �÷����� ��ü �������� : (in�� �ǹ�) ������)
        //(in�� �ǹ�)������ ) {
        }
        
    }

}
