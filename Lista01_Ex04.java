import java.util.Scanner;
public class Lista01_Ex04{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        Double Base, Altura, Area; 

        System.out.println("Digite o valor da base");
        Base = in.nextDouble();
        System.out.println("Digite o valor da altura");
        Altura = in.nextDouble();
        
        Area = (Base*Altura)/2;

        System.out.println("Esta e a area do triangulo: " + Area);

    }
}