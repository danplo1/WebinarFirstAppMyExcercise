package com.company;

/**
 * Created by Daniel_D'AGE on 24.05.2018.
 */
public class Main2 {

    public static void main(String[] args) {

        String arg1 = "Ala ma ";
        String arg2 = "kota.";

        arg1 = arg1.concat(arg2);// przypisujemy inny obiekt 2/zmiana referencji

        arg1 = arg1.concat("Hello World!");
        arg1 = arg1 + "witaj świecie!";


        int age1 = 10;
        int age2 = 10;

        System.out.println(5+5+"hejo"+5+5);

        //== operator porównania, nie porównuje zawartośc, tylko referencje




        System.out.println(arg1);

        int myAge = 19;
        int yourAge = 21;

        if (myAge>yourAge||yourAge>10){
            System.out.println("My Age jest większe!");
        } else{
            System.out.println("My Age jest mniejsze!");
        }

    }


}
