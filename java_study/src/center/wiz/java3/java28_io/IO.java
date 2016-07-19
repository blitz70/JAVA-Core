package center.wiz.java3.java28_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {

  public static void main(String[] args) {
    try {
      myInput();
      myOutput();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void myInput() throws Exception {
    InputStream is = null;
    is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\in.txt");
    while (true) {
      int i = is.read();
      System.out.println("데이터 : " + i);
      if (i == -1)
        break;
    }
    if (is != null)
      is.close();
  }

  public static void myOutput() throws Exception {
    OutputStream os = null;
    os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\out.txt");
    String str = "Weather today is fine indeed!";
    byte[] bs = str.getBytes();
    os.write(bs);
    if (os != null)
      os.close();
  }

}