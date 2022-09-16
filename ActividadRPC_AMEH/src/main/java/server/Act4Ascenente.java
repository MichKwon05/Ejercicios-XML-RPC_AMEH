package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
//Andrea Michelle Estrada Hernández 4°A DSM
public class Act4Ascenente {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Methods orden = new Methods();
       // ingreso.ingresarDatos();
        orden.cargar();
        orden.imprimir();

    }
}//Andrea Michelle Estrada Hernández 4°A DSM
