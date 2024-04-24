package Antra_paskaita;

import java.time.LocalTime;
import java.util.Random;

public class Valandos {
    public static void main(String[] args) {
 // Pakeiskite sąlygos sakinį, kad:
               //jeigu laikotarpis nuo 7 ryto iki 12 dienos, “Labas rytas”;
               //jeigu laikotarpis nuo 12 dienos iki 6 vakaro, “Laba diena”;
               //jeigu nuo 6 vakaro iki 12 nakties, “Labas vakaras”
              //nuo 12 nakties iki 7 ryto, “Laikas miegoti”.
             //Užrašykite tą patį naudojant Ternary (trigubą operatorių).

       int valandos = LocalTime.now().getHour();
     // int valandos = random.nextInt(0,23);

        System.out.println("Dabar valandu yra " + valandos);
        System.out.println("                             ");

        if (valandos >= 7 && valandos < 12) {
            System.out.println("Labas rytas");
        } else if (valandos >= 12 && valandos < 18) {
            System.out.println("Laba diena");
        } else if (valandos >= 18 && valandos <24) {
            System.out.println("Labas vakaras");
        } else {
            System.out.println("Laikas miegoti");
        }



        // salyga ? rezultatas_1 : rezultatas_2
        String ternery = (valandos >= 7 && valandos < 12) ? "Labas rytas" :
                (valandos >= 12 && valandos < 18) ? "Laba diena" :
                        (valandos >= 18) ? "Labas vakaras":  "Laikas miegoti";

        System.out.println("Ternery variantas: " + ternery);

    }
}
pabaiga1



