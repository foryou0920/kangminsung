package ex2;

// �߻�Ŭ������ �߻�޼��尡 �ִٸ� �ݵ�� ������ �ؼ� ����ؾ� ���
// �޾Ƽ� �߻�Ŭ������ ������ �ִ� �ٸ��ڿ�(���⼭�� 1000��)�� ����Ҽ� ����
// �� �߻��� �䱸������ ������ �ȴ�.
public class Ex1_AbstractMain extends Ex1_Abstract {

    @Override
    public void moveMount() {
        System.out.println("���� �Ű��� " + getMoney() + "�پ��� ����");
    }

    public static void main(String[] args) {
        Ex1_Abstract ref = new Ex1_AbstractMain();
        ref.moveMount();
       //�θ��� �޼��带 ȣ�������� ������(****)�� 
        // �ڽĸ޼��尡 ȣ���� ��
        // (����)�߻�Ŭ������ ���������� new�� �����ڷ� �����Ǿ 
        // ���ɼ� ���� ������ �̿ϼ��� �߻�޼���� ���� �صθ� 
        // �����ǵ� �ڽĿ� ���ؼ� �ϼ��� �Ǿ ����� �� ** 6
    }
}
