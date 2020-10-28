import java.util.Scanner;

public class Lista01_Ex01{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        int Num; //Número inteiro
        int NumAnt; //Número Antecessor

        System.out.println(" Digite um numero qualquer: ");
        Num = in.nextInt();
        
        NumAnt = Num - 1;

        System.out.println(" O namero digitado sera: " + Num + " , " + " E o numero antecessor a este sera: " + NumAnt );

    }
}