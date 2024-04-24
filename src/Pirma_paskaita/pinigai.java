package Pirma_paskaita;

import java.util.Random;

public class pinigai {
//Deklaruokite kintamąjį pinigaiPinigineje;

//Sukurkite atsitiktinį (random) skaičių tarp 12.56 ir
//30.43;
//Priskirkite atsitiktinę reikšmę turimam kintam;
//Pagal šios dienos degalų kainą, jums reikia
//nusipirkti 20 litrų degalų;
//Ar užteks piniginėje esančių pinigų?
//Kiek pinigų trūksta/lieka piniginėje?
//Visas reikšmes atspausdinkite konsolėje.

    public static void main(String[] args) {
        Random random = new Random();
        float pinigaiPinigineje;
        float atsitiktineReiksme = random.nextFloat(30.43f - 12.56f) + 12.56f;
        pinigaiPinigineje = atsitiktineReiksme;
        float dyzelinoKaina = 1.56f;
        int degaluKiekis = 20;
        double visoDegaluKaina = dyzelinoKaina * degaluKiekis;
        boolean arUztenkaPinigu = pinigaiPinigineje >= visoDegaluKaina;
        double pinigulikutis = pinigaiPinigineje - visoDegaluKaina;

        System.out.println(STR."Viso pinigineje buvo \{pinigaiPinigineje} pinigu");
        System.out.println("Siandien degalu kaina yra " + dyzelinoKaina + " pinigu uz ltr.");
        System.out.println("Viso 20l uzsipilti kainuotu " + visoDegaluKaina + " pinigu");
        System.out.println("Ar pinigije uzteks pinigu uzsipilti 20l? " + arUztenkaPinigu);
        System.out.println("Likutis pinigineje yra " + pinigulikutis + " pinigu");
    }
}

