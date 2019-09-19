public class Typage {
    public static void main(String[]args) {

        // Définir les variables//
        int var1 = 10; float var2 =  1.5f; char var3 = '6';

        //Convertir Integer en String//
        String var1AsString = String.valueOf(var1);

        //Afficher le résultat de la conversion//
        System.out.println("Conversion 1: " + var1AsString);

        //Convertir Integer en Boolean//
        /*Il est impossible de convertir un Integer en Boolean car le Booleean ne prend que les valeur de vrai ou faux
        et ne peut convertir un nombre
         */

       //Afficher le résultat de la conversion//
       System.out.println("Conversion 2: impossible");

       //Convertir Float en Integer//
       var1 = (int)var2;

        //Afficher le résultat de la conversion//
        System.out.println("Conversion 3: " + var1);

        //Convertir Float en String (arrondie)//
        String var2AsString = String.valueOf(Math.round(var2));

        //Afficher le résultat de la conversion//
        System.out.println("Conversion 4: " + var2AsString);

        //Convertir Char en Integer//
        var1 = Character.getNumericValue(var3);

        //Afficher le résultat de la conversion//
        System.out.println("Conversion 5: " + var1);

        //Même chose mais avec une lettre//
        // Le résultat est la valeur de la variable 1, un Integer, donc la conversion ne fonctionne pas //
    }

}
