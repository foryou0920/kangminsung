package exam;

//입력받은 성별의 값이 "M""m""F""f" 가 아닐경우 
//제어할수 있도록 boolean 형식으로 메서드를 반환한다 
// 적절히 입력했을경우 입력받은 값을 현재 클래스의 vo에 대입니다. 
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


