import java.util.Scanner;
public class Lista01_Ex05{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        Double Celsius, Farenheit; //Algoritmo Fareheit para Celsius e vice versa

        System.out.println("Digite a temperatura em Celsius");
        Celsius = in.nextDouble();

        Farenheit = ((Celsius*9)/5) + 32;
        Celsius =  (5*(Farenheit -32)/9);

        System.out.println("Essas são as temperaturas em Celsius e Farenheit: ");
        System.out.println("Celsius para Farenheit: " + Farenheit);
        System.out.println("Farenheit para Celsius: " + Celsius);

    }
}