import java.util.Random;

//public class Main {
  //  public static void main(String[] args)
    //1. Atspausdinkite savo varda tiek kartu,
    //	kiek jusu varde yra simboliu.
    //	Zodzio ilgiui nustatyti naudokite metoda length().

    //  while (i <= vardas.length()) {
    //     System.out.println( " " + vardas);
    //   i++;
    //}


    //Atspausdinkite kas trecia skaiciu seka
//	didejancia tvarka nuo 220 iki 300.
    //   {
    //     int i = 220;
    //   while (i <= 300) {
    //      System.out.print(i + " ");
    //      i += 3;
    //     }

//Atspausdinkite skaicius, kurie dalinasi is triju.
//	Skaiciu intervalas nuo 0 iki 99.
 //   {
        //      int i = 0;
        //      while (i <= 99) {
        //         if (i % 3 == 0)
        //            System.out.print(i + " ");
        //            i++;}

// Atspausdinkite sio menesio pavadinima
//	tiek kartu, kiek zodyje yra simboliu.
//	Zodzio ilgiui nustatyti naudokite metoda.

        //     String menesis ="Balandis";
        //  int i=1;
        //    while( i<=menesis.length()){
        //      System.out.println(i+ " " + menesis);
        //      i++;
        //     }
// Atspausdinkite kas antra skaiciu seka
//	mazejancia tvarka nuo -50 iki -100.

        //    for ( int m = -50; m >= -100; m-=2){
        //       System.out.print(m+ " ");}

//  Atspausdinkite zodi "Nebeprisikiškiakopūsteliaujantiesiems" sekanciai:
//	a. kiekivena raide atskirai
//	b. po tris raides atskirai

        //      String zodis = "Nebeprisikiškiakopūsteliaujantiesiems";
        //     for (int i = 0; i < zodis.length(); i++) {
        // System.out.println(i+" "+ zodis.charAt(i));
        //  }
        //      for (int i = 0; i < zodis.length(); i+=3) {
        //          if (i >= zodis.length() - 3) {
        //              System.out.println(zodis.substring(i));
        //                } else {
        //              System.out.println(zodis.substring(i, i + 3));}


//Atspausdinkite sios savaites diena
//	tiek kartu, kiek zodyje yra simboliu.
//	Zodzio ilgiui nustatyti naudokite metoda.

        //   int cikloIlgis = "Pirmadienis".length();
        //   do{
        //      System.out.println(" " +"Pirmadienis");
        //      cikloIlgis--;}
        //      while (cikloIlgis>0);

//Sukurkite klasę Katinas;
//Klasės viduje sukurkite klasės kintamuosius (field’us) - vardas, amzius,
//arSkiepytas;
//Sukurkite katino tipo kintamąjį (objektą);
//Suteikite objekto kintamiesiems (field’ams) reikšmes;
//Gražiai (atskirose eilutėse) atspausdinkite ekrane katino vardą, amžių,
//informaciją apie skiepą;
//Sukurkite dar vieną katino tipo kintamąjį (objektą) ir priskirkite jo
//kintamiesiesm reikšmes (atspausdinkite);

        //      class Katinas{
        //          String Vardas;
        //          int Amzius;
        //          boolean ArSkiepytas;}

        //     Katinas mur = new Katinas();
        //      mur.Amzius =5;
        //     mur.Vardas ="Murkis";
        //     mur.ArSkiepytas =false;

        //      Katinas miau = new Katinas();
        //      miau.Amzius =2;
        //      miau.Vardas ="Miauksis";
        //      miau.ArSkiepytas =true;
//
        //      Katinas Puk = new Katinas();
        //      Puk.Amzius =4;
        //      Puk.Vardas ="Pukis";
        //      Puk.ArSkiepytas =true;

        //   System.out.println("Pirmo katino vardas:"+ mur.Vardas);
        //   System.out.println("Jo amzius"  +mur.Amzius);
        //   System.out.println("Ar skiepytas?"  +mur.ArSkiepytas);
        //  System.out.println("Antro katino vardas: %s jo amzius: %d", miau.Vardas, miau.Amzius);
        //   System.out.println("Ar skiepytas"+  miau.ArSkiepytas);
        //   System.out.println("Trecias katino vardas: %s, jo amzius: %d", Puk.Vardas, Puk.Amzius);
        //   System.out.println( + Puk.ArSkiepytas);


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] masivas8Sveiki = new int[4];
        boolean[] tikrinti = new boolean[masivas8Sveiki.length / 2];

        for (int i = 0; i < masivas8Sveiki.length; i++) {
            masivas8Sveiki[i] = random.nextInt(10,100);
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






