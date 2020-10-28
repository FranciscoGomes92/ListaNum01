import java.util.Scanner;

public class Lista01_Ex02{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        double Num; //Número inteiro
        double Porc;//Numero gerado pela porcentagem
        double NumTot;//Numero total

        System.out.println(" Digite um numero qualquer: ");
        Num = in.nextDouble();
        
        Porc = (Num * 20)/100;
        NumTot = Num + Porc;

        System.out.println(" O acrescimo da porcentagem sera: " + Porc );
        System.out.println(" O namero digitado com o aumento da porcentagem sera: " + NumTot );
    }
}