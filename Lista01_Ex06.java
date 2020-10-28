import java.util.Scanner;

public class Lista01_Ex06{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        double Nota1, Nota2, NotaFin; 

        System.out.println(" Insira a sua nota da avaliacao 1: ");
        Nota1 = in.nextDouble();
        System.out.println(" insira a sua nota da avaliacao 2: ");
        Nota2 =in.nextDouble();

        NotaFin = (Nota1 + Nota2)/2;

        System.out.println(" Esta sera sua nota final: " + NotaFin );
    }
}