package Antra_paskaita;

import java.util.Random;

public class Savaites_dienos {
    //        Sukurkite du switchus. Generuojamas atsitiktinis skaicius nuo 0 iki 10 ir programa turi atpazinti:
//        - 1as switch'as nurodo savaites dienos pavadinima jei sugeneruojamas rezultatas tarp 1 ir 7,
//        visus kitus rezultatus rodo, kad "Tokios savaites dienos nezinau"
    public static void main(String[] args) {
        Random skaicius = new Random();
        int dienosNr =  1+skaicius.nextInt(10);
        String rezultatas = "     ";

        System.out.println(dienosNr);

        switch (dienosNr) {
            case 1:
                rezultatas = "Pirmadienis";
                break;
            case 2:
                rezultatas = "Antradienis";
                break;
            case 3:
                rezultatas = "Treciadienis";
                break;
            case 4:
                rezultatas = "Ketvirtadienis";
                break;
            case 5:
                rezultatas = "Penktadienis";
                break;
            case 6:
                rezultatas = "Sestadienis";
                break;
            case 7:
                rezultatas = "Sekmadienis";
                break;
            default:
                rezultatas = "Nezinoma reiksme";
        }

        System.out.println("Dienos Nr.: " + rezultatas);

//        - 2as switchas nurodo ar dabo diena, ar savaitgalis (pvz. jei sugenruojamas 2, t.y. antradienis,
//        tai darbo diena, o jei 6 - savaitgalis ir pan.)

        rezultatas = "";

        switch (dienosNr) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                rezultatas += "Valio. Tai Darbo diena";
                break;
            case 6:
            case 7:
                rezultatas += "Nu ir kam tas savaitgalis";
                break;
            default:
                rezultatas = "Nezinoma reiksme";
        }

        System.out.println(rezultatas);
    }
}



