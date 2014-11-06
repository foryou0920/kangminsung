
package ex1;

public class Main {
    public static void main(String[] args) {
        D_carPhone ref = new D_carPhone("갤노트3","500000",1000,"20px");
        System.out.println("모델명 :" +ref.model); //부모 
        System.out.println("가격 :" +ref.getNumber()); //부모 
        System.out.println("화음 :" +ref.getChord());//부모에 등록
        System.out.println("픽셀 :" +ref.getPixel());// 자식
        
        MP3Phone mp = new MP3Phone("아이폰6","990000",1000,50);
        System.out.println("");
        System.out.println("모델명 :" +mp.getModel()); //부모 
        System.out.println("가격 :" +mp.getNumber()); //부모 
        System.out.println("화음 :" +mp.getChord());//부모에 등록
        System.out.println("픽셀 :" +mp.getSize());// 자식
        
                
    }

}
