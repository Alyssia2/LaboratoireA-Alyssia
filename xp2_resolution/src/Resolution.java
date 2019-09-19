import java.util.Scanner;

public class Resolution {
    public static void main(String [] args){

        //Definir les variables//
        double a = 0.0, b = 0.0, c = 0.0, d = 0.0, x1 = 0.0, x2 = 0.0;
        Scanner sc = new Scanner(System.in);

        //Entree des valeurs//
        System.out.print("a > ");
        a = sc.nextDouble();
        System.out.print("b > ");
        b = sc.nextDouble();
        System.out.print("c > ");
        c = sc.nextDouble();
        System.out.print("Équation : " + a + "x2+" + b + "x+" + c + "=0");

        //Équation discriminant//
        d = Math.pow(b,2)-4*a*c;

        //Equation x1//
        x1 = (-b + Math.sqrt(d))/(2*a);

        //Equation x2//
        x2 = (-b - Math.sqrt(d))/(2*a);

        //Presentation des resultat//
        System.out.print("discriminant : " + d);
        System.out.print("X1 : : " + x1);
        System.out.print("X2 : : " + x2);

        sc.close();
    }
}
