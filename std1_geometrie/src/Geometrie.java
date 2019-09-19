import jdk.nashorn.internal.parser.Scanner;

public class Geometrie {

    public static void main(String[] args){

        //Variables//
        double rayon = 0.0, surface = 0.0, volume = 0.0, longueur = 0.0, hauteur = 0.0, apotheme = 0.0;

        //Calcul du cercle//
        rayon = 10.0;
        surface = Math.pow(rayon,2)*Math.PI;

        //Presentation des donnees du cercle//
        System.out.println("Le cercle");
        System.out.println("-Rayon : " + (rayon = 10.0) );
        System.out.println("-Surface : " + surface);

        //Calcul du cube//
        longueur = 7.0;
        surface =  Math.pow(longueur,2)*6;
        volume = Math.pow(longueur,3);

        //Presentation des donnees du cube//
        System.out.println("Le cube");
        System.out.println("-Longueur : " + longueur);
        System.out.println("-Surface : " + surface);
        System.out.println("-Volume : " + volume);

        //Calcul du cylindre//
        rayon = 10.0;
        hauteur = 5.0;
        surface = 2*(Math.PI*Math.pow(rayon,2))+(2*Math.PI*rayon*hauteur);
        volume = (Math.PI*Math.pow(rayon,2))*hauteur;

        //Presentation des donnees du cylindre//
        System.out.println("Le cylindre");
        System.out.println("-Rayon : " + rayon);
        System.out.println("-Hauteur : " + hauteur);
        System.out.println("-Surface : " + surface);
        System.out.println("Volume : " + volume);

        //Calcul du cone//
        rayon = 3.0;
        hauteur = 7.0;
        apotheme = 7.1589108;
        surface = (Math.PI*Math.pow(rayon,2))+(Math.PI*rayon*apotheme);
        volume = (Math.PI*Math.pow(rayon,2)*hauteur)/3;

        //Presentation des donnees du cone//
        System.out.println("Le cone");
        System.out.println("-Rayon : " + rayon);
        System.out.println("-Hauteur : " + hauteur);
        System.out.println("-Apotheme : " + apotheme);
        System.out.println("-Surface : " + surface);
        System.out.println("Volume : " + volume);
    }
}
