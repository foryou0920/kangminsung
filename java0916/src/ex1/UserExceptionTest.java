
package ex1;

import java.util.Scanner;

public class UserExceptionTest {
    UserException ues;
        private void test(String n) throws UserException { 
            if(n.length()<1) { 
                throw ues = new UserException("���� �־�� �մϴ�");
                
            }else { 
                throw ues = new UserException("��������",703);
            }
        }
        public static void main(String[] args) throws UserException {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է�:");
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

    

