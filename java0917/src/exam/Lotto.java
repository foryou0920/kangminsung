
package exam;

import java.util.Iterator;
import static java.util.Spliterators.iterator;
import java.util.TreeSet;

public class Lotto {

    private String num;

    public Lotto() {
        lottoGame();
//                   TreeSet<Integer> it = new TreeSet<>();
//           while(it.size()<6) { 
//               int num = (int)(Math.random()*45)+1;
//               it.add(num);
//           }
//           Iterator<Integer> ii  = it.iterator();
//           StringBuffer sb = new StringBuffer();
//           while (ii.hasNext()) {  // 다음 호출한 객체값이 있는지 확인 
//               Integer lotNumber = ii.next();
//               sb.append(lotNumber).append("\t");
//              
//           }
//           num = sb.toString();
    }
    
       private void lottoGame() { 
           TreeSet<Integer> it = new TreeSet<>();
           while(it.size()<6) { 
               int num = (int)(Math.random()*45)+1;
               it.add(num);
           }
           Iterator<Integer> ii  = it.iterator();
           StringBuffer sb = new StringBuffer();
           while (ii.hasNext()) { 
               Integer lotNumber = ii.next();
               sb.append(lotNumber).append("\t");
              
           }
           num = sb.toString();
       }

    public String getNum() {
        return num;
    }
       
        
    }


