package Antra_paskaita;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.*;
import java.util.Random;

public class BigDcmel {


    public static void main(String[] args) {

        BigDecimal kintamasis1; // 7.56
        BigDecimal kintamasis2; // 102.103

        kintamasis1 = new BigDecimal(7.56);
        kintamasis2 = new BigDecimal(102.103);

//        kintamasis1 = BigDecimal.valueOf(7.56);
//        kintamasis2 = BigDecimal.valueOf(102.103);

        BigDecimal suma;
        BigDecimal skirtumas;
        BigDecimal daugyba;
        BigDecimal dalyba;

        suma = kintamasis1.add(kintamasis2); // kintamasis1 + kintamasis2
        System.out.println("Sudetis: " + suma);

        skirtumas = kintamasis1.subtract(kintamasis2); // kintamasis1 - kintamasis2
        System.out.println("Skirtumas: " + skirtumas);

        daugyba = kintamasis1.multiply(kintamasis2); // kintamasis1 * kintamasis2
        System.out.println("Daugyba: " + daugyba);

        dalyba = kintamasis1.divide(kintamasis2, 1); // kintamasis1 / kintamasis2
        System.out.println("Dalyba: " + dalyba);

        System.out.println("------------------------------");

        System.out.println("Sudetis: " + suma.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println("Skirtumas: " + skirtumas.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println("Daugyba: " + daugyba.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println("Dalyba: " + dalyba.setScale(2, RoundingMode.HALF_EVEN));

        System.out.println("------------------------------");
        Random random= new Random();
        BigDecimal pirmasSkBgDc;
        BigDecimal antrasSkBgDc;

        int atskSK = random.nextInt(-100, 100);
        pirmasSkBgDc = new BigDecimal(atskSK);

        atskSK = random.nextInt(-100, 100);
        antrasSkBgDc = new BigDecimal(atskSK);

// toliau atliekam matematiniai veiksmai, kap parodyta auksciau
        System.out.println("------------------------------");
        int sumaInt = 5;
        int skirtumasInt = -2;
        System.out.println("Gaunamo kaskoki rezultata: " + (sumaInt >= skirtumasInt));
        System.out.println("------------------------------");
        boolean arLyguDaugiau = suma.compareTo(skirtumas) >= 0; // (-1, 0 , 1) >= 0 ? true : false
        System.out.println("arLyguDaugiau: " + arLyguDaugiau);

        boolean arMaziau = daugyba.compareTo(dalyba) < 0; // tikrinam daugyba < dalyba
        System.out.println("arMaziau: " + arMaziau);
    }
}



