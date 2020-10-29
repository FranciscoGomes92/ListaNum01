import java.util.Scanner;

public class Lista01_Ex07{
    public static void main (String [] Args){
        Scanner in = new Scanner(System.in);

        double DistM, VelMed, Tempo; 

        System.out.println(" Insira a distancia que sera percorrida em metros: ");
        DistM = in.nextDouble();
        System.out.println(" insita a sua velocidade media: ");
        VelMed =in.nextDouble();
        VelMed = VelMed * 1000;

        Tempo = (DistM / VelMed);

        System.out.println(" Este e o tempo total para chegar em seu destino : " + Tempo + " Hora ");
    }
}