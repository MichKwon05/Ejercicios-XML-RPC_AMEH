package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Act2Variables {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        //Andrea Michelle Estrada Hernández 4°A DSM
        Methods op = new Methods();
        System.out.println("******* ACTIVIDAD 2 *******\n" +
         "4 Variables y sus operaciones\n");
       System.out.println("Escribe 4 números: ");
        System.out.print("Número 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Número 3: ");
        int n3 = scanner.nextInt();
        System.out.print("Número 4: ");
        int n4 = scanner.nextInt();


        System.out.print( "El producto es: "+ op.mul(n1,n2,n3,n4));
        System.out.print(" ,la suma es: " + op.suma(n1,n2,n3,n4));
        System.out.print(" y el promedio es: " + op.promedio(n1,n2,n3,n4)+"\n");

        ////////////////////////////////////////////////////////////////////////////////////////////3

         System.out.println("\n ******* ACTIVIDAD 3 *******\n" +
         "Sumar los numeros que hay entre dos \n");
         int nMen, nMay, sum=0;
         System.out.println("Escribe el número menor");
         nMen = scanner.nextInt();
         System.out.println("Escribe el número mayor");
         nMay = scanner.nextInt();
         op.SetnMen(nMen);
         op.SetnMay(nMay);
         op.arreglos();


         /*
        Object[] data = {n1,n2,n3,n4};
        Double response = (Double) client.execute("Methods.prod", data);
        System.out.println("mi resultado: " +response);*/

    }
}