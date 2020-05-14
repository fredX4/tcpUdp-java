import java.io.IOException;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Syntax: Main <Root path> <port>");
            return;
        } else {
            int port = Integer.parseInt(args[1]);
            String path = args[0];
            try {
                FileServer server = new FileServer(port, path);
                server.service();
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}