import java.util.Scanner;

public class Convertisseur2 {
    public static void main(String[]args){

        //Definir variables//
        int angle1 = 0;
        double angle2 = 0.0;

        Scanner sc = new Scanner (System.in);

        //Entrer les valeurs//
        System.out.println("Quel est l'angle en degré ?");

        angle1 = sc.nextInt();

        //Calcul//
        angle2 = Math.toRadians (angle1);

        //Presenter les resultats//
        System.out.println("L'angle en radian est " + angle2);

        sc.close();
    }
}