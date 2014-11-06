package exam;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Grade {

    public static void main(String[] args) {

    }

    public void show(int studentNo, char grade, float score, short rank) throws FileNotFoundException, IOException {
        File data = new File("Á¡¼ö :" + studentNo);
        OutputStream os = null;
        DataOutputStream doss = null;

        try {
            doss = new DataOutputStream(os = new FileOutputStream(data));

            doss.writeInt(studentNo);
            doss.writeChar(grade);
            doss.writeFloat(score);
            doss.writeShort(rank);
        } catch (IOException ex) {
            ex.printStackTrace();

        } finally {
            try {
                if (doss != null) { doss.close(); }
                if (os != null) { os.close(); }
                    }
                    catch(Exception e) { 
                     
                     
         }
                }

            }
        }
    
