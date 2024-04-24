package Antra_paskaita.Vardas;

public class Pavarde_tyrimas {

    ////1. Sukurkite Stringą su savo vardu ir Stringą su savo pavarde.
////patikrinkite ar jūsų pirma vardo raidė ir pirma pavardės raidė yra ta pati;
////patikrinkite ar raidžių skaičius varde yra toks pats kaip raidžių skaičius pavardėje.
////sujunkite jūsų vardą ir pavardę į vieną kintamąjį  (nepamirškite tarpo tarp jų). Kokio ilgio yra
// sujungtas Stringas?
    public static void main(String[] args) {


        String vardas = "Tadas";
        String pavarde = "Davkelis";
        boolean pirmaRaide = false;

        int suma = vardas.length() + pavarde.length();
        if (vardas.charAt(0) == pavarde.charAt(0)) {
            System.out.println("Pirmos raides sutampa:" + vardas.charAt(0) + " ir " + pavarde.charAt(0));
        } else {
            System.out.println("Pirmos raides nesutampa:" + vardas.charAt(0) + " ir " + pavarde.charAt(0));
            if (vardas.length() == pavarde.length()) {
                System.out.println("Varado ir Pavardes raidziu skaicius sutampa");
                System.out.println();
            } else {
                System.out.println("Vardo ir pavardes raidziu skaicius nesutampa");
                System.out.println();
            }
            System.out.println("Mano duomenys:" + vardas + " " + pavarde);
            System.out.println();
            System.out.println("Mano v. ir p. raidziu skaicius: " + suma);

        }
    }

}