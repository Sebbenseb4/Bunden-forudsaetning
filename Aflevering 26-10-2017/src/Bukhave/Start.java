package Bukhave;

import java.util.*;

public class Start {

    public static void main(String[] args) {


        //De tomme "souts" i øvrige klasser giver bedre læsevenlighed

        //Importerer studerende fra DatHoldet klassen
        DatHoldet datKlasse = new DatHoldet();
        System.out.println();

        //Henter metoder fra Studerende.java og henter objekter fra DatHoldet.java
        datKlasse.stud1.spis();
        datKlasse.stud2.studer();

        System.out.println();
        System.out.println();


        //Importerer klassen MineMetoder.java
        MineMetoder illustrering = new MineMetoder();

        //Bringer MineMetoder.java i brug
        illustrering.eksEt();
        illustrering.eksTo();
        illustrering.eksTre();
        illustrering.eksFire();
        illustrering.eksFem();
        }
    }






