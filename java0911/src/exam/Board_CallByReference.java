package exam;

//�Է¹��� ������ ���� "M""m""F""f" �� �ƴҰ�� 
//�����Ҽ� �ֵ��� boolean �������� �޼��带 ��ȯ�Ѵ� 
// ������ �Է�������� �Է¹��� ���� ���� Ŭ������ vo�� ���Դϴ�. 
public class Board_CallByReference {

    private BoardVO vo;

    public boolean info(BoardVO vo) {
        if (!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f")) {

            return false;
        } else {
            this.vo = vo;
            return true;

        }
    }

    public BoardVO getVo() {
        return vo;
    }
}


