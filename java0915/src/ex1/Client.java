
package ex1;

public class Client {
    public static void main(String[] args) {
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        int size = ar.length;
        System.out.println("배열의 크기 :" + ar.length);
        //효율적인 코드를 사용하는 방법 
        for(int i=0 ; i<size; i++) { 
            ar[i].cry();
        //jdk5부터 향상된 for
        //(배열 / 컬렉션의 객체 지역변수 : (in의 의미) 변수명)
        //(in의 의미)변수명 ) {
        }
        
    }

}
