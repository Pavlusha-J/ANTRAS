package Trecia_paskaita;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//1 Sukurkite klasę Darbuotojas
//2 Klasės kintamieji - vardas, pavarde, pareigos, asmensKodas, lytis, arVairuoja
//3 Skurti Darbuotojo tipo kintamąjį (objektą)
//4 Suteikti objekto kintamiesiems reikšmes
//5 Gražiai atspausdinti ekrane visas objekto kintamųjų reikšmes
//6 Sukurti dar viena Darbuotojo objektą, priskirkite kintamiesiems reikšmes ir atspausdinkite ekrane



        Random random = new Random();
        int[] masivas8Sveiki = new int[16];
        boolean[] tikrinti = new boolean[masivas8Sveiki.length / 2];

        for (int i = 0; i < masivas8Sveiki.length; i++) {
            masivas8Sveiki[i] = random.nextInt(10);
            System.out.print(masivas8Sveiki[i]);
        }
        for (int i = 0; i < tikrinti.length; i++) {
            if (masivas8Sveiki[i * 2] == masivas8Sveiki[i * 2 + 1]) tikrinti[i] = true;
            else tikrinti[i] = false;
        }
        for (int i = 0;
             i < tikrinti.length; i++) {
            System.out.println(tikrinti[i]);
        }

    }

}

