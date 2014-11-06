
package ex;

public class Home {
    private String doorColor ; // 대문의 색상 : 정보를 은닉 
    //setter , getter를 사용하여 캡슐화
    public String getDoorColor() {  // 대문색을 확인하도록 제공
        return doorColor;     
        
    }
    public void setDoorColor(String doorC) { // 대문색을 지정하도록 제공
        doorColor = doorC; 
    }

}
