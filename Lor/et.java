import java.io.OutputStream;
import java.net.Socket;

public class NetworkExample {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("example.com", 80);
        OutputStream out = socket.getOutputStream();
        out.write("GET / HTTP/1.1\n\n".getBytes());
        out.flush();  // Ensure the request is sent immediately
        socket.close();
    }
}
