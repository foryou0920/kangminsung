
package ex1;

import java.util.Scanner;

public class UserExceptionTest {
    UserException ues;
        private void test(String n) throws UserException { 
            if(n.length()<1) { 
                throw ues = new UserException("값을 넣어야 합니다");
                
            }else { 
                throw ues = new UserException("최종예선",703);
            }
        }
        public static void main(String[] args) throws UserException {
        Scanner sc = new Scanner(System.in);
        System.out.print("글입력:");
        String n = sc.nextLine();
        UserExceptionTest ref = new UserExceptionTest();
        try { 
            ref.test(n);
        } catch(UserException e) { 
            System.out.println(e.getMessage());
        } finally { 
            System.out.println("port :" + ref.ues.getPort());
        }
        
    }
        
}

    

