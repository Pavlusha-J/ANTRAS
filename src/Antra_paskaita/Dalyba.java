package Antra_paskaita;
import java.util.*;
public class Dalyba {
 //  Parašykite programą, kuri išspaudintų visus skaičius nuo 1 iki 10 000 kurie dalinasi be liekanos
    //  iš (skirtingi variantai): 2, 5, 7, 8, 12, 16, 42, 103, 111, 223, 250.
    //  Jeigu skaičius nesidalina, nei iš vieno iš išvardintų - atspausdinti skaičių ir prierašą - nesidalina.
        public static void main(String[] args) {

            int dalybosSkaiciai[] = {2, 5, 7, 8, 12, 16, 42, 103, 111, 223, 250};
            int visiSkaiciai;
            for (int i = 1; i <=10000; i++){
            visiSkaiciai = 0;
            for (int j = 0; j < dalybosSkaiciai.length; j++){
                if (i % dalybosSkaiciai[j] == 0) {

                    System.out.println( "Skaicius" +i+ "dalinasi is "+dalybosSkaiciai[j]+ "be liekanos");
                        visiSkaiciai++;
                    }
                    if (visiSkaiciai ==0);
                    {
                        System.out.println("Skaicius"+i+ "nesidalina");
                    }

                }
            }
        }
    }


