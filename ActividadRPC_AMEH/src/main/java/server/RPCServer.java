package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.PropertyPermission;
//Andrea Michelle Estrada Hernández 4°A DSM
public class RPCServer {
    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("Initiali");
        PropertyHandlerMapping mapping = new  PropertyHandlerMapping();
        mapping.addHandler("Methods", Methods.class);
        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("Server running in http://localhost:1200");
        System.out.println("Waiting requests .-...");
    }
}
