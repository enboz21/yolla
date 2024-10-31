import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    private static Socket sben=null;
    private static Scanner K=null;
    private static DataOutputStream giden=null;
    public static void is() throws IOException {
        sben=new Socket("127.0.0.1",9999);
        K=new Scanner(System.in);
        giden=new DataOutputStream(sben.getOutputStream());
        String a="";
        while (!a.equals("son")) {
            a=K.nextLine();
            giden.writeUTF(a);
        }
        giden.flush();
        giden.close();
        sben.close();

    }
    public static void main(String[] args) throws IOException {
        is();

    }
}