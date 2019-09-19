import java.util.Scanner;

public class Salutation {
    public static void main(String []args) {

        //Definir variables//
        String nom ;

        //Creer scanner//
        Scanner sc = new Scanner (System.in);

        //Entrer le nom//
        System.out.println("Quel est ton nom");
        nom=sc.next();

        //Presenter le bonjour avec le nom//
        System.out.println("Bonjour " + nom);

        sc.close();
    }
}
