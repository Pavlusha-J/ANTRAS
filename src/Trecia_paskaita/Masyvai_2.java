package Trecia_paskaita;

import java.util.Random;
//Sukurkite masyvą iš 8 atsitiktinių sveikų skaitmenų. Sukurkite
//antrą masyvą, kuriame saugome boolean reikšmes, kurios
//atspindi visų pirmojo masyvo porų palyginimo rezultatą.
//(Lyginame (0 ir 1) (2 ir 3) (4 ir 5) bei (6 ir 7) elementus, jei jie
//yra lygūs, tuomet antrame masyve išsaugome reikšmę true, jei
//nelygūs tuomet false).
public class Masyvai_2 {
    public static void main(String[] args) {


        Random random = new Random();
        int[] masyvasSvSkaiciai = {50, 50, 12, 45, 56, 65};
        boolean[] patikrinti = new boolean[4];

        for (int i = 0; i < masyvasSvSkaiciai.length; i++) {
            //      int [] masyvasSvSkaiciai = random.nextInt(0,100);
            System.out.println("Atsitiktiniai parinkti skaiciai:  " + masyvasSvSkaiciai[i]);
        }
        for (int i = 0; i < patikrinti.length; i++) {
            if (masyvasSvSkaiciai[i * 2] == masyvasSvSkaiciai[i * 2 + 1]) patikrinti[i]=true;

            else
                patikrinti[i] = false;
        }
        for (int i = 0; i < patikrinti.length; i++) {
            System.out.println(patikrinti[i]);
        }

    }
}


