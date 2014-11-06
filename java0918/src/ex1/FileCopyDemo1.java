package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo1 {

    public static void main(String[] args) throws IOException {
        // 대상파일 읽어와서 특정 다른 디렉토리에 복사하는 작업
        // 읽어오기 위한 스트림 - FileInputStream
        //작성하기 위한 스트림 - FileOutputStream
        String path = "C:\\kosta86\\javaStudy\\util\\han.zip";
        String path2 = "C:\\kosta86\\javaStudy\\tmp\\han.zip";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //2차 스트림을 사용(버퍼기능이 내장된!)
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
                //한바이트씩 읽을때마다 한바이트씩 작성

                bos.write(rv);
            }
            bos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("파일이 없네요");
            ex.printStackTrace();

        } catch (IOException ex) {
            System.out.println("읽어오는 중 문제가 발생했습니다.");
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
        System.out.println("시간 :" + (end - start));

    }
}
