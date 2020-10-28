import java.util.Scanner;

public class Lista01_Ex03{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        int Num; //Número inteiro
        int Quad;

        System.out.println(" Digite um numero qualquer: ");
        Num = in.nextInt();
        
        Quad = Num * Num;

        System.out.println(" O namero digitado ao quadrado sera: " + Quad );
    }
}