package center.wiz.java3.java28_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOCopy {
  
  public static void main(String[] args) {
    InputStream is = null;
    OutputStream os = null;
    long time;
    //slow
    try {
      is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\pic.jpg");
      os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\pic_c1.jpg");
      time = System.currentTimeMillis();
      System.out.println("Start : " + (System.currentTimeMillis()-time));
      while (true) {
        int data = is.read();
        if (data == -1) break;
        os.write(data);
      }
      if (is != null) is.close();
      if (os != null) os.close();
      System.out.println("End : " + (System.currentTimeMillis()-time));
    } catch (Exception e) {
      e.printStackTrace();
    }
    //fast
    try {
      is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\pic.jpg");
      os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\pic_c2.jpg");
      time = System.currentTimeMillis();
      System.out.println("Start : " + (System.currentTimeMillis()-time));
      while (true) {
        byte[] data = new byte[100];
        int count = is.read(data);
        if (count == -1) break;
        os.write(data, 0, count);;
      }
      if (is != null) is.close();
      if (os != null) os.close();
      System.out.println("End : " + (System.currentTimeMillis()-time));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
