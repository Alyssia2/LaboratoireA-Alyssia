import java.util.Scanner;

public class Convertisseur1 {
    public static void main(String[]args){

        //Definir les variables//
        double angle1 = 0.0, angle2 = 180.0, angle3 = 0.0 ;

        //Entrer les valeurs//
        Scanner sc = new Scanner (System.in);
        System.out.println("Quel est l'angle en radian?");
        angle1 = sc.nextDouble ();

        //Calcul//
        angle3 = angle1*(angle2/Math.PI);

        //Presenter resultat//
        System.out.println("L'angle en degré est " + angle3);

        sc.close();
    }
}
