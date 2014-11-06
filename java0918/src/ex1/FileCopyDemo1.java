package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {

    public static void main(String[] args) throws IOException {
        // ������� �о�ͼ� Ư�� �ٸ� ���丮�� �����ϴ� �۾�
        // �о���� ���� ��Ʈ�� - FileInputStream
        //�ۼ��ϱ� ���� ��Ʈ�� - FileOutputStream
        String path = "C:\\kosta86\\javaStudy\\util\\han.zip";
        String path2 = "C:\\kosta86\\javaStudy\\tmp\\han.zip";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //2�� ��Ʈ���� ���(���۱���� �����!)
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        long start = System.currentTimeMillis();

        try {
            fis = new FileInputStream(path); //
            fos = new FileOutputStream(path2); //
            bis = new BufferedInputStream(fis, 2048);
            bos = new BufferedOutputStream(fos, 2048);

            int rv = 0;
            while ((rv = bis.read()) != -1) {
                //�ѹ���Ʈ�� ���������� �ѹ���Ʈ�� �ۼ�

                bos.write(rv);
            }
            bos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("������ ���׿�");
            ex.printStackTrace();

        } catch (IOException ex) {
            System.out.println("�о���� �� ������ �߻��߽��ϴ�.");
            ex.printStackTrace();
        } finally {
            try {

                if (fis != null) {fis.close(); }//
                if (fos != null) {fos.close(); }//
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("�ð� :" + (end - start));

    }
}
