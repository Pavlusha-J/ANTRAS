package Antra_paskaita;

import java.util.*;

public class Darbas1 {

    public static void main(String[] args) {
        //sukurkite kolekciją su mūsų kurso mokinių vardais;
        //Surūšiuokite abėcėlės tvarka ir atspausdinkite ekrane.

        List<String> kursoDraugai = new ArrayList<String>();

        kursoDraugai.add("Tadas");
        kursoDraugai.add("Evaldas");
        kursoDraugai.add("Skirmantas");
        kursoDraugai.add("Agne");
        kursoDraugai.add("Gintare");
        kursoDraugai.add("Darius");
        kursoDraugai.add("Skirmantas");
        kursoDraugai.add("Sergejus");
        kursoDraugai.add("Zilvinas");

        kursoDraugai.sort(Comparator.naturalOrder());
        {
            for (int i = 0; i < kursoDraugai.size(); i++) ;
            System.out.println(kursoDraugai.getFirst());
        }
        Set<String> elementai = new HashSet<String>();

        elementai.add("Du");
        elementai.add("gaideliai");
        elementai.add("du");
        elementai.add("gaideliai");
        elementai.add("baltus");
        elementai.add("zirnius");
        elementai.add("kule");

        {
            System.out.println(elementai);
        }

        Map<Integer, String> planetos = new HashMap<Integer, String>();

        planetos.put(1, "Merkurius");
        planetos.put(2, "Venera");
        planetos.put(3, "Zeme");
        planetos.put(4, "Marsas");
        planetos.put(5, "Asteroidu ziedas");
        planetos.put(6, "Jupiteris");
        planetos.put(null, "Plutonas");
        planetos.put(8, "Saturnas");

        if (planetos.containsKey(6))
            planetos.remove(6);
        {
            System.out.println(planetos);
        }
        List<Object> trysObjektai = new ArrayList<>();

        trysObjektai.add(kursoDraugai.get(0));
        trysObjektai.add(elementai.iterator().next());
        trysObjektai.add(planetos.get(1));
        {
            System.out.println(trysObjektai);
        }
    }
}