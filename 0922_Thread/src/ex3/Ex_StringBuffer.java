package ex3;

import java.util.StringTokenizer;

/**
 * @author kosta 
 * Document   : Ex_StringBuffer Created on : 2014. 9. 22, ���� 6:01:50
 */
public class Ex_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("ABCDEFGaaa");
        sb.append(new String("AAAAAAA"));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        String res = sb.toString();
        System.out.println(res);
        System.out.println(sb);
       
        // �ǹ̾��� ���� whitespace������ ���ڰ����� �ν�
        String str = "A-B--C";
        String[] st = str.split("-");
        for(String e : st){
            System.out.println(e);
        }
        System.out.println("------------------------------");
        // space�� ��޾��� !
        StringTokenizer stz = new StringTokenizer(str, "-");
        while (stz.hasMoreTokens()) {
            Object object = stz.nextToken();
            System.out.println(object);
        }
        
    }
}
