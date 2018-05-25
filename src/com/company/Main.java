package com.company;

public class Main {


    public static void main(String[] args) {


        //boolean isHeHungry; //deklaracja zmiennej,bez podania wartości

        //isHeHungry = true; // przypisanie wartości do zmiennej
        //lub poniższy zapis
        // zminne
        boolean isHeHungry = true;
        int hisAge = 26;
        double cash = 231.5899;
        String myName = "Daniel";
        char gender ='M' +1; //dodawanie +1 do liczny alfabetu


        hisAge = 15+20;
        hisAge =hisAge+21;


        myName.length();


        System.out.println("Długość imienia " + myName + " to: " + myName.length()); // kompilator nie widzi nazwy
        // zmiennej tylko jej wartość

        System.out.println("Długość imienia " + myName + " to: " + myName.length());
    }
}
