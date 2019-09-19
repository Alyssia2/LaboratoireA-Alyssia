public class BoiteNoire {
    public static void main(String[] args){

        //Definir variable//
        double mVolSphere = 3517.0, poidsSphere = 0.0, rayonSphere = 2.15, volumeSphere = 0.0,
                mVolSubstanceIsolation = 13545.88, poidsSubstanceIsolation = 0.0, volumeSubstanceIsolation = 0.0,
                quantiteSubstanceIsolation = 0.0, poidsBoite = 375.0, volumeBoite = 125.0, poidsTotal = 0.0;

        //Calcul poids de la sphere//
        volumeSphere = 4*Math.PI*Math.pow(rayonSphere,3)/3;
        poidsSphere = mVolSphere*volumeSphere;

        //Calcul poids substance isolante//
        volumeSubstanceIsolation = volumeBoite-volumeSphere;
        poidsSubstanceIsolation = mVolSubstanceIsolation*volumeSubstanceIsolation;
        quantiteSubstanceIsolation = volumeSubstanceIsolation*1000;
        //Un m3 = 1000 L)

        //Calcul poids boite noire//
        poidsTotal = poidsBoite + poidsSphere + poidsSubstanceIsolation;

        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("- RAPPORT D'INFORMATIONS");
        System.out.println(" Sphere");
        System.out.println(" * Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println(" * Poids : " + poidsSphere + " kg");
        System.out.println(" * Rayon : " + rayonSphere + " m");
        System.out.println(" * Volume : " + volumeSphere + " m3");
        System.out.println(" Substance isolante");
        System.out.println(" * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
        System.out.println(" * Poids : " + poidsSubstanceIsolation + " kg");
        System.out.println(" * Volume : " + volumeSubstanceIsolation + " m3");
        System.out.println(" * Quantite : " + quantiteSubstanceIsolation + " l");
        System.out.println(" Boite noire");
        System.out.println(" * Poids : " + poidsBoite+ " kg");
        System.out.println(" * Volume : " + volumeBoite + " m3");
        System.out.println(" * Poids total : " + poidsTotal + " kg");
        System.out.println("-------------------------------------------");
    }
}
