import java.util.Scanner;

public class Vecteur {
    public static void main(String[] args){

        //Definir les variables//
        double xa = 0.0, xb = 0.0, ya = 0.0, yb = 0.0, za = 0.0, zb = 0.0, distance = 0.0;
        Scanner sc = new Scanner (System.in);

        //Le point A//
        System.out.println("Quelles sont les coordonnes du point A?");
        xa = sc.nextDouble();
        ya = sc.nextDouble();
        za = sc.nextDouble();
        System.out.println("Le point A (" + xa + ", "+ ya + ", " + za +")" );

        //Le point B//
        System.out.println("Quelles sont les coordonnes du point B?");
        xb = sc.nextDouble();
        yb = sc.nextDouble();
        zb = sc.nextDouble();
        System.out.println("Le point B (" + xb + ", " + yb + ", " + zb + ")" );

        //Le calcul//
        distance = Math.sqrt(Math.pow((xb-xa),2)+Math.pow((yb-ya),2)+ Math.pow((zb-za),2));

        //Le resultat//
        System.out.println("La distance est : " + distance);

        sc.close();
    }
}
