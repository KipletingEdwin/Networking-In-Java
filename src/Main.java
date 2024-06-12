import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws UnknownHostException {

        String url = "www.simplilearn.com";

        InetAddress inetAddress = InetAddress.getByName(url);

        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));
        //getHost Address method
        System.out.println("Host Address : " + inetAddress.getHostAddress());
        //isAnyLocalAddress method
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());
        //isLinkLocalAddress method
        System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());
        //isLoopbackAddress
        System.out.println("isLoopbackAddress : " + inetAddress.isLoopbackAddress());
        //isSiteLocalAddress
        System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());
        //hashCode() method
        System.out.println("haschCode : " + inetAddress.hashCode());

    }
}