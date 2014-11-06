
package ex1;

public class Ex2_Throws {
    public void setData(String m) throws NumberFormatException  { 
        if(m.length() >=1) { 
            String str = m.substring(0, 1);
            printData(str);
                    }
        
    }
    public void printData(String m) throws NumberFormatException { 
        int dan = Integer.parseInt(m);
        System.out.println(dan+"´Ü");
        System.out.println("---------------------------");
        for(int i=0 ; i<9; i++) { 
            System.out.println(dan+"x"+(i+1) + "=" +(dan*(i+1)));
        }
    }
}
