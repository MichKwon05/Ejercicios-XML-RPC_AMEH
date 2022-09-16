package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

//Andrea Michelle Estrada Hernández 4°A DSM
public class ActPerson {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Indica tu nombre");
        String name = scanner.nextLine();
        System.out.println("Indica el peso");
        Double weight = scanner.nextDouble();
        System.out.println("Indica la altura");
        Double height = scanner.nextDouble();

        Object[] data = { weight,height };

        Double response = (Double) client.execute("Methods.imc", data);
        System.out.println("Hola " + name+" tu IMC: " + response);
    }
}
//Andrea Michelle Estrada Hernández 4°A DSM