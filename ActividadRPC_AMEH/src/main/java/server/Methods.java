package server;
import java.util.Arrays;
import java.util.Scanner;
public class Methods {
    //Andrea Michelle Estrada Hernández 4°A DSM
    int n1, n2, n3,n4, sum=0;
    int suma, promedio;
    int mul;
    int nMen, nMay;
    Scanner scanner = new Scanner(System.in);

    public double addition(double num1, double num2) {

        return num1 + num2;
    }
    ////1

    public double imc(double weight, double height) {
        double imc = weight / (height * height);
        return imc;
    }
    //////2
    public int mul (int n1, int n2, int  n3, int n4){
        int producto = n1 * n2 * n3* n4;
        return producto;

    }
    public int suma (int n1, int n2, int  n3, int n4){
        int sum = n1 + n2 + n3 + n4;
        return sum;

    }
    public int promedio (int n1, int n2, int  n3, int n4){
        int prom = (n1 + n2 + n3 + n4)/4;
        return prom;

    }

    /////3

    public void SetnMen(int nMen) {
        this.nMen = nMen;

    }
    public int GetnMen() {
        return nMen;

    }
    public void SetnMay(int nMay) {
        this.nMay = nMay;

    }
    public int GetnMay() {
        return nMay;

    }

     public void arreglos() {
        System.out.println("Números desde " + nMen + " hasta " + nMay + " : ");
            for (int i = nMen; i <= nMay; i++) {
              System.out.print(i +" ");
              sum+=i;
            }
            System.out.println("\nSuma de los dígitos que se \n"
            + "encuentran entres los dos: "+sum);
     }
    ///

    ////////////////4
    private int[] array = new int[5];

    public void cargar() {
        int i;
        System.out.println("Indica los valores  ");
        for (i = 0; i < array.length; i++) {
                System.out.print("Posicion [" + (i+1) + "] ");
                array[i] = scanner.nextInt();
        }
    }
    public void imprimir() {
        System.out.println("Arreglo en orden ascendente:");
        int i,j, aux;/*
        for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
           // System.out.println();
        }*/

        for (i = 0; i < array.length; i++) {
            for (j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i]+ ", ");
        }


    }



}//Andrea Michelle Estrada Hernández 4°A DSM
