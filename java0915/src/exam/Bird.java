
package exam;
// �ϳ��� Ŭ������ ����� ������ ������, �������� �������̽��� ����!
public class Bird extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("±±");
    }

    @Override
    public String col() {
        return "����� ����";
    }
   

}
