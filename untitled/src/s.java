import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class s {
    static ServerSocket ss=null;
    static Socket s=null;
    static DataInputStream dis=null;

    public static void su() throws IOException {
        ss=new ServerSocket(9999);
        System.out.println("dinleme..");
        s=ss.accept();
        dis=new DataInputStream(s.getInputStream());
        String gel="";
        while (!gel.equals("son")){
            gel=dis.readUTF();
            System.out.println("GELEN : "+gel);
        }
        dis.close();
    }

    public static void main(String[] args) throws IOException {
        su();
    }

}
