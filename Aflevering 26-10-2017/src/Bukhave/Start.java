package Bukhave;

import java.util.*;

public class Start {

    public static void main(String[] args) {


        //De tomme "souts" giver bedre læsevenlighed

        //Importerer studerende fra DatHoldet klassen
        DatHoldet datKlasse = new DatHoldet();
        System.out.println();

        //Bringer metoder i brug - henter objekter fra DatHoldet.java og tildeler metoder fra Studerende.java
        datKlasse.stud1.spis();
        datKlasse.stud2.studer();

        System.out.println();
        System.out.println();

        //Importerer klassen MineMetoder.java

        MineMetoder illustrering = new MineMetoder();
        illustrering.ifStatement();





        }










    }


        /*

        System.out.println(klassen.getStudent1());
         */


        /*
        //Student1
        Studerende student1;
        student1 = new Studerende("Mads");
        student1.setAge(27);
        student1.showAge();
        student1.setHeight(188);
        student1.showHeight();
        System.out.println();

        //Student2
        Studerende student2;
        student2 = new Studerende("Felix");
        student2.setAge(25);
        student2.showAge();
        System.out.println();

        //Student3
        Studerende student3;
        student3 = new Studerende("Hector");
        student3.setAge(22);
        student3.showAge();
        System.out.println();

        //Student4 - Student4 oprettes vha alder, i modsætning til 1,2,3, som oprettes vha navn.
        Studerende student4;
        student4 = new Studerende(34);
        student4.setName("Henning");
        student4.showName();
        System.out.println();
         */




