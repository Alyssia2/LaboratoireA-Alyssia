import java.util.Scanner;

public class Pythagore {
    public static void main (String[] args){
        //Definir les variables//
        int A = 0, B = 0; double C = 0.0;
        Scanner sc = new Scanner(System.in);

        //Entrer les valeurs//
        System.out.println("Quel est la valeur A? ");
        A = sc.nextInt();
        System.out.println("Quel est la valeur de B?");
        B = sc.nextInt();

        //  Calcul//
        C = Math.sqrt((Math.pow(A,2))+(Math.pow(B,2)));

        //Presenter resultat//
        System.out.println("Valeur de pythagore : " + C);

        sc.close();
    }
}
