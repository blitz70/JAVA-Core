package center.wiz.java3.java28_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOText {

  public static void main(String[] args) {
    
    InputStream is = null;
    OutputStream os = null;
    DataInputStream dis = null;
    DataOutputStream dos = null;
    String text = "";
    try {
      is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\in.txt");
      //dis = new DataInputStream(is);
      //text = dis.readUTF();   //error
      while (true) {
        int data = is.read();
        text += (char) data;
        if (data == -1) break;
      }
      System.out.println(text);
      os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\out.txt");
      dos = new DataOutputStream(os);
      //dos.writeUTF("Weather today is fine indeed!");
      dos.writeUTF(text);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (is != null) is.close();
        if (os != null) os.close();
        if (dis != null) dis.close();
        if (dos != null) dos.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }

}
