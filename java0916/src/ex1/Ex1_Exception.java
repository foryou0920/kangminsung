
package ex1;
// Exception : 가벼운 오류이며 프로그램적으로 처리한다. 
//    - 일반적인 예외 : 컴파일할때 발생하는 오류
//        예) 1/0시 파일을 읽고자 하는데 대상이 파일이 없다면 
//    - 실행시 예외
//        예) 0으로 나누는 프로그램등 , 문자형 숫자에 문자를 넣는다는 등 
//            컴파일 시에는 절대 알수없는 예외
// Error : 치명적인 오류이며 JVM에 의존하여 처리한다. 

public class Ex1_Exception {
    public static void main(String[] args) {
        int[] var = {100,200,30};
        int size = var.length;
        for(int i=0; i<=size; i++) { 
            try {
                System.out.println(var[i]);
                System.out.println("♡");
            } catch (Exception e) {
                System.out.println("배열의 범위를 넘었습니다.");  
            }
        
//예외발생지점 배열의 인덱스가 3(4번째)은 없기때문에 에러발생 
//            try { 
//               예외가 발생가능한 문장들 
//                       실행문 : 예외가 발생되면 수행이 안됨
//                       { catch (예외객체 변수명) { 
//                               예외수행문장들;
//                               }
            }
        }
        
    }
