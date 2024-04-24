package Trecia_paskaita;

import java.util.Random;

public class Masyvai {





        public static void main(String[] args) {


            Random random = new Random();
            int[] masyvasSvSkaiciai = new int [6];//{50, 50, 12, 45, 56, 65};
            boolean[] patikrinti = new boolean[masyvasSvSkaiciai.length/2];

            for (int i = 0; i < masyvasSvSkaiciai.length; i++) {
                masyvasSvSkaiciai[i] = random.nextInt(10,100);
                System.out.println("Atsitiktiniai parinkti skaiciai:  " + masyvasSvSkaiciai[i]);
            }
            for (int i = 0; i < patikrinti.length; i++) {
                if (masyvasSvSkaiciai[i * 2] == masyvasSvSkaiciai[i * 2 + 1]) patikrinti[i]=true;

                else
                    patikrinti[i] = false;
            }
            for (int i =0; i< patikrinti.length; i++) {
                System.out.println(patikrinti[i]);
            }

        }
    }








