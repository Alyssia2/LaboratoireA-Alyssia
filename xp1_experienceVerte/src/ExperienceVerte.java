import java.util.Scanner;

public class ExperienceVerte {
    public static void main(String[] args){

        //Définir les variables//
        int a = 0 ,b = 0, c = 0, d = 0, e = 0, f = 0, co2 = 0, k = 0;

        //Creer scanner//
        Scanner sc = new Scanner(System.in);

        //Entree des quantites//
        System.out.println("A > ");
        a = sc.nextInt();
        System.out.println("B > ");
        b = sc.nextInt();
        System.out.println("C > ");
        c = sc.nextInt();
        System.out.println("D > ");
        d = sc.nextInt();
        System.out.println("E > ");
        e = sc.nextInt();
        System.out.println("F > ");
        f = sc.nextInt();

        //Afficher les quantites de depart//
        System.out.println("A_0{" + a + "} B_0{" + b + "} C_0{" + c + "} D_0{" + d + "} E_0{" + e + "} F_0{" + f +
                "} co2_0{" + co2 + "}");

        //R1 : 2A + 4C = 3D + CO2//
        k = Math.min((a/2), (c/4));

        //Afficher k//
        System.out.println("k : " + k);

        //R1 partie 2//
        a = a - (k*2);
        c = c- (k*4);
        d = d + (k*3);
        co2 = co2 + k;

        //Afficher les quantites après R1//
        System.out.println("A_1{" + a + "} B_1{" + b + "} C_1{" + c + "} D_1{" + d + "} E_1{" + e + "} F_1{" + f +
                "} co2_1{" + co2 + "}");

        //R2 : B + 2C + E = 4F + 4CO2//
        k = Math.min((Math.min(b, e)),(c/2));

        //Afficher k//
        System.out.println("k : " + k);

        //R2 partie 2//
        b = b - k;
        c = c - (k*2);
        e = e - k;
        f = f + (k*4);
        co2 = co2 + (k*4);

        //Afficher les quantites après R2//
        System.out.println("A_2{" + a + "} B_2{" + b + "} C_2{" + c + "} D_2{" + d + "} E_2{" + e + "} F_2{" + f +
                "} co2_2{" + co2 + "}");

        //R3 : A/2 + 4F = B + 4E + CO2//
        k = Math.min(a*2,f/4);

        //Afficher k//
        System.out.println("k : " + k);

        //R3 partie 2//
        a = a - (k/2);
        f = f - (k*4);
        b = b + k;
        e = e + (k*4);
        co2 = co2 + k;

        //Afficher les quantites après R3//
        System.out.println("A_3{" + a + "} B_3{" + b + "} C_3{" + c + "} D_3{" + d + "} E_3{" + e + "} F_3{" + f +
                "} co2_3{" + co2 + "}");

        sc.close();
    }
}
