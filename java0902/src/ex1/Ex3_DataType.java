
package ex1;

public class Ex3_DataType {
  
    public static void main(String[] args) { 
     byte a = 10; 
     byte b = 20;
//     demotion : 큰자료형에서 작은 자료형으로 데이터가 이동될때
//     자료의 손실이 있을수 있음(캐스팅)
//     promotion : 작은 자료형에서 큰 자료형으로 데이터가 이동될때 
//     자연스러운현상
//     JVM은 int 4바이트 이하의 연산을 수행할때 int형으로 승격시킴 
//     그래서 a+b가 연산이 이루어 질때 int공간에 연산 결과에 저장이 되기 때문에
//     이것을 byte c에 저장하기 위해서는 demotion이 일어남 
     byte c = (byte)(a+b);
     System.out.println(c);
     int d = a+b;
      System.out.println(d);
      
      long myL = a+b;
        int f;
        f = (int) myL;
}
}
