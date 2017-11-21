import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//建立server端伺服程式
public class app22_6 {
    public static void main(String args[]){
        try{
            ServerSocket svs = new ServerSocket(2525);
            System.out.print("等候客戶請求中...");
            Socket s = svs.accept();
            System.out.println("客戶端已和本機連上線...");
            OutputStream out = s.getOutputStream();
            String str ="Honor shows the man.";
            System.out.println("資料傳送中...");
            out.close();
            System.out.println("資料傳送完畢...");
        }
        catch (Exception e){
            System.out.println("發生了"+e+"例外");
        }
    }
}
