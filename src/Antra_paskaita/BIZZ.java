package Antra_paskaita;

//
//Atspausdinkite skaičius nuo 1 iki 100, tačiau vietoj skaičių, kurie
//dalinasi iš 3 atspausdinkit žodį “FIZZ”, vietoj skaičių, kurie dalinasi iš
//5, atspausdinkit žodį “BUZZ”, vietoj tų, kurie dalinasi ir iš 3, ir iš 5 -
//“FIZZBUZZ”
public class BIZZ {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");}

                     {
                System.out.println(i);
            }


        }
    }
}
